package org.snmp4j.smi;

import java.net.InetAddress;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public class TcpAddress extends TransportIpAddress {
    private static final LogAdapter logger = LogFactory.getLogger(TcpAddress.class);
    static final long serialVersionUID = 1165319744164017388L;

    public TcpAddress() {
    }

    public static Address parse(String str) {
        try {
            TcpAddress tcpAddress = new TcpAddress();
            if (tcpAddress.parseAddress(str)) {
                return tcpAddress;
            }
            return null;
        } catch (Exception e10) {
            logger.error(e10);
            return null;
        }
    }

    @Override // org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof TcpAddress) && super.equals(obj);
    }

    public TcpAddress(InetAddress inetAddress, int i10) {
        setInetAddress(inetAddress);
        setPort(i10);
    }

    public TcpAddress(int i10) {
        setPort(i10);
    }

    public TcpAddress(String str) {
        if (!parseAddress(str)) {
            throw new IllegalArgumentException(str);
        }
    }
}
