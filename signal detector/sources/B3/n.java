package B3;

import A3.C0133b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import e3.AbstractC2303a;

/* loaded from: classes.dex */
public final class n extends com.bumptech.glide.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f620e;

    public /* synthetic */ n(int i) {
        this.f620e = i;
    }

    @Override // com.bumptech.glide.c
    public final float A(Object obj) {
        switch (this.f620e) {
            case 0:
                return ((o) obj).f623E.f647b * 10000.0f;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }

    @Override // com.bumptech.glide.c
    public final void L(Object obj, float f2) {
        switch (this.f620e) {
            case 0:
                o oVar = (o) obj;
                oVar.f623E.f647b = f2 / 10000.0f;
                oVar.invalidateSelf();
                int i = (int) f2;
                int i3 = 1;
                if (oVar.f636b.b(true)) {
                    Context context = oVar.f635a;
                    if (oVar.f627I == null) {
                        LinearInterpolator linearInterpolator = AbstractC2303a.f19927a;
                        oVar.f629K = com.bumptech.glide.d.P(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        oVar.f630L = com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        oVar.f627I = valueAnimator;
                        valueAnimator.setDuration(500L);
                        oVar.f627I.setFloatValues(0.0f, 1.0f);
                        oVar.f627I.setInterpolator(null);
                        oVar.f627I.addUpdateListener(new C0133b(i3, oVar));
                    }
                    float f5 = i;
                    float f6 = (f5 < 1000.0f || f5 > 9000.0f) ? 0.0f : 1.0f;
                    if (f6 == oVar.f624F) {
                        if (!oVar.f627I.isRunning()) {
                            oVar.f623E.f650e = f6;
                            oVar.invalidateSelf();
                            break;
                        }
                    } else {
                        if (oVar.f627I.isRunning()) {
                            oVar.f627I.cancel();
                        }
                        oVar.f624F = f6;
                        if (f6 != 1.0f) {
                            oVar.f628J = oVar.f630L;
                            oVar.f627I.reverse();
                            break;
                        } else {
                            oVar.f628J = oVar.f629K;
                            oVar.f627I.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f2);
                break;
        }
    }
}
