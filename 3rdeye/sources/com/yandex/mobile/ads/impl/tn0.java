package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tn0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f33723a;

    /* renamed from: b, reason: collision with root package name */
    private final kn0 f33724b;

    /* renamed from: c, reason: collision with root package name */
    private final List<kn0> f33725c;

    /* renamed from: d, reason: collision with root package name */
    private final mc2 f33726d;

    /* renamed from: e, reason: collision with root package name */
    private final bd2 f33727e;

    /* renamed from: f, reason: collision with root package name */
    private final pl0 f33728f;

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f33729g;

    /* renamed from: h, reason: collision with root package name */
    private final long f33730h;
    private final List<p70> i;

    public tn0(String videoAdId, kn0 recommendedMediaFile, ArrayList mediaFiles, mc2 adPodInfo, bd2 bd2Var, pl0 adInfo, JSONObject jSONObject, long j4, List extensions) {
        kotlin.jvm.internal.l.f(videoAdId, "videoAdId");
        kotlin.jvm.internal.l.f(recommendedMediaFile, "recommendedMediaFile");
        kotlin.jvm.internal.l.f(mediaFiles, "mediaFiles");
        kotlin.jvm.internal.l.f(adPodInfo, "adPodInfo");
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        kotlin.jvm.internal.l.f(extensions, "extensions");
        this.f33723a = videoAdId;
        this.f33724b = recommendedMediaFile;
        this.f33725c = mediaFiles;
        this.f33726d = adPodInfo;
        this.f33727e = bd2Var;
        this.f33728f = adInfo;
        this.f33729g = jSONObject;
        this.f33730h = j4;
        this.i = extensions;
    }

    public final pl0 a() {
        return this.f33728f;
    }

    public final mc2 b() {
        return this.f33726d;
    }

    public final long c() {
        return this.f33730h;
    }

    public final List<p70> d() {
        return this.i;
    }

    public final JSONObject e() {
        return this.f33729g;
    }

    public final List<kn0> f() {
        return this.f33725c;
    }

    public final kn0 g() {
        return this.f33724b;
    }

    public final bd2 h() {
        return this.f33727e;
    }

    public final String toString() {
        return this.f33723a;
    }
}
