package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public abstract class TransportIpAddress extends IpAddress {
    private static final LogAdapter logger = LogFactory.getLogger(TransportIpAddress.class);
    static final long serialVersionUID = 695596530250216972L;
    protected int port = 0;

    public static Address parse(String str) {
        UdpAddress udpAddress = new UdpAddress();
        if (udpAddress.parseAddress(str)) {
            return udpAddress;
        }
        return null;
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        OctetString octetString = new OctetString();
        octetString.decodeBER(bERInputStream);
        try {
            setTransportAddress(octetString);
        } catch (Exception e10) {
            logger.error("Wrong encoding of TransportAddress");
            throw new IOException("Wrong encoding of TransportAddress: " + e10.getMessage());
        }
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        new OctetString(getValue()).encodeBER(outputStream);
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof TransportIpAddress) && super.equals(obj) && ((TransportIpAddress) obj).getPort() == this.port;
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        return getValue().length;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERPayloadLength() {
        return getBERLength();
    }

    public int getPort() {
        return this.port;
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 4;
    }

    public byte[] getValue() {
        int iIntValue;
        int i10;
        byte[] address = getInetAddress().getAddress();
        if (getInetAddress() instanceof Inet6Address) {
            try {
                iIntValue = ((Number) Inet6Address.class.getMethod("getScopeId", null).invoke((Inet6Address) getInetAddress(), null)).intValue();
                i10 = 4;
            } catch (Exception unused) {
            }
        } else {
            iIntValue = 0;
            i10 = 0;
        }
        byte[] bArr = new byte[address.length + 2 + i10];
        System.arraycopy(address, 0, bArr, 0, address.length);
        int length = address.length;
        if (i10 > 0) {
            bArr[length] = (byte) (((-16777216) & iIntValue) >> 24);
            bArr[length + 1] = (byte) ((16711680 & iIntValue) >> 16);
            int i11 = length + 3;
            bArr[length + 2] = (byte) ((65280 & iIntValue) >> 8);
            length += 4;
            bArr[i11] = (byte) (iIntValue & 255);
        }
        int i12 = this.port;
        bArr[length] = (byte) ((i12 >> 8) & 255);
        bArr[length + 1] = (byte) (i12 & 255);
        return bArr;
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return super.hashCode() ^ (this.port + 2);
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.Address
    public boolean isValid() {
        int i10;
        return super.isValid() && (i10 = this.port) >= 0 && i10 <= 65535;
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.Address
    public boolean parseAddress(String str) {
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(str, MqttTopic.TOPIC_LEVEL_SEPARATOR);
            String strNextToken = stringTokenizer.nextToken();
            String strNextToken2 = stringTokenizer.nextToken();
            if (super.parseAddress(strNextToken)) {
                this.port = Integer.parseInt(strNextToken2);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void setPort(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            this.port = i10;
            return;
        }
        throw new IllegalArgumentException("Illegal port specified: " + i10);
    }

    public void setTransportAddress(OctetString octetString) throws UnknownHostException {
        byte[] value = octetString.substring(0, octetString.length() - 2).getValue();
        if (value.length == 8 || value.length == 20) {
            int length = value.length;
            int i10 = length - 4;
            byte[] bArr = new byte[i10];
            System.arraycopy(value, 0, bArr, 0, i10);
            try {
                setInetAddress((InetAddress) Inet6Address.class.getMethod("getByAddress", String.class, byte[].class, Integer.TYPE).invoke(Inet6Address.class, null, bArr, Integer.valueOf((value[i10] << 24) + ((value[length - 3] & 255) << 16) + ((value[length - 2] & 255) << 8) + (value[length - 1] & 255))));
            } catch (Exception unused) {
                logger.warn("Java < 1.5 does not support scoped IPv6 addresses, ignoring scope ID for " + octetString);
                setInetAddress(InetAddress.getByAddress(bArr));
            }
        } else {
            setInetAddress(InetAddress.getByAddress(value));
        }
        int i11 = (octetString.get(octetString.length() - 2) & 255) << 8;
        this.port = i11;
        this.port = i11 + (octetString.get(octetString.length() - 1) & 255);
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return super.toString() + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.port;
    }

    @Override // org.snmp4j.smi.IpAddress, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        int iCompareTo = super.compareTo(variable);
        return iCompareTo == 0 ? this.port - ((TransportIpAddress) variable).getPort() : iCompareTo;
    }
}
