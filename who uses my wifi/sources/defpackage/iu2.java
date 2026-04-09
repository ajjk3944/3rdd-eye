package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iu2 extends el2 {
    public final Context l;
    public final WeakReference m;
    public final qq2 n;
    public final t93 o;
    public final an2 p;
    public final un2 q;
    public final ml2 r;
    public final nb2 s;
    public final md3 t;
    public final j83 u;
    public final mv2 v;
    public boolean w;

    public iu2(ko1 ko1Var, Context context, ag2 ag2Var, qq2 qq2Var, t93 t93Var, an2 an2Var, un2 un2Var, ml2 ml2Var, a83 a83Var, md3 md3Var, j83 j83Var, mv2 mv2Var) {
        super(ko1Var);
        this.w = false;
        this.l = context;
        this.n = qq2Var;
        this.m = new WeakReference(ag2Var);
        this.o = t93Var;
        this.p = an2Var;
        this.q = un2Var;
        this.r = ml2Var;
        this.t = md3Var;
        ta2 ta2Var = a83Var.l;
        this.s = new nb2(ta2Var != null ? ta2Var.f : "", ta2Var != null ? ta2Var.g : 1);
        this.u = j83Var;
        this.v = mv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z) {
        lf4 lf4Var = hg4.C.c;
        qq2 qq2Var = this.n;
        boolean zM = lf4.m(qq2Var.d());
        Context context = this.l;
        an2 an2Var = this.p;
        if (!zM) {
            iz1 iz1Var = mz1.le;
            tw1 tw1Var = tw1.e;
            kz1 kz1Var = tw1Var.c;
            kz1 kz1Var2 = tw1Var.c;
            if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                lf4.l(context, this.b, this.v);
            }
            if (((Boolean) kz1Var2.a(mz1.K0)).booleanValue() && lf4.g(context)) {
                gi2.i0("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                an2Var.b();
                if (((Boolean) kz1Var2.a(mz1.L0)).booleanValue()) {
                    this.t.a(((c83) this.a.b.g).b);
                    return;
                }
                return;
            }
        }
        if (this.w) {
            gi2.i0("The rewarded ad have been showed.");
            an2Var.O(zt0.Q(10, null, null));
            return;
        }
        this.w = true;
        sd2 sd2Var = sd2.x;
        t93 t93Var = this.o;
        t93Var.P1(sd2Var);
        if (activity == null) {
            activity = context;
        }
        try {
            qq2Var.q(z, activity, an2Var);
            t93Var.U1();
        } catch (pq2 e) {
            an2Var.R(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            ag2 ag2Var = (ag2) this.m.get();
            if (((Boolean) tw1.e.c.a(mz1.b7)).booleanValue()) {
                if (!this.w && ag2Var != null) {
                    md2.f.execute(new ig2(ag2Var, 6));
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
