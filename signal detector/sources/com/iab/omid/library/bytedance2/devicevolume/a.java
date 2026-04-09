package com.iab.omid.library.bytedance2.devicevolume;

/* loaded from: classes.dex */
public class a {
    public float a(int i, int i3) {
        if (i3 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f2 = i / i3;
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }
}
