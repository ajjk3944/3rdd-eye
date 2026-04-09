package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class in extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ln e;

    public /* synthetic */ in(ln lnVar, jn jnVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = lnVar;
        this.b = jnVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jn jnVar = this.b;
                wo0 wo0Var = jnVar.a;
                ln lnVar = this.e;
                lnVar.c(wo0Var);
                lnVar.r.remove(jnVar.a);
                lnVar.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                jn jnVar2 = this.b;
                wo0 wo0Var2 = jnVar2.b;
                ln lnVar2 = this.e;
                lnVar2.c(wo0Var2);
                lnVar2.r.remove(jnVar2.b);
                lnVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                wo0 wo0Var = this.b.a;
                this.e.getClass();
                break;
            default:
                wo0 wo0Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
