package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class no extends uk2 {
    public final /* synthetic */ int p;

    public /* synthetic */ no(int i) {
        this.p = i;
    }

    @Override // defpackage.uk2
    public final float p(Object obj) {
        switch (this.p) {
            case 0:
                return ((oo) obj).v.b * 10000.0f;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }

    @Override // defpackage.uk2
    public final void w(Object obj, float f) {
        switch (this.p) {
            case 0:
                oo ooVar = (oo) obj;
                ooVar.v.b = f / 10000.0f;
                ooVar.invalidateSelf();
                int i = (int) f;
                if (ooVar.g.c(true)) {
                    Context context = ooVar.f;
                    if (ooVar.z == null) {
                        LinearInterpolator linearInterpolator = r4.a;
                        ooVar.B = wl2.u(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        ooVar.C = wl2.u(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        ooVar.z = valueAnimator;
                        valueAnimator.setDuration(500L);
                        ooVar.z.setFloatValues(0.0f, 1.0f);
                        ooVar.z.setInterpolator(null);
                        ooVar.z.addUpdateListener(new mo(0, ooVar));
                    }
                    float f2 = i;
                    float f3 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
                    if (f3 == ooVar.w) {
                        if (!ooVar.z.isRunning()) {
                            ooVar.v.e = f3;
                            ooVar.invalidateSelf();
                            break;
                        }
                    } else {
                        if (ooVar.z.isRunning()) {
                            ooVar.z.cancel();
                        }
                        ooVar.w = f3;
                        if (f3 != 1.0f) {
                            ooVar.A = ooVar.C;
                            ooVar.z.reverse();
                            break;
                        } else {
                            ooVar.A = ooVar.B;
                            ooVar.z.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
