package org.snmp4j.smi;

import java.net.InetAddress;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public class TlsAddress extends TcpAddress {
    private static final LogAdapter logger = LogFactory.getLogger(SshAddress.class);
    static final long serialVersionUID = 0;

    public TlsAddress() {
    }

    public static Address parse(String str) {
        try {
            TlsAddress tlsAddress = new TlsAddress();
            if (tlsAddress.parseAddress(str)) {
                return tlsAddress;
            }
            return null;
        } catch (Exception e10) {
            logger.error(e10);
            return null;
        }
    }

    @Override // org.snmp4j.smi.TcpAddress, org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof TlsAddress) && super.equals(obj);
    }

    public TlsAddress(InetAddress inetAddress, int i10) {
        super(inetAddress, i10);
    }

    public TlsAddress(String str) {
        if (!parseAddress(str)) {
            throw new IllegalArgumentException(str);
        }
    }
}
