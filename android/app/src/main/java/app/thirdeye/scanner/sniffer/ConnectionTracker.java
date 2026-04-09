package app.thirdeye.scanner.sniffer;

import android.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Tracks active network connections for the packet sniffer
 */
public class ConnectionTracker {
    private static final String TAG = "ConnectionTracker";
    private static final long CONNECTION_TIMEOUT_MS = 60000; // 60 seconds

    private static class ConnectionState {
        String protocol;
        String sourceIP;
        int sourcePort;
        String destinationIP;
        int destinationPort;
        long lastActivity;

        ConnectionState(String protocol, String sourceIP, int sourcePort,
                        String destinationIP, int destinationPort) {
            this.protocol = protocol;
            this.sourceIP = sourceIP;
            this.sourcePort = sourcePort;
            this.destinationIP = destinationIP;
            this.destinationPort = destinationPort;
            this.lastActivity = System.currentTimeMillis();
        }

        void updateActivity() {
            this.lastActivity = System.currentTimeMillis();
        }

        boolean isExpired() {
            return System.currentTimeMillis() - lastActivity > CONNECTION_TIMEOUT_MS;
        }

        String getKey() {
            return String.format("%s:%s:%d:%s:%d",
                    protocol, sourceIP, sourcePort, destinationIP, destinationPort);
        }
    }

    private final Map<String, ConnectionState> connections = new HashMap<>();

    /**
     * Track a new connection or update existing one
     */
    public synchronized void trackConnection(String protocol, String sourceIP, int sourcePort,
                                              String destinationIP, int destinationPort) {
        String key = String.format("%s:%s:%d:%s:%d",
                protocol, sourceIP, sourcePort, destinationIP, destinationPort);

        ConnectionState state = connections.get(key);
        if (state == null) {
            state = new ConnectionState(protocol, sourceIP, sourcePort, destinationIP, destinationPort);
            connections.put(key, state);
        } else {
            state.updateActivity();
        }
    }

    /**
     * Check if a connection exists
     */
    public synchronized boolean hasConnection(String protocol, String sourceIP, int sourcePort,
                                               String destinationIP, int destinationPort) {
        String key = String.format("%s:%s:%d:%s:%d",
                protocol, sourceIP, sourcePort, destinationIP, destinationPort);
        return connections.containsKey(key);
    }

    /**
     * Clean up expired connections
     */
    public synchronized int cleanupExpired() {
        int removed = 0;
        Iterator<Map.Entry<String, ConnectionState>> iterator = connections.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, ConnectionState> entry = iterator.next();
            if (entry.getValue().isExpired()) {
                iterator.remove();
                removed++;
            }
        }

        if (removed > 0) {
            Log.d(TAG, "Cleaned up " + removed + " expired connections");
        }

        return removed;
    }

    /**
     * Get total number of tracked connections
     */
    public synchronized int getConnectionCount() {
        return connections.size();
    }

    /**
     * Clear all connections
     */
    public synchronized void clear() {
        connections.clear();
        Log.i(TAG, "All connections cleared");
    }
}
