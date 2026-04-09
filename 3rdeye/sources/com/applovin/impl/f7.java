package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class f7 {

    /* renamed from: f, reason: collision with root package name */
    private static final List f19355f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19356a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f19358c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f19359d;

    /* renamed from: b, reason: collision with root package name */
    protected List f19357b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f19360e = System.currentTimeMillis();

    public f7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f19356a = kVar;
        this.f19358c = jSONObject;
        this.f19359d = jSONObject2;
    }

    public List a() {
        return this.f19357b;
    }

    public JSONObject b() {
        return this.f19358c;
    }

    public long c() {
        return this.f19360e;
    }

    public int d() {
        return this.f19357b.size();
    }

    public JSONObject e() {
        return this.f19359d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f19358c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f19355f;
    }

    public int g() {
        return a7.a(JsonUtils.getInt(this.f19358c, "video_completion_percent", -1));
    }
}
