package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0311h f5474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f5476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0313j f5477e;

    public /* synthetic */ C0310g(C0313j c0313j, C0311h c0311h, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f5473a = i;
        this.f5477e = c0313j;
        this.f5474b = c0311h;
        this.f5475c = viewPropertyAnimator;
        this.f5476d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5473a) {
            case 0:
                this.f5475c.setListener(null);
                View view = this.f5476d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0311h c0311h = this.f5474b;
                g0 g0Var = c0311h.f5479a;
                C0313j c0313j = this.f5477e;
                c0313j.c(g0Var);
                c0313j.f5506r.remove(c0311h.f5479a);
                c0313j.i();
                break;
            default:
                this.f5475c.setListener(null);
                View view2 = this.f5476d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0311h c0311h2 = this.f5474b;
                g0 g0Var2 = c0311h2.f5480b;
                C0313j c0313j2 = this.f5477e;
                c0313j2.c(g0Var2);
                c0313j2.f5506r.remove(c0311h2.f5480b);
                c0313j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5473a) {
            case 0:
                g0 g0Var = this.f5474b.f5479a;
                this.f5477e.getClass();
                break;
            default:
                g0 g0Var2 = this.f5474b.f5480b;
                this.f5477e.getClass();
                break;
        }
    }
}
