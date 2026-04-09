package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;

/* loaded from: classes3.dex */
public final class rl2<T> implements InstreamAdBreakQueue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final it0<T> f32686a;

    public rl2(it0<T> manualAdBreakQueue) {
        kotlin.jvm.internal.l.f(manualAdBreakQueue, "manualAdBreakQueue");
        this.f32686a = manualAdBreakQueue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f32686a.a();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final T poll() {
        return this.f32686a.b();
    }
}
