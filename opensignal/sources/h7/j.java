package h7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f10092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f10097f;

    public j(n nVar, n1 n1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10097f = nVar;
        this.f10092a = n1Var;
        this.f10093b = i10;
        this.f10094c = view;
        this.f10095d = i11;
        this.f10096e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f10093b;
        View view = this.f10094c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f10095d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10096e.setListener(null);
        n nVar = this.f10097f;
        n1 n1Var = this.f10092a;
        nVar.c(n1Var);
        nVar.f10150p.remove(n1Var);
        nVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10097f.getClass();
    }
}
