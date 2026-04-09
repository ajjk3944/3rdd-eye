package app.thirdeye.scanner.sniffer;

import android.util.Log;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class PacketParser {
    private static final String TAG = "PacketParser";

    // Protocol numbers
    private static final int PROTOCOL_TCP = 6;
    private static final int PROTOCOL_UDP = 17;
    private static final int PROTOCOL_ICMP = 1;
    private static final int PROTOCOL_ICMPV6 = 58;

    // TCP flags
    private static final int TCP_FLAG_FIN = 0x01;
    private static final int TCP_FLAG_SYN = 0x02;
    private static final int TCP_FLAG_RST = 0x04;
    private static final int TCP_FLAG_PSH = 0x08;
    private static final int TCP_FLAG_ACK = 0x10;
    private static final int TCP_FLAG_URG = 0x20;

    public static class ConnectionInfo {
        public int ipVersion;
        public String protocol;
        public String sourceIP;
        public int sourcePort;
        public String destinationIP;
        public int destinationPort;
        public int packetSize;
        public long timestamp;
        public String tcpFlags;

        public ConnectionInfo() {
            this.timestamp = System.currentTimeMillis();
            this.sourcePort = 0;
            this.destinationPort = 0;
            this.tcpFlags = "";
        }

        @Override
        public String toString() {
            return String.format("IPv%d %s %s:%d -> %s:%d (%d bytes) %s",
                    ipVersion, protocol, sourceIP, sourcePort, destinationIP, destinationPort,
                    packetSize, tcpFlags);
        }
    }

    /**
     * Parse raw IP packet bytes into structured ConnectionInfo
     */
    public static ConnectionInfo parse(byte[] packet, int length) {
        if (packet == null || length < 20) {
            Log.w(TAG, "Packet too short or null");
            return null;
        }

        try {
            ConnectionInfo info = new ConnectionInfo();
            info.packetSize = length;

            // Extract IP version from first nibble
            int versionAndHeaderLength = packet[0] & 0xFF;
            int version = (versionAndHeaderLength >> 4) & 0x0F;
            info.ipVersion = version;

            if (version == 4) {
                return parseIPv4(packet, length, info);
            } else if (version == 6) {
                return parseIPv6(packet, length, info);
            } else {
                Log.w(TAG, "Unknown IP version: " + version);
                return null;
            }
        } catch (Exception e) {
            Log.e(TAG, "Error parsing packet", e);
            return null;
        }
    }

    private static ConnectionInfo parseIPv4(byte[] packet, int length, ConnectionInfo info) {
        if (length < 20) {
            return null;
        }

        // IP header length (lower nibble of byte 0, multiply by 4)
        int headerLength = (packet[0] & 0x0F) * 4;
        if (headerLength < 20 || headerLength > length) {
            Log.w(TAG, "Invalid IPv4 header length: " + headerLength);
            return null;
        }

        // Protocol number (byte 9)
        int protocolNumber = packet[9] & 0xFF;

        // Total packet length (bytes 2-3)
        int totalLength = readUnsignedShort(packet, 2);

        // Source IP (bytes 12-15)
        info.sourceIP = ipv4ToString(packet, 12);

        // Destination IP (bytes 16-19)
        info.destinationIP = ipv4ToString(packet, 16);

        // Parse transport layer based on protocol
        if (protocolNumber == PROTOCOL_TCP) {
            info.protocol = "TCP";
            parseTCP(packet, headerLength, length, info);
        } else if (protocolNumber == PROTOCOL_UDP) {
            info.protocol = "UDP";
            parseUDP(packet, headerLength, length, info);
        } else if (protocolNumber == PROTOCOL_ICMP) {
            info.protocol = "ICMP";
        } else {
            info.protocol = "OTHER";
        }

        return info;
    }

    private static ConnectionInfo parseIPv6(byte[] packet, int length, ConnectionInfo info) {
        if (length < 40) {
            return null;
        }

        // IPv6 header is always 40 bytes
        int headerLength = 40;

        // Next header (protocol) at byte 6
        int protocolNumber = packet[6] & 0xFF;

        // Payload length (bytes 4-5)
        int payloadLength = readUnsignedShort(packet, 4);

        // Source IP (bytes 8-23)
        info.sourceIP = ipv6ToString(packet, 8);

        // Destination IP (bytes 24-39)
        info.destinationIP = ipv6ToString(packet, 24);

        // Parse transport layer based on protocol
        if (protocolNumber == PROTOCOL_TCP) {
            info.protocol = "TCP";
            parseTCP(packet, headerLength, length, info);
        } else if (protocolNumber == PROTOCOL_UDP) {
            info.protocol = "UDP";
            parseUDP(packet, headerLength, length, info);
        } else if (protocolNumber == PROTOCOL_ICMPV6) {
            info.protocol = "ICMP";
        } else {
            info.protocol = "OTHER";
        }

        return info;
    }

    private static void parseTCP(byte[] packet, int ipHeaderLength, int totalLength, ConnectionInfo info) {
        if (ipHeaderLength + 20 > totalLength) {
            return;
        }

        int tcpStart = ipHeaderLength;

        // Source port (first 2 bytes of TCP header)
        info.sourcePort = readUnsignedShort(packet, tcpStart);

        // Destination port (next 2 bytes)
        info.destinationPort = readUnsignedShort(packet, tcpStart + 2);

        // TCP flags (byte 13 of TCP header)
        if (tcpStart + 13 < totalLength) {
            int flags = packet[tcpStart + 13] & 0xFF;
            info.tcpFlags = buildTcpFlagsString(flags);
        }
    }

    private static void parseUDP(byte[] packet, int ipHeaderLength, int totalLength, ConnectionInfo info) {
        if (ipHeaderLength + 8 > totalLength) {
            return;
        }

        int udpStart = ipHeaderLength;

        // Source port (first 2 bytes of UDP header)
        info.sourcePort = readUnsignedShort(packet, udpStart);

        // Destination port (next 2 bytes)
        info.destinationPort = readUnsignedShort(packet, udpStart + 2);

        // UDP length (bytes 4-5)
        // int udpLength = readUnsignedShort(packet, udpStart + 4);
    }

    private static String buildTcpFlagsString(int flags) {
        StringBuilder sb = new StringBuilder();
        if ((flags & TCP_FLAG_FIN) != 0) sb.append("FIN ");
        if ((flags & TCP_FLAG_SYN) != 0) sb.append("SYN ");
        if ((flags & TCP_FLAG_RST) != 0) sb.append("RST ");
        if ((flags & TCP_FLAG_PSH) != 0) sb.append("PSH ");
        if ((flags & TCP_FLAG_ACK) != 0) sb.append("ACK ");
        if ((flags & TCP_FLAG_URG) != 0) sb.append("URG ");
        return sb.toString().trim();
    }

    /**
     * Read 2 bytes as unsigned short (big-endian)
     */
    public static int readUnsignedShort(byte[] data, int offset) {
        if (offset + 1 >= data.length) {
            return 0;
        }
        return ((data[offset] & 0xFF) << 8) | (data[offset + 1] & 0xFF);
    }

    /**
     * Convert 4 bytes to IPv4 dotted decimal string
     */
    public static String ipv4ToString(byte[] data, int offset) {
        if (offset + 3 >= data.length) {
            return "0.0.0.0";
        }
        return String.format("%d.%d.%d.%d",
                data[offset] & 0xFF,
                data[offset + 1] & 0xFF,
                data[offset + 2] & 0xFF,
                data[offset + 3] & 0xFF);
    }

    /**
     * Convert 16 bytes to IPv6 string
     */
    public static String ipv6ToString(byte[] data, int offset) {
        if (offset + 15 >= data.length) {
            return "::";
        }

        try {
            byte[] ipv6Bytes = new byte[16];
            System.arraycopy(data, offset, ipv6Bytes, 0, 16);
            InetAddress addr = InetAddress.getByAddress(ipv6Bytes);
            return addr.getHostAddress();
        } catch (UnknownHostException e) {
            Log.e(TAG, "Error converting IPv6 address", e);
            return "::";
        }
    }

    /**
     * Check if IP address is private/local
     */
    public static boolean isPrivateIP(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }

        try {
            InetAddress addr = InetAddress.getByName(ip);

            // Check for loopback
            if (addr.isLoopbackAddress()) {
                return true;
            }

            // Check for link-local
            if (addr.isLinkLocalAddress()) {
                return true;
            }

            // Check for site-local (private)
            if (addr.isSiteLocalAddress()) {
                return true;
            }

            // Additional checks for IPv4 private ranges
            if (addr instanceof Inet4Address) {
                byte[] bytes = addr.getAddress();
                // 10.0.0.0/8
                if ((bytes[0] & 0xFF) == 10) {
                    return true;
                }
                // 172.16.0.0/12
                if ((bytes[0] & 0xFF) == 172 && (bytes[1] & 0xF0) == 16) {
                    return true;
                }
                // 192.168.0.0/16
                if ((bytes[0] & 0xFF) == 192 && (bytes[1] & 0xFF) == 168) {
                    return true;
                }
                // 127.0.0.0/8 (loopback)
                if ((bytes[0] & 0xFF) == 127) {
                    return true;
                }
            }

            // IPv6 unique local addresses (fc00::/7)
            if (addr instanceof Inet6Address) {
                byte[] bytes = addr.getAddress();
                if ((bytes[0] & 0xFE) == 0xFC) {
                    return true;
                }
            }

            return false;
        } catch (UnknownHostException e) {
            Log.e(TAG, "Error checking if IP is private: " + ip, e);
            return false;
        }
    }
}
