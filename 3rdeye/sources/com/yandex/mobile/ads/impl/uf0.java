package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import ia.C4468d;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class uf0 {
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uf0.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String a(String str) {
        InetAddress inetAddressA;
        kotlin.jvm.internal.l.f(str, "<this>");
        int i = 0;
        int i10 = -1;
        if (y9.q.b0(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            if (y9.n.a0(str, "[", false) && y9.n.T(str, "]")) {
                inetAddressA = a(1, str.length() - 1, str);
            } else {
                inetAddressA = a(0, str.length(), str);
            }
            if (inetAddressA == null) {
                return null;
            }
            byte[] address = inetAddressA.getAddress();
            if (address.length == 16) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < address.length) {
                    int i13 = i11;
                    while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                        i13 += 2;
                    }
                    int i14 = i13 - i11;
                    if (i14 > i12 && i14 >= 4) {
                        i10 = i11;
                        i12 = i14;
                    }
                    i11 = i13 + 2;
                }
                C4468d c4468d = new C4468d();
                while (i < address.length) {
                    if (i == i10) {
                        c4468d.C0(58);
                        i += i12;
                        if (i == 16) {
                            c4468d.C0(58);
                        }
                    } else {
                        if (i > 0) {
                            c4468d.C0(58);
                        }
                        byte b10 = address[i];
                        byte[] bArr = t82.f33480a;
                        c4468d.N0(((b10 & 255) << 8) | (address[i + 1] & 255));
                        i += 2;
                    }
                }
                return c4468d.p0();
            }
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError(C1154e9.i("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String ascii = IDN.toASCII(str);
            kotlin.jvm.internal.l.e(ascii, "toASCII(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() == 0) {
                return null;
            }
            int length = lowerCase.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = lowerCase.charAt(i15);
                if (kotlin.jvm.internal.l.h(cCharAt, 31) <= 0 || kotlin.jvm.internal.l.h(cCharAt, 127) >= 0 || y9.q.f0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                    return null;
                }
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
