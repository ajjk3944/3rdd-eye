package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;
import q2.C2841s;

/* loaded from: classes.dex */
public final class E9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7919b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7920c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7922e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E9(int i, String str, Object obj, Object obj2, int i3) {
        this(i, str, obj, obj2);
        this.f7922e = i3;
    }

    public static E9 e(int i, int i3, String str) {
        return new E9(1, str, Integer.valueOf(i), Integer.valueOf(i3), 1);
    }

    public static E9 f(long j6, long j7, String str) {
        return new E9(1, str, Long.valueOf(j6), Long.valueOf(j7), 2);
    }

    public static E9 g(String str, float f2, float f5) {
        return new E9(1, str, Float.valueOf(f2), Float.valueOf(f5), 3);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) C2841s.f23267e.f23268a.f14823c).add(new E9(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) C2841s.f23267e.f23268a.f14824d).add(new E9(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f7922e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f7919b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f7919b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f7919b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f7919b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f7919b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f7922e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f7919b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f7919b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f7919b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f7919b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f7919b, (String) c());
        }
    }

    public final Object c() {
        return C2841s.f23267e.f23270c.i ? this.f7921d : this.f7920c;
    }

    public final Object d() {
        return C2841s.f23267e.f23270c.a(this);
    }

    public E9(int i, String str, Object obj, Object obj2) {
        this.f7918a = i;
        this.f7919b = str;
        this.f7920c = obj;
        this.f7921d = obj2;
        ((ArrayList) C2841s.f23267e.f23268a.f14822b).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E9(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.f7922e = 4;
    }
}
