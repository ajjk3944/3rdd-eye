package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.a f16659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f16660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f16662d;

    public n(o oVar, o.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f16662d = oVar;
        this.f16659a = aVar;
        this.f16660b = viewPropertyAnimator;
        this.f16661c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16660b.setListener(null);
        View view = this.f16661c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        o.a aVar = this.f16659a;
        RecyclerView.F f10 = aVar.f16675b;
        o oVar = this.f16662d;
        oVar.c(f10);
        oVar.f16673r.remove(aVar.f16675b);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.F f10 = this.f16659a.f16675b;
        this.f16662d.getClass();
    }
}
