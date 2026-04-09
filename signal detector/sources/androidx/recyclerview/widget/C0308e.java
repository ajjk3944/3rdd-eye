package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5455a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f5456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f5457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0313j f5459e;

    public C0308e(C0313j c0313j, g0 g0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5459e = c0313j;
        this.f5456b = g0Var;
        this.f5458d = viewPropertyAnimator;
        this.f5457c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5455a) {
            case 1:
                this.f5457c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5455a) {
            case 0:
                this.f5458d.setListener(null);
                this.f5457c.setAlpha(1.0f);
                C0313j c0313j = this.f5459e;
                g0 g0Var = this.f5456b;
                c0313j.c(g0Var);
                c0313j.f5505q.remove(g0Var);
                c0313j.i();
                break;
            default:
                this.f5458d.setListener(null);
                C0313j c0313j2 = this.f5459e;
                g0 g0Var2 = this.f5456b;
                c0313j2.c(g0Var2);
                c0313j2.f5503o.remove(g0Var2);
                c0313j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5455a) {
            case 0:
                this.f5459e.getClass();
                break;
            default:
                this.f5459e.getClass();
                break;
        }
    }

    public C0308e(C0313j c0313j, g0 g0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5459e = c0313j;
        this.f5456b = g0Var;
        this.f5457c = view;
        this.f5458d = viewPropertyAnimator;
    }
}
