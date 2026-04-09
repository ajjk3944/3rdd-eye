package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc0 nc0Var = ((BottomSheetBehavior) this.b).i;
                if (nc0Var != null) {
                    nc0Var.r(fFloatValue);
                    break;
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                iu iuVar = (iu) this.b;
                iuVar.c.setAlpha(iFloatValue);
                iuVar.d.setAlpha(iFloatValue);
                iuVar.s.invalidate();
                break;
            default:
                ((TextInputLayout) this.b).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
