package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f12129a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f12130b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f12131c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12132d;

    public i3(p1 p1Var, r1 r1Var, long j, long j8, long j9, long j10, long j11, int i4) {
        this.f12130b = r1Var;
        this.f12132d = i4;
        this.f12129a = new n1(p1Var, j, j8, j9, j10, j11);
    }

    public static final int c(y1 y1Var, long j, c2 c2Var) {
        if (j == y1Var.G1()) {
            return 0;
        }
        c2Var.f9923a = j;
        return 1;
    }

    public static /* synthetic */ int d(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public final void a(long j) {
        o1 o1Var = this.f12131c;
        if (o1Var == null || o1Var.f14497a != j) {
            n1 n1Var = this.f12129a;
            long jG = n1Var.f14097a.g(j);
            long j8 = n1Var.f14099c;
            long j9 = n1Var.f14100d;
            long j10 = n1Var.f14101e;
            long j11 = n1Var.f14102f;
            o1 o1Var2 = new o1();
            o1Var2.f14497a = j;
            o1Var2.f14498b = jG;
            o1Var2.f14500d = 0L;
            o1Var2.f14501e = j8;
            o1Var2.f14502f = j9;
            o1Var2.g = j10;
            o1Var2.f14499c = j11;
            o1Var2.f14503h = o1.a(jG, 0L, j8, j9, j10, j11);
            this.f12131c = o1Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.ads.y1 r28, com.google.android.gms.internal.ads.c2 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            com.google.android.gms.internal.ads.o1 r3 = r0.f12131c
            r3.getClass()
            long r4 = r3.f14502f
            long r6 = r3.g
            long r8 = r3.f14503h
            long r6 = r6 - r4
            int r10 = r0.f12132d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            com.google.android.gms.internal.ads.r1 r10 = r0.f12130b
            if (r6 > 0) goto L26
            r0.f12131c = r7
            r10.a()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.G1()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lbe
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lbe
            int r4 = (int) r4
            r1.K1(r4)
            r1.B1()
            long r4 = r3.f14498b
            com.google.android.gms.internal.ads.q1 r4 = r10.e(r1, r4)
            int r5 = r4.f15185a
            r15 = r11
            long r11 = r4.f15186b
            r17 = r13
            long r13 = r4.f15187c
            r4 = -3
            if (r5 == r4) goto Lb4
            r4 = -2
            if (r5 == r4) goto L93
            r4 = -1
            if (r5 == r4) goto L74
            long r3 = r1.G1()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6a
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6a
            int r3 = (int) r3
            r1.K1(r3)
        L6a:
            r0.f12131c = r7
            r10.a()
            int r1 = c(r1, r13, r2)
            return r1
        L74:
            r3.f14501e = r11
            r3.g = r13
            long r4 = r3.f14498b
            long r6 = r3.f14500d
            long r8 = r3.f14502f
            r15 = r4
            long r4 = r3.f14499c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = com.google.android.gms.internal.ads.o1.a(r15, r17, r19, r21, r23, r25)
            r3.f14503h = r4
            goto L6
        L93:
            r4 = r11
            r6 = r13
            r3.f14500d = r4
            r3.f14502f = r6
            long r8 = r3.f14498b
            long r10 = r3.f14501e
            long r12 = r3.g
            long r14 = r3.f14499c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = com.google.android.gms.internal.ads.o1.a(r15, r17, r19, r21, r23, r25)
            r3.f14503h = r4
            goto L6
        Lb4:
            r0.f12131c = r7
            r10.a()
            int r1 = c(r1, r8, r2)
            return r1
        Lbe:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i3.b(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }
}
