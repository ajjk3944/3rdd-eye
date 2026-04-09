package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f5460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f5462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f5464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0313j f5465f;

    public C0309f(C0313j c0313j, g0 g0Var, int i, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5465f = c0313j;
        this.f5460a = g0Var;
        this.f5461b = i;
        this.f5462c = view;
        this.f5463d = i3;
        this.f5464e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f5461b;
        View view = this.f5462c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f5463d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5464e.setListener(null);
        C0313j c0313j = this.f5465f;
        g0 g0Var = this.f5460a;
        c0313j.c(g0Var);
        c0313j.f5504p.remove(g0Var);
        c0313j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f5465f.getClass();
    }
}
