package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6309a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6310b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6311c;

    public k1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f6309a = JsonUtils.getString(jSONObject, "name", "");
        this.f6310b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f6311c = n7.a(list);
        } else {
            this.f6311c = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f6310b;
    }

    public String b() {
        return this.f6309a;
    }

    public boolean c() {
        return this.f6311c;
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
