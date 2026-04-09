package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ik2 extends el2 {
    public final Context l;
    public final View m;
    public final ag2 n;
    public final b83 o;
    public final dl2 p;
    public final yr2 q;
    public final yp2 r;
    public final z94 s;
    public final Executor t;
    public xe4 u;

    public ik2(ko1 ko1Var, Context context, b83 b83Var, View view, ag2 ag2Var, dl2 dl2Var, yr2 yr2Var, yp2 yp2Var, z94 z94Var, Executor executor) {
        super(ko1Var);
        this.l = context;
        this.m = view;
        this.n = ag2Var;
        this.o = b83Var;
        this.p = dl2Var;
        this.q = yr2Var;
        this.r = yp2Var;
        this.s = z94Var;
        this.t = executor;
    }

    @Override // defpackage.el2
    public final void a() {
        this.t.execute(new fu1(23, this));
        super.a();
    }

    public final b83 c() {
        xe4 xe4Var = this.u;
        if (xe4Var != null) {
            return xe4Var.n ? new b83(-3, 0, true) : new b83(xe4Var.j, xe4Var.g, false);
        }
        a83 a83Var = this.b;
        if (a83Var.c0) {
            for (String str : a83Var.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.m;
            return new b83(view.getWidth(), view.getHeight(), false);
        }
        return (b83) a83Var.r.get(0);
    }

    public final int d() {
        iz1 iz1Var = mz1.z8;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && this.b.g0) {
            if (!((Boolean) tw1Var.c.a(mz1.A8)).booleanValue()) {
                return 0;
            }
        }
        return ((c83) this.a.b.g).c;
    }
}
