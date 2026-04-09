package b5;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends f1 {

    /* renamed from: c, reason: collision with root package name */
    public final h f1797c;

    public g(h hVar) {
        this.f1797c = hVar;
    }

    @Override // b5.f1
    public final void a(ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        h hVar = this.f1797c;
        g1 g1Var = (g1) hVar.f218b;
        View view = g1Var.f1801c.H;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((g1) hVar.f218b).c(this);
        if (u0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + g1Var + " has been cancelled.");
        }
    }

    @Override // b5.f1
    public final void b(ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        h hVar = this.f1797c;
        g1 g1Var = (g1) hVar.f218b;
        if (hVar.t()) {
            g1Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = g1Var.f1801c.H;
        nk.k.d(context, "context");
        y4.a aVarC = hVar.C(context);
        if (aVarC == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) aVarC.f37323a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (g1Var.f1799a != 1) {
            view.startAnimation(animation);
            g1Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        e0 e0Var = new e0(animation, viewGroup, view);
        e0Var.setAnimationListener(new f(g1Var, viewGroup, view, this));
        view.startAnimation(e0Var);
        if (u0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + g1Var + " has started.");
        }
    }
}
