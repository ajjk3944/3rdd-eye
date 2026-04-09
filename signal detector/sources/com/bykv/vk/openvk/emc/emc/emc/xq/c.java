package com.bykv.vk.openvk.emc.emc.emc.xq;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f6580a;

    /* renamed from: b, reason: collision with root package name */
    public int f6581b;

    /* renamed from: c, reason: collision with root package name */
    public long f6582c;

    /* renamed from: d, reason: collision with root package name */
    public double f6583d;

    /* renamed from: e, reason: collision with root package name */
    public String f6584e;

    /* renamed from: f, reason: collision with root package name */
    public String f6585f;

    /* renamed from: g, reason: collision with root package name */
    public String f6586g;

    /* renamed from: h, reason: collision with root package name */
    public String f6587h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f6588j;

    /* renamed from: k, reason: collision with root package name */
    public int f6589k;

    /* renamed from: l, reason: collision with root package name */
    public int f6590l;

    /* renamed from: m, reason: collision with root package name */
    public int f6591m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f6592n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6593o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f6594p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f6595q = 307200;

    /* renamed from: r, reason: collision with root package name */
    public int f6596r = 1;

    public final int a() {
        if (this.f6595q < 0) {
            this.f6595q = 307200;
        }
        long j6 = this.f6595q;
        long j7 = this.f6582c;
        if (j6 > j7) {
            this.f6595q = (int) j7;
        }
        return this.f6595q;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f6588j)) {
            this.f6588j = N1.a.a(this.f6586g);
        }
        return this.f6588j;
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.f6580a);
            jSONObject.put("cover_url", this.f6585f);
            jSONObject.put("cover_width", this.f6581b);
            jSONObject.put("endcard", this.f6587h);
            jSONObject.put("file_hash", b());
            jSONObject.put("resolution", this.f6584e);
            jSONObject.put("size", this.f6582c);
            jSONObject.put("video_duration", this.f6583d);
            jSONObject.put("video_url", this.f6586g);
            jSONObject.put("playable_download_url", this.i);
            jSONObject.put("if_playable_loading_show", this.f6591m);
            jSONObject.put("remove_loading_page_type", this.f6592n);
            jSONObject.put("fallback_endcard_judge", this.f6589k);
            jSONObject.put("video_preload_size", a());
            jSONObject.put("reward_video_cached_type", this.f6593o);
            jSONObject.put("execute_cached_type", this.f6594p);
            jSONObject.put("endcard_render", this.f6590l);
            jSONObject.put("replay_time", this.f6596r);
            jSONObject.put("play_speed_ratio", -1.0f);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
