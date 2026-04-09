package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f1384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f1389f;

    public h(l lVar, x1 x1Var, int i4, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1389f = lVar;
        this.f1384a = x1Var;
        this.f1385b = i4;
        this.f1386c = view;
        this.f1387d = i10;
        this.f1388e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.f1385b;
        View view = this.f1386c;
        if (i4 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1387d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1388e.setListener(null);
        l lVar = this.f1389f;
        x1 x1Var = this.f1384a;
        lVar.c(x1Var);
        lVar.f1443p.remove(x1Var);
        lVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1389f.getClass();
    }
}
