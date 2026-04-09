package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import com.yandex.mobile.ads.video.playback.model.VideoAdInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class cn2 implements VideoAd {

    /* renamed from: a, reason: collision with root package name */
    private final tn0 f25721a;

    /* renamed from: b, reason: collision with root package name */
    private final nb2 f25722b;

    public cn2(tn0 videoAd, nb2 videoAdInfoConverter) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(videoAdInfoConverter, "videoAdInfoConverter");
        this.f25721a = videoAd;
        this.f25722b = videoAdInfoConverter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2)) {
            return false;
        }
        cn2 cn2Var = (cn2) obj;
        return kotlin.jvm.internal.l.b(this.f25721a, cn2Var.f25721a) && kotlin.jvm.internal.l.b(this.f25722b, cn2Var.f25722b);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final VideoAdInfo getAdInfo() {
        nb2 nb2Var = this.f25722b;
        pl0 instreamAdInfo = this.f25721a.a();
        nb2Var.getClass();
        kotlin.jvm.internal.l.f(instreamAdInfo, "instreamAdInfo");
        return new VideoAdInfo(instreamAdInfo.a(), instreamAdInfo.e(), instreamAdInfo.d(), instreamAdInfo.f(), instreamAdInfo.c(), instreamAdInfo.b());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final AdPodInfo getAdPodInfo() {
        return new xk2(this.f25721a.b());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final long getDuration() {
        return this.f25721a.c();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final VideoAdExtensions getExtensions() {
        return new dn2(this.f25721a.d());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final String getInfo() {
        return this.f25721a.a().f();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final MediaFile getMediaFile() {
        return new cm2(this.f25721a.g());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final List<MediaFile> getMediaFiles() {
        List<kn0> listF = this.f25721a.f();
        ArrayList arrayList = new ArrayList(C2092m.T(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(new cm2((kn0) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final SkipInfo getSkipInfo() {
        bd2 bd2VarH = this.f25721a.h();
        if (bd2VarH != null) {
            return new tm2(bd2VarH);
        }
        return null;
    }

    public final int hashCode() {
        return this.f25722b.hashCode() + (this.f25721a.hashCode() * 31);
    }

    public final String toString() {
        return "YandexVideoAd(videoAd=" + this.f25721a + ", videoAdInfoConverter=" + this.f25722b + ")";
    }
}
