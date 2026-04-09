package kd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f28148b;

    public /* synthetic */ c(d dVar, int i4) {
        this.f28147a = i4;
        this.f28148b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f28147a) {
            case 1:
                this.f28148b.f28196b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f28147a) {
            case 0:
                this.f28148b.f28196b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
