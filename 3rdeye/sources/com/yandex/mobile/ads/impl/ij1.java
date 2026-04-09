package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes3.dex */
public enum ij1 {
    f28707c(InstreamAdBreakType.PREROLL),
    f28708d(InstreamAdBreakType.MIDROLL),
    f28709e(InstreamAdBreakType.POSTROLL),
    f28710f("standalone");


    /* renamed from: b, reason: collision with root package name */
    private final String f28712b;

    ij1(String str) {
        this.f28712b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f28712b;
    }
}
