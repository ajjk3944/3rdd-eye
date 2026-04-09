package w7;

import android.animation.Animator;
import j6.C5195A;
import kotlin.jvm.internal.l;
import w7.C5742b;

/* compiled from: SliderView.kt */
/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5744d implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public Float f47551a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5742b f47553c;

    public C5744d(C5742b c5742b) {
        this.f47553c = c5742b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        l.f(animation, "animation");
        this.f47552b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        l.f(animation, "animation");
        C5742b c5742b = this.f47553c;
        c5742b.f47513e = null;
        if (this.f47552b) {
            return;
        }
        Float f10 = this.f47551a;
        Float thumbSecondaryValue = c5742b.getThumbSecondaryValue();
        if (f10 == null) {
            if (thumbSecondaryValue == null) {
                return;
            }
        } else if (thumbSecondaryValue != null && f10.floatValue() == thumbSecondaryValue.floatValue()) {
            return;
        }
        C5195A<C5742b.c> c5195a = c5742b.f47511c;
        c5195a.getClass();
        C5195A.a aVar = new C5195A.a();
        while (aVar.hasNext()) {
            ((C5742b.c) aVar.next()).a(thumbSecondaryValue);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        l.f(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        l.f(animation, "animation");
        this.f47552b = false;
    }
}
