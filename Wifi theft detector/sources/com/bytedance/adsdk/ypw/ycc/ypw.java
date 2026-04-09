package com.bytedance.adsdk.ypw.ycc;

/* loaded from: classes.dex */
public class ypw {
    private static float emc(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float ypw(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int emc(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fYpw = ypw(((i10 >> 16) & 255) / 255.0f);
        float fYpw2 = ypw(((i10 >> 8) & 255) / 255.0f);
        float fYpw3 = ypw((i10 & 255) / 255.0f);
        float fYpw4 = ypw(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fYpw5 = fYpw2 + ((ypw(((i11 >> 8) & 255) / 255.0f) - fYpw2) * f10);
        float fYpw6 = fYpw3 + (f10 * (ypw((i11 & 255) / 255.0f) - fYpw3));
        return (Math.round(emc(fYpw + ((fYpw4 - fYpw) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(emc(fYpw5) * 255.0f) << 8) | Math.round(emc(fYpw6) * 255.0f);
    }
}
