package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p71 {
    public static Float a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1));
            int i = fp0.f27419b;
            return null;
        }
    }
}
