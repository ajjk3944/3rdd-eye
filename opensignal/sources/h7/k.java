package h7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f10117e;

    public /* synthetic */ k(n nVar, l lVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f10113a = i10;
        this.f10117e = nVar;
        this.f10114b = lVar;
        this.f10115c = viewPropertyAnimator;
        this.f10116d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10113a) {
            case 0:
                this.f10115c.setListener(null);
                View view = this.f10116d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                l lVar = this.f10114b;
                n1 n1Var = lVar.f10119a;
                n nVar = this.f10117e;
                nVar.c(n1Var);
                nVar.f10152r.remove(lVar.f10119a);
                nVar.i();
                break;
            default:
                this.f10115c.setListener(null);
                View view2 = this.f10116d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                l lVar2 = this.f10114b;
                n1 n1Var2 = lVar2.f10120b;
                n nVar2 = this.f10117e;
                nVar2.c(n1Var2);
                nVar2.f10152r.remove(lVar2.f10120b);
                nVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10113a) {
            case 0:
                n1 n1Var = this.f10114b.f10119a;
                this.f10117e.getClass();
                break;
            default:
                n1 n1Var2 = this.f10114b.f10120b;
                this.f10117e.getClass();
                break;
        }
    }
}
