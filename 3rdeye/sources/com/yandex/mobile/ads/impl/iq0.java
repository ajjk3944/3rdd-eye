package com.yandex.mobile.ads.impl;

import R9.AbstractC1564a;
import R9.C1568e;
import android.text.Html;
import b9.C1992A;
import b9.m;
import d9.C4284b;
import d9.C4285c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class iq0 {

    /* renamed from: a, reason: collision with root package name */
    public static final iq0 f28836a = new iq0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1564a f28837b = R9.t.a(a.f28838b);

    public static final class a extends kotlin.jvm.internal.m implements p9.l<C1568e, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28838b = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(C1568e c1568e) {
            C1568e Json = c1568e;
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11792b = false;
            Json.f11793c = true;
            return C1992A.f18074a;
        }
    }

    private iq0() {
    }

    public static String a(String key, JSONObject jsonObject) throws JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(key, "key");
        String string = jsonObject.getString(key);
        if (string == null || string.length() == 0 || "null".equals(string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        return String.valueOf(Html.fromHtml(string));
    }

    public static final Integer b(String name, JSONObject jsonObject) {
        Object objA;
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(name, "name");
        try {
            objA = Integer.valueOf(jsonObject.getInt(name));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (Integer) objA;
    }

    public static List c(String name, JSONObject parent) {
        kotlin.jvm.internal.l.f(parent, "parent");
        kotlin.jvm.internal.l.f(name, "name");
        JSONArray jSONArrayOptJSONArray = parent.optJSONArray(name);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        C4284b c4284bU = E.u.u();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            f28836a.getClass();
            if (strOptString != null && strOptString.length() != 0 && !"null".equals(strOptString)) {
                c4284bU.add(strOptString);
            }
        }
        return E.u.m(c4284bU);
    }

    public static Map a(JSONObject parent) {
        kotlin.jvm.internal.l.f(parent, "parent");
        JSONObject jSONObjectOptJSONObject = parent.optJSONObject("bidding_info");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        C4285c c4285c = new C4285c();
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        kotlin.jvm.internal.l.e(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObjectOptJSONObject.optString(next);
            f28836a.getClass();
            if (strOptString != null && strOptString.length() != 0 && !"null".equals(strOptString)) {
                kotlin.jvm.internal.l.c(next);
                c4285c.put(next, strOptString);
            }
        }
        return c4285c.c();
    }

    public static final JSONObject a(String content) {
        Object objA;
        kotlin.jvm.internal.l.f(content, "content");
        try {
            objA = new JSONObject(content);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (JSONObject) objA;
    }

    public static AbstractC1564a a() {
        return f28837b;
    }
}
