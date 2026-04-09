package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bb1 implements fc2<ab1> {
    @Override // com.yandex.mobile.ads.impl.fc2
    public final ab1 a(za2 videoAd, nu creative, sv0 mediaFile, mc2 adPodInfo, String str, String str2, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(creative, "creative");
        kotlin.jvm.internal.l.f(mediaFile, "mediaFile");
        kotlin.jvm.internal.l.f(adPodInfo, "adPodInfo");
        return new ab1(mediaFile.f(), mediaFile.h(), mediaFile.d());
    }
}
