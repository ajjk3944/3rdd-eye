package g0;

import C.S;
import android.animation.Animator;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ScreenFlashView.java */
/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4361h implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C8.a f37914a;

    public C4361h(C8.a aVar) {
        this.f37914a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        S.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
        this.f37914a.run();
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
