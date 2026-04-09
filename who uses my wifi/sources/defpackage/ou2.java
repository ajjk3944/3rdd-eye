package defpackage;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ou2 {
    public final sm2 a;
    public final wp2 b;
    public final gn2 c;
    public final un2 d;
    public final xn2 e;
    public final vo2 f;
    public final Executor g;
    public final vp2 h;
    public final xj2 i;
    public final su1 j;
    public final sb2 k;
    public final vs1 l;
    public final qo2 m;
    public final jz2 n;
    public final eb3 o;
    public final mv2 p;
    public final gj2 q;
    public final tu2 r;
    public final xv2 s;
    public final im2 t;

    public ou2(sm2 sm2Var, gn2 gn2Var, un2 un2Var, xn2 xn2Var, vo2 vo2Var, Executor executor, vp2 vp2Var, xj2 xj2Var, su1 su1Var, sb2 sb2Var, vs1 vs1Var, qo2 qo2Var, jz2 jz2Var, eb3 eb3Var, mv2 mv2Var, wp2 wp2Var, gj2 gj2Var, tu2 tu2Var, xv2 xv2Var, im2 im2Var) {
        this.a = sm2Var;
        this.c = gn2Var;
        this.d = un2Var;
        this.e = xn2Var;
        this.f = vo2Var;
        this.g = executor;
        this.h = vp2Var;
        this.i = xj2Var;
        this.j = su1Var;
        this.k = sb2Var;
        this.l = vs1Var;
        this.m = qo2Var;
        this.n = jz2Var;
        this.o = eb3Var;
        this.p = mv2Var;
        this.b = wp2Var;
        this.q = gj2Var;
        this.r = tu2Var;
        this.s = xv2Var;
        this.t = im2Var;
    }

    public static final pd2 b(ag2 ag2Var, String str, String str2, Bundle bundle, da3 da3Var) {
        iz1 iz1Var = mz1.p2;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            ga1.n(hg4.C.k, bundle, "rendering-webview-load-html-start");
        }
        pd2 pd2Var = new pd2();
        if (((Boolean) tw1Var.c.a(mz1.E9)).booleanValue()) {
            aa3 aa3VarL = aa3.l(ag2Var.getContext(), 112);
            aa3VarL.a();
            qb1.P(pd2Var, da3Var, aa3VarL, false);
        }
        ag2Var.e0().l = new mr2(bundle, pd2Var, 2, false);
        ag2Var.J0(str, str2);
        return pd2Var;
    }

    public final void a(ag2 ag2Var, boolean z, e42 e42Var, Bundle bundle) {
        rs1 rs1Var;
        iz1 iz1Var = mz1.p2;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            ga1.n(hg4.C.k, bundle, "rendering-configure-webview-start");
        }
        ag2Var.e0().p(new fd1() { // from class: nu2
            @Override // defpackage.fd1
            public final /* synthetic */ void C() {
                this.f.a.C();
            }
        }, this.d, this.e, new m32() { // from class: lu2
            @Override // defpackage.m32
            public final /* synthetic */ void n0(String str, String str2) {
                this.f.f.n0(str, str2);
            }
        }, new xt2(2, this), z, e42Var, this.j, new of3(20, this), this.k, this.n, this.o, this.p, null, this.b, null, null, null, this.q, this.s, this.t);
        ag2Var.setOnTouchListener(new h70(2, this));
        ag2Var.setOnClickListener(new m1(8, this));
        if (((Boolean) kz1Var2.a(mz1.Q2)).booleanValue() && (rs1Var = this.l.b) != null) {
            rs1Var.e(ag2Var.p0());
        }
        vp2 vp2Var = this.h;
        Executor executor = this.g;
        vp2Var.L1(ag2Var, executor);
        vp2Var.L1(new jt2(ag2Var, 2), executor);
        vp2Var.U1(ag2Var.p0());
        ag2Var.v0("/trackActiveViewUnit", new v32(this, ag2Var, 5));
        xj2 xj2Var = this.i;
        xj2Var.getClass();
        xj2Var.o = new WeakReference(ag2Var);
        if (((Boolean) kz1Var2.a(iz1Var)).booleanValue()) {
            ga1.n(hg4.C.k, bundle, "rendering-configure-webview-end");
        }
    }
}
