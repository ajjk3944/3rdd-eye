package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import q2.C2841s;
import q2.InterfaceC2803B;
import q2.InterfaceC2809b0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2847v;
import q2.InterfaceC2853y;
import q2.InterfaceC2854y0;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1820rr extends q2.K {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16621a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2853y f16622b;

    /* renamed from: c, reason: collision with root package name */
    public final C0960bu f16623c;

    /* renamed from: d, reason: collision with root package name */
    public final C0830Yi f16624d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f16625e;

    /* renamed from: f, reason: collision with root package name */
    public final C0784Vn f16626f;

    public BinderC1820rr(Context context, InterfaceC2853y interfaceC2853y, C0960bu c0960bu, C0830Yi c0830Yi, C0784Vn c0784Vn) {
        this.f16621a = context;
        this.f16622b = interfaceC2853y;
        this.f16623c = c0960bu;
        this.f16624d = c0830Yi;
        this.f16626f = c0784Vn;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = c0830Yi.f12654m;
        C2911G c2911g = p2.j.f22785C.f22790c;
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(o().f23190c);
        frameLayout.setMinimumWidth(o().f23193f);
        this.f16625e = frameLayout;
    }

    @Override // q2.L
    public final String A() {
        return this.f16623c.f13485g;
    }

    @Override // q2.L
    public final q2.B0 C() {
        C0830Yi c0830Yi = this.f16624d;
        c0830Yi.getClass();
        try {
            return c0830Yi.f12657p.mo5a();
        } catch (C1123eu unused) {
            return null;
        }
    }

    @Override // q2.L
    public final void C3(q2.W w6) {
        C2090wr c2090wr = this.f16623c.f13481c;
        if (c2090wr != null) {
            c2090wr.p(w6);
        }
    }

    @Override // q2.L
    public final void D1(q2.d1 d1Var) {
        FrameLayout frameLayout;
        InterfaceC0828Yg interfaceC0828Yg;
        M2.u.c("setAdSize must be called on the main UI thread.");
        C0830Yi c0830Yi = this.f16624d;
        if (c0830Yi == null || (frameLayout = this.f16625e) == null || (interfaceC0828Yg = c0830Yi.f12655n) == null) {
            return;
        }
        interfaceC0828Yg.f1(T2.d.a(d1Var));
        frameLayout.setMinimumHeight(d1Var.f23190c);
        frameLayout.setMinimumWidth(d1Var.f23193f);
        c0830Yi.f12662u = d1Var;
    }

    @Override // q2.L
    public final boolean H() {
        return false;
    }

    @Override // q2.L
    public final void H3(N9 n9) {
        u2.k.g("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final void L2(String str) {
    }

    @Override // q2.L
    public final boolean M() {
        C0830Yi c0830Yi = this.f16624d;
        return c0830Yi != null && c0830Yi.f16601b.f10788q0;
    }

    @Override // q2.L
    public final InterfaceC2854y0 N() {
        return this.f16624d.f16605f;
    }

    @Override // q2.L
    public final void O0(q2.Y0 y02) {
        u2.k.g("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final void R0(long j6) {
        C0712Rj c0712Rj = this.f16624d.f16608j;
        if (c0712Rj != null) {
            c0712Rj.a(j6);
        }
    }

    @Override // q2.L
    public final void S0(boolean z6) {
    }

    @Override // q2.L
    public final void V2(InterfaceC2842s0 interfaceC2842s0) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Mc)).booleanValue()) {
            u2.k.g("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        C2090wr c2090wr = this.f16623c.f13481c;
        if (c2090wr != null) {
            try {
                if (!interfaceC2842s0.d()) {
                    this.f16626f.b();
                }
            } catch (RemoteException e6) {
                u2.k.d("Error in making CSI ping for reporting paid event callback", e6);
            }
            c2090wr.f17501c.set(interfaceC2842s0);
        }
    }

    @Override // q2.L
    public final InterfaceC2853y Y() {
        return this.f16622b;
    }

    @Override // q2.L
    public final long a0() {
        C0712Rj c0712Rj;
        C0830Yi c0830Yi = this.f16624d;
        if (c0830Yi == null || (c0712Rj = c0830Yi.f16608j) == null) {
            return 0L;
        }
        return c0712Rj.f11035a.get();
    }

    @Override // q2.L
    public final S2.a c() {
        return new S2.b(this.f16625e);
    }

    @Override // q2.L
    public final void d() {
        M2.u.c("destroy must be called on the main UI thread.");
        C2137xk c2137xk = this.f16624d.f16602c;
        c2137xk.getClass();
        c2137xk.C1(new C1288hw(null, 3));
    }

    @Override // q2.L
    public final void e() {
        M2.u.c("destroy must be called on the main UI thread.");
        C2137xk c2137xk = this.f16624d.f16602c;
        c2137xk.getClass();
        c2137xk.C1(new C2083wk(null));
    }

    @Override // q2.L
    public final boolean f0(q2.a1 a1Var) {
        u2.k.g("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // q2.L
    public final void i() {
    }

    @Override // q2.L
    public final Bundle k() {
        u2.k.g("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // q2.L
    public final void k1(InterfaceC2853y interfaceC2853y) {
        u2.k.g("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final boolean m() {
        return false;
    }

    @Override // q2.L
    public final void n() {
        C2138xl c2138xl = this.f16624d.f12659r;
        synchronized (c2138xl) {
            c2138xl.C1(C1437kl.f15261k);
        }
    }

    @Override // q2.L
    public final q2.d1 o() {
        M2.u.c("getAdSize must be called on the main UI thread.");
        return C1476lN.f(this.f16621a, Collections.singletonList(this.f16624d.c()));
    }

    @Override // q2.L
    public final void q2(InterfaceC2847v interfaceC2847v) {
        u2.k.g("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final String r() {
        BinderC1168fk binderC1168fk = this.f16624d.f16605f;
        if (binderC1168fk != null) {
            return binderC1168fk.f14124a;
        }
        return null;
    }

    @Override // q2.L
    public final void s() {
        M2.u.c("destroy must be called on the main UI thread.");
        C2137xk c2137xk = this.f16624d.f16602c;
        c2137xk.getClass();
        c2137xk.C1(new C9(null, false));
    }

    @Override // q2.L
    public final void s1() {
        u2.k.g("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final q2.W u() {
        return this.f16623c.f13492o;
    }

    @Override // q2.L
    public final void v1(q2.Z z6) {
        u2.k.g("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final String w() {
        BinderC1168fk binderC1168fk = this.f16624d.f16605f;
        if (binderC1168fk != null) {
            return binderC1168fk.f14124a;
        }
        return null;
    }

    @Override // q2.L
    public final void w1(InterfaceC1407k8 interfaceC1407k8) {
    }

    @Override // q2.L
    public final void w2(boolean z6) {
        u2.k.g("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.L
    public final void K() {
    }

    @Override // q2.L
    public final void b0() {
    }

    @Override // q2.L
    public final void l() {
    }

    @Override // q2.L
    public final void q() {
    }

    @Override // q2.L
    public final void B2(S2.a aVar) {
    }

    @Override // q2.L
    public final void I2(InterfaceC2809b0 interfaceC2809b0) {
    }

    @Override // q2.L
    public final void S1(C0435Be c0435Be) {
    }

    @Override // q2.L
    public final void u2(q2.g1 g1Var) {
    }

    @Override // q2.L
    public final void x3(q2.a1 a1Var, InterfaceC2803B interfaceC2803B) {
    }
}
