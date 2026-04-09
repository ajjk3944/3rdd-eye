package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ja1 {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f29036a;

    /* renamed from: b, reason: collision with root package name */
    private final ma1 f29037b;

    public /* synthetic */ ja1(ia1 ia1Var) {
        this(ia1Var, new ma1(ia1Var));
    }

    public final void a(ke2 options) {
        kotlin.jvm.internal.l.f(options, "options");
        this.f29037b.a(options.a());
        this.f29036a.a(options.c());
    }

    public ja1(ia1 nativeVideoAdPlayer, ma1 playerVolumeManager) {
        kotlin.jvm.internal.l.f(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        kotlin.jvm.internal.l.f(playerVolumeManager, "playerVolumeManager");
        this.f29036a = nativeVideoAdPlayer;
        this.f29037b = playerVolumeManager;
    }
}
