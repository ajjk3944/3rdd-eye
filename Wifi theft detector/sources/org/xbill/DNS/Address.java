package org.xbill.DNS;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public final class Address {
    public static final int IPv4 = 1;
    public static final int IPv6 = 2;

    private Address() {
    }

    private static InetAddress addrFromRecord(String str, Record record) throws UnknownHostException {
        return InetAddress.getByAddress(str, (record instanceof ARecord ? ((ARecord) record).getAddress() : ((AAAARecord) record).getAddress()).getAddress());
    }

    public static int addressLength(int i10) {
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int familyOf(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static InetAddress[] getAllByName(String str) throws UnknownHostException {
        try {
            return new InetAddress[]{getByAddress(str)};
        } catch (UnknownHostException unused) {
            Record[] recordArrLookupHostName = lookupHostName(str, true);
            InetAddress[] inetAddressArr = new InetAddress[recordArrLookupHostName.length];
            for (int i10 = 0; i10 < recordArrLookupHostName.length; i10++) {
                inetAddressArr[i10] = addrFromRecord(str, recordArrLookupHostName[i10]);
            }
            return inetAddressArr;
        }
    }

    public static InetAddress getByAddress(String str) throws UnknownHostException {
        byte[] byteArray = toByteArray(str, 1);
        if (byteArray != null) {
            return InetAddress.getByAddress(str, byteArray);
        }
        byte[] byteArray2 = toByteArray(str, 2);
        if (byteArray2 != null) {
            return InetAddress.getByAddress(str, byteArray2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid address: ");
        stringBuffer.append(str);
        throw new UnknownHostException(stringBuffer.toString());
    }

    public static InetAddress getByName(String str) throws UnknownHostException {
        try {
            return getByAddress(str);
        } catch (UnknownHostException unused) {
            return addrFromRecord(str, lookupHostName(str, false)[0]);
        }
    }

    public static String getHostName(InetAddress inetAddress) throws UnknownHostException {
        Record[] recordArrRun = new Lookup(ReverseMap.fromAddress(inetAddress), 12).run();
        if (recordArrRun != null) {
            return ((PTRRecord) recordArrRun[0]).getTarget().toString();
        }
        throw new UnknownHostException("unknown address");
    }

    public static boolean isDottedQuad(String str) {
        return toByteArray(str, 1) != null;
    }

    private static Record[] lookupHostName(String str, boolean z10) throws UnknownHostException {
        Record[] recordArrRun;
        Record[] recordArrRun2;
        try {
            Lookup lookup = new Lookup(str, 1);
            Record[] recordArrRun3 = lookup.run();
            if (recordArrRun3 == null) {
                if (lookup.getResult() != 4 || (recordArrRun2 = new Lookup(str, 28).run()) == null) {
                    throw new UnknownHostException("unknown host");
                }
                return recordArrRun2;
            }
            if (z10 && (recordArrRun = new Lookup(str, 28).run()) != null) {
                Record[] recordArr = new Record[recordArrRun3.length + recordArrRun.length];
                System.arraycopy(recordArrRun3, 0, recordArr, 0, recordArrRun3.length);
                System.arraycopy(recordArrRun, 0, recordArr, recordArrRun3.length, recordArrRun.length);
                return recordArr;
            }
            return recordArrRun3;
        } catch (TextParseException unused) {
            throw new UnknownHostException("invalid name");
        }
    }

    private static byte[] parseV4(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt != '.' || i10 == 3 || i11 == 0) {
                    return null;
                }
                bArr[i10] = (byte) i12;
                i12 = 0;
                i10++;
                i11 = 0;
            } else {
                if (i11 == 3) {
                    return null;
                }
                if (i11 > 0 && i12 == 0) {
                    return null;
                }
                i11++;
                i12 = (i12 * 10) + (cCharAt - '0');
                if (i12 > 255) {
                    return null;
                }
            }
        }
        if (i10 != 3 || i11 == 0) {
            return null;
        }
        bArr[i10] = (byte) i12;
        return bArr;
    }

    private static byte[] parseV6(String str) throws NumberFormatException {
        int i10;
        byte[] byteArray;
        byte[] bArr = new byte[16];
        int i11 = -1;
        String[] strArrSplit = str.split(":", -1);
        int length = strArrSplit.length;
        int i12 = length - 1;
        if (strArrSplit[0].length() != 0) {
            i10 = 0;
        } else {
            if (i12 <= 0 || strArrSplit[1].length() != 0) {
                return null;
            }
            i10 = 1;
        }
        if (strArrSplit[i12].length() == 0) {
            if (i12 - i10 <= 0 || strArrSplit[length - 2].length() != 0) {
                return null;
            }
            i12 = length - 2;
        }
        if ((i12 - i10) + 1 > 8) {
            return null;
        }
        int i13 = 0;
        while (true) {
            if (i10 > i12) {
                break;
            }
            if (strArrSplit[i10].length() == 0) {
                if (i11 >= 0) {
                    return null;
                }
                i11 = i13;
            } else if (strArrSplit[i10].indexOf(46) < 0) {
                for (int i14 = 0; i14 < strArrSplit[i10].length(); i14++) {
                    try {
                        if (Character.digit(strArrSplit[i10].charAt(i14), 16) < 0) {
                            return null;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                int i15 = Integer.parseInt(strArrSplit[i10], 16);
                if (i15 > 65535 || i15 < 0) {
                    break;
                }
                int i16 = i13 + 1;
                bArr[i13] = (byte) (i15 >>> 8);
                i13 += 2;
                bArr[i16] = (byte) (i15 & 255);
            } else {
                if (i10 < i12 || i10 > 6 || (byteArray = toByteArray(strArrSplit[i10], 1)) == null) {
                    return null;
                }
                int i17 = 0;
                while (i17 < 4) {
                    bArr[i13] = byteArray[i17];
                    i17++;
                    i13++;
                }
            }
            i10++;
        }
        if (i13 < 16 && i11 < 0) {
            return null;
        }
        if (i11 >= 0) {
            int i18 = (16 - i13) + i11;
            System.arraycopy(bArr, i11, bArr, i18, i13 - i11);
            while (i11 < i18) {
                bArr[i11] = 0;
                i11++;
            }
        }
        return bArr;
        return null;
    }

    public static int[] toArray(String str, int i10) {
        byte[] byteArray = toByteArray(str, i10);
        if (byteArray == null) {
            return null;
        }
        int[] iArr = new int[byteArray.length];
        for (int i11 = 0; i11 < byteArray.length; i11++) {
            iArr[i11] = byteArray[i11] & 255;
        }
        return iArr;
    }

    public static byte[] toByteArray(String str, int i10) {
        if (i10 == 1) {
            return parseV4(str);
        }
        if (i10 == 2) {
            return parseV6(str);
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String toDottedQuad(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bArr[0] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[1] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[2] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[3] & 255);
        return stringBuffer.toString();
    }

    public static InetAddress truncate(InetAddress inetAddress, int i10) {
        int i11;
        int iAddressLength = addressLength(familyOf(inetAddress)) * 8;
        if (i10 < 0 || i10 > iAddressLength) {
            throw new IllegalArgumentException("invalid mask length");
        }
        if (i10 == iAddressLength) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i12 = i10 / 8;
        int i13 = i12 + 1;
        while (true) {
            if (i13 >= address.length) {
                break;
            }
            address[i13] = 0;
            i13++;
        }
        int i14 = 0;
        for (i11 = 0; i11 < i10 % 8; i11++) {
            i14 |= 1 << (7 - i11);
        }
        address[i12] = (byte) (address[i12] & i14);
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("invalid address");
        }
    }

    public static String toDottedQuad(int[] iArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(iArr[0]);
        stringBuffer.append(".");
        stringBuffer.append(iArr[1]);
        stringBuffer.append(".");
        stringBuffer.append(iArr[2]);
        stringBuffer.append(".");
        stringBuffer.append(iArr[3]);
        return stringBuffer.toString();
    }

    public static int[] toArray(String str) {
        return toArray(str, 1);
    }

    public static InetAddress getByAddress(String str, int i10) throws UnknownHostException {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("unknown address family");
        }
        byte[] byteArray = toByteArray(str, i10);
        if (byteArray != null) {
            return InetAddress.getByAddress(str, byteArray);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid address: ");
        stringBuffer.append(str);
        throw new UnknownHostException(stringBuffer.toString());
    }
}
