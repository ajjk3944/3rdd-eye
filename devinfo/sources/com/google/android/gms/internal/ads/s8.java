package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f15894a;

    /* renamed from: b, reason: collision with root package name */
    public String f15895b;

    /* renamed from: c, reason: collision with root package name */
    public u2 f15896c;

    /* renamed from: d, reason: collision with root package name */
    public r8 f15897d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15898e;

    /* renamed from: l, reason: collision with root package name */
    public long f15903l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f15899f = new boolean[3];
    public final x8 g = new x8(32);

    /* renamed from: h, reason: collision with root package name */
    public final x8 f15900h = new x8(33);

    /* renamed from: i, reason: collision with root package name */
    public final x8 f15901i = new x8(34);
    public final x8 j = new x8(39);

    /* renamed from: k, reason: collision with root package name */
    public final x8 f15902k = new x8(40);

    /* renamed from: m, reason: collision with root package name */
    public long f15904m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final sk0 f15905n = new sk0();

    public s8(e9 e9Var) {
        this.f15894a = e9Var;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
        this.f15896c.getClass();
        String str = bq0.f9768a;
        if (z3) {
            this.f15894a.f10746d.L(0);
            h(0, 0, this.f15903l, this.f15904m);
            f(0, 48, this.f15903l, this.f15904m);
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        this.f15903l = 0L;
        this.f15904m = -9223372036854775807L;
        ls.S(this.f15899f);
        this.g.a();
        this.f15900h.a();
        this.f15901i.a();
        this.j.a();
        this.f15902k.a();
        this.f15894a.f10746d.L(0);
        r8 r8Var = this.f15897d;
        if (r8Var != null) {
            r8Var.f15567f = false;
            r8Var.g = false;
            r8Var.f15568h = false;
            r8Var.f15569i = false;
            r8Var.j = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        this.f15904m = j;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void d(sk0 sk0Var) {
        this.f15896c.getClass();
        String str = bq0.f9768a;
        while (sk0Var.B() > 0) {
            int i4 = sk0Var.f16447b;
            int i10 = sk0Var.f16448c;
            byte[] bArr = sk0Var.f16446a;
            this.f15903l += sk0Var.B();
            this.f15896c.b(sk0Var.B(), sk0Var);
            while (i4 < i10) {
                int iQ = ls.Q(bArr, i4, i10, this.f15899f);
                if (iQ == i10) {
                    g(i4, i10, bArr);
                    return;
                }
                int i11 = bArr[iQ + 3] & 126;
                int i12 = 3;
                if (iQ > 0) {
                    int i13 = iQ - 1;
                    if (bArr[i13] == 0) {
                        i12 = 4;
                        iQ = i13;
                    }
                }
                int i14 = iQ - i4;
                if (i14 > 0) {
                    g(i4, iQ, bArr);
                }
                int i15 = i10 - iQ;
                long j = this.f15903l - i15;
                h(i15, i14 < 0 ? -i14 : 0, j, this.f15904m);
                f(i15, i11 >> 1, j, this.f15904m);
                i4 = iQ + i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        h9Var.a();
        h9Var.b();
        this.f15895b = h9Var.f11777e;
        h9Var.b();
        u2 u2VarM = z1Var.m(h9Var.f11776d, 2);
        this.f15896c = u2VarM;
        this.f15897d = new r8(u2VarM);
        this.f15894a.a(z1Var, h9Var);
    }

    public final void f(int i4, int i10, long j, long j8) {
        r8 r8Var = this.f15897d;
        boolean z3 = this.f15898e;
        r8Var.g = false;
        r8Var.f15568h = false;
        r8Var.f15566e = j8;
        r8Var.f15565d = 0;
        r8Var.f15563b = j;
        if (i10 >= 32 && i10 != 40) {
            if (r8Var.f15569i && !r8Var.j) {
                if (z3) {
                    r8Var.a(i4);
                }
                r8Var.f15569i = false;
            }
            if (i10 <= 35 || i10 == 39) {
                r8Var.f15568h = !r8Var.j;
                r8Var.j = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        r8Var.f15564c = z10;
        r8Var.f15567f = z10 || i10 <= 9;
        if (!this.f15898e) {
            this.g.c(i10);
            this.f15900h.c(i10);
            this.f15901i.c(i10);
        }
        this.j.c(i10);
        this.f15902k.c(i10);
    }

    public final void g(int i4, int i10, byte[] bArr) {
        r8 r8Var = this.f15897d;
        if (r8Var.f15567f) {
            int i11 = r8Var.f15565d;
            int i12 = (i4 + 2) - i11;
            if (i12 < i10) {
                r8Var.g = (bArr[i12] & 128) != 0;
                r8Var.f15567f = false;
            } else {
                r8Var.f15565d = (i10 - i4) + i11;
            }
        }
        if (!this.f15898e) {
            this.g.d(i4, i10, bArr);
            this.f15900h.d(i4, i10, bArr);
            this.f15901i.d(i4, i10, bArr);
        }
        this.j.d(i4, i10, bArr);
        this.f15902k.d(i4, i10, bArr);
    }

    public final void h(int i4, int i10, long j, long j8) {
        be1 be1Var = this.f15894a.f10746d;
        r8 r8Var = this.f15897d;
        boolean z3 = this.f15898e;
        if (r8Var.j && r8Var.g) {
            r8Var.f15572m = r8Var.f15564c;
            r8Var.j = false;
        } else if (r8Var.f15568h || r8Var.g) {
            if (z3 && r8Var.f15569i) {
                r8Var.a(i4 + ((int) (j - r8Var.f15563b)));
            }
            r8Var.f15570k = r8Var.f15563b;
            r8Var.f15571l = r8Var.f15566e;
            r8Var.f15572m = r8Var.f15564c;
            r8Var.f15569i = true;
        }
        if (!this.f15898e) {
            x8 x8Var = this.g;
            x8Var.e(i10);
            x8 x8Var2 = this.f15900h;
            x8Var2.e(i10);
            x8 x8Var3 = this.f15901i;
            x8Var3.e(i10);
            if (x8Var.f18319c && x8Var2.f18319c && x8Var3.f18319c) {
                String str = this.f15895b;
                int i11 = x8Var.f18320d;
                byte[] bArr = new byte[x8Var2.f18320d + i11 + x8Var3.f18320d];
                System.arraycopy((byte[]) x8Var.f18321e, 0, bArr, 0, i11);
                System.arraycopy((byte[]) x8Var2.f18321e, 0, bArr, x8Var.f18320d, x8Var2.f18320d);
                System.arraycopy((byte[]) x8Var3.f18321e, 0, bArr, x8Var.f18320d + x8Var2.f18320d, x8Var3.f18320d);
                String strA = null;
                tz0 tz0VarJ = ls.J((byte[]) x8Var2.f18321e, 3, x8Var2.f18320d, null);
                qx0 qx0Var = tz0VarJ.f17009b;
                if (qx0Var != null) {
                    int i12 = qx0Var.f15468f;
                    int[] iArr = qx0Var.f15467e;
                    int i13 = qx0Var.f15466d;
                    strA = ba0.a(qx0Var.f15463a, qx0Var.f15464b, qx0Var.f15465c, i13, iArr, i12);
                }
                lw1 lw1Var = new lw1();
                lw1Var.f13652a = str;
                lw1Var.d("video/mp2t");
                lw1Var.e("video/hevc");
                lw1Var.f13659i = strA;
                lw1Var.f13668s = tz0VarJ.f17012e;
                lw1Var.f13669t = tz0VarJ.f17013f;
                lw1Var.f13670u = tz0VarJ.g;
                lw1Var.f13671v = tz0VarJ.f17014h;
                lw1Var.B = new sm1(tz0VarJ.f17016k, tz0VarJ.f17017l, tz0VarJ.f17018m, null, tz0VarJ.f17010c + 8, tz0VarJ.f17011d + 8);
                lw1Var.f13674y = tz0VarJ.f17015i;
                lw1Var.f13663n = tz0VarJ.j;
                lw1Var.C = tz0VarJ.f17008a + 1;
                lw1Var.f13664o = Collections.singletonList(bArr);
                mx1 mx1Var = new mx1(lw1Var);
                this.f15896c.f(mx1Var);
                int i14 = mx1Var.f14054o;
                mq0.c0(i14 != -1);
                be1Var.J(i14);
                this.f15898e = true;
            }
        }
        x8 x8Var4 = this.j;
        boolean zE = x8Var4.e(i10);
        sk0 sk0Var = this.f15905n;
        if (zE) {
            sk0Var.z(ls.b(x8Var4.f18320d, (byte[]) x8Var4.f18321e), (byte[]) x8Var4.f18321e);
            sk0Var.G(5);
            be1Var.K(j8, sk0Var);
        }
        x8 x8Var5 = this.f15902k;
        if (x8Var5.e(i10)) {
            sk0Var.z(ls.b(x8Var5.f18320d, (byte[]) x8Var5.f18321e), (byte[]) x8Var5.f18321e);
            sk0Var.G(5);
            be1Var.K(j8, sk0Var);
        }
    }
}
