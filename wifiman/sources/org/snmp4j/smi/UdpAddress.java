package org.snmp4j.smi;

import java.net.InetAddress;

/* loaded from: classes2.dex */
public class UdpAddress extends TransportIpAddress {
    static final long serialVersionUID = -4390734262648716203L;

    public UdpAddress() {
    }

    public static Address parse(String str) {
        UdpAddress udpAddress = new UdpAddress();
        if (udpAddress.parseAddress(str)) {
            return udpAddress;
        }
        return null;
    }

    @Override // org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof UdpAddress) && super.equals(obj);
    }

    public UdpAddress(InetAddress inetAddress, int i10) {
        setInetAddress(inetAddress);
        setPort(i10);
    }

    public UdpAddress(int i10) {
        setPort(i10);
    }

    public UdpAddress(String str) {
        if (!parseAddress(str)) {
            throw new IllegalArgumentException(str);
        }
    }
}
