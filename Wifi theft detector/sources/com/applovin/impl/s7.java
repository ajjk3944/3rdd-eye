package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s7 {

    /* renamed from: f, reason: collision with root package name */
    private static final List f7563f = Arrays.asList(MimeTypes.VIDEO_MP4, "video/webm", MimeTypes.VIDEO_H263, "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7564a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f7566c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f7567d;

    /* renamed from: b, reason: collision with root package name */
    protected List f7565b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f7568e = System.currentTimeMillis();

    public s7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f7564a = kVar;
        this.f7566c = jSONObject;
        this.f7567d = jSONObject2;
    }

    public List a() {
        return this.f7565b;
    }

    public JSONObject b() {
        return this.f7566c;
    }

    public long c() {
        return this.f7568e;
    }

    public int d() {
        return this.f7565b.size();
    }

    public JSONObject e() {
        return this.f7567d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f7566c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f7563f;
    }

    public int g() {
        return n7.c(JsonUtils.getInt(this.f7566c, "video_completion_percent", -1));
    }
}
