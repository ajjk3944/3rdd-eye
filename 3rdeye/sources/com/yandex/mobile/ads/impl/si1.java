package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;

/* loaded from: classes3.dex */
public final class si1 {

    /* renamed from: a, reason: collision with root package name */
    private final v60 f33075a;

    /* renamed from: b, reason: collision with root package name */
    private Float f33076b;

    public si1(v60 playerProvider) {
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        this.f33075a = playerProvider;
    }

    public final void a(float f10) {
        if (this.f33076b == null) {
            this.f33076b = a();
        }
        Player playerA = this.f33075a.a();
        if (playerA == null) {
            return;
        }
        playerA.setVolume(f10);
    }

    public final void b() {
        Float f10 = this.f33076b;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            Player playerA = this.f33075a.a();
            if (playerA != null) {
                playerA.setVolume(fFloatValue);
            }
        }
        this.f33076b = null;
    }

    public final Float a() {
        Player playerA = this.f33075a.a();
        if (playerA != null) {
            return Float.valueOf(playerA.getVolume());
        }
        return null;
    }
}
