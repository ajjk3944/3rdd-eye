package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wo0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ln e;

    public gn(ln lnVar, wo0 wo0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = lnVar;
        this.b = wo0Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                ln lnVar = this.e;
                wo0 wo0Var = this.b;
                lnVar.c(wo0Var);
                lnVar.q.remove(wo0Var);
                lnVar.i();
                break;
            default:
                this.d.setListener(null);
                ln lnVar2 = this.e;
                wo0 wo0Var2 = this.b;
                lnVar2.c(wo0Var2);
                lnVar2.o.remove(wo0Var2);
                lnVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public gn(ln lnVar, wo0 wo0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = lnVar;
        this.b = wo0Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
