package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* loaded from: classes3.dex */
public final class di1 {

    /* renamed from: a, reason: collision with root package name */
    private final w60 f26189a;

    public di1(w60 playerProvider) {
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        this.f26189a = playerProvider;
    }

    public final void a() {
        Player playerA = this.f26189a.a();
        if (playerA == null) {
            return;
        }
        playerA.setPlayWhenReady(false);
    }

    public final void b() {
        Player playerA = this.f26189a.a();
        if (playerA == null) {
            return;
        }
        playerA.setPlayWhenReady(true);
    }
}
