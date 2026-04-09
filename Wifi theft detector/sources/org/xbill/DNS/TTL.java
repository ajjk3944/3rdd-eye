package org.xbill.DNS;

/* loaded from: classes4.dex */
public final class TTL {
    public static final long MAX_VALUE = 2147483647L;

    private TTL() {
    }

    public static void check(long j10) {
        if (j10 < 0 || j10 > MAX_VALUE) {
            throw new InvalidTTLException(j10);
        }
    }

    public static String format(long j10) {
        check(j10);
        StringBuffer stringBuffer = new StringBuffer();
        long j11 = j10 % 60;
        long j12 = j10 / 60;
        long j13 = j12 % 60;
        long j14 = j12 / 60;
        long j15 = j14 % 24;
        long j16 = j14 / 24;
        long j17 = j16 % 7;
        long j18 = j16 / 7;
        if (j18 > 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(j18);
            stringBuffer2.append("W");
            stringBuffer.append(stringBuffer2.toString());
        }
        if (j17 > 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(j17);
            stringBuffer3.append("D");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (j15 > 0) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(j15);
            stringBuffer4.append("H");
            stringBuffer.append(stringBuffer4.toString());
        }
        if (j13 > 0) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(j13);
            stringBuffer5.append("M");
            stringBuffer.append(stringBuffer5.toString());
        }
        if (j11 > 0 || (j18 == 0 && j17 == 0 && j15 == 0 && j13 == 0)) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(j11);
            stringBuffer6.append("S");
            stringBuffer.append(stringBuffer6.toString());
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long parse(java.lang.String r16, boolean r17) {
        /*
            r0 = r16
            if (r0 == 0) goto L95
            int r1 = r0.length()
            if (r1 == 0) goto L95
            r1 = 0
            char r2 = r0.charAt(r1)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 == 0) goto L95
            r2 = 0
            r4 = r2
            r6 = r4
        L19:
            int r8 = r0.length()
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 >= r8) goto L7b
            char r8 = r0.charAt(r1)
            boolean r11 = java.lang.Character.isDigit(r8)
            if (r11 == 0) goto L43
            r9 = 10
            long r9 = r9 * r6
            int r8 = java.lang.Character.getNumericValue(r8)
            long r11 = (long) r8
            long r9 = r9 + r11
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 < 0) goto L3d
            r6 = r9
            goto L72
        L3d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>()
            throw r0
        L43:
            char r8 = java.lang.Character.toUpperCase(r8)
            r11 = 68
            r12 = 60
            if (r8 == r11) goto L67
            r11 = 72
            if (r8 == r11) goto L6a
            r11 = 77
            if (r8 == r11) goto L6b
            r11 = 83
            if (r8 == r11) goto L6c
            r11 = 87
            if (r8 != r11) goto L61
            r14 = 7
            long r6 = r6 * r14
            goto L67
        L61:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>()
            throw r0
        L67:
            r14 = 24
            long r6 = r6 * r14
        L6a:
            long r6 = r6 * r12
        L6b:
            long r6 = r6 * r12
        L6c:
            long r4 = r4 + r6
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 > 0) goto L75
            r6 = r2
        L72:
            int r1 = r1 + 1
            goto L19
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>()
            throw r0
        L7b:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L80
            r4 = r6
        L80:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 > 0) goto L8f
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8e
            if (r17 == 0) goto L8e
            return r0
        L8e:
            return r4
        L8f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>()
            throw r0
        L95:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.TTL.parse(java.lang.String, boolean):long");
    }

    public static long parseTTL(String str) {
        return parse(str, true);
    }
}
