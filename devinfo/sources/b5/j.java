package b5;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends f1 {

    /* renamed from: c, reason: collision with root package name */
    public final h f1824c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f1825d;

    public j(h hVar) {
        this.f1824c = hVar;
    }

    @Override // b5.f1
    public final void a(ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f1825d;
        h hVar = this.f1824c;
        if (animatorSet == null) {
            ((g1) hVar.f218b).c(this);
            return;
        }
        g1 g1Var = (g1) hVar.f218b;
        if (!g1Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.f1831a.a(animatorSet);
        }
        if (u0.K(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(g1Var);
            sb2.append(" has been canceled");
            sb2.append(g1Var.g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // b5.f1
    public final void b(ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        g1 g1Var = (g1) this.f1824c.f218b;
        AnimatorSet animatorSet = this.f1825d;
        if (animatorSet == null) {
            g1Var.c(this);
            return;
        }
        animatorSet.start();
        if (u0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + g1Var + " has started.");
        }
    }

    @Override // b5.f1
    public final void c(d.a aVar, ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        g1 g1Var = (g1) this.f1824c.f218b;
        AnimatorSet animatorSet = this.f1825d;
        if (animatorSet == null) {
            g1Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !g1Var.f1801c.f1940n) {
            return;
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + g1Var);
        }
        long jA = k.f1828a.a(animatorSet);
        long j = (long) (aVar.f21572c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + g1Var);
        }
        l.f1831a.b(animatorSet, j);
    }

    @Override // b5.f1
    public final void d(ViewGroup viewGroup) {
        j jVar;
        nk.k.e(viewGroup, "container");
        h hVar = this.f1824c;
        if (hVar.t()) {
            return;
        }
        Context context = viewGroup.getContext();
        nk.k.d(context, "context");
        y4.a aVarC = hVar.C(context);
        this.f1825d = aVarC != null ? (AnimatorSet) aVarC.f37324b : null;
        g1 g1Var = (g1) hVar.f218b;
        z zVar = g1Var.f1801c;
        boolean z3 = g1Var.f1799a == 3;
        View view = zVar.H;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f1825d;
        if (animatorSet != null) {
            jVar = this;
            animatorSet.addListener(new i(viewGroup, view, z3, g1Var, jVar));
        } else {
            jVar = this;
        }
        AnimatorSet animatorSet2 = jVar.f1825d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
