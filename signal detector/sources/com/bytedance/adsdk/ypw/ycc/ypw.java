package com.bytedance.adsdk.ypw.ycc;

import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public class ypw {
    private static float emc(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float ypw(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int emc(float f2, int i, int i3) {
        if (i == i3) {
            return i;
        }
        float f5 = ((i >> 24) & 255) / 255.0f;
        float f6 = ((i3 >> 24) & 255) / 255.0f;
        float fYpw = ypw(((i >> 16) & 255) / 255.0f);
        float fYpw2 = ypw(((i >> 8) & 255) / 255.0f);
        float fYpw3 = ypw((i & 255) / 255.0f);
        float fYpw4 = ypw(((i3 >> 16) & 255) / 255.0f);
        float fYpw5 = ypw(((i3 >> 8) & 255) / 255.0f);
        float fYpw6 = ypw((i3 & 255) / 255.0f);
        float fH = AbstractC1135f5.h(f6, f5, f2, f5);
        float fH2 = AbstractC1135f5.h(fYpw4, fYpw, f2, fYpw);
        float fH3 = AbstractC1135f5.h(fYpw5, fYpw2, f2, fYpw2);
        float fH4 = AbstractC1135f5.h(fYpw6, fYpw3, f2, fYpw3);
        float fEmc = emc(fH2) * 255.0f;
        float fEmc2 = emc(fH3) * 255.0f;
        return Math.round(emc(fH4) * 255.0f) | (Math.round(fEmc) << 16) | (Math.round(fH * 255.0f) << 24) | (Math.round(fEmc2) << 8);
    }
}
