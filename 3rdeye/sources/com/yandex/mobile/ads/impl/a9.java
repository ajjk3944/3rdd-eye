package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f24556a;

    /* renamed from: b, reason: collision with root package name */
    private final C4074a5 f24557b;

    /* renamed from: c, reason: collision with root package name */
    private final C4150l4 f24558c;

    public a9(c9 adStateHolder, C4074a5 playbackStateController, C4150l4 adInfoStorage) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playbackStateController, "playbackStateController");
        kotlin.jvm.internal.l.f(adInfoStorage, "adInfoStorage");
        this.f24556a = adStateHolder;
        this.f24557b = playbackStateController;
        this.f24558c = adInfoStorage;
    }

    public final C4150l4 a() {
        return this.f24558c;
    }

    public final c9 b() {
        return this.f24556a;
    }

    public final C4074a5 c() {
        return this.f24557b;
    }
}
