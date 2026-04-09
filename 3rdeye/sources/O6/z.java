package O6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: DivStateLayout.kt */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f10477a;

    public z(A a10) {
        this.f10477a = a10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.l.f(animation, "animation");
        InterfaceC5480a<C1992A> swipeOutCallback = this.f10477a.getSwipeOutCallback();
        if (swipeOutCallback != null) {
            swipeOutCallback.invoke();
        }
    }
}
