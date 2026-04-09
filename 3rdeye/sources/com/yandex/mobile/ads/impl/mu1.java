package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class mu1 {

    /* renamed from: a, reason: collision with root package name */
    private final gu1 f30518a;

    /* renamed from: b, reason: collision with root package name */
    private final mw1 f30519b;

    /* renamed from: c, reason: collision with root package name */
    private final nr f30520c;

    public /* synthetic */ mu1() {
        this(new gu1(), new mw1());
    }

    public final boolean a(du1 sdkConfiguration) {
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        if (this.f30518a.a(sdkConfiguration)) {
            return true;
        }
        this.f30519b.getClass();
        if (!"7.14.0".equals(sdkConfiguration.O())) {
            return true;
        }
        this.f30520c.getClass();
        if (!kotlin.jvm.internal.l.b(ew1.a.a().i(), sdkConfiguration.F0())) {
            return true;
        }
        this.f30520c.getClass();
        if (ew1.a.a().c() != sdkConfiguration.s0()) {
            return true;
        }
        this.f30520c.getClass();
        return !kotlin.jvm.internal.l.b(ew1.a.a().e(), sdkConfiguration.Z());
    }

    public mu1(gu1 sdkConfigurationExpiredDateValidator, mw1 sdkVersionUpdateValidator) {
        kotlin.jvm.internal.l.f(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        kotlin.jvm.internal.l.f(sdkVersionUpdateValidator, "sdkVersionUpdateValidator");
        this.f30518a = sdkConfigurationExpiredDateValidator;
        this.f30519b = sdkVersionUpdateValidator;
        this.f30520c = new nr();
    }
}
