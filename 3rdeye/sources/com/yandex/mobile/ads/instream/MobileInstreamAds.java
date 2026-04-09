package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.nn0;

/* loaded from: classes3.dex */
public final class MobileInstreamAds {
    public static final MobileInstreamAds INSTANCE = new MobileInstreamAds();

    private MobileInstreamAds() {
    }

    public static final void setAdGroupPreloading(boolean z10) {
        nn0.a.a().a(z10);
    }
}
