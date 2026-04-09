package org.xbill.DNS;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class ClientSubnetOption extends EDNSOption {
    private static final long serialVersionUID = -3868158449890266347L;
    private InetAddress address;
    private int family;
    private int scopeNetmask;
    private int sourceNetmask;

    public ClientSubnetOption() {
        super(8);
    }

    private static int checkMaskLength(String str, int i10, int i11) {
        int iAddressLength = Address.addressLength(i10) * 8;
        if (i11 >= 0 && i11 <= iAddressLength) {
            return i11;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(str);
        stringBuffer.append("\" ");
        stringBuffer.append(i11);
        stringBuffer.append(" must be in the range ");
        stringBuffer.append("[0..");
        stringBuffer.append(iAddressLength);
        stringBuffer.append("]");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public int getFamily() {
        return this.family;
    }

    public int getScopeNetmask() {
        return this.scopeNetmask;
    }

    public int getSourceNetmask() {
        return this.sourceNetmask;
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionFromWire(DNSInput dNSInput) throws WireParseException, UnknownHostException {
        int u16 = dNSInput.readU16();
        this.family = u16;
        if (u16 != 1 && u16 != 2) {
            throw new WireParseException("unknown address family");
        }
        int u82 = dNSInput.readU8();
        this.sourceNetmask = u82;
        if (u82 > Address.addressLength(this.family) * 8) {
            throw new WireParseException("invalid source netmask");
        }
        int u83 = dNSInput.readU8();
        this.scopeNetmask = u83;
        if (u83 > Address.addressLength(this.family) * 8) {
            throw new WireParseException("invalid scope netmask");
        }
        byte[] byteArray = dNSInput.readByteArray();
        if (byteArray.length != (this.sourceNetmask + 7) / 8) {
            throw new WireParseException("invalid address");
        }
        byte[] bArr = new byte[Address.addressLength(this.family)];
        System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.address = byAddress;
            if (!Address.truncate(byAddress, this.sourceNetmask).equals(this.address)) {
                throw new WireParseException("invalid padding");
            }
        } catch (UnknownHostException e10) {
            throw new WireParseException("invalid address", e10);
        }
    }

    @Override // org.xbill.DNS.EDNSOption
    public String optionToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.address.getHostAddress());
        stringBuffer.append("/");
        stringBuffer.append(this.sourceNetmask);
        stringBuffer.append(", scope netmask ");
        stringBuffer.append(this.scopeNetmask);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionToWire(DNSOutput dNSOutput) {
        dNSOutput.writeU16(this.family);
        dNSOutput.writeU8(this.sourceNetmask);
        dNSOutput.writeU8(this.scopeNetmask);
        dNSOutput.writeByteArray(this.address.getAddress(), 0, (this.sourceNetmask + 7) / 8);
    }

    public ClientSubnetOption(int i10, int i11, InetAddress inetAddress) {
        super(8);
        int iFamilyOf = Address.familyOf(inetAddress);
        this.family = iFamilyOf;
        this.sourceNetmask = checkMaskLength("source netmask", iFamilyOf, i10);
        this.scopeNetmask = checkMaskLength("scope netmask", this.family, i11);
        InetAddress inetAddressTruncate = Address.truncate(inetAddress, i10);
        this.address = inetAddressTruncate;
        if (!inetAddress.equals(inetAddressTruncate)) {
            throw new IllegalArgumentException("source netmask is not valid for address");
        }
    }

    public ClientSubnetOption(int i10, InetAddress inetAddress) {
        this(i10, 0, inetAddress);
    }
}
