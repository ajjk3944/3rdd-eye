package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.F f16641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f16642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f16644d;

    public j(View view, ViewPropertyAnimator viewPropertyAnimator, o oVar, RecyclerView.F f10) {
        this.f16644d = oVar;
        this.f16641a = f10;
        this.f16642b = viewPropertyAnimator;
        this.f16643c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16642b.setListener(null);
        this.f16643c.setAlpha(1.0f);
        o oVar = this.f16644d;
        RecyclerView.F f10 = this.f16641a;
        oVar.c(f10);
        oVar.f16672q.remove(f10);
        oVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f16644d.getClass();
    }
}
