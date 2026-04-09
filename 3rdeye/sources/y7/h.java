package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import y7.e;

/* compiled from: BaseIndicatorTabLayout.java */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48300a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.d f48301b;

    public h(e.d dVar) {
        this.f48301b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f48300a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f48300a) {
            return;
        }
        e.d dVar = this.f48301b;
        dVar.f48267e = dVar.f48283v;
        dVar.f48268f = 0.0f;
    }
}
