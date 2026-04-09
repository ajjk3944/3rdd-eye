package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cb0 implements p60 {

    /* renamed from: a, reason: collision with root package name */
    public final ga0 f10069a;

    /* renamed from: b, reason: collision with root package name */
    public final ha0 f10070b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f10071c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f10072d;

    public cb0(ga0 ga0Var, ha0 ha0Var, Executor executor, ex exVar) {
        this.f10069a = ga0Var;
        this.f10070b = ha0Var;
        this.f10071c = executor;
        this.f10072d = exVar;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        vd.b bVar;
        if (this.f10070b.f11793e) {
            ga0 ga0Var = this.f10069a;
            xh0 xh0VarW = ga0Var.w();
            if (xh0VarW == null) {
                synchronized (ga0Var) {
                    bVar = ga0Var.f11423m;
                }
                if (bVar != null && ((Boolean) va.s.f36163e.f36166c.a(sk.f16153h6)).booleanValue()) {
                    vd.b bVarU = ga0Var.u();
                    gx gxVarV = ga0Var.v();
                    if (bVarU == null || gxVarV == null) {
                        return;
                    }
                    f81 f81Var = new f81(x41.r(new vd.b[]{bVarU, gxVarV}), false);
                    f81Var.a(new q81(0, f81Var, new fk0(27, this)), this.f10072d);
                    return;
                }
            }
            if (xh0VarW != null) {
                qz qzVarT = ga0Var.t();
                qz qzVarR = ga0Var.r();
                if (qzVarT == null) {
                    qzVarT = qzVarR == null ? null : qzVarR;
                }
                if (qzVarT != null) {
                    this.f10071c.execute(new a00(qzVarT, 5));
                }
            }
        }
    }
}
