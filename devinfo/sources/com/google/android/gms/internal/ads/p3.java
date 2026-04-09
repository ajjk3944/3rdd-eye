package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p3 implements x1 {

    /* renamed from: b, reason: collision with root package name */
    public z1 f14870b;

    /* renamed from: c, reason: collision with root package name */
    public y1 f14871c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.d f14872d;

    /* renamed from: e, reason: collision with root package name */
    public v5 f14873e;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public long f14875h;

    /* renamed from: i, reason: collision with root package name */
    public int f14876i;

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f14869a = new sk0(16);
    public long j = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f14874f = 0;

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.y1 r14) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.sk0 r0 = new com.google.android.gms.internal.ads.sk0
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.y(r4)
            byte[] r5 = r0.f16446a
            r6 = r14
            com.google.android.gms.internal.ads.t1 r6 = (com.google.android.gms.internal.ads.t1) r6
            r7 = 0
            boolean r5 = r6.O1(r5, r7, r4, r2)
            if (r5 != 0) goto L1b
            goto L65
        L1b:
            long r8 = r0.P()
            int r5 = r0.b()
            r10 = 1
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L38
            byte[] r8 = r0.f16446a
            boolean r8 = r6.O1(r8, r4, r4, r2)
            if (r8 != 0) goto L32
            goto L65
        L32:
            long r8 = r0.j()
            r10 = r1
            goto L39
        L38:
            r10 = r4
        L39:
            long r10 = (long) r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L3f
            goto L65
        L3f:
            long r8 = r8 - r10
            int r8 = (int) r8
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r8 >= r4) goto L4b
            goto L65
        L4b:
            r3 = 4
            r0.y(r3)
            byte[] r4 = r0.f16446a
            r6.O1(r4, r7, r3, r7)
            int r3 = r0.b()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5e
            goto L65
        L5e:
            int r8 = r8 + (-4)
            r6.e(r8, r7)
        L63:
            r3 = r7
            goto L9
        L65:
            return r7
        L66:
            r3 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r3) goto L6c
            return r2
        L6c:
            if (r8 == 0) goto L63
            r6.e(r8, r7)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p3.c(com.google.android.gms.internal.ads.y1):boolean");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
        if (this.f14873e != null) {
            this.f14873e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f14870b = z1Var;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        if (j != 0) {
            if (this.f14874f == 3) {
                v5 v5Var = this.f14873e;
                v5Var.getClass();
                v5Var.f(j, j8);
                return;
            }
            return;
        }
        this.f14874f = 0;
        this.f14876i = 0;
        this.j = -1L;
        if (this.f14873e != null) {
            this.f14873e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) throws NumberFormatException, ua {
        while (true) {
            int i4 = this.f14874f;
            if (i4 == 0) {
                int i10 = this.f14876i;
                sk0 sk0Var = this.f14869a;
                if (i10 == 0) {
                    if (!y1Var.N1(sk0Var.f16446a, 0, 8, true)) {
                        z1 z1Var = this.f14870b;
                        z1Var.getClass();
                        z1Var.i();
                        this.f14870b.o(new d2(-9223372036854775807L, 0L));
                        this.f14874f = 4;
                        return -1;
                    }
                    this.f14876i = 8;
                    sk0Var.E(0);
                    this.f14875h = sk0Var.P();
                    this.g = sk0Var.b();
                }
                long j = this.f14875h;
                if (j == 1) {
                    y1Var.L1(8, 8, sk0Var.f16446a);
                    this.f14876i += 8;
                    j = sk0Var.j();
                    this.f14875h = j;
                }
                if (this.g == 1836086884) {
                    long jG1 = y1Var.G1();
                    this.j = jG1;
                    long j8 = this.f14876i;
                    t3 t3Var = new t3(0L, jG1 - j8, -9223372036854775807L, jG1, j - j8);
                    z1 z1Var2 = this.f14870b;
                    z1Var2.getClass();
                    u2 u2VarM = z1Var2.m(Segment.SHARE_MINIMUM, 4);
                    lw1 lw1Var = new lw1();
                    lw1Var.d("image/heic");
                    lw1Var.j = new v8(t3Var);
                    u2VarM.f(new mx1(lw1Var));
                    this.f14874f = 2;
                } else {
                    this.f14874f = 1;
                }
            } else if (i4 == 1) {
                y1Var.K1((int) (this.f14875h - this.f14876i));
                this.f14876i = 0;
                this.f14874f = 0;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return -1;
                    }
                    if (this.f14872d == null || y1Var != this.f14871c) {
                        this.f14871c = y1Var;
                        this.f14872d = new androidx.recyclerview.widget.d(y1Var, this.j);
                    }
                    v5 v5Var = this.f14873e;
                    v5Var.getClass();
                    int iG = v5Var.g(this.f14872d, c2Var);
                    if (iG == 1) {
                        c2Var.f9923a += this.j;
                    }
                    return iG;
                }
                if (this.f14873e == null) {
                    this.f14873e = new v5(r6.I8, 8);
                }
                androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(y1Var, this.j);
                this.f14872d = dVar;
                if (this.f14873e.c(dVar)) {
                    v5 v5Var2 = this.f14873e;
                    long j9 = this.j;
                    z1 z1Var3 = this.f14870b;
                    z1Var3.getClass();
                    v5Var2.e(new androidx.recyclerview.widget.d(j9, z1Var3, 2));
                    this.f14874f = 3;
                } else {
                    z1 z1Var4 = this.f14870b;
                    z1Var4.getClass();
                    z1Var4.i();
                    this.f14870b.o(new d2(-9223372036854775807L, 0L));
                    this.f14874f = 4;
                }
            }
        }
    }
}
