package o4;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final e f18799c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f18800d;

    public g(e eVar) {
        this.f18799c = eVar;
    }

    @Override // o4.r0
    public final void a(ViewGroup viewGroup) {
        br.l.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f18800d;
        e eVar = this.f18799c;
        if (animatorSet == null) {
            ((s0) eVar.f1504d).c(this);
            return;
        }
        s0 s0Var = (s0) eVar.f1504d;
        if (!s0Var.f18856g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            i.f18804a.a(animatorSet);
        }
        if (androidx.fragment.app.d.K(2)) {
            s0Var.toString();
        }
    }

    @Override // o4.r0
    public final void b(ViewGroup viewGroup) {
        br.l.e(viewGroup, "container");
        s0 s0Var = (s0) this.f18799c.f1504d;
        AnimatorSet animatorSet = this.f18800d;
        if (animatorSet == null) {
            s0Var.c(this);
            return;
        }
        animatorSet.start();
        if (androidx.fragment.app.d.K(2)) {
            Objects.toString(s0Var);
        }
    }

    @Override // o4.r0
    public final void c(c.b bVar, ViewGroup viewGroup) {
        br.l.e(bVar, "backEvent");
        br.l.e(viewGroup, "container");
        s0 s0Var = (s0) this.f18799c.f1504d;
        AnimatorSet animatorSet = this.f18800d;
        if (animatorSet == null) {
            s0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !s0Var.f18852c.J) {
            return;
        }
        if (androidx.fragment.app.d.K(2)) {
            s0Var.toString();
        }
        long jA = h.f18801a.a(animatorSet);
        long j = (long) (bVar.f3002c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (androidx.fragment.app.d.K(2)) {
            animatorSet.toString();
            s0Var.toString();
        }
        i.f18804a.b(animatorSet, j);
    }

    @Override // o4.r0
    public final void d(ViewGroup viewGroup) {
        g gVar;
        br.l.e(viewGroup, "container");
        e eVar = this.f18799c;
        if (eVar.k1()) {
            return;
        }
        Context context = viewGroup.getContext();
        br.l.d(context, "context");
        i4.b bVarT1 = eVar.t1(context);
        this.f18800d = bVarT1 != null ? (AnimatorSet) bVarT1.f11197d : null;
        s0 s0Var = (s0) eVar.f1504d;
        androidx.fragment.app.b bVar = s0Var.f18852c;
        boolean z10 = s0Var.f18850a == w0.GONE;
        View view = bVar.f1413e0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f18800d;
        if (animatorSet != null) {
            gVar = this;
            animatorSet.addListener(new f(viewGroup, view, z10, s0Var, gVar));
        } else {
            gVar = this;
        }
        AnimatorSet animatorSet2 = gVar.f18800d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
