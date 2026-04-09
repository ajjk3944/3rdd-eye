package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;

/* loaded from: classes3.dex */
public final class tm2 implements SkipInfo {

    /* renamed from: a, reason: collision with root package name */
    private final bd2 f33686a;

    public tm2(bd2 skipInfo) {
        kotlin.jvm.internal.l.f(skipInfo, "skipInfo");
        this.f33686a = skipInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm2) && kotlin.jvm.internal.l.b(this.f33686a, ((tm2) obj).f33686a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f33686a.a();
    }

    public final int hashCode() {
        return this.f33686a.hashCode();
    }

    public final String toString() {
        return "YandexSkipInfo(skipInfo=" + this.f33686a + ")";
    }
}
