package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class je2 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public je2(String str) throws JSONException {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", mz1.U);
        this.b = b(jSONObject, "byte_buffer_precache_limit", mz1.l);
        this.c = b(jSONObject, "exo_cache_buffer_size", mz1.v);
        this.d = b(jSONObject, "exo_connect_timeout_millis", mz1.h);
        iz1 iz1Var = mz1.g;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.e = b(jSONObject, "exo_read_timeout_millis", mz1.i);
        this.f = b(jSONObject, "load_check_interval_bytes", mz1.j);
        this.g = b(jSONObject, "player_precache_limit", mz1.k);
        this.h = b(jSONObject, "socket_receive_buffer_size", mz1.m);
        this.i = a(jSONObject, "use_cache_data_source", mz1.I4);
        b(jSONObject, "min_retry_count", mz1.n);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", mz1.p);
        this.k = a(jSONObject, "enable_multiple_video_playback", mz1.Z1);
        this.l = a(jSONObject, "use_range_http_data_source", mz1.b2);
        iz1 iz1Var2 = mz1.c2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
            }
        } else {
            jLongValue = ((Long) tw1.e.c.a(iz1Var2)).longValue();
        }
        this.m = jLongValue;
        iz1 iz1Var3 = mz1.d2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
            }
        } else {
            jLongValue2 = ((Long) tw1.e.c.a(iz1Var3)).longValue();
        }
        this.n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, iz1 iz1Var) {
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(iz1Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, iz1 iz1Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) tw1.e.c.a(iz1Var)).intValue();
    }
}
