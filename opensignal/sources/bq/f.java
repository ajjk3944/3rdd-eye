package bq;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import h7.x;

/* loaded from: classes.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2868b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f2867a = i10;
        this.f2868b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2867a) {
            case 0:
                br.l.e(valueAnimator, "animation");
                View view = (View) this.f2868b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                br.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.setLayoutParams(layoutParams);
                view.requestLayout();
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                x xVar = (x) this.f2868b;
                xVar.f10237c.setAlpha(iFloatValue);
                xVar.f10238d.setAlpha(iFloatValue);
                xVar.f10251s.invalidate();
                break;
            case 2:
                ((TabLayout) this.f2868b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 3:
                ((TextInputLayout) this.f2868b).S0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee.i iVar = ((BottomSheetBehavior) this.f2868b).f5523i;
                if (iVar != null) {
                    iVar.r(fFloatValue);
                    break;
                }
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f2868b;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
