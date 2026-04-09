package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class yb implements sb {

    /* renamed from: a, reason: collision with root package name */
    private final String f35690a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f35691b;

    public yb(String request, Runnable adtuneRequestRunnable) {
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(adtuneRequestRunnable, "adtuneRequestRunnable");
        this.f35690a = request;
        this.f35691b = adtuneRequestRunnable;
    }

    @Override // com.yandex.mobile.ads.impl.sb
    public final void a() {
        this.f35691b.run();
    }

    @Override // com.yandex.mobile.ads.impl.sb
    public final boolean a(String str, String str2) {
        return "mobileads".equals(str) && kotlin.jvm.internal.l.b(this.f35690a, str2);
    }
}
