package com.yandex.mobile.ads.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c80 {

    /* renamed from: a, reason: collision with root package name */
    private final b80 f25567a;

    public /* synthetic */ c80() {
        this(new b80());
    }

    public final LinkedHashMap a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.isNull(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            JSONObject jsonObject = (JSONObject) obj;
                            this.f25567a.getClass();
                            kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
                            a80 a80Var = (kotlin.jvm.internal.l.b(jsonObject.optString("type"), "parcelable") && kotlin.jvm.internal.l.b(jq0.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, jsonObject), "null")) ? a80.f24553a : null;
                            if (a80Var != null) {
                                kotlin.jvm.internal.l.c(next);
                                linkedHashMap.put(next, a80Var);
                            }
                        } else {
                            kotlin.jvm.internal.l.c(next);
                            kotlin.jvm.internal.l.c(obj);
                            linkedHashMap.put(next, obj);
                        }
                    }
                }
                return linkedHashMap;
            }
        }
        return null;
    }

    public c80(b80 extrasParcelableParser) {
        kotlin.jvm.internal.l.f(extrasParcelableParser, "extrasParcelableParser");
        this.f25567a = extrasParcelableParser;
    }
}
