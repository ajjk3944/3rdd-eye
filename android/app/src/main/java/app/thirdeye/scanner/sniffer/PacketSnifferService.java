package app.thirdeye.scanner.sniffer;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.getcapacitor.JSObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PacketSnifferService extends VpnService {
    private static final String TAG = "PacketSnifferService";
    
    // Notification
    private static final String CHANNEL_ID = "packet_sniffer_channel";
    private static final int NOTIFICATION_ID = 1001;
    
    // VPN Configuration
    private static final String VPN_ADDRESS = "172.31.255.253";
    private static final String VPN_ROUTE = "0.0.0.0";
    private static final int VPN_MTU = 1500;
    private static final int BUFFER_SIZE = 32767; // Max IP packet size
    
    // Database batching
    private static final int BATCH_SIZE = 50;
    private static final long BATCH_INTERVAL_MS = 500;
    
    // Service state
    private static volatile boolean isRunning = false;
    private static volatile String currentSessionId = null;
    private static volatile EventListener eventListener = null;
    
    // Event listener interface
    public interface EventListener {
        void onNewConnection(JSObject connection);
        void onSuspiciousDetected(JSObject alert);
    }
    
    public static void setEventListener(EventListener listener) {
        eventListener = listener;
    }
    
    // VPN components
    private ParcelFileDescriptor vpnInterface;
    private Thread captureThread;
    private Thread forwardingThread;
    private final AtomicBoolean shouldStop = new AtomicBoolean(false);
    
    // Connection forwarding
    private final Map<String, TcpConnection> tcpConnections = new ConcurrentHashMap<>();
    private final Map<String, UdpConnection> udpConnections = new ConcurrentHashMap<>();
    private final ExecutorService forwardingExecutor = Executors.newCachedThreadPool();
    private FileOutputStream vpnOutputStream;
    
    // Statistics (thread-safe)
    private final AtomicLong totalPackets = new AtomicLong(0);
    private final AtomicLong totalBytes = new AtomicLong(0);
    private final AtomicInteger suspiciousCount = new AtomicInteger(0);
    private final Set<String> activeApps = new HashSet<>();
    private final Set<String> uniqueCountries = new HashSet<>();
    private long sessionStartTime;
    
    // Utilities
    private AppIdentifier appIdentifier;
    private GeoIPResolver geoIPResolver;
    private SuspiciousDetector suspiciousDetector;
    private TrafficLogDatabase database;
    private ConnectionTracker connectionTracker;
    
    // Batching queue
    private final Queue<PendingConnection> pendingConnections = new LinkedList<>();
    private long lastBatchTime = 0;
    private long lastCleanupTime = 0;
    private static final long CLEANUP_INTERVAL_MS = 30000; // 30 seconds

    private static class PendingConnection {
        PacketParser.ConnectionInfo info;
        String appPackage;
        String appName;
        String countryName;
        String countryCode;
        boolean isSuspicious;
        String suspiciousReason;

        PendingConnection(PacketParser.ConnectionInfo info, String appPackage, String appName,
                          String countryName, String countryCode, boolean isSuspicious,
                          String suspiciousReason) {
            this.info = info;
            this.appPackage = appPackage;
            this.appName = appName;
            this.countryName = countryName;
            this.countryCode = countryCode;
            this.isSuspicious = isSuspicious;
            this.suspiciousReason = suspiciousReason;
        }
    }

    // TCP connection proxy
    private class TcpConnection {
        Socket socket;
        String key;
        Thread readerThread;
        
        TcpConnection(String key) {
            this.key = key;
        }
        
        void close() {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
            if (readerThread != null) {
                readerThread.interrupt();
            }
        }
    }
    
    // UDP connection proxy
    private class UdpConnection {
        DatagramSocket socket;
        String key;
        Thread readerThread;
        
        UdpConnection(String key) {
            this.key = key;
        }
        
        void close() {
            if (socket != null) {
                socket.close();
            }
            if (readerThread != null) {
                readerThread.interrupt();
            }
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Service created");
        
        // Set service instance for static access
        serviceInstance = this;
        
        // Initialize utilities
        appIdentifier = new AppIdentifier();
        geoIPResolver = GeoIPResolver.getInstance();
        geoIPResolver.init(this);
        suspiciousDetector = new SuspiciousDetector();
        database = TrafficLogDatabase.getInstance(this);
        connectionTracker = new ConnectionTracker();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (isRunning) {
            Log.w(TAG, "Service already running");
            return START_STICKY;
        }

        Log.i(TAG, "Starting packet sniffer service");
        
        // Generate session ID
        currentSessionId = UUID.randomUUID().toString();
        sessionStartTime = System.currentTimeMillis();
        
        // Reset statistics
        totalPackets.set(0);
        totalBytes.set(0);
        suspiciousCount.set(0);
        activeApps.clear();
        uniqueCountries.clear();
        suspiciousDetector.reset();
        connectionTracker.clear();
        
        // Start foreground service with notification
        startForeground(NOTIFICATION_ID, createNotification());
        
        // Set up VPN
        if (!setupVPN()) {
            Log.e(TAG, "Failed to set up VPN");
            stopSelf();
            return START_NOT_STICKY;
        }
        
        // Start capture thread
        shouldStop.set(false);
        captureThread = new Thread(this::capturePackets, "PacketCaptureThread");
        captureThread.start();
        
        isRunning = true;
        Log.i(TAG, "Packet sniffer service started with session ID: " + currentSessionId);
        
        return START_STICKY;
    }

    private boolean setupVPN() {
        try {
            Builder builder = new Builder();
            builder.setSession("ThirdEye Traffic Monitor")
                    .addAddress(VPN_ADDRESS, 32)
                    .addRoute(VPN_ROUTE, 0)
                    .addDnsServer("8.8.8.8")
                    .addDnsServer("8.8.4.4")
                    .setMtu(VPN_MTU)
                    .setBlocking(true);
            
            // Exclude our own app to prevent loops
            try {
                builder.addDisallowedApplication(getPackageName());
            } catch (Exception e) {
                Log.w(TAG, "Could not exclude own package", e);
            }
            
            vpnInterface = builder.establish();
            
            if (vpnInterface == null) {
                Log.e(TAG, "VPN interface is null - permission not granted?");
                return false;
            }
            
            Log.i(TAG, "VPN interface established");
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error setting up VPN", e);
            return false;
        }
    }

    private void capturePackets() {
        Log.i(TAG, "Capture thread started");
        
        FileInputStream inputStream = new FileInputStream(vpnInterface.getFileDescriptor());
        vpnOutputStream = new FileOutputStream(vpnInterface.getFileDescriptor());
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
        
        try {
            while (!shouldStop.get()) {
                // Read packet from VPN interface
                buffer.clear();
                int length = inputStream.read(buffer.array());
                
                if (length <= 0) {
                    // VPN is shutting down
                    break;
                }
                
                // Process and forward the packet
                processAndForwardPacket(buffer.array(), length);
                
                // Update notification periodically
                if (totalPackets.get() % 100 == 0) {
                    updateNotification();
                }
                
                // Flush batch if needed
                flushBatchIfNeeded(false);
                
                // Cleanup expired connections periodically
                long now = System.currentTimeMillis();
                if (now - lastCleanupTime > CLEANUP_INTERVAL_MS) {
                    connectionTracker.cleanupExpired();
                    cleanupStaleConnections();
                    lastCleanupTime = now;
                }
            }
        } catch (IOException e) {
            if (!shouldStop.get()) {
                Log.e(TAG, "Error in capture loop", e);
            }
        } finally {
            // Flush remaining connections
            flushBatchIfNeeded(true);
            
            // Close all proxy connections
            closeAllConnections();
            
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.e(TAG, "Error closing input stream", e);
            }
            
            try {
                if (vpnOutputStream != null) {
                    vpnOutputStream.close();
                }
            } catch (IOException e) {
                Log.e(TAG, "Error closing output stream", e);
            }
        }
        
        Log.i(TAG, "Capture thread stopped");
    }

    private void processAndForwardPacket(byte[] packet, int length) {
        try {
            // Parse packet headers
            PacketParser.ConnectionInfo info = PacketParser.parse(packet, length);
            if (info == null) {
                return; // Malformed packet
            }
            
            // Log the packet for analysis (but don't skip private IPs for forwarding)
            boolean isPrivate = PacketParser.isPrivateIP(info.destinationIP);
            
            // Track connection and update statistics
            connectionTracker.trackConnection(
                    info.protocol,
                    info.sourceIP,
                    info.sourcePort,
                    info.destinationIP,
                    info.destinationPort
            );
            
            totalPackets.incrementAndGet();
            totalBytes.addAndGet(length);
            
            // Identify app and log connection (skip private IPs for logging)
            if (!isPrivate) {
                logConnection(info, length);
            }
            
            // Forward packet to real network
            forwardPacket(packet, length, info);
            
        } catch (Exception e) {
            Log.e(TAG, "Error processing packet", e);
        }
    }

    private void forwardPacket(byte[] packet, int length, PacketParser.ConnectionInfo info) {
        try {
            if ("TCP".equals(info.protocol)) {
                forwardTcpPacket(packet, length, info);
            } else if ("UDP".equals(info.protocol)) {
                forwardUdpPacket(packet, length, info);
            } else {
                // For other protocols (ICMP, etc.), we can't easily forward
                // Just log and drop
                Log.d(TAG, "Dropping non-TCP/UDP packet: " + info.protocol);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error forwarding packet", e);
        }
    }

    private void forwardTcpPacket(byte[] packet, int length, PacketParser.ConnectionInfo info) {
        String connectionKey = String.format("%s:%d->%s:%d", 
                info.sourceIP, info.sourcePort, info.destinationIP, info.destinationPort);
        
        TcpConnection conn = tcpConnections.get(connectionKey);
        
        // Check if this is a SYN packet (new connection)
        if (info.tcpFlags.contains("SYN") && !info.tcpFlags.contains("ACK")) {
            if (conn != null) {
                conn.close();
            }
            
            // Create new TCP connection
            final TcpConnection newConn = new TcpConnection(connectionKey);
            tcpConnections.put(connectionKey, newConn);
            
            forwardingExecutor.execute(() -> {
                try {
                    Socket socket = new Socket();
                    newConn.socket = socket;
                    
                    // Protect socket from VPN to prevent loop
                    protect(socket);
                    
                    // Connect to destination
                    socket.connect(new InetSocketAddress(info.destinationIP, info.destinationPort), 5000);
                    Log.d(TAG, "TCP connected: " + connectionKey);
                    
                    // Start reader thread to forward responses back
                    newConn.readerThread = new Thread(() -> readTcpResponses(newConn, info));
                    newConn.readerThread.start();
                    
                } catch (IOException e) {
                    Log.w(TAG, "TCP connect failed: " + connectionKey + " - " + e.getMessage());
                    tcpConnections.remove(connectionKey);
                    sendTcpReset(info);
                }
            });
        } else if (conn != null && conn.socket != null && conn.socket.isConnected()) {
            // Forward data from existing connection
            int ipHeaderLength = (packet[0] & 0x0F) * 4;
            int tcpHeaderLength = ((packet[ipHeaderLength + 12] & 0xFF) >> 4) * 4;
            int dataOffset = ipHeaderLength + tcpHeaderLength;
            int dataLength = length - dataOffset;
            
            if (dataLength > 0) {
                try {
                    conn.socket.getOutputStream().write(packet, dataOffset, dataLength);
                } catch (IOException e) {
                    Log.w(TAG, "TCP write failed: " + connectionKey);
                    conn.close();
                    tcpConnections.remove(connectionKey);
                }
            }
            
            // Check for FIN or RST
            if (info.tcpFlags.contains("FIN") || info.tcpFlags.contains("RST")) {
                conn.close();
                tcpConnections.remove(connectionKey);
            }
        }
    }

    private void readTcpResponses(TcpConnection conn, PacketParser.ConnectionInfo originalInfo) {
        try {
            byte[] buffer = new byte[8192];
            while (!shouldStop.get() && conn.socket != null && !conn.socket.isClosed()) {
                int bytesRead = conn.socket.getInputStream().read(buffer);
                if (bytesRead <= 0) {
                    break;
                }
                
                // Build response packet and write to VPN
                byte[] responsePacket = buildTcpResponsePacket(
                        originalInfo.destinationIP, originalInfo.destinationPort,
                        originalInfo.sourceIP, originalInfo.sourcePort,
                        buffer, bytesRead);
                
                if (responsePacket != null && vpnOutputStream != null) {
                    synchronized (vpnOutputStream) {
                        vpnOutputStream.write(responsePacket);
                    }
                }
            }
        } catch (IOException e) {
            if (!shouldStop.get()) {
                Log.w(TAG, "TCP read error: " + conn.key);
            }
        } finally {
            conn.close();
            tcpConnections.remove(conn.key);
        }
    }

    private void forwardUdpPacket(byte[] packet, int length, PacketParser.ConnectionInfo info) {
        String connectionKey = String.format("%s:%d->%s:%d", 
                info.sourceIP, info.sourcePort, info.destinationIP, info.destinationPort);
        
        UdpConnection conn = udpConnections.get(connectionKey);
        
        if (conn == null) {
            // Create new UDP connection
            final UdpConnection newConn = new UdpConnection(connectionKey);
            udpConnections.put(connectionKey, newConn);
            
            forwardingExecutor.execute(() -> {
                try {
                    DatagramSocket socket = new DatagramSocket();
                    newConn.socket = socket;
                    
                    // Protect socket from VPN
                    protect(socket);
                    
                    // Start reader thread
                    newConn.readerThread = new Thread(() -> readUdpResponses(newConn, info));
                    newConn.readerThread.start();
                    
                } catch (IOException e) {
                    Log.w(TAG, "UDP socket creation failed: " + connectionKey);
                    udpConnections.remove(connectionKey);
                }
            });
            
            conn = newConn;
        }
        
        // Forward UDP data
        if (conn != null && conn.socket != null) {
            int ipHeaderLength = (packet[0] & 0x0F) * 4;
            int dataOffset = ipHeaderLength + 8; // UDP header is 8 bytes
            int dataLength = length - dataOffset;
            
            if (dataLength > 0) {
                final UdpConnection finalConn = conn;
                try {
                    byte[] data = new byte[dataLength];
                    System.arraycopy(packet, dataOffset, data, 0, dataLength);
                    
                    DatagramPacket udpPacket = new DatagramPacket(
                            data, dataLength,
                            InetAddress.getByName(info.destinationIP),
                            info.destinationPort);
                    
                    finalConn.socket.send(udpPacket);
                } catch (IOException e) {
                    Log.w(TAG, "UDP send failed: " + connectionKey);
                }
            }
        }
    }

    private void readUdpResponses(UdpConnection conn, PacketParser.ConnectionInfo originalInfo) {
        try {
            byte[] buffer = new byte[8192];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            
            conn.socket.setSoTimeout(30000); // 30 second timeout
            
            while (!shouldStop.get() && conn.socket != null && !conn.socket.isClosed()) {
                try {
                    conn.socket.receive(packet);
                    
                    // Build response packet and write to VPN
                    byte[] responsePacket = buildUdpResponsePacket(
                            originalInfo.destinationIP, originalInfo.destinationPort,
                            originalInfo.sourceIP, originalInfo.sourcePort,
                            packet.getData(), packet.getLength());
                    
                    if (responsePacket != null && vpnOutputStream != null) {
                        synchronized (vpnOutputStream) {
                            vpnOutputStream.write(responsePacket);
                        }
                    }
                } catch (java.net.SocketTimeoutException e) {
                    // Timeout - close connection
                    break;
                }
            }
        } catch (IOException e) {
            if (!shouldStop.get()) {
                Log.w(TAG, "UDP read error: " + conn.key);
            }
        } finally {
            conn.close();
            udpConnections.remove(conn.key);
        }
    }

    private byte[] buildTcpResponsePacket(String srcIp, int srcPort, String dstIp, int dstPort, 
                                          byte[] data, int dataLength) {
        try {
            // Simplified TCP packet building - in production you'd need proper sequence numbers
            int ipHeaderLength = 20;
            int tcpHeaderLength = 20;
            int totalLength = ipHeaderLength + tcpHeaderLength + dataLength;
            
            byte[] packet = new byte[totalLength];
            
            // IP header
            packet[0] = 0x45; // Version 4, header length 5
            packet[1] = 0x00; // TOS
            packet[2] = (byte) (totalLength >> 8);
            packet[3] = (byte) totalLength;
            // ID, flags, TTL, protocol, checksum - simplified
            packet[8] = 64; // TTL
            packet[9] = 6; // TCP
            
            // Source IP
            String[] srcParts = srcIp.split("\\.");
            for (int i = 0; i < 4; i++) {
                packet[12 + i] = (byte) Integer.parseInt(srcParts[i]);
            }
            
            // Dest IP
            String[] dstParts = dstIp.split("\\.");
            for (int i = 0; i < 4; i++) {
                packet[16 + i] = (byte) Integer.parseInt(dstParts[i]);
            }
            
            // TCP header
            int tcpStart = ipHeaderLength;
            packet[tcpStart] = (byte) (srcPort >> 8);
            packet[tcpStart + 1] = (byte) srcPort;
            packet[tcpStart + 2] = (byte) (dstPort >> 8);
            packet[tcpStart + 3] = (byte) dstPort;
            packet[tcpStart + 12] = 0x50; // Header length
            packet[tcpStart + 13] = 0x18; // PSH + ACK flags
            
            // Copy data
            if (dataLength > 0) {
                System.arraycopy(data, 0, packet, ipHeaderLength + tcpHeaderLength, dataLength);
            }
            
            return packet;
        } catch (Exception e) {
            Log.e(TAG, "Error building TCP response packet", e);
            return null;
        }
    }

    private byte[] buildUdpResponsePacket(String srcIp, int srcPort, String dstIp, int dstPort,
                                          byte[] data, int dataLength) {
        try {
            int ipHeaderLength = 20;
            int udpHeaderLength = 8;
            int totalLength = ipHeaderLength + udpHeaderLength + dataLength;
            
            byte[] packet = new byte[totalLength];
            
            // IP header
            packet[0] = 0x45; // Version 4, header length 5
            packet[1] = 0x00; // TOS
            packet[2] = (byte) (totalLength >> 8);
            packet[3] = (byte) totalLength;
            packet[8] = 64; // TTL
            packet[9] = 17; // UDP
            
            // Source IP
            String[] srcParts = srcIp.split("\\.");
            for (int i = 0; i < 4; i++) {
                packet[12 + i] = (byte) Integer.parseInt(srcParts[i]);
            }
            
            // Dest IP
            String[] dstParts = dstIp.split("\\.");
            for (int i = 0; i < 4; i++) {
                packet[16 + i] = (byte) Integer.parseInt(dstParts[i]);
            }
            
            // UDP header
            int udpStart = ipHeaderLength;
            packet[udpStart] = (byte) (srcPort >> 8);
            packet[udpStart + 1] = (byte) srcPort;
            packet[udpStart + 2] = (byte) (dstPort >> 8);
            packet[udpStart + 3] = (byte) dstPort;
            int udpLength = udpHeaderLength + dataLength;
            packet[udpStart + 4] = (byte) (udpLength >> 8);
            packet[udpStart + 5] = (byte) udpLength;
            
            // Copy data
            if (dataLength > 0) {
                System.arraycopy(data, 0, packet, ipHeaderLength + udpHeaderLength, dataLength);
            }
            
            return packet;
        } catch (Exception e) {
            Log.e(TAG, "Error building UDP response packet", e);
            return null;
        }
    }

    private void sendTcpReset(PacketParser.ConnectionInfo info) {
        // Send RST packet back to client
        // Simplified implementation
        Log.d(TAG, "Sending TCP RST for " + info.destinationIP + ":" + info.destinationPort);
    }

    private void logConnection(PacketParser.ConnectionInfo info, int length) {
        try {
            // Identify app
            AppIdentifier.AppInfo appInfo = appIdentifier.identify(
                    this,
                    info.protocol,
                    info.sourceIP,
                    info.sourcePort,
                    info.destinationIP,
                    info.destinationPort
            );
            
            String appPackage = "unknown";
            String appName = "Unknown";
            
            if (appInfo != null) {
                appPackage = appInfo.packageName;
                appName = appInfo.appName;
                synchronized (activeApps) {
                    activeApps.add(appPackage);
                }
            }
            
            // Resolve country
            GeoIPResolver.GeoInfo geoInfo = geoIPResolver.resolve(info.destinationIP);
            String countryName = geoInfo.countryName;
            String countryCode = geoInfo.countryCode;
            
            synchronized (uniqueCountries) {
                uniqueCountries.add(countryCode);
            }
            
            // Check for suspicious activity
            SuspiciousDetector.SuspiciousResult suspiciousResult = suspiciousDetector.analyze(
                    appPackage,
                    appName,
                    info.destinationIP,
                    info.destinationPort,
                    countryCode,
                    0,
                    length
            );
            
            if (suspiciousResult.isSuspicious) {
                suspiciousCount.incrementAndGet();
                
                if (eventListener != null) {
                    JSObject alert = new JSObject();
                    alert.put("appPackage", appPackage);
                    alert.put("appName", appName);
                    alert.put("destinationIP", info.destinationIP);
                    alert.put("destinationPort", info.destinationPort);
                    alert.put("countryName", countryName);
                    alert.put("countryCode", countryCode);
                    alert.put("suspiciousReason", suspiciousResult.reason);
                    alert.put("severity", suspiciousResult.severity);
                    alert.put("timestamp", info.timestamp);
                    eventListener.onSuspiciousDetected(alert);
                }
            }
            
            // Add to batch queue
            synchronized (pendingConnections) {
                pendingConnections.add(new PendingConnection(
                        info,
                        appPackage,
                        appName,
                        countryName,
                        countryCode,
                        suspiciousResult.isSuspicious,
                        suspiciousResult.reason
                ));
            }
            
            // Notify listener of new connection (sample every 10th)
            if (eventListener != null && totalPackets.get() % 10 == 0) {
                JSObject connection = new JSObject();
                connection.put("appPackage", appPackage);
                connection.put("appName", appName);
                connection.put("protocol", info.protocol);
                connection.put("destinationIP", info.destinationIP);
                connection.put("destinationPort", info.destinationPort);
                connection.put("countryName", countryName);
                connection.put("countryCode", countryCode);
                connection.put("timestamp", info.timestamp);
                eventListener.onNewConnection(connection);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error logging connection", e);
        }
    }

    private void cleanupStaleConnections() {
        // Remove stale TCP connections
        tcpConnections.entrySet().removeIf(entry -> {
            TcpConnection conn = entry.getValue();
            if (conn.socket == null || conn.socket.isClosed()) {
                conn.close();
                return true;
            }
            return false;
        });
        
        // UDP connections are cleaned up by timeout in their reader threads
    }

    private void closeAllConnections() {
        for (TcpConnection conn : tcpConnections.values()) {
            conn.close();
        }
        tcpConnections.clear();
        
        for (UdpConnection conn : udpConnections.values()) {
            conn.close();
        }
        udpConnections.clear();
        
        forwardingExecutor.shutdownNow();
    }

    private void flushBatchIfNeeded(boolean force) {
        long now = System.currentTimeMillis();
        boolean shouldFlush = force;
        
        synchronized (pendingConnections) {
            if (!shouldFlush) {
                shouldFlush = pendingConnections.size() >= BATCH_SIZE ||
                        (now - lastBatchTime) >= BATCH_INTERVAL_MS;
            }
            
            if (shouldFlush && !pendingConnections.isEmpty()) {
                // Process batch
                while (!pendingConnections.isEmpty()) {
                    PendingConnection conn = pendingConnections.poll();
                    if (conn != null) {
                        database.logConnection(
                                conn.info,
                                conn.appPackage,
                                conn.appName,
                                conn.countryName,
                                conn.countryCode,
                                conn.isSuspicious,
                                conn.suspiciousReason,
                                currentSessionId
                        );
                    }
                }
                lastBatchTime = now;
            }
        }
    }

    private Notification createNotification() {
        createNotificationChannel();
        
        Intent stopIntent = new Intent(this, PacketSnifferService.class);
        stopIntent.setAction("STOP");
        PendingIntent stopPendingIntent = PendingIntent.getService(
                this,
                0,
                stopIntent,
                PendingIntent.FLAG_IMMUTABLE
        );
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle("ThirdEye Traffic Monitor")
                .setContentText("Monitoring network traffic")
                .setSmallIcon(android.R.drawable.ic_menu_info_details)
                .setOngoing(true)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .addAction(android.R.drawable.ic_menu_close_clear_cancel, "Stop", stopPendingIntent);
        
        return builder.build();
    }

    private void updateNotification() {
        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            String text = String.format("Captured %d packets (%d apps)",
                    totalPackets.get(), activeApps.size());
            
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                    .setContentTitle("ThirdEye Traffic Monitor")
                    .setContentText(text)
                    .setSmallIcon(android.R.drawable.ic_menu_info_details)
                    .setOngoing(true)
                    .setPriority(NotificationCompat.PRIORITY_LOW);
            
            notificationManager.notify(NOTIFICATION_ID, builder.build());
        }
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "Traffic Monitor",
                    NotificationManager.IMPORTANCE_LOW
            );
            channel.setDescription("Network traffic monitoring notifications");
            
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(channel);
            }
        }
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Service destroying");
        stopCapture();
        serviceInstance = null;
        super.onDestroy();
    }

    @Override
    public void onRevoke() {
        Log.i(TAG, "VPN permission revoked");
        stopCapture();
        super.onRevoke();
    }

    private void stopCapture() {
        if (!isRunning) {
            return;
        }
        
        Log.i(TAG, "Stopping capture");
        
        // Signal thread to stop
        shouldStop.set(true);
        
        // Close VPN interface (this will cause read() to return)
        if (vpnInterface != null) {
            try {
                vpnInterface.close();
            } catch (IOException e) {
                Log.e(TAG, "Error closing VPN interface", e);
            }
            vpnInterface = null;
        }
        
        // Wait for thread to finish
        if (captureThread != null) {
            try {
                captureThread.join(5000); // Wait up to 5 seconds
            } catch (InterruptedException e) {
                Log.w(TAG, "Interrupted while waiting for capture thread", e);
            }
            captureThread = null;
        }
        
        // Clear state
        isRunning = false;
        currentSessionId = null;
        
        Log.i(TAG, "Capture stopped");
    }

    // Static methods for external access
    public static boolean isRunning() {
        return isRunning;
    }

    public static String getSessionId() {
        return currentSessionId;
    }
    
    private static PacketSnifferService serviceInstance = null;
    
    public static LiveStats getLiveStatsFromService() {
        if (serviceInstance != null && isRunning) {
            return serviceInstance.getLiveStats();
        }
        return null;
    }

    public static class LiveStats {
        public long totalPackets;
        public long totalBytes;
        public int activeApps;
        public int uniqueCountries;
        public int suspiciousCount;
        public long sessionDuration;
    }

    public LiveStats getLiveStats() {
        LiveStats stats = new LiveStats();
        stats.totalPackets = totalPackets.get();
        stats.totalBytes = totalBytes.get();
        synchronized (activeApps) {
            stats.activeApps = activeApps.size();
        }
        synchronized (uniqueCountries) {
            stats.uniqueCountries = uniqueCountries.size();
        }
        stats.suspiciousCount = suspiciousCount.get();
        stats.sessionDuration = System.currentTimeMillis() - sessionStartTime;
        return stats;
    }
}
