package M3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: M3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0173d f2836b;

    public /* synthetic */ C0172c(C0173d c0173d, int i) {
        this.f2835a = i;
        this.f2836b = c0173d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2835a) {
            case 1:
                this.f2836b.f2896b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2835a) {
            case 0:
                this.f2836b.f2896b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
