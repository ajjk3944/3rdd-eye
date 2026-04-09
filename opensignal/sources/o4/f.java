package o4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f18796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f18797e;

    public f(ViewGroup viewGroup, View view, boolean z10, s0 s0Var, g gVar) {
        this.f18793a = viewGroup;
        this.f18794b = view;
        this.f18795c = z10;
        this.f18796d = s0Var;
        this.f18797e = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        br.l.e(animator, "anim");
        ViewGroup viewGroup = this.f18793a;
        View view = this.f18794b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f18795c;
        s0 s0Var = this.f18796d;
        if (z10 || s0Var.f18850a == w0.GONE) {
            w0 w0Var = s0Var.f18850a;
            br.l.d(view, "viewToAnimate");
            w0Var.applyState(view, viewGroup);
        }
        g gVar = this.f18797e;
        ((s0) gVar.f18799c.f1504d).c(gVar);
        if (androidx.fragment.app.d.K(2)) {
            Objects.toString(s0Var);
        }
    }
}
