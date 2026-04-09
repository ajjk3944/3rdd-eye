package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wj1 {

    /* renamed from: a, reason: collision with root package name */
    private final vj1 f35002a;

    public /* synthetic */ wj1(d82 d82Var) {
        this(d82Var, new vj1(d82Var));
    }

    public final ArrayList a(JSONArray jSONArray) throws k61, JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(this.f35002a.a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public wj1(d82 urlJsonParser, vj1 preferredPackageParser) {
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(preferredPackageParser, "preferredPackageParser");
        this.f35002a = preferredPackageParser;
    }
}
