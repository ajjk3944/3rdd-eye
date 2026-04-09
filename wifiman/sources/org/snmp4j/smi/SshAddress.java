package org.snmp4j.smi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public class SshAddress extends TcpAddress {
    private static final LogAdapter logger = LogFactory.getLogger(SshAddress.class);
    static final long serialVersionUID = 0;
    private String addressURI;
    private String userName;

    public SshAddress(String str) {
        this.addressURI = str;
        parseAddress(str);
    }

    @Override // org.snmp4j.smi.TcpAddress, org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SshAddress sshAddress = (SshAddress) obj;
        if (!getInetAddress().equals(sshAddress.getInetAddress()) || !this.addressURI.equals(sshAddress.addressURI)) {
            return false;
        }
        String str = this.userName;
        String str2 = sshAddress.userName;
        return str == null ? str2 == null : str.equals(str2);
    }

    public String getAddressURI() {
        return this.addressURI;
    }

    public String getUserName() {
        return this.userName;
    }

    @Override // org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return (super.hashCode() * 31) + this.addressURI.hashCode();
    }

    @Override // org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.Address
    public boolean parseAddress(String str) {
        String strSubstring;
        String strSubstring2;
        int i10;
        int i11;
        try {
            int iLastIndexOf = str.lastIndexOf(58);
            String strSubstring3 = null;
            if (iLastIndexOf < 0 || (i11 = iLastIndexOf + 1) >= str.length()) {
                strSubstring = str;
                strSubstring2 = null;
            } else {
                strSubstring = str.substring(0, iLastIndexOf);
                strSubstring2 = str.substring(i11);
            }
            int iIndexOf = strSubstring.indexOf(64);
            if (iIndexOf > 0 && (i10 = iIndexOf + 1) < strSubstring.length()) {
                strSubstring3 = strSubstring.substring(0, iIndexOf);
                strSubstring = strSubstring.substring(i10);
            }
            try {
                setInetAddress(InetAddress.getByName(strSubstring));
                this.port = Integer.parseInt(strSubstring2);
                this.userName = strSubstring3;
                return true;
            } catch (UnknownHostException unused) {
                return false;
            }
        } catch (Exception e10) {
            logger.error("Failed to parse address '" + str + "' as SSH address: " + e10.getMessage(), e10);
            return false;
        }
    }

    @Override // org.snmp4j.smi.TransportIpAddress, org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return "SshAddress[addressURI='" + this.addressURI + "']";
    }

    public SshAddress(InetAddress inetAddress, int i10) {
        super(inetAddress, i10);
        this.addressURI = "" + inetAddress.getHostAddress() + ':' + i10;
    }

    public SshAddress(InetAddress inetAddress, int i10, String str) {
        super(inetAddress, i10);
        this.userName = str;
        this.addressURI = str + '@' + inetAddress.getHostAddress() + ':' + i10;
    }
}
