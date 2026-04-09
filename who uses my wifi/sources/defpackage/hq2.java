package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hq2 extends el2 {
    public final Context l;
    public final WeakReference m;
    public final t93 n;
    public final qq2 o;
    public final ml2 p;
    public final md3 q;
    public final an2 r;
    public final id2 s;
    public final mv2 t;
    public boolean u;

    public hq2(ko1 ko1Var, Context context, ag2 ag2Var, t93 t93Var, qq2 qq2Var, ml2 ml2Var, md3 md3Var, an2 an2Var, id2 id2Var, mv2 mv2Var) {
        super(ko1Var);
        this.u = false;
        this.l = context;
        this.m = new WeakReference(ag2Var);
        this.n = t93Var;
        this.o = qq2Var;
        this.p = ml2Var;
        this.q = md3Var;
        this.r = an2Var;
        this.s = id2Var;
        this.t = mv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z) {
        a83 a83VarF;
        int i;
        Context context = this.l;
        an2 an2Var = this.r;
        t93 t93Var = this.n;
        t93Var.P1(sd2.x);
        lf4 lf4Var = hg4.C.c;
        qq2 qq2Var = this.o;
        if (!lf4.m(qq2Var.d())) {
            iz1 iz1Var = mz1.le;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                lf4.l(context, this.b, this.t);
            }
            if (((Boolean) tw1Var.c.a(mz1.K0)).booleanValue() && lf4.g(context)) {
                gi2.i0("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                an2Var.b();
                if (((Boolean) tw1Var.c.a(mz1.L0)).booleanValue()) {
                    this.q.a(((c83) this.a.b.g).b);
                    return;
                }
                return;
            }
        }
        ag2 ag2Var = (ag2) this.m.get();
        if (((Boolean) tw1.e.c.a(mz1.Hc)).booleanValue() && ag2Var != null && (a83VarF = ag2Var.F()) != null && a83VarF.r0) {
            int i2 = a83VarF.s0;
            id2 id2Var = this.s;
            synchronized (id2Var.f) {
                hd2 hd2Var = id2Var.i;
                synchronized (hd2Var.f) {
                    i = hd2Var.k;
                }
            }
            if (i2 != i) {
                gi2.i0("The interstitial consent form has been shown.");
                an2Var.O(zt0.Q(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.u) {
            gi2.i0("The interstitial ad has been shown.");
            an2Var.O(zt0.Q(10, null, null));
        }
        if (this.u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            qq2Var.q(z, activity, an2Var);
            t93Var.U1();
            this.u = true;
        } catch (pq2 e) {
            an2Var.R(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            ag2 ag2Var = (ag2) this.m.get();
            if (((Boolean) tw1.e.c.a(mz1.b7)).booleanValue()) {
                if (!this.u && ag2Var != null) {
                    md2.f.execute(new ig2(ag2Var, 4));
                }
            } else if (ag2Var != null) {
                ag2Var.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
