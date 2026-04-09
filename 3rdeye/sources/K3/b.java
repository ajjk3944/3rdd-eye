package k3;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.jvm.internal.l;
import p4.C5452b;
import w7.C5742b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43302b;

    public /* synthetic */ b(Object obj, int i) {
        this.f43301a = i;
        this.f43302b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f43301a) {
            case 0:
                c.b((c) this.f43302b, it);
                break;
            case 1:
                C5452b c5452b = (C5452b) this.f43302b;
                c5452b.getClass();
                float fFloatValue = ((Float) it.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c5452b.f45151d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                C5742b this$0 = (C5742b) this.f43302b;
                l.f(this$0, "this$0");
                l.f(it, "it");
                Object animatedValue = it.getAnimatedValue();
                l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.f47528u = (Float) animatedValue;
                this$0.postInvalidateOnAnimation();
                break;
        }
    }
}
