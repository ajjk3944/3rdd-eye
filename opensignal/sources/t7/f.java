package t7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final View f22473a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22474b = false;

    public f(View view) {
        this.f22473a = view;
    }

    @Override // t7.o
    public final void a() {
        View view = this.f22473a;
        view.setTag(i.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? a0.f22457a.s(view) : 0.0f));
    }

    @Override // t7.o
    public final void d() {
        this.f22473a.setTag(i.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a0.f22457a.B(this.f22473a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f22473a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f22474b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f22474b;
        View view = this.f22473a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (z10) {
            return;
        }
        f0 f0Var = a0.f22457a;
        f0Var.B(view, 1.0f);
        f0Var.getClass();
    }

    @Override // t7.o
    public final void b(q qVar) {
    }

    @Override // t7.o
    public final void c(q qVar) {
    }

    @Override // t7.o
    public final void e(q qVar) {
    }

    @Override // t7.o
    public final void f(q qVar) {
    }
}
