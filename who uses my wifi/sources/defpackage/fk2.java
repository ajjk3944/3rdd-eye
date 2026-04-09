package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fk2 extends el2 {
    public final ag2 l;
    public final int m;
    public final Context n;
    public final gw3 o;
    public final qq2 p;
    public final t93 q;
    public final an2 r;
    public final boolean s;
    public final id2 t;
    public final mv2 u;
    public boolean v;

    public fk2(ko1 ko1Var, Context context, ag2 ag2Var, int i, gw3 gw3Var, qq2 qq2Var, t93 t93Var, an2 an2Var, id2 id2Var, mv2 mv2Var) {
        super(ko1Var);
        this.v = false;
        this.l = ag2Var;
        this.n = context;
        this.m = i;
        this.o = gw3Var;
        this.p = qq2Var;
        this.q = t93Var;
        this.r = an2Var;
        this.s = ((Boolean) tw1.e.c.a(mz1.R5)).booleanValue();
        this.t = id2Var;
        this.u = mv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [android.content.Context] */
    public final void c(Activity activity, boolean z) {
        ag2 ag2Var;
        a83 a83VarF;
        int i;
        t93 t93Var = this.q;
        an2 an2Var = this.r;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.n;
        }
        boolean z2 = this.s;
        if (z2) {
            t93Var.P1(sd2.x);
        }
        hg4 hg4Var = hg4.C;
        lf4 lf4Var = hg4Var.c;
        qq2 qq2Var = this.p;
        if (!lf4.m(qq2Var.d())) {
            iz1 iz1Var = mz1.le;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                lf4.l(activity2, this.b, this.u);
            }
            if (((Boolean) tw1Var.c.a(mz1.K0)).booleanValue() && lf4.g(activity2)) {
                gi2.i0("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                an2Var.b();
                if (((Boolean) tw1Var.c.a(mz1.L0)).booleanValue()) {
                    new md3(activity2.getApplicationContext(), hg4Var.t.a()).a(((c83) this.a.b.g).b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) tw1.e.c.a(mz1.Hc)).booleanValue() && (ag2Var = this.l) != null && (a83VarF = ag2Var.F()) != null && a83VarF.r0) {
            int i2 = a83VarF.s0;
            id2 id2Var = this.t;
            synchronized (id2Var.f) {
                hd2 hd2Var = id2Var.i;
                synchronized (hd2Var.f) {
                    i = hd2Var.k;
                }
            }
            if (i2 != i) {
                gi2.i0("The app open consent form has been shown.");
                an2Var.O(zt0.Q(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.v) {
            gi2.i0("App open interstitial ad is already visible.");
            an2Var.O(zt0.Q(10, null, null));
        }
        if (this.v) {
            return;
        }
        try {
            qq2Var.q(z, activity2, an2Var);
            if (z2) {
                t93Var.U1();
            }
            this.v = true;
        } catch (pq2 e) {
            an2Var.R(e);
        }
    }

    public final void d() {
        fn2 fn2Var = this.c;
        fn2Var.getClass();
        fn2Var.P1(new z71(20, (Object) null));
        ag2 ag2Var = this.l;
        if (ag2Var != null) {
            ag2Var.destroy();
        }
    }

    public final void e(int i, long j) {
        gw3 gw3Var = this.o;
        lv2 lv2VarA = ((mv2) gw3Var.g).a();
        lv2VarA.k("gqi", ((c83) ((h83) gw3Var.h).b.g).b);
        lv2VarA.k("action", "ad_closed");
        lv2VarA.k("show_time", String.valueOf(j));
        lv2VarA.k("ad_format", "app_open_ad");
        int i2 = i - 1;
        lv2VarA.k("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        lv2VarA.m();
    }
}
