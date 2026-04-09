package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dh2 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f26181a;

    /* renamed from: b, reason: collision with root package name */
    private final bh2 f26182b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dh2(Context context) {
        this(qx1.a(new qx1(), context, "ViewSizeInfoStorage"), new bh2());
        kotlin.jvm.internal.l.f(context, "context");
    }

    private static String b(fh2 fh2Var) {
        return fh2Var.a() + "-" + fh2Var.b();
    }

    public final String a(fh2 viewSizeKey) {
        kotlin.jvm.internal.l.f(viewSizeKey, "viewSizeKey");
        return this.f26181a.getString(b(viewSizeKey), null);
    }

    public final void a(fh2 viewSizeKey, ah2 viewSizeInfo) {
        kotlin.jvm.internal.l.f(viewSizeKey, "viewSizeKey");
        kotlin.jvm.internal.l.f(viewSizeInfo, "viewSizeInfo");
        String strB = b(viewSizeKey);
        this.f26182b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", viewSizeInfo.d().b());
        jSONObject2.put("height", viewSizeInfo.d().a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", viewSizeInfo.b().b());
        jSONObject3.put("height", viewSizeInfo.b().a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, viewSizeInfo.c().b().b());
        String strName = viewSizeInfo.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        jSONObject4.put("mode", lowerCase);
        jSONObject5.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, viewSizeInfo.c().a().b());
        String lowerCase2 = viewSizeInfo.c().a().a().name().toLowerCase(locale);
        kotlin.jvm.internal.l.e(lowerCase2, "toLowerCase(...)");
        jSONObject5.put("mode", lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(viewSizeInfo.a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String string = jSONObject.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        this.f26181a.edit().putString(strB, string).apply();
    }

    public dh2(SharedPreferences preferences, bh2 viewSizeInfoParser) {
        kotlin.jvm.internal.l.f(preferences, "preferences");
        kotlin.jvm.internal.l.f(viewSizeInfoParser, "viewSizeInfoParser");
        this.f26181a = preferences;
        this.f26182b = viewSizeInfoParser;
    }
}
