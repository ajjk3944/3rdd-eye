package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class x20 extends kotlin.jvm.internal.m implements p9.p<JSONObject, o20, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y20 f35151b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<n20> f35152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(y20 y20Var, ArrayList arrayList) {
        super(2);
        this.f35151b = y20Var;
        this.f35152c = arrayList;
    }

    @Override // p9.p
    public final C1992A invoke(JSONObject jSONObject, o20 o20Var) throws JSONException {
        Object obj;
        JSONObject node = jSONObject;
        o20 type = o20Var;
        kotlin.jvm.internal.l.f(node, "node");
        kotlin.jvm.internal.l.f(type, "type");
        this.f35151b.getClass();
        String str = null;
        if (node.has("view_name")) {
            try {
                obj = node.get("view_name");
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        if (str != null) {
            this.f35152c.add(new n20(type, str));
        }
        return C1992A.f18074a;
    }
}
