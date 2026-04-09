package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.F f16645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f16647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f16648d;

    public k(View view, ViewPropertyAnimator viewPropertyAnimator, o oVar, RecyclerView.F f10) {
        this.f16648d = oVar;
        this.f16645a = f10;
        this.f16646b = view;
        this.f16647c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f16646b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16647c.setListener(null);
        o oVar = this.f16648d;
        RecyclerView.F f10 = this.f16645a;
        oVar.c(f10);
        oVar.f16670o.remove(f10);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f16648d.getClass();
    }
}
