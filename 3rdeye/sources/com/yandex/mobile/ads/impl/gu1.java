package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class gu1 {

    /* renamed from: a, reason: collision with root package name */
    private final n32 f27987a;

    public /* synthetic */ gu1() {
        this(new n32());
    }

    public final boolean a(du1 sdkConfiguration) {
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        this.f27987a.getClass();
        return System.currentTimeMillis() >= sdkConfiguration.x();
    }

    public gu1(n32 systemCurrentTimeProvider) {
        kotlin.jvm.internal.l.f(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        this.f27987a = systemCurrentTimeProvider;
    }
}
