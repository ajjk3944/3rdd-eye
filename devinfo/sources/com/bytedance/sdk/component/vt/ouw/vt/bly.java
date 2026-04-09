package com.bytedance.sdk.component.vt.ouw.vt;

import d.h;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {
    public static final Charset ouw = Charset.forName("UTF-8");

    public static int ouw(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 < 'A' || c9 > 'F') {
            return -1;
        }
        return c9 - '7';
    }

    private static boolean vt(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void ouw(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static int ouw(String str, int i4) {
        for (int i10 = 0; i10 < i4; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
        }
        return i4;
    }

    public static int ouw(String str, int i4, int i10) {
        for (int i11 = i10 - 1; i11 >= i4; i11--) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i11 + 1;
            }
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if ((r13 - r9) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
    
        r3[r11] = (byte) r14;
        r10 = r18;
        r11 = r11 + 1;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00da, code lost:
    
        if (r7 == 16) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dc, code lost:
    
        if (r8 != (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00de, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00df, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress vt(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.vt.bly.vt(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int ouw(String str, int i4, int i10, String str2) {
        while (i4 < i10) {
            if (str2.indexOf(str.charAt(i4)) != -1) {
                return i4;
            }
            i4++;
        }
        return i10;
    }

    public static int ouw(String str, int i4, int i10, char c9) {
        while (i4 < i10) {
            if (str.charAt(i4) == c9) {
                return i4;
            }
            i4++;
        }
        return i10;
    }

    public static String ouw(String str) {
        InetAddress inetAddressVt;
        if (str.contains(":")) {
            int i4 = 0;
            int i10 = 1;
            if (str.startsWith("[") && str.endsWith("]")) {
                inetAddressVt = vt(str, 1, str.length() - 1);
            } else {
                inetAddressVt = vt(str, 0, str.length());
            }
            if (inetAddressVt == null) {
                return null;
            }
            byte[] address = inetAddressVt.getAddress();
            int i11 = 16;
            if (address.length == 16) {
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                while (i13 < address.length) {
                    int i15 = i13;
                    while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                        i15 += 2;
                    }
                    int i16 = i15 - i13;
                    if (i16 > i14 && i16 >= 4) {
                        i12 = i13;
                        i14 = i16;
                    }
                    i13 = i15 + 2;
                }
                ouw ouwVar = new ouw();
                while (i4 < address.length) {
                    if (i4 == i12) {
                        ouwVar.vt(58);
                        i4 += i14;
                        if (i4 == i11) {
                            ouwVar.vt(58);
                        }
                    } else {
                        if (i4 > 0) {
                            ouwVar.vt(58);
                        }
                        long j = ((address[i4] & 255) << 8) | (address[i4 + 1] & 255);
                        if (j == 0) {
                            ouwVar.vt(48);
                        } else {
                            int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + i10;
                            fkw fkwVarLh = ouwVar.lh(iNumberOfTrailingZeros);
                            byte[] bArr = fkwVarLh.ouw;
                            int i17 = fkwVarLh.f7670lh;
                            for (int i18 = (i17 + iNumberOfTrailingZeros) - i10; i18 >= i17; i18--) {
                                bArr[i18] = ouw.ouw[(int) (j & 15)];
                                j >>>= 4;
                            }
                            fkwVarLh.f7670lh += iNumberOfTrailingZeros;
                            ouwVar.f7671lh += iNumberOfTrailingZeros;
                        }
                        i4 += 2;
                        i10 = 1;
                        i11 = 16;
                    }
                }
                return ouwVar.lh();
            }
            throw new AssertionError(h.t("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (vt(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean ouw(byte[] bArr, int i4, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i4] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }
}
