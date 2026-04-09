package I6;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9.l f2520b;

    public a(c cVar, b9.l lVar) {
        this.f2519a = cVar;
        this.f2520b = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2519a.f2524b.remove(this.f2520b);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
