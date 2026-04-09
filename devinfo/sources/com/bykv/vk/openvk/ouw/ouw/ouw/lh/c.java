package com.bykv.vk.openvk.ouw.ouw.ouw.lh;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f6573a;

    /* renamed from: b, reason: collision with root package name */
    public int f6574b;

    /* renamed from: c, reason: collision with root package name */
    public long f6575c;

    /* renamed from: d, reason: collision with root package name */
    public double f6576d;

    /* renamed from: e, reason: collision with root package name */
    public String f6577e;

    /* renamed from: f, reason: collision with root package name */
    public String f6578f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f6579h;

    /* renamed from: i, reason: collision with root package name */
    public String f6580i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f6581k;

    /* renamed from: l, reason: collision with root package name */
    public int f6582l;

    /* renamed from: m, reason: collision with root package name */
    public int f6583m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f6584n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6585o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f6586p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f6587q = 307200;

    /* renamed from: r, reason: collision with root package name */
    public int f6588r = 1;

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.f6573a);
            jSONObject.put("cover_url", this.f6578f);
            jSONObject.put("cover_width", this.f6574b);
            jSONObject.put("endcard", this.f6579h);
            jSONObject.put("file_hash", b());
            jSONObject.put("resolution", this.f6577e);
            jSONObject.put("size", this.f6575c);
            jSONObject.put("video_duration", this.f6576d);
            jSONObject.put("video_url", this.g);
            jSONObject.put("playable_download_url", this.f6580i);
            jSONObject.put("if_playable_loading_show", this.f6583m);
            jSONObject.put("remove_loading_page_type", this.f6584n);
            jSONObject.put("fallback_endcard_judge", this.f6581k);
            jSONObject.put("video_preload_size", c());
            jSONObject.put("reward_video_cached_type", this.f6585o);
            jSONObject.put("execute_cached_type", this.f6586p);
            jSONObject.put("endcard_render", this.f6582l);
            jSONObject.put("replay_time", this.f6588r);
            jSONObject.put("play_speed_ratio", -1.0f);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.j)) {
            this.j = z8.a.a(this.g);
        }
        return this.j;
    }

    public final int c() {
        if (this.f6587q < 0) {
            this.f6587q = 307200;
        }
        long j = this.f6587q;
        long j8 = this.f6575c;
        if (j > j8) {
            this.f6587q = (int) j8;
        }
        return this.f6587q;
    }
}
