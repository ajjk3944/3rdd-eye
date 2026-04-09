package o4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class d extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final e f18786c;

    public d(e eVar) {
        this.f18786c = eVar;
    }

    @Override // o4.r0
    public final void a(ViewGroup viewGroup) {
        br.l.e(viewGroup, "container");
        e eVar = this.f18786c;
        s0 s0Var = (s0) eVar.f1504d;
        View view = s0Var.f18852c.f1413e0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((s0) eVar.f1504d).c(this);
        if (androidx.fragment.app.d.K(2)) {
            s0Var.toString();
        }
    }

    @Override // o4.r0
    public final void b(ViewGroup viewGroup) {
        br.l.e(viewGroup, "container");
        e eVar = this.f18786c;
        s0 s0Var = (s0) eVar.f1504d;
        if (eVar.k1()) {
            s0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = s0Var.f18852c.f1413e0;
        br.l.d(context, "context");
        i4.b bVarT1 = eVar.t1(context);
        if (bVarT1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) bVarT1.f11196a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (s0Var.f18850a != w0.REMOVED) {
            view.startAnimation(animation);
            s0Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        y yVar = new y(animation, viewGroup, view);
        yVar.setAnimationListener(new c(s0Var, viewGroup, view, this));
        view.startAnimation(yVar);
        if (androidx.fragment.app.d.K(2)) {
            s0Var.toString();
        }
    }
}
