package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iz1 {
    public final int a;
    public final String b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz1(int i, String str, Object obj, Object obj2, int i2) {
        this(i, obj, obj2, str);
        this.e = i2;
    }

    public static iz1 d(String str, int i, int i2) {
        return new iz1(1, str, Integer.valueOf(i), Integer.valueOf(i2), 1);
    }

    public static iz1 e(long j, long j2, String str) {
        return new iz1(1, str, Long.valueOf(j), Long.valueOf(j2), 2);
    }

    public static iz1 f(String str, float f, float f2) {
        return new iz1(1, str, Float.valueOf(f), Float.valueOf(f2), 3);
    }

    public static void g() {
        Object obj = null;
        ((ArrayList) tw1.e.a.h).add(new iz1(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) tw1.e.a.i).add(new iz1(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.b, (String) c());
        }
    }

    public final Object c() {
        return tw1.e.c.i ? this.d : this.c;
    }

    public iz1(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        ((ArrayList) tw1.e.a.g).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iz1(String str, String str2, String str3) {
        this(1, str2, str3, str);
        this.e = 4;
    }
}
