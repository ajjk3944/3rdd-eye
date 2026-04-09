package com.bytedance.adsdk.vt.le;

import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private static float ouw(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float vt(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int ouw(float f10, int i4, int i10) {
        if (i4 == i10) {
            return i4;
        }
        float f11 = ((i4 >> 24) & 255) / 255.0f;
        float f12 = ((i10 >> 24) & 255) / 255.0f;
        float fVt = vt(((i4 >> 16) & 255) / 255.0f);
        float fVt2 = vt(((i4 >> 8) & 255) / 255.0f);
        float fVt3 = vt((i4 & 255) / 255.0f);
        float fVt4 = vt(((i10 >> 16) & 255) / 255.0f);
        float fVt5 = vt(((i10 >> 8) & 255) / 255.0f);
        float fVt6 = vt((i10 & 255) / 255.0f);
        float fC = c.c(f12, f11, f10, f11);
        float fC2 = c.c(fVt4, fVt, f10, fVt);
        float fC3 = c.c(fVt5, fVt2, f10, fVt2);
        float fC4 = c.c(fVt6, fVt3, f10, fVt3);
        float fOuw = ouw(fC2) * 255.0f;
        float fOuw2 = ouw(fC3) * 255.0f;
        return Math.round(ouw(fC4) * 255.0f) | (Math.round(fOuw) << 16) | (Math.round(fC * 255.0f) << 24) | (Math.round(fOuw2) << 8);
    }
}
