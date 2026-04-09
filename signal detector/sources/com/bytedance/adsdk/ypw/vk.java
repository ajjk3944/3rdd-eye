package com.bytedance.adsdk.ypw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
class vk implements Interpolator {
    private final float[] emc;
    private final float[] ypw;

    public vk(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i3 = i + 1;
        this.emc = new float[i3];
        this.ypw = new float[i3];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < i3; i6++) {
            pathMeasure.getPosTan((i6 * length) / i, fArr, null);
            this.emc[i6] = fArr[0];
            this.ypw[i6] = fArr[1];
        }
    }

    private static Path emc(float f2, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f5, f6, f7, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int length = this.emc.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i3 = (i + length) / 2;
            if (f2 < this.emc[i3]) {
                length = i3;
            } else {
                i = i3;
            }
        }
        float[] fArr = this.emc;
        float f5 = fArr[length];
        float f6 = fArr[i];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.ypw[i];
        }
        float f8 = (f2 - f6) / f7;
        float[] fArr2 = this.ypw;
        float f9 = fArr2[i];
        return AbstractC1135f5.h(fArr2[length], f9, f8, f9);
    }

    public vk(float f2, float f5, float f6, float f7) {
        this(emc(f2, f5, f6, f7));
    }
}
