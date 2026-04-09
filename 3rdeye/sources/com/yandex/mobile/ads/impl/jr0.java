package com.yandex.mobile.ads.impl;

import b9.m;
import c9.C2079C;
import c9.C2097r;
import com.google.android.gms.common.internal.ImagesContract;
import d9.C4284b;
import d9.C4289g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jr0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4235y f29266a;

    public /* synthetic */ jr0(mp1 mp1Var) {
        this(mp1Var, new C4235y(mp1Var));
    }

    private static String a(String str, JSONObject jSONObject) throws k61, JSONException {
        if (!jSONObject.has(str)) {
            return null;
        }
        String strA = y81.a(jSONObject, "jsonAsset", str, "jsonAttribute", str);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        return strA;
    }

    public jr0(mp1 reporter, C4235y actionParserProvider) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(actionParserProvider, "actionParserProvider");
        this.f29266a = actionParserProvider;
    }

    public final ir0 a(JSONObject jsonLink, qj base64EncodingParameters) throws k61, JSONException {
        ArrayList arrayList;
        Object objA;
        kotlin.jvm.internal.l.f(jsonLink, "jsonLink");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        JSONArray jSONArrayOptJSONArray = jsonLink.optJSONArray("actions");
        C4284b c4284bM = null;
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                C4235y c4235y = this.f29266a;
                kotlin.jvm.internal.l.c(jSONObject);
                InterfaceC4228x<?> interfaceC4228xA = c4235y.a(jSONObject, base64EncodingParameters);
                if (interfaceC4228xA != null) {
                    arrayList2.add(interfaceC4228xA.a(jSONObject));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String strA = a("falseClickUrl", jsonLink);
        h80 h80Var = strA != null ? new h80(strA, jsonLink.optLong("falseClickInterval", 0L)) : null;
        C4289g c4289g = new C4289g();
        String strA2 = a("trackingUrl", jsonLink);
        if (strA2 != null) {
            c4289g.add(strA2);
        }
        JSONArray jSONArrayOptJSONArray2 = jsonLink.optJSONArray("trackingUrls");
        if (jSONArrayOptJSONArray2 != null) {
            C4284b c4284bU = E.u.u();
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i10 = 0; i10 < length2; i10++) {
                try {
                    objA = jSONArrayOptJSONArray2.getString(i10);
                } catch (Throwable th) {
                    objA = b9.n.a(th);
                }
                if (!(objA instanceof m.a)) {
                    String str = (String) objA;
                    kotlin.jvm.internal.l.c(str);
                    c4284bU.add(str);
                }
            }
            c4284bM = E.u.m(c4284bU);
        }
        if (c4284bM != null) {
            c4289g.addAll(c4284bM);
        }
        return new ir0(arrayList, h80Var, C2097r.G0(C2079C.a(c4289g)), a(ImagesContract.URL, jsonLink), jsonLink.optLong("clickableDelay", 0L));
    }
}
