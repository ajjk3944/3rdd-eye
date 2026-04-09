package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;

/* loaded from: classes3.dex */
public final class et {
    public static xs a(InstreamAd instreamAd) {
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        if (instreamAd instanceof nl2) {
            return ((nl2) instreamAd).a();
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
