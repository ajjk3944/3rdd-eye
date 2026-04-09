package m0;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC2651b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21927a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21928b;

    public AbstractInterpolatorC2651b(float[] fArr) {
        this.f21927a = fArr;
        this.f21928b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f21927a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f5 = this.f21928b;
        float f6 = (f2 - (iMin * f5)) / f5;
        float f7 = fArr[iMin];
        return AbstractC1135f5.h(fArr[iMin + 1], f7, f6, f7);
    }
}
