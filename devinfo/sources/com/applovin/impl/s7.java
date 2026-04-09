package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s7 {

    /* renamed from: f, reason: collision with root package name */
    private static final List f5310f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5311a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f5313c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f5314d;

    /* renamed from: b, reason: collision with root package name */
    protected List f5312b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f5315e = System.currentTimeMillis();

    public s7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f5311a = kVar;
        this.f5313c = jSONObject;
        this.f5314d = jSONObject2;
    }

    public List a() {
        return this.f5312b;
    }

    public JSONObject b() {
        return this.f5313c;
    }

    public long c() {
        return this.f5315e;
    }

    public int d() {
        return this.f5312b.size();
    }

    public JSONObject e() {
        return this.f5314d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f5313c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f5310f;
    }

    public int g() {
        return n7.c(JsonUtils.getInt(this.f5313c, "video_completion_percent", -1));
    }
}
