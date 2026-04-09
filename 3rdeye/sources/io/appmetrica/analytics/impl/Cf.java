package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Cf implements InterfaceC4710j8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39260a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f39261b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39262c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39263d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC4685i8 f39264e;

    public Cf(String str, JSONObject jSONObject, boolean z10, boolean z11, EnumC4685i8 enumC4685i8) {
        this.f39260a = str;
        this.f39261b = jSONObject;
        this.f39262c = z10;
        this.f39263d = z11;
        this.f39264e = enumC4685i8;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4710j8
    public final EnumC4685i8 a() {
        return this.f39264e;
    }

    public final JSONObject b() {
        if (!this.f39262c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f39260a);
            if (this.f39261b.length() > 0) {
                jSONObject.put("additionalParams", this.f39261b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f39260a);
            jSONObject.put("additionalParams", this.f39261b);
            jSONObject.put("wasSet", this.f39262c);
            jSONObject.put("autoTracking", this.f39263d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f39264e.f41064a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f39260a + "', additionalParameters=" + this.f39261b + ", wasSet=" + this.f39262c + ", autoTrackingEnabled=" + this.f39263d + ", source=" + this.f39264e + '}';
    }

    public static Cf a(JSONObject jSONObject) {
        EnumC4685i8 enumC4685i8;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        EnumC4685i8[] enumC4685i8ArrValues = EnumC4685i8.values();
        int length = enumC4685i8ArrValues.length;
        while (true) {
            if (i >= length) {
                enumC4685i8 = null;
                break;
            }
            enumC4685i8 = enumC4685i8ArrValues[i];
            if (kotlin.jvm.internal.l.b(enumC4685i8.f41064a, strOptStringOrNull2)) {
                break;
            }
            i++;
        }
        if (enumC4685i8 == null) {
            enumC4685i8 = EnumC4685i8.f41059b;
        }
        return new Cf(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, enumC4685i8);
    }
}
