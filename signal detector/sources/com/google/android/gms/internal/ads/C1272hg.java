package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272hg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14519a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14521c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14522d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14524f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14525g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14526h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14527j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14528k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14529l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14530m;

    /* renamed from: n, reason: collision with root package name */
    public final long f14531n;

    public C1272hg(String str) throws JSONException {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f14519a = a(jSONObject, "aggressive_media_codec_release", H9.f8763j0);
        this.f14520b = b(jSONObject, "byte_buffer_precache_limit", H9.f8782m);
        this.f14521c = b(jSONObject, "exo_cache_buffer_size", H9.f8847w);
        this.f14522d = b(jSONObject, "exo_connect_timeout_millis", H9.i);
        E9 e9 = H9.f8751h;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f14523e = b(jSONObject, "exo_read_timeout_millis", H9.f8762j);
        this.f14524f = b(jSONObject, "load_check_interval_bytes", H9.f8769k);
        this.f14525g = b(jSONObject, "player_precache_limit", H9.f8776l);
        this.f14526h = b(jSONObject, "socket_receive_buffer_size", H9.f8789n);
        this.i = a(jSONObject, "use_cache_data_source", H9.f8706Z4);
        b(jSONObject, "min_retry_count", H9.f8796o);
        this.f14527j = a(jSONObject, "treat_load_exception_as_non_fatal", H9.f8809q);
        this.f14528k = a(jSONObject, "enable_multiple_video_playback", H9.f8799o2);
        this.f14529l = a(jSONObject, "use_range_http_data_source", H9.f8812q2);
        E9 e92 = H9.f8818r2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
            }
        } else {
            jLongValue = ((Long) C2841s.f23267e.f23270c.a(e92)).longValue();
        }
        this.f14530m = jLongValue;
        E9 e93 = H9.f8825s2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
            }
        } else {
            jLongValue2 = ((Long) C2841s.f23267e.f23270c.a(e93)).longValue();
        }
        this.f14531n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, E9 e9) {
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(e9)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, E9 e9) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C2841s.f23267e.f23270c.a(e9)).intValue();
    }
}
