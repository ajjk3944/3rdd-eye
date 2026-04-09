package L3;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2573b;

    public /* synthetic */ b(int i, Object obj) {
        this.f2572a = i;
        this.f2573b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2572a) {
            case 0:
                ((TabLayout) this.f2573b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 1:
                ((TextInputLayout) this.f2573b).f18511K0.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((CollapsingToolbarLayout) this.f2573b).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                G3.j jVar = ((BottomSheetBehavior) this.f2573b).i;
                if (jVar != null) {
                    jVar.r(fFloatValue);
                    break;
                }
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f2573b;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
