package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616o1 implements InterfaceC1992v0 {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2100x0 f15877b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2046w0 f15878c;

    /* renamed from: d, reason: collision with root package name */
    public U1.b f15879d;

    /* renamed from: e, reason: collision with root package name */
    public C1940u2 f15880e;

    /* renamed from: g, reason: collision with root package name */
    public int f15882g;

    /* renamed from: h, reason: collision with root package name */
    public long f15883h;
    public int i;

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f15876a = new C2036vr(16);

    /* renamed from: j, reason: collision with root package name */
    public long f15884j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f15881f = 0;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.google.android.gms.internal.ads.InterfaceC2046w0 r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.vr r0 = new com.google.android.gms.internal.ads.vr
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.y(r4)
            byte[] r5 = r0.f17354a
            r6 = r13
            com.google.android.gms.internal.ads.r0 r6 = (com.google.android.gms.internal.ads.C1776r0) r6
            r7 = 0
            boolean r5 = r6.y(r5, r7, r4, r2)
            if (r5 != 0) goto L1b
            goto L68
        L1b:
            long r8 = r0.P()
            int r5 = r0.b()
            r10 = 1
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L38
            byte[] r8 = r0.f17354a
            boolean r6 = r6.y(r8, r4, r4, r2)
            if (r6 != 0) goto L32
            goto L68
        L32:
            long r8 = r0.j()
            r6 = r1
            goto L39
        L38:
            r6 = r4
        L39:
            long r10 = (long) r6
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 >= 0) goto L3f
            goto L68
        L3f:
            long r8 = r8 - r10
            int r6 = (int) r8
            if (r3 == 0) goto L69
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L68
            if (r6 >= r4) goto L4b
            goto L68
        L4b:
            r3 = 4
            r0.y(r3)
            byte[] r4 = r0.f17354a
            r5 = r13
            com.google.android.gms.internal.ads.r0 r5 = (com.google.android.gms.internal.ads.C1776r0) r5
            r5.y(r4, r7, r3, r7)
            int r3 = r0.b()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L61
            goto L68
        L61:
            int r6 = r6 + (-4)
            r5.e(r6, r7)
        L66:
            r3 = r7
            goto L9
        L68:
            return r7
        L69:
            r3 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r3) goto L6f
            return r2
        L6f:
            if (r6 == 0) goto L66
            r3 = r13
            com.google.android.gms.internal.ads.r0 r3 = (com.google.android.gms.internal.ads.C1776r0) r3
            r3.e(r6, r7)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1616o1.b(com.google.android.gms.internal.ads.w0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
        if (this.f15880e != null) {
            this.f15880e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        this.f15877b = interfaceC2100x0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        if (j6 != 0) {
            if (this.f15881f == 3) {
                C1940u2 c1940u2 = this.f15880e;
                c1940u2.getClass();
                c1940u2.f(j6, j7);
                return;
            }
            return;
        }
        this.f15881f = 0;
        this.i = 0;
        this.f15884j = -1L;
        if (this.f15880e != null) {
            this.f15880e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) throws P4, NumberFormatException {
        while (true) {
            int i = this.f15881f;
            if (i == 0) {
                int i3 = this.i;
                C2036vr c2036vr = this.f15876a;
                if (i3 == 0) {
                    if (!interfaceC2046w0.w(c2036vr.f17354a, 0, 8, true)) {
                        InterfaceC2100x0 interfaceC2100x0 = this.f15877b;
                        interfaceC2100x0.getClass();
                        interfaceC2100x0.u();
                        this.f15877b.A(new B0(-9223372036854775807L, 0L));
                        this.f15881f = 4;
                        return -1;
                    }
                    this.i = 8;
                    c2036vr.E(0);
                    this.f15883h = c2036vr.P();
                    this.f15882g = c2036vr.b();
                }
                long j6 = this.f15883h;
                if (j6 == 1) {
                    interfaceC2046w0.s(8, 8, c2036vr.f17354a);
                    this.i += 8;
                    j6 = c2036vr.j();
                    this.f15883h = j6;
                }
                if (this.f15882g == 1836086884) {
                    long jO = interfaceC2046w0.o();
                    this.f15884j = jO;
                    long j7 = this.i;
                    C1831s1 c1831s1 = new C1831s1(0L, jO - j7, -9223372036854775807L, jO, j6 - j7);
                    InterfaceC2100x0 interfaceC2100x02 = this.f15877b;
                    interfaceC2100x02.getClass();
                    T0 t0X = interfaceC2100x02.x(1024, 4);
                    C1855sP c1855sP = new C1855sP();
                    c1855sP.d("image/heic");
                    c1855sP.f16730j = new U3(c1831s1);
                    t0X.e(new TP(c1855sP));
                    this.f15881f = 2;
                } else {
                    this.f15881f = 1;
                }
            } else if (i == 1) {
                interfaceC2046w0.t((int) (this.f15883h - this.i));
                this.i = 0;
                this.f15881f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.f15879d == null || interfaceC2046w0 != this.f15878c) {
                        this.f15878c = interfaceC2046w0;
                        this.f15879d = new U1.b(interfaceC2046w0, this.f15884j);
                    }
                    C1940u2 c1940u2 = this.f15880e;
                    c1940u2.getClass();
                    int iG = c1940u2.g(this.f15879d, a02);
                    if (iG == 1) {
                        a02.f6910a += this.f15884j;
                    }
                    return iG;
                }
                if (this.f15880e == null) {
                    this.f15880e = new C1940u2(R2.f10828B, 8);
                }
                U1.b bVar = new U1.b(interfaceC2046w0, this.f15884j);
                this.f15879d = bVar;
                if (this.f15880e.b(bVar)) {
                    C1940u2 c1940u22 = this.f15880e;
                    long j8 = this.f15884j;
                    InterfaceC2100x0 interfaceC2100x03 = this.f15877b;
                    interfaceC2100x03.getClass();
                    c1940u22.e(new U1.b(j8, interfaceC2100x03, 3));
                    this.f15881f = 3;
                } else {
                    InterfaceC2100x0 interfaceC2100x04 = this.f15877b;
                    interfaceC2100x04.getClass();
                    interfaceC2100x04.u();
                    this.f15877b.A(new B0(-9223372036854775807L, 0L));
                    this.f15881f = 4;
                }
            }
        }
    }
}
