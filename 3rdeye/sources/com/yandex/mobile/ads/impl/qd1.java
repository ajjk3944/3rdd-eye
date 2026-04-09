package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class qd1 implements u70 {

    /* renamed from: a, reason: collision with root package name */
    private w70 f32155a;

    /* renamed from: b, reason: collision with root package name */
    private m22 f32156b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32157c;

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f32155a = w70Var;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        if (this.f32155a == null) {
            throw new IllegalStateException();
        }
        if (this.f32156b == null) {
            rz rzVar = (rz) v70Var;
            if (!a(rzVar)) {
                throw yf1.a("Failed to determine bitstream type", (Exception) null);
            }
            rzVar.c();
        }
        if (!this.f32157c) {
            n52 n52VarA = this.f32155a.a(0, 1);
            this.f32155a.a();
            this.f32156b.a(this.f32155a, n52VarA);
            this.f32157c = true;
        }
        return this.f32156b.a((rz) v70Var, jj1Var);
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        m22 m22Var = this.f32156b;
        if (m22Var != null) {
            m22Var.a(j4, j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        try {
            return a((rz) v70Var);
        } catch (yf1 unused) {
            return false;
        }
    }

    private static /* synthetic */ u70[] a() {
        return new u70[]{new qd1()};
    }

    private boolean a(rz rzVar) throws IOException {
        sd1 sd1Var = new sd1();
        if (sd1Var.a(rzVar, true) && (sd1Var.f32939a & 2) == 2) {
            int iMin = Math.min(sd1Var.f32943e, 8);
            uf1 uf1Var = new uf1(iMin);
            rzVar.b(uf1Var.c(), 0, iMin, false);
            uf1Var.e(0);
            if (uf1Var.a() >= 5 && uf1Var.t() == 127 && uf1Var.v() == 1179402563) {
                this.f32156b = new sb0();
            } else {
                uf1Var.e(0);
                if (ti2.a(1, uf1Var, true)) {
                    this.f32156b = new si2();
                } else {
                    uf1Var.e(0);
                    if (bf1.b(uf1Var)) {
                        this.f32156b = new bf1();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }
}
