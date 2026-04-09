package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i61 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12150a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f12151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12152c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12153d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12154e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12155f;
    public final byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f12156h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12157i;

    /* JADX WARN: Illegal instructions before constructor call */
    public i61(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i4 = 0; i4 < cArr.length; i4++) {
            char c9 = cArr[i4];
            if (!(c9 < 128)) {
                throw new IllegalArgumentException(al0.H("Non-ASCII character: %s", Character.valueOf(c9)));
            }
            if (!(bArr[c9] == -1)) {
                throw new IllegalArgumentException(al0.H("Duplicate character: %s", Character.valueOf(c9)));
            }
            bArr[c9] = (byte) i4;
        }
        this(str, cArr, bArr, false);
    }

    public final int a(char c9) throws l61 {
        if (c9 > 127) {
            throw new l61("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c9))));
        }
        byte b10 = this.g[c9];
        if (b10 != -1) {
            return b10;
        }
        if (c9 <= ' ' || c9 == 127) {
            throw new l61("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c9))));
        }
        throw new l61(r5.c.l(new StringBuilder(String.valueOf(c9).length() + 24), "Unrecognized character: ", c9));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i61)) {
            return false;
        }
        i61 i61Var = (i61) obj;
        return this.f12157i == i61Var.f12157i && Arrays.equals(this.f12151b, i61Var.f12151b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12151b) + (true != this.f12157i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f12150a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i61(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.f12150a = r5
            r6.getClass()
            r4.f12151b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L7b
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L7b
            if (r5 <= 0) goto L7d
            int[] r1 = com.google.android.gms.internal.ads.w61.f17921a     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L7b
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L7b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L7b
        L1c:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L7b
            r5.<init>()     // Catch: java.lang.ArithmeticException -> L7b
            throw r5     // Catch: java.lang.ArithmeticException -> L7b
        L22:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L4b
        L31:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 32 - r0
            goto L4b
        L3a:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            com.google.android.gms.internal.ads.mq0.z(r0)     // Catch: java.lang.ArithmeticException -> L7b
        L45:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 31 - r0
        L4b:
            r4.f12153d = r0     // Catch: java.lang.ArithmeticException -> L7b
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.f12154e = r3
            int r6 = r0 >> r6
            r4.f12155f = r6
            int r5 = r5 + (-1)
            r4.f12152c = r5
            r4.g = r7
            boolean[] r5 = new boolean[r3]
        L63:
            int r6 = r4.f12155f
            if (r1 >= r6) goto L76
            int r6 = r1 * 8
            int r7 = r4.f12153d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = com.google.android.gms.internal.ads.yo0.q(r6, r7)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L63
        L76:
            r4.f12156h = r5
            r4.f12157i = r8
            return
        L7b:
            r5 = move-exception
            goto L85
        L7d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L7b
            java.lang.String r7 = "x (0) must be > 0"
            r5.<init>(r7)     // Catch: java.lang.ArithmeticException -> L7b
            throw r5     // Catch: java.lang.ArithmeticException -> L7b
        L85:
            int r6 = r6.length
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8 + 24
            r0.<init>(r8)
            java.lang.String r8 = "Illegal alphabet length "
            java.lang.String r6 = d.h.q(r6, r8, r0)
            r7.<init>(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i61.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
