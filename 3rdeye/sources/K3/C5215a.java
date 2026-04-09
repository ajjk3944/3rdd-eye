package k3;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.l;
import p4.C5457g;
import w7.C5742b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5215a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43300b;

    public /* synthetic */ C5215a(Object obj, int i) {
        this.f43299a = i;
        this.f43300b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f43299a) {
            case 0:
                c.a((c) this.f43300b, it);
                break;
            case 1:
                C5457g c5457g = (C5457g) this.f43300b;
                c5457g.getClass();
                c5457g.f45151d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                break;
            default:
                C5742b this$0 = (C5742b) this.f43300b;
                l.f(this$0, "this$0");
                l.f(it, "it");
                Object animatedValue = it.getAnimatedValue();
                l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.f47525r = ((Float) animatedValue).floatValue();
                this$0.postInvalidateOnAnimation();
                break;
        }
    }
}
