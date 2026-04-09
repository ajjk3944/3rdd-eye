package com.bytedance.adsdk.vt;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class zih implements Interpolator {
    private final float[] ouw;
    private final float[] vt;

    private zih(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i4 = (int) (length / 0.002f);
        int i10 = i4 + 1;
        this.ouw = new float[i10];
        this.vt = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / i4, fArr, null);
            this.ouw[i11] = fArr[0];
            this.vt[i11] = fArr[1];
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.ouw.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i10 = (i4 + length) / 2;
            if (f10 < this.ouw[i10]) {
                length = i10;
            } else {
                i4 = i10;
            }
        }
        float[] fArr = this.ouw;
        float f11 = fArr[length];
        float f12 = fArr[i4];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.vt[i4];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.vt;
        float f15 = fArr2[i4];
        return c.c(fArr2[length], f15, f14, f15);
    }

    public zih(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        this(path);
    }
}
