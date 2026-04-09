package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gg1;

/* loaded from: classes3.dex */
public final class ur1 {
    public static sc0 a(sl1 progressListener, c91 nativeMediaContent, s42 timeProviderContainer) {
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        ta1 ta1VarA = nativeMediaContent.a();
        yb1 yb1VarB = nativeMediaContent.b();
        if (ta1VarA != null) {
            return new hb1(ta1VarA, progressListener, timeProviderContainer, timeProviderContainer.e(), timeProviderContainer.a());
        }
        if (yb1VarB == null) {
            return new u81(progressListener, timeProviderContainer, gg1.a.a(false), timeProviderContainer.e(), timeProviderContainer.a(), timeProviderContainer.d());
        }
        return null;
    }
}
