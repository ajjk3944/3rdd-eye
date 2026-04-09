package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ok0 extends va.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14716a;

    /* renamed from: b, reason: collision with root package name */
    public final va.y f14717b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0 f14718c;

    /* renamed from: d, reason: collision with root package name */
    public final u30 f14719d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f14720e;

    /* renamed from: f, reason: collision with root package name */
    public final qd0 f14721f;

    public ok0(Context context, va.y yVar, hq0 hq0Var, u30 u30Var, qd0 qd0Var) {
        this.f14716a = context;
        this.f14717b = yVar;
        this.f14718c = hq0Var;
        this.f14719d = u30Var;
        this.f14721f = qd0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = u30Var.f17043m;
        ya.f0 f0Var = ua.j.C.f35261c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(G1().f36040c);
        frameLayout.setMinimumWidth(G1().f36043f);
        this.f14720e = frameLayout;
    }

    @Override // va.l0
    public final void D0(long j) {
        o50 o50Var = this.f14719d.j;
        if (o50Var != null) {
            o50Var.a(j);
        }
    }

    @Override // va.l0
    public final Bundle D1() {
        za.i.g("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // va.l0
    public final void F1() {
        u80 u80Var = this.f14719d.f17048r;
        synchronized (u80Var) {
            u80Var.p1(h80.j);
        }
    }

    @Override // va.l0
    public final va.c3 G1() {
        pb.y.d("getAdSize must be called on the main UI thread.");
        return yr1.f(this.f14716a, Collections.singletonList(this.f14719d.c()));
    }

    @Override // va.l0
    public final va.y I() {
        return this.f14717b;
    }

    @Override // va.l0
    public final String J1() {
        c60 c60Var = this.f14719d.f14537f;
        if (c60Var != null) {
            return c60Var.f9997a;
        }
        return null;
    }

    @Override // va.l0
    public final String L1() {
        c60 c60Var = this.f14719d.f14537f;
        if (c60Var != null) {
            return c60Var.f9997a;
        }
        return null;
    }

    @Override // va.l0
    public final long M() {
        o50 o50Var;
        u30 u30Var = this.f14719d;
        if (u30Var == null || (o50Var = u30Var.j) == null) {
            return 0L;
        }
        return o50Var.f14565a.get();
    }

    @Override // va.l0
    public final String M1() {
        return this.f14718c.g;
    }

    @Override // va.l0
    public final va.x1 N1() {
        return this.f14719d.f14537f;
    }

    @Override // va.l0
    public final boolean P(va.z2 z2Var) {
        za.i.g("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // va.l0
    public final void P2(va.x2 x2Var) {
        za.i.g("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final void S2(boolean z3) {
        za.i.g("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final void X3(va.v0 v0Var) {
        uk0 uk0Var = this.f14718c.f11943c;
        if (uk0Var != null) {
            uk0Var.h(v0Var);
        }
    }

    @Override // va.l0
    public final vb.a a() {
        return new vb.b(this.f14720e);
    }

    @Override // va.l0
    public final void d() {
        pb.y.d("destroy must be called on the main UI thread.");
        s60 s60Var = this.f14719d.f14534c;
        s60Var.getClass();
        s60Var.p1(new mu0(null, 2));
    }

    @Override // va.l0
    public final void d1(va.r1 r1Var) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Oc)).booleanValue()) {
            za.i.g("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        uk0 uk0Var = this.f14718c.f11943c;
        if (uk0Var != null) {
            try {
                if (!r1Var.d()) {
                    this.f14721f.b();
                }
            } catch (RemoteException e2) {
                za.i.d("Error in making CSI ping for reporting paid event callback", e2);
            }
            uk0Var.f17229c.set(r1Var);
        }
    }

    @Override // va.l0
    public final void e() {
        pb.y.d("destroy must be called on the main UI thread.");
        s60 s60Var = this.f14719d.f14534c;
        s60Var.getClass();
        s60Var.p1(new jm(null, 1));
    }

    @Override // va.l0
    public final void e4(xk xkVar) {
        za.i.g("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final boolean f() {
        return false;
    }

    @Override // va.l0
    public final void h() {
        pb.y.d("destroy must be called on the main UI thread.");
        s60 s60Var = this.f14719d.f14534c;
        s60Var.getClass();
        s60Var.p1(new nk(null, 2));
    }

    @Override // va.l0
    public final va.v0 i() {
        return this.f14718c.f11953o;
    }

    @Override // va.l0
    public final void j1(va.c3 c3Var) {
        FrameLayout frameLayout;
        qz qzVar;
        pb.y.d("setAdSize must be called on the main UI thread.");
        u30 u30Var = this.f14719d;
        if (u30Var == null || (frameLayout = this.f14720e) == null || (qzVar = u30Var.f17044n) == null) {
            return;
        }
        qzVar.D0(h0.a(c3Var));
        frameLayout.setMinimumHeight(c3Var.f36040c);
        frameLayout.setMinimumWidth(c3Var.f36043f);
        u30Var.f17051u = c3Var;
    }

    @Override // va.l0
    public final void p1() {
        za.i.g("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final boolean r() {
        return false;
    }

    @Override // va.l0
    public final void s1(va.y0 y0Var) {
        za.i.g("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final void t0(va.v vVar) {
        za.i.g("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final boolean u() {
        u30 u30Var = this.f14719d;
        return u30Var != null && u30Var.f14533b.f18103q0;
    }

    @Override // va.l0
    public final void x3(va.y yVar) {
        za.i.g("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // va.l0
    public final va.a2 y() {
        u30 u30Var = this.f14719d;
        u30Var.getClass();
        try {
            return u30Var.f17046p.mo165b();
        } catch (kq0 unused) {
            return null;
        }
    }

    @Override // va.l0
    public final void B1() {
    }

    @Override // va.l0
    public final void E1() {
    }

    @Override // va.l0
    public final void I1() {
    }

    @Override // va.l0
    public final void N() {
    }

    @Override // va.l0
    public final void t() {
    }

    @Override // va.l0
    public final void A2(va.f3 f3Var) {
    }

    @Override // va.l0
    public final void E0(boolean z3) {
    }

    @Override // va.l0
    public final void F0(va.a1 a1Var) {
    }

    @Override // va.l0
    public final void g3(String str) {
    }

    @Override // va.l0
    public final void j3(vb.a aVar) {
    }

    @Override // va.l0
    public final void n2(su suVar) {
    }

    @Override // va.l0
    public final void t1(vh vhVar) {
    }

    @Override // va.l0
    public final void Z3(va.z2 z2Var, va.b0 b0Var) {
    }
}
