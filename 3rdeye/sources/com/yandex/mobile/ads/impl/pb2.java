package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pb2 {

    /* renamed from: a, reason: collision with root package name */
    private final tn0 f31714a;

    public pb2(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f31714a = videoAd;
    }

    public final String a() {
        JSONObject jSONObjectE = this.f31714a.e();
        String strOptString = jSONObjectE != null ? jSONObjectE.optString("productType") : null;
        if (strOptString == null || strOptString.length() <= 0) {
            return null;
        }
        return strOptString;
    }
}
