package com.yandex.mobile.ads.video.playback.model;

import com.yandex.mobile.ads.impl.ec2;

/* loaded from: classes3.dex */
public interface MediaFile extends ec2 {
    int getAdHeight();

    int getAdWidth();

    String getApiFramework();

    Integer getBitrate();

    String getMediaType();

    @Override // com.yandex.mobile.ads.impl.ec2
    String getUrl();
}
