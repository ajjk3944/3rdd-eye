package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ym0;

/* loaded from: classes3.dex */
public final class uz {

    /* renamed from: a, reason: collision with root package name */
    private final ym0 f34253a;

    public uz(ui1 playerVolumeProvider) {
        kotlin.jvm.internal.l.f(playerVolumeProvider, "playerVolumeProvider");
        ym0.a aVar = new ym0.a();
        float volume = playerVolumeProvider.getVolume();
        if (volume == 0.0f) {
            aVar.a(1.0f);
            aVar.b(true);
        } else {
            aVar.a(volume);
            aVar.b(false);
        }
        this.f34253a = aVar.a();
    }

    public final ym0 a() {
        return this.f34253a;
    }
}
