package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f1408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f1409e;

    public /* synthetic */ i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.f1405a = i4;
        this.f1409e = lVar;
        this.f1406b = jVar;
        this.f1407c = viewPropertyAnimator;
        this.f1408d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1405a) {
            case 0:
                this.f1407c.setListener(null);
                View view = this.f1408d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f1406b;
                x1 x1Var = jVar.f1411a;
                l lVar = this.f1409e;
                lVar.c(x1Var);
                lVar.f1445r.remove(jVar.f1411a);
                lVar.i();
                break;
            default:
                this.f1407c.setListener(null);
                View view2 = this.f1408d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f1406b;
                x1 x1Var2 = jVar2.f1412b;
                l lVar2 = this.f1409e;
                lVar2.c(x1Var2);
                lVar2.f1445r.remove(jVar2.f1412b);
                lVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1405a) {
            case 0:
                x1 x1Var = this.f1406b.f1411a;
                this.f1409e.getClass();
                break;
            default:
                x1 x1Var2 = this.f1406b.f1412b;
                this.f1409e.getClass();
                break;
        }
    }
}
