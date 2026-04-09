package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* loaded from: classes3.dex */
public final class ti1 {

    /* renamed from: a, reason: collision with root package name */
    private final w60 f33624a;

    /* renamed from: b, reason: collision with root package name */
    private Float f33625b;

    public ti1(w60 playerProvider) {
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        this.f33624a = playerProvider;
    }

    public final void a(float f10) {
        if (this.f33625b == null) {
            this.f33625b = a();
        }
        Player playerA = this.f33624a.a();
        if (playerA == null) {
            return;
        }
        playerA.setVolume(f10);
    }

    public final void b() {
        Float f10 = this.f33625b;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            Player playerA = this.f33624a.a();
            if (playerA != null) {
                playerA.setVolume(fFloatValue);
            }
        }
        this.f33625b = null;
    }

    public final Float a() {
        Player playerA = this.f33624a.a();
        if (playerA != null) {
            return Float.valueOf(playerA.getVolume());
        }
        return null;
    }
}
