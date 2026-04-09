package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ma1 {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f30323a;

    public ma1(ia1 videoAdPlayer) {
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        this.f30323a = videoAdPlayer;
    }

    public final void a(Double d10) {
        this.f30323a.setVolume((float) (d10 != null ? d10.doubleValue() : 0.0d));
    }
}
