package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pk {

    /* renamed from: a, reason: collision with root package name */
    public final int f15024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15025b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15026c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15028e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk(int i4, String str, Object obj, Object obj2, int i10) {
        this(i4, str, obj, obj2);
        this.f15028e = i10;
    }

    public static pk e(int i4, int i10, String str) {
        return new pk(1, str, Integer.valueOf(i4), Integer.valueOf(i10), 1);
    }

    public static pk f(String str, long j, long j8) {
        return new pk(1, str, Long.valueOf(j), Long.valueOf(j8), 2);
    }

    public static pk g(String str, float f10, float f11) {
        return new pk(1, str, Float.valueOf(f10), Float.valueOf(f11), 3);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) va.s.f36163e.f36164a.f15074c).add(new pk(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) va.s.f36163e.f36164a.f15075d).add(new pk(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f15028e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f15025b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f15025b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f15025b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f15025b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f15025b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f15028e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f15025b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f15025b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f15025b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f15025b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f15025b, (String) c());
        }
    }

    public final Object c() {
        return va.s.f36163e.f36166c.f15676i ? this.f15027d : this.f15026c;
    }

    public final Object d() {
        return va.s.f36163e.f36166c.a(this);
    }

    public pk(int i4, String str, Object obj, Object obj2) {
        this.f15024a = i4;
        this.f15025b = str;
        this.f15026c = obj;
        this.f15027d = obj2;
        ((ArrayList) va.s.f36163e.f36164a.f15073b).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pk(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.f15028e = 4;
    }
}
