package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class nl1 {
    public static String a(long j4) {
        long jCeil = (long) Math.ceil(j4 / 1000);
        return String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)}, 2));
    }
}
