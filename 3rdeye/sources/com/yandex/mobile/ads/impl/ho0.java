package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ho0 implements hf2 {

    /* renamed from: a, reason: collision with root package name */
    private final gg2 f28309a;

    /* renamed from: b, reason: collision with root package name */
    private final jo0 f28310b;

    public ho0(zs adBreak, mb2 videoAdInfo, dd2 statusController, io0 viewProvider, gg2 containerVisibleAreaValidator, jo0 videoVisibleStartValidator) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(statusController, "statusController");
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        kotlin.jvm.internal.l.f(containerVisibleAreaValidator, "containerVisibleAreaValidator");
        kotlin.jvm.internal.l.f(videoVisibleStartValidator, "videoVisibleStartValidator");
        this.f28309a = containerVisibleAreaValidator;
        this.f28310b = videoVisibleStartValidator;
    }

    @Override // com.yandex.mobile.ads.impl.hf2
    public final boolean a() {
        return this.f28310b.a() && this.f28309a.a();
    }
}
