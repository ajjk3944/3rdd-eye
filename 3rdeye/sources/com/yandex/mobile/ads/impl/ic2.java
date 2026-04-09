package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ic2 {

    /* renamed from: a, reason: collision with root package name */
    private final zf2 f28644a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28645b;

    public ic2(jc2<?> videoAdPlayer, zf2 videoTracker) {
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        this.f28644a = videoTracker;
        this.f28645b = videoAdPlayer.getVolume() == 0.0f;
    }

    public final void a(float f10) {
        if (f10 == 0.0f) {
            if (this.f28645b) {
                return;
            }
            this.f28645b = true;
            this.f28644a.l();
            return;
        }
        if (this.f28645b) {
            this.f28645b = false;
            this.f28644a.a();
        }
    }
}
