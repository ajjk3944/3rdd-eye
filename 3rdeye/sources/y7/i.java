package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import y7.e;

/* compiled from: BaseIndicatorTabLayout.java */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48302a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.d f48303b;

    public i(e.d dVar) {
        this.f48303b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f48302a = true;
        this.f48303b.f48282u = 1.0f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f48302a) {
            return;
        }
        e.d dVar = this.f48303b;
        dVar.f48267e = dVar.f48283v;
        dVar.f48268f = 0.0f;
    }
}
