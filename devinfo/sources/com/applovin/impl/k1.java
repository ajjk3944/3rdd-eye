package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4358a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4359b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4360c;

    public k1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f4358a = JsonUtils.getString(jSONObject, "name", "");
        this.f4359b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f4360c = n7.a(list);
        } else {
            this.f4360c = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f4359b;
    }

    public String b() {
        return this.f4358a;
    }

    public boolean c() {
        return this.f4360c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || n7.a(str2, str) != 1) {
            return str3 == null || n7.a(str3, str) != -1;
        }
        return false;
    }
}
