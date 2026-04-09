package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4226w4 implements h81 {

    /* renamed from: a, reason: collision with root package name */
    private final bc0 f34802a;

    public C4226w4(bc0 forceImpressionTrackingListener) {
        kotlin.jvm.internal.l.f(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f34802a = forceImpressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.h81
    public final void a(ck0 eventsObservable) {
        kotlin.jvm.internal.l.f(eventsObservable, "eventsObservable");
        eventsObservable.a(this.f34802a);
    }
}
