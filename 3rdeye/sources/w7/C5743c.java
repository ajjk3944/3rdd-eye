package w7;

import android.animation.Animator;
import kotlin.jvm.internal.l;

/* compiled from: SliderView.kt */
/* renamed from: w7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5743c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public float f47548a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5742b f47550c;

    public C5743c(C5742b c5742b) {
        this.f47550c = c5742b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        l.f(animation, "animation");
        this.f47549b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        l.f(animation, "animation");
        C5742b c5742b = this.f47550c;
        c5742b.f47512d = null;
        if (this.f47549b) {
            return;
        }
        c5742b.o(Float.valueOf(this.f47548a), c5742b.getThumbValue());
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        l.f(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        l.f(animation, "animation");
        this.f47549b = false;
    }
}
