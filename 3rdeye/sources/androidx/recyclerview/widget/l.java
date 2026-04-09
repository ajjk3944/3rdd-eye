package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.F f16649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f16653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f16654f;

    public l(o oVar, RecyclerView.F f10, int i, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f16654f = oVar;
        this.f16649a = f10;
        this.f16650b = i;
        this.f16651c = view;
        this.f16652d = i10;
        this.f16653e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f16650b;
        View view = this.f16651c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f16652d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16653e.setListener(null);
        o oVar = this.f16654f;
        RecyclerView.F f10 = this.f16649a;
        oVar.c(f10);
        oVar.f16671p.remove(f10);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f16654f.getClass();
    }
}
