package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4082c {
    public static C4075b a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("experiments");
            JSONArray jSONArray = jSONObject.getJSONArray("test_ids");
            kotlin.jvm.internal.l.e(jSONArray, "getJSONArray(...)");
            LinkedHashSet linkedHashSetA = a(jSONArray);
            kotlin.jvm.internal.l.c(string);
            return new C4075b(string, linkedHashSetA);
        } catch (Throwable unused) {
            fp0.b(new Object[0]);
            return null;
        }
    }

    private static LinkedHashSet a(JSONArray jSONArray) {
        Object objA;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                objA = Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i))));
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (b9.m.a(objA) != null) {
                Objects.toString(jSONArray.get(i));
                fp0.b(new Object[0]);
            }
        }
        return linkedHashSet;
    }
}
