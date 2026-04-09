package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n23 extends n92 {
    public final Context f;
    public final d32 g;
    public final l83 h;
    public final ik2 i;
    public final FrameLayout j;
    public final mv2 k;

    public n23(Context context, d32 d32Var, l83 l83Var, ik2 ik2Var, mv2 mv2Var) {
        this.f = context;
        this.g = d32Var;
        this.h = l83Var;
        this.i = ik2Var;
        this.k = mv2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = ik2Var.m;
        lf4 lf4Var = hg4.C.c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(o().h);
        frameLayout.setMinimumWidth(o().k);
        this.j = frameLayout;
    }

    @Override // defpackage.ba2
    public final py2 A() {
        ik2 ik2Var = this.i;
        ik2Var.getClass();
        try {
            return ik2Var.p.a();
        } catch (n83 unused) {
            return null;
        }
    }

    @Override // defpackage.ba2
    public final boolean C() {
        return false;
    }

    @Override // defpackage.ba2
    public final String E() {
        rm2 rm2Var = this.i.f;
        if (rm2Var != null) {
            return rm2Var.f;
        }
        return null;
    }

    @Override // defpackage.ba2
    public final void H2(b12 b12Var) {
        gi2.f0("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final void I0(wi2 wi2Var) {
        s23 s23Var = this.h.c;
        if (s23Var != null) {
            s23Var.p(wi2Var);
        }
    }

    @Override // defpackage.ba2
    public final void J2(ih3 ih3Var) {
        gi2.f0("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final boolean L() {
        ik2 ik2Var = this.i;
        return ik2Var != null && ik2Var.b.q0;
    }

    @Override // defpackage.ba2
    public final tx2 N() {
        return this.i.f;
    }

    @Override // defpackage.ba2
    public final void N0(xe4 xe4Var) {
        FrameLayout frameLayout;
        ag2 ag2Var;
        ou1.h("setAdSize must be called on the main UI thread.");
        ik2 ik2Var = this.i;
        if (ik2Var == null || (frameLayout = this.j) == null || (ag2Var = ik2Var.n) == null) {
            return;
        }
        ag2Var.Z(zq.a(xe4Var));
        frameLayout.setMinimumHeight(xe4Var.h);
        frameLayout.setMinimumWidth(xe4Var.k);
        ik2Var.u = xe4Var;
    }

    @Override // defpackage.ba2
    public final void N1(pk2 pk2Var) {
        gi2.f0("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final void W2(d32 d32Var) {
        gi2.f0("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final boolean Z(pc4 pc4Var) {
        gi2.f0("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // defpackage.ba2
    public final void Z1(zu2 zu2Var) {
        if (!((Boolean) tw1.e.c.a(mz1.pc)).booleanValue()) {
            gi2.f0("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        s23 s23Var = this.h.c;
        if (s23Var != null) {
            try {
                if (!zu2Var.c()) {
                    this.k.b();
                }
            } catch (RemoteException unused) {
                gi2.q0(3);
            }
            s23Var.h.set(zu2Var);
        }
    }

    @Override // defpackage.ba2
    public final void c() {
        ou1.h("destroy must be called on the main UI thread.");
        fn2 fn2Var = this.i.c;
        fn2Var.getClass();
        fn2Var.P1(new zj0(null));
    }

    @Override // defpackage.ba2
    public final u10 d() {
        return new oi0(this.j);
    }

    @Override // defpackage.ba2
    public final void e() {
        ou1.h("destroy must be called on the main UI thread.");
        fn2 fn2Var = this.i.c;
        fn2Var.getClass();
        fn2Var.P1(new nc3(null, false));
    }

    @Override // defpackage.ba2
    public final void g1(boolean z) {
        gi2.f0("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final void i2() {
        gi2.f0("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final Bundle k() {
        gi2.f0("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // defpackage.ba2
    public final long k0() {
        gm2 gm2Var;
        ik2 ik2Var = this.i;
        if (ik2Var == null || (gm2Var = ik2Var.j) == null) {
            return 0L;
        }
        return gm2Var.a.get();
    }

    @Override // defpackage.ba2
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ba2
    public final void n() {
        yp2 yp2Var = this.i.r;
        synchronized (yp2Var) {
            yp2Var.P1(sd2.A);
        }
    }

    @Override // defpackage.ba2
    public final xe4 o() {
        ou1.h("getAdSize must be called on the main UI thread.");
        return a30.n(this.f, Collections.singletonList(this.i.c()));
    }

    @Override // defpackage.ba2
    public final void o3(vz1 vz1Var) {
        gi2.f0("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // defpackage.ba2
    public final d32 p2() {
        return this.g;
    }

    @Override // defpackage.ba2
    public final void r() {
        ou1.h("destroy must be called on the main UI thread.");
        fn2 fn2Var = this.i.c;
        fn2Var.getClass();
        fn2Var.P1(new z71(20, (Object) null));
    }

    @Override // defpackage.ba2
    public final wi2 s() {
        return this.h.o;
    }

    @Override // defpackage.ba2
    public final void s1(long j) {
        gm2 gm2Var = this.i.j;
        if (gm2Var != null) {
            gm2Var.a(j);
        }
    }

    @Override // defpackage.ba2
    public final String u() {
        rm2 rm2Var = this.i.f;
        if (rm2Var != null) {
            return rm2Var.f;
        }
        return null;
    }

    @Override // defpackage.ba2
    public final String v() {
        return this.h.g;
    }

    @Override // defpackage.ba2
    public final void H() {
    }

    @Override // defpackage.ba2
    public final void i() {
    }

    @Override // defpackage.ba2
    public final void m() {
    }

    @Override // defpackage.ba2
    public final void p0() {
    }

    @Override // defpackage.ba2
    public final void q() {
    }

    @Override // defpackage.ba2
    public final void A1(vi4 vi4Var) {
    }

    @Override // defpackage.ba2
    public final void D1(String str) {
    }

    @Override // defpackage.ba2
    public final void K2(nw1 nw1Var) {
    }

    @Override // defpackage.ba2
    public final void k3(u10 u10Var) {
    }

    @Override // defpackage.ba2
    public final void n2(ma2 ma2Var) {
    }

    @Override // defpackage.ba2
    public final void o2(pl2 pl2Var) {
    }

    @Override // defpackage.ba2
    public final void t1(boolean z) {
    }

    @Override // defpackage.ba2
    public final void a1(pc4 pc4Var, p42 p42Var) {
    }
}
