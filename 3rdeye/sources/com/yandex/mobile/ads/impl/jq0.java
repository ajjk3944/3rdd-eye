package com.yandex.mobile.ads.impl;

import b9.m;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jq0 {
    public static final String a(String name, JSONObject jSONObject) {
        Object objA;
        kotlin.jvm.internal.l.f(jSONObject, "<this>");
        kotlin.jvm.internal.l.f(name, "name");
        try {
            objA = jSONObject.getString(name);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (String) objA;
    }
}
