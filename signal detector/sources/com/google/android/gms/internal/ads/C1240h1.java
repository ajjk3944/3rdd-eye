package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240h1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1399k0 f14410a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1615o0 f14411b;

    /* renamed from: c, reason: collision with root package name */
    public C1453l0 f14412c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14413d;

    public C1240h1(InterfaceC1507m0 interfaceC1507m0, InterfaceC1615o0 interfaceC1615o0, long j6, long j7, long j8, long j9, long j10, int i) {
        this.f14411b = interfaceC1615o0;
        this.f14413d = i;
        this.f14410a = new C1399k0(interfaceC1507m0, j6, j7, j8, j9, j10);
    }

    public static final int c(InterfaceC2046w0 interfaceC2046w0, long j6, A0 a02) {
        if (j6 == interfaceC2046w0.o()) {
            return 0;
        }
        a02.f6910a = j6;
        return 1;
    }

    public static /* synthetic */ int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(long j6) {
        C1453l0 c1453l0 = this.f14412c;
        if (c1453l0 == null || c1453l0.f15322a != j6) {
            C1399k0 c1399k0 = this.f14410a;
            long jG = c1399k0.f15032a.g(j6);
            long j7 = c1399k0.f15034c;
            long j8 = c1399k0.f15035d;
            long j9 = c1399k0.f15036e;
            long j10 = c1399k0.f15037f;
            C1453l0 c1453l02 = new C1453l0();
            c1453l02.f15322a = j6;
            c1453l02.f15323b = jG;
            c1453l02.f15325d = 0L;
            c1453l02.f15326e = j7;
            c1453l02.f15327f = j8;
            c1453l02.f15328g = j9;
            c1453l02.f15324c = j10;
            c1453l02.f15329h = C1453l0.a(jG, 0L, j7, j8, j9, j10);
            this.f14412c = c1453l02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC2046w0 r28, com.google.android.gms.internal.ads.A0 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            com.google.android.gms.internal.ads.l0 r3 = r0.f14412c
            r3.getClass()
            long r4 = r3.f15327f
            long r6 = r3.f15328g
            long r8 = r3.f15329h
            long r6 = r6 - r4
            int r10 = r0.f14413d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            com.google.android.gms.internal.ads.o0 r10 = r0.f14411b
            if (r6 > 0) goto L26
            r0.f14412c = r7
            r10.mo9c()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.o()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lbe
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lbe
            int r4 = (int) r4
            r1.t(r4)
            r1.i()
            long r4 = r3.f15323b
            com.google.android.gms.internal.ads.n0 r4 = r10.j(r1, r4)
            int r5 = r4.f15698a
            r15 = r11
            long r11 = r4.f15699b
            r17 = r13
            long r13 = r4.f15700c
            r4 = -3
            if (r5 == r4) goto Lb4
            r4 = -2
            if (r5 == r4) goto L93
            r4 = -1
            if (r5 == r4) goto L74
            long r3 = r1.o()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6a
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6a
            int r3 = (int) r3
            r1.t(r3)
        L6a:
            r0.f14412c = r7
            r10.mo9c()
            int r1 = c(r1, r13, r2)
            return r1
        L74:
            r3.f15326e = r11
            r3.f15328g = r13
            long r4 = r3.f15323b
            long r6 = r3.f15325d
            long r8 = r3.f15327f
            r15 = r4
            long r4 = r3.f15324c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = com.google.android.gms.internal.ads.C1453l0.a(r15, r17, r19, r21, r23, r25)
            r3.f15329h = r4
            goto L6
        L93:
            r4 = r11
            r6 = r13
            r3.f15325d = r4
            r3.f15327f = r6
            long r8 = r3.f15323b
            long r10 = r3.f15326e
            long r12 = r3.f15328g
            long r14 = r3.f15324c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = com.google.android.gms.internal.ads.C1453l0.a(r15, r17, r19, r21, r23, r25)
            r3.f15329h = r4
            goto L6
        Lb4:
            r0.f14412c = r7
            r10.mo9c()
            int r1 = c(r1, r8, r2)
            return r1
        Lbe:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1240h1.b(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }
}
