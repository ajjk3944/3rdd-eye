package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yx {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18913a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18914b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18915c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18916d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18917e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18918f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18919h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18920i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18921k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18922l;

    /* renamed from: m, reason: collision with root package name */
    public final long f18923m;

    /* renamed from: n, reason: collision with root package name */
    public final long f18924n;

    public yx(String str) throws JSONException {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f18913a = a(jSONObject, "aggressive_media_codec_release", sk.f16175j0);
        this.f18914b = b(jSONObject, "byte_buffer_precache_limit", sk.f16219m);
        this.f18915c = b(jSONObject, "exo_cache_buffer_size", sk.f16376w);
        this.f18916d = b(jSONObject, "exo_connect_timeout_millis", sk.f16161i);
        pk pkVar = sk.f16146h;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f18917e = b(jSONObject, "exo_read_timeout_millis", sk.j);
        this.f18918f = b(jSONObject, "load_check_interval_bytes", sk.f16189k);
        this.g = b(jSONObject, "player_precache_limit", sk.f16203l);
        this.f18919h = b(jSONObject, "socket_receive_buffer_size", sk.f16234n);
        this.f18920i = a(jSONObject, "use_cache_data_source", sk.Z4);
        b(jSONObject, "min_retry_count", sk.f16250o);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", sk.f16282q);
        this.f18921k = a(jSONObject, "enable_multiple_video_playback", sk.f16253o2);
        this.f18922l = a(jSONObject, "use_range_http_data_source", sk.f16285q2);
        pk pkVar2 = sk.f16301r2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
            }
        } else {
            jLongValue = ((Long) va.s.f36163e.f36166c.a(pkVar2)).longValue();
        }
        this.f18923m = jLongValue;
        pk pkVar3 = sk.f16316s2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
            }
        } else {
            jLongValue2 = ((Long) va.s.f36163e.f36166c.a(pkVar3)).longValue();
        }
        this.f18924n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, pk pkVar) {
        boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(pkVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, pk pkVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) va.s.f36163e.f36166c.a(pkVar)).intValue();
    }
}
