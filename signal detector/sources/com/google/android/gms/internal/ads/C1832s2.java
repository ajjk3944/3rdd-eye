package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832s2 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16660a;

    /* renamed from: b, reason: collision with root package name */
    public final C1886t2[] f16661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16662c;

    public C1832s2(long j6, C1886t2[] c1886t2Arr, int i) {
        this.f16660a = j6;
        this.f16661b = c1886t2Arr;
        this.f16662c = i;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f16660a;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    @Override // com.google.android.gms.internal.ads.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.K0 i(long r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            com.google.android.gms.internal.ads.t2[] r3 = r0.f16661b
            int r4 = r3.length
            com.google.android.gms.internal.ads.M0 r5 = com.google.android.gms.internal.ads.M0.f9790c
            if (r4 != 0) goto L11
            com.google.android.gms.internal.ads.K0 r1 = new com.google.android.gms.internal.ads.K0
            r1.<init>(r5, r5)
            return r1
        L11:
            r4 = -1
            int r10 = r0.f16662c
            if (r10 == r4) goto L4f
            r11 = r3[r10]
            com.google.android.gms.internal.ads.C2 r11 = r11.f16839b
            int r12 = r11.a(r1)
            if (r12 != r4) goto L24
            int r12 = r11.b(r1)
        L24:
            if (r12 != r4) goto L2c
            com.google.android.gms.internal.ads.K0 r1 = new com.google.android.gms.internal.ads.K0
            r1.<init>(r5, r5)
            return r1
        L2c:
            long[] r5 = r11.f7498f
            r13 = r5[r12]
            long[] r15 = r11.f7495c
            r16 = r15[r12]
            int r18 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r18 >= 0) goto L55
            int r6 = r11.f7494b
            int r6 = r6 + r4
            if (r12 >= r6) goto L55
            int r1 = r11.b(r1)
            if (r1 == r4) goto L55
            if (r1 == r12) goto L55
            r6 = r5[r1]
            r1 = r15[r1]
            r20 = r6
            r6 = r1
            r1 = r20
            goto L5c
        L4f:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r1
        L55:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
        L5c:
            r5 = 0
            r11 = r16
        L5f:
            int r15 = r3.length
            if (r5 >= r15) goto Lb3
            if (r5 == r10) goto La4
            r15 = r3[r5]
            com.google.android.gms.internal.ads.C2 r15 = r15.f16839b
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long[] r8 = r15.f7495c
            int r9 = r15.a(r13)
            if (r9 != r4) goto L79
            int r9 = r15.b(r13)
        L79:
            if (r9 != r4) goto L7e
            r19 = r5
            goto L86
        L7e:
            r19 = r5
            r4 = r8[r9]
            long r11 = java.lang.Math.min(r4, r11)
        L86:
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 == 0) goto La1
            int r4 = r15.a(r1)
            r5 = -1
            if (r4 != r5) goto L95
            int r4 = r15.b(r1)
        L95:
            if (r4 != r5) goto L99
            r9 = r3
            goto Lad
        L99:
            r9 = r3
            r3 = r8[r4]
            long r6 = java.lang.Math.min(r3, r6)
            goto Lad
        La1:
            r9 = r3
            r5 = -1
            goto Lad
        La4:
            r9 = r3
            r19 = r5
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r4
        Lad:
            int r3 = r19 + 1
            r4 = r5
            r5 = r3
            r3 = r9
            goto L5f
        Lb3:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.M0 r3 = new com.google.android.gms.internal.ads.M0
            r3.<init>(r13, r11)
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 != 0) goto Lc7
            com.google.android.gms.internal.ads.K0 r1 = new com.google.android.gms.internal.ads.K0
            r1.<init>(r3, r3)
            return r1
        Lc7:
            com.google.android.gms.internal.ads.M0 r4 = new com.google.android.gms.internal.ads.M0
            r4.<init>(r1, r6)
            com.google.android.gms.internal.ads.K0 r1 = new com.google.android.gms.internal.ads.K0
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1832s2.i(long):com.google.android.gms.internal.ads.K0");
    }
}
