package z3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: z3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3022g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3023h f24475c;

    public C3022g(C3023h c3023h, boolean z6, int i) {
        this.f24475c = c3023h;
        this.f24473a = z6;
        this.f24474b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3023h c3023h = this.f24475c;
        c3023h.f24463b.setTranslationX(0.0f);
        c3023h.c(this.f24474b, 0.0f, this.f24473a);
    }
}
