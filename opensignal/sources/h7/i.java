package h7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10086a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f10087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f10090e;

    public i(n nVar, n1 n1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f10090e = nVar;
        this.f10087b = n1Var;
        this.f10089d = viewPropertyAnimator;
        this.f10088c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10086a) {
            case 1:
                this.f10088c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10086a) {
            case 0:
                this.f10089d.setListener(null);
                this.f10088c.setAlpha(1.0f);
                n nVar = this.f10090e;
                n1 n1Var = this.f10087b;
                nVar.c(n1Var);
                nVar.f10151q.remove(n1Var);
                nVar.i();
                break;
            default:
                this.f10089d.setListener(null);
                n nVar2 = this.f10090e;
                n1 n1Var2 = this.f10087b;
                nVar2.c(n1Var2);
                nVar2.f10149o.remove(n1Var2);
                nVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10086a) {
            case 0:
                this.f10090e.getClass();
                break;
            default:
                this.f10090e.getClass();
                break;
        }
    }

    public i(n nVar, n1 n1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10090e = nVar;
        this.f10087b = n1Var;
        this.f10088c = view;
        this.f10089d = viewPropertyAnimator;
    }
}
