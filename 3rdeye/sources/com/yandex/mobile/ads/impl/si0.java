package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import g0.C4356c;

/* loaded from: classes3.dex */
public final class si0 {
    private static String a(String str, ImageView.ScaleType scaleType) {
        return C4356c.i(scaleType.ordinal(), "#S", str);
    }

    public static String b(String url, ImageView.ScaleType scaleType) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(scaleType, "scaleType");
        return a(url, scaleType);
    }

    public static String a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        return a(url, ImageView.ScaleType.CENTER_INSIDE);
    }
}
