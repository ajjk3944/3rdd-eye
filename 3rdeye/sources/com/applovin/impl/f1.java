package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19332a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19333b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19334c;

    public f1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f19332a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f19333b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f19334c = a7.a(list);
        } else {
            this.f19334c = a7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f19333b;
    }

    public String b() {
        return this.f19332a;
    }

    public boolean c() {
        return this.f19334c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || a7.a(str2, str) != 1) {
            return str3 == null || a7.a(str3, str) != -1;
        }
        return false;
    }
}
