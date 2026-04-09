package org.xbill.DNS;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public final class ReverseMap {
    private static Name inaddr4 = Name.fromConstantString("in-addr.arpa.");
    private static Name inaddr6 = Name.fromConstantString("ip6.arpa.");

    private ReverseMap() {
    }

    public static Name fromAddress(byte[] bArr) {
        if (bArr.length != 4 && bArr.length != 16) {
            throw new IllegalArgumentException("array must contain 4 or 16 elements");
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr.length == 4) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                stringBuffer.append(bArr[length] & 255);
                if (length > 0) {
                    stringBuffer.append(".");
                }
            }
        } else {
            for (int length2 = bArr.length - 1; length2 >= 0; length2--) {
                int i10 = bArr[length2];
                int[] iArr = {(i10 & 255) >> 4, i10 & 15};
                for (int i11 = 1; i11 >= 0; i11--) {
                    stringBuffer.append(Integer.toHexString(iArr[i11]));
                    if (length2 > 0 || i11 > 0) {
                        stringBuffer.append(".");
                    }
                }
            }
        }
        try {
            return bArr.length == 4 ? Name.fromString(stringBuffer.toString(), inaddr4) : Name.fromString(stringBuffer.toString(), inaddr6);
        } catch (TextParseException unused) {
            throw new IllegalStateException("name cannot be invalid");
        }
    }

    public static Name fromAddress(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 >= 0 && i11 <= 255) {
                bArr[i10] = (byte) i11;
            } else {
                throw new IllegalArgumentException("array must contain values between 0 and 255");
            }
        }
        return fromAddress(bArr);
    }

    public static Name fromAddress(InetAddress inetAddress) {
        return fromAddress(inetAddress.getAddress());
    }

    public static Name fromAddress(String str, int i10) throws UnknownHostException {
        byte[] byteArray = Address.toByteArray(str, i10);
        if (byteArray != null) {
            return fromAddress(byteArray);
        }
        throw new UnknownHostException("Invalid IP address");
    }

    public static Name fromAddress(String str) throws UnknownHostException {
        byte[] byteArray = Address.toByteArray(str, 1);
        if (byteArray == null) {
            byteArray = Address.toByteArray(str, 2);
        }
        if (byteArray != null) {
            return fromAddress(byteArray);
        }
        throw new UnknownHostException("Invalid IP address");
    }
}
