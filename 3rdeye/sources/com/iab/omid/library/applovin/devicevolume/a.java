package com.iab.omid.library.applovin.devicevolume;

/* loaded from: classes2.dex */
public class a {
    public float a(int i, int i10) {
        if (i10 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f10 = i / i10;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }
}
