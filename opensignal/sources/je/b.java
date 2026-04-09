package je;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f13611b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f13610a = i10;
        this.f13611b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f13610a) {
            case 1:
                this.f13611b.f13649b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f13610a) {
            case 0:
                this.f13611b.f13649b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
