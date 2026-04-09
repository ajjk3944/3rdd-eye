package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;

/* loaded from: classes3.dex */
public final class ci1 {

    /* renamed from: a, reason: collision with root package name */
    private final v60 f25660a;

    public ci1(v60 playerProvider) {
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        this.f25660a = playerProvider;
    }

    public final void a() {
        Player playerA = this.f25660a.a();
        if (playerA == null) {
            return;
        }
        playerA.setPlayWhenReady(false);
    }

    public final void b() {
        Player playerA = this.f25660a.a();
        if (playerA == null) {
            return;
        }
        playerA.setPlayWhenReady(true);
    }
}
