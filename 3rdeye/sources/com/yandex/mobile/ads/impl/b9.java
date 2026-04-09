package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f25135a;

    /* renamed from: b, reason: collision with root package name */
    private final C4081b5 f25136b;

    /* renamed from: c, reason: collision with root package name */
    private final C4157m4 f25137c;

    public b9(d9 adStateHolder, C4081b5 playbackStateController, C4157m4 adInfoStorage) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playbackStateController, "playbackStateController");
        kotlin.jvm.internal.l.f(adInfoStorage, "adInfoStorage");
        this.f25135a = adStateHolder;
        this.f25136b = playbackStateController;
        this.f25137c = adInfoStorage;
    }

    public final C4157m4 a() {
        return this.f25137c;
    }

    public final d9 b() {
        return this.f25135a;
    }

    public final C4081b5 c() {
        return this.f25136b;
    }
}
