package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public class IpAddress extends SMIAddress implements AssignableFromByteArray {
    private static final long serialVersionUID = -146846354059565449L;
    private InetAddress inetAddress;
    private static final LogAdapter logger = LogFactory.getLogger(AbstractVariable.class);
    private static final byte[] IPANYADDRESS = {0, 0, 0, 0};
    public static final InetAddress ANY_IPADDRESS = createAnyAddress();

    public IpAddress() {
        this.inetAddress = ANY_IPADDRESS;
    }

    private static InetAddress createAnyAddress() {
        try {
            return InetAddress.getByAddress(IPANYADDRESS);
        } catch (Exception e10) {
            logger.error("Unable to create any IpAddress: " + e10.getMessage(), e10);
            return null;
        }
    }

    public static Address parse(String str) {
        try {
            return new IpAddress(InetAddress.getByName(str));
        } catch (Exception e10) {
            logger.error("Unable to parse IpAddress from: " + str, e10);
            return null;
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new IpAddress(this.inetAddress);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        byte[] bArrDecodeString = BER.decodeString(bERInputStream, mutableByte);
        if (mutableByte.getValue() != 64) {
            throw new IOException("Wrong type encountered when decoding Counter: " + ((int) mutableByte.getValue()));
        }
        if (bArrDecodeString.length == 4) {
            this.inetAddress = InetAddress.getByAddress(bArrDecodeString);
            return;
        }
        throw new IOException("IpAddress encoding error, wrong length: " + bArrDecodeString.length);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4];
        InetAddress inetAddress = this.inetAddress;
        if (!(inetAddress instanceof Inet6Address)) {
            System.arraycopy(inetAddress.getAddress(), 0, bArr, 0, 4);
        } else if (((Inet6Address) inetAddress).isIPv4CompatibleAddress()) {
            System.arraycopy(this.inetAddress.getAddress(), r2.length - 5, bArr, 0, 4);
        }
        BER.encodeString(outputStream, (byte) 64, bArr);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof IpAddress) && compareTo((Variable) obj) == 0;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        byte[] bArr = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10] = (byte) (oid.get(i10) & 255);
        }
        try {
            setAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        return 6;
    }

    public InetAddress getInetAddress() {
        return this.inetAddress;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 64;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        InetAddress inetAddress = this.inetAddress;
        if (inetAddress != null) {
            return inetAddress.hashCode();
        }
        return 0;
    }

    @Override // org.snmp4j.smi.Address
    public boolean isValid() {
        return this.inetAddress != null;
    }

    @Override // org.snmp4j.smi.Address
    public boolean parseAddress(String str) {
        try {
            this.inetAddress = InetAddress.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public void setAddress(byte[] bArr) throws UnknownHostException {
        this.inetAddress = InetAddress.getByAddress(bArr);
    }

    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    @Override // org.snmp4j.smi.Address, org.snmp4j.smi.AssignableFromString
    public void setValue(String str) {
        if (parseAddress(str)) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be parsed by " + getClass().getName());
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public byte[] toByteArray() {
        if (getInetAddress() != null) {
            return getInetAddress().getAddress();
        }
        return null;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int toInt() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public long toLong() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        InetAddress inetAddress = this.inetAddress;
        if (inetAddress == null) {
            return "0.0.0.0";
        }
        String string = inetAddress.toString();
        return string.substring(string.indexOf(47) + 1);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        byte[] bArr = new byte[4];
        System.arraycopy(this.inetAddress.getAddress(), 0, bArr, 0, 4);
        OID oid = new OID(new int[4]);
        for (int i10 = 0; i10 < 4; i10++) {
            oid.set(i10, bArr[i10] & 255);
        }
        return oid;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        return new OctetString(this.inetAddress.getAddress()).compareTo((Variable) new OctetString(((IpAddress) variable).getInetAddress().getAddress()));
    }

    public IpAddress(InetAddress inetAddress) {
        inetAddress.getClass();
        this.inetAddress = inetAddress;
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public void setValue(byte[] bArr) {
        try {
            setAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    public IpAddress(String str) {
        if (!parseAddress(str)) {
            throw new IllegalArgumentException(str);
        }
    }

    public IpAddress(byte[] bArr) {
        try {
            this.inetAddress = InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new IllegalArgumentException("Unknown host: " + e10.getMessage());
        }
    }
}
