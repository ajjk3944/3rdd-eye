package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pn extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ lx0 d;
    public final /* synthetic */ rn e;

    public pn(ViewGroup viewGroup, View view, boolean z, lx0 lx0Var, rn rnVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = lx0Var;
        this.e = rnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        lx0 lx0Var = this.d;
        if (z) {
            ex0.a(view, lx0Var.a);
        }
        this.e.e();
        if (xw.F(2)) {
            Objects.toString(lx0Var);
        }
    }
}
