package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.a f16655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f16656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f16658d;

    public m(o oVar, o.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f16658d = oVar;
        this.f16655a = aVar;
        this.f16656b = viewPropertyAnimator;
        this.f16657c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16656b.setListener(null);
        View view = this.f16657c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        o.a aVar = this.f16655a;
        RecyclerView.F f10 = aVar.f16674a;
        o oVar = this.f16658d;
        oVar.c(f10);
        oVar.f16673r.remove(aVar.f16674a);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.F f10 = this.f16655a.f16674a;
        this.f16658d.getClass();
    }
}
