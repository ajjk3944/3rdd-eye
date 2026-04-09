package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class mk implements so1, to1 {

    /* renamed from: b, reason: collision with root package name */
    private final int f30405b;

    /* renamed from: d, reason: collision with root package name */
    private uo1 f30407d;

    /* renamed from: e, reason: collision with root package name */
    private int f30408e;

    /* renamed from: f, reason: collision with root package name */
    private gi1 f30409f;

    /* renamed from: g, reason: collision with root package name */
    private int f30410g;

    /* renamed from: h, reason: collision with root package name */
    private ft1 f30411h;
    private dc0[] i;

    /* renamed from: j, reason: collision with root package name */
    private long f30412j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30414l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f30415m;

    /* renamed from: c, reason: collision with root package name */
    private final ec0 f30406c = new ec0();

    /* renamed from: k, reason: collision with root package name */
    private long f30413k = Long.MIN_VALUE;

    public mk(int i) {
        this.f30405b = i;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public /* synthetic */ void a(float f10, float f11) throws h60 {
        K3.a(this, f10, f11);
    }

    public abstract void a(long j4, boolean z10) throws h60;

    public abstract void a(dc0[] dc0VarArr, long j4, long j10) throws h60;

    @Override // com.yandex.mobile.ads.impl.so1
    public final void b() {
        if (this.f30410g != 0) {
            throw new IllegalStateException();
        }
        ec0 ec0Var = this.f30406c;
        ec0Var.f26788a = null;
        ec0Var.f26789b = null;
        v();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void c() {
        if (this.f30410g != 1) {
            throw new IllegalStateException();
        }
        ec0 ec0Var = this.f30406c;
        ec0Var.f26788a = null;
        ec0Var.f26789b = null;
        this.f30410g = 0;
        this.f30411h = null;
        this.i = null;
        this.f30414l = false;
        u();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean e() {
        return this.f30413k == Long.MIN_VALUE;
    }

    public int f() throws h60 {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final ft1 g() {
        return this.f30411h;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final int getState() {
        return this.f30410g;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void h() {
        this.f30414l = true;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void i() throws IOException {
        ft1 ft1Var = this.f30411h;
        ft1Var.getClass();
        ft1Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final long j() {
        return this.f30413k;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean k() {
        return this.f30414l;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public tu0 l() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final int m() {
        return this.f30405b;
    }

    public final uo1 p() {
        uo1 uo1Var = this.f30407d;
        uo1Var.getClass();
        return uo1Var;
    }

    public final ec0 q() {
        ec0 ec0Var = this.f30406c;
        ec0Var.f26788a = null;
        ec0Var.f26789b = null;
        return ec0Var;
    }

    public final gi1 r() {
        gi1 gi1Var = this.f30409f;
        gi1Var.getClass();
        return gi1Var;
    }

    public final dc0[] s() {
        dc0[] dc0VarArr = this.i;
        dc0VarArr.getClass();
        return dc0VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void start() throws h60 {
        if (this.f30410g != 1) {
            throw new IllegalStateException();
        }
        this.f30410g = 2;
        w();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void stop() {
        if (this.f30410g != 2) {
            throw new IllegalStateException();
        }
        this.f30410g = 1;
        x();
    }

    public final boolean t() {
        if (e()) {
            return this.f30414l;
        }
        ft1 ft1Var = this.f30411h;
        ft1Var.getClass();
        return ft1Var.d();
    }

    public abstract void u();

    @Override // com.yandex.mobile.ads.impl.hi1.b
    public void a(int i, Object obj) throws h60 {
    }

    public void a(boolean z10, boolean z11) throws h60 {
    }

    public final h60 a(int i, dc0 dc0Var, Exception exc, boolean z10) {
        int iA;
        if (dc0Var == null || this.f30415m) {
            iA = 4;
        } else {
            this.f30415m = true;
            try {
                iA = a(dc0Var) & 7;
            } catch (h60 unused) {
            } finally {
                this.f30415m = false;
            }
        }
        return h60.a(exc, getName(), this.f30408e, dc0Var, iA, z10, i);
    }

    public final int b(long j4) {
        ft1 ft1Var = this.f30411h;
        ft1Var.getClass();
        return ft1Var.a(j4 - this.f30412j);
    }

    public final h60 a(Exception exc, dc0 dc0Var, int i) {
        return a(i, dc0Var, exc, false);
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(uo1 uo1Var, dc0[] dc0VarArr, ft1 ft1Var, long j4, boolean z10, boolean z11, long j10, long j11) throws h60 {
        if (this.f30410g == 0) {
            this.f30407d = uo1Var;
            this.f30410g = 1;
            a(z10, z11);
            a(dc0VarArr, ft1Var, j10, j11);
            this.f30414l = false;
            this.f30413k = j4;
            a(j4, z10);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(int i, gi1 gi1Var) {
        this.f30408e = i;
        this.f30409f = gi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final mk n() {
        return this;
    }

    public void v() {
    }

    public void w() throws h60 {
    }

    public void x() {
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public boolean a() {
        return e();
    }

    public final int a(ec0 ec0Var, my myVar, int i) {
        ft1 ft1Var = this.f30411h;
        ft1Var.getClass();
        int iA = ft1Var.a(ec0Var, myVar, i);
        if (iA != -4) {
            if (iA == -5) {
                dc0 dc0Var = ec0Var.f26789b;
                dc0Var.getClass();
                if (dc0Var.f26087q != Long.MAX_VALUE) {
                    ec0Var.f26789b = dc0Var.a().a(dc0Var.f26087q + this.f30412j).a();
                }
            }
            return iA;
        }
        if (myVar.f()) {
            this.f30413k = Long.MIN_VALUE;
            return this.f30414l ? -4 : -3;
        }
        long j4 = myVar.f30574f + this.f30412j;
        myVar.f30574f = j4;
        this.f30413k = Math.max(this.f30413k, j4);
        return iA;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(dc0[] dc0VarArr, ft1 ft1Var, long j4, long j10) throws h60 {
        if (!this.f30414l) {
            this.f30411h = ft1Var;
            if (this.f30413k == Long.MIN_VALUE) {
                this.f30413k = j4;
            }
            this.i = dc0VarArr;
            this.f30412j = j10;
            a(dc0VarArr, j4, j10);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4) throws h60 {
        this.f30414l = false;
        this.f30413k = j4;
        a(j4, false);
    }
}
