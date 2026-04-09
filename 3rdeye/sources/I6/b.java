package I6;

import android.animation.Animator;

/* compiled from: Animator.kt */
/* loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9.l f2522b;

    public b(c cVar, b9.l lVar) {
        this.f2521a = cVar;
        this.f2522b = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2521a.f2524b.remove(this.f2522b);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
