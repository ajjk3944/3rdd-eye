package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.MediaFile;

/* loaded from: classes3.dex */
public final class cm2 implements MediaFile {

    /* renamed from: a, reason: collision with root package name */
    private final kn0 f25702a;

    public cm2(kn0 mediaFile) {
        kotlin.jvm.internal.l.f(mediaFile, "mediaFile");
        this.f25702a = mediaFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm2) && kotlin.jvm.internal.l.b(this.f25702a, ((cm2) obj).f25702a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f25702a.getAdHeight();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f25702a.getAdWidth();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final String getApiFramework() {
        return this.f25702a.getApiFramework();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final Integer getBitrate() {
        return this.f25702a.getBitrate();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final String getMediaType() {
        return this.f25702a.getMediaType();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.ec2
    public final String getUrl() {
        return this.f25702a.getUrl();
    }

    public final int hashCode() {
        return this.f25702a.hashCode();
    }

    public final String toString() {
        return "YandexMediaFile(mediaFile=" + this.f25702a + ")";
    }
}
