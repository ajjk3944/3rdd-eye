package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dr0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class er0 {

    /* renamed from: a, reason: collision with root package name */
    private final wg f26993a;

    /* renamed from: b, reason: collision with root package name */
    private final rk2 f26994b;

    /* renamed from: c, reason: collision with root package name */
    private final jr0 f26995c;

    public er0(mp1 reporter, wg assetsJsonParser) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(assetsJsonParser, "assetsJsonParser");
        this.f26993a = assetsJsonParser;
        this.f26994b = new rk2();
        this.f26995c = new jr0(reporter);
    }

    public final dr0 a(XmlPullParser parser, qj base64EncodingParameters) throws JSONException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        try {
            dr0.a aVar = new dr0.a();
            this.f26994b.getClass();
            JSONObject jSONObject = new JSONObject(rk2.c(parser));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if ("assets".equals(next)) {
                    aVar.a(this.f26993a.a(jSONObject, base64EncodingParameters));
                } else if ("link".equals(next)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    jr0 jr0Var = this.f26995c;
                    kotlin.jvm.internal.l.c(jSONObject2);
                    aVar.a(jr0Var.a(jSONObject2, base64EncodingParameters));
                }
            }
            return aVar.a();
        } catch (Exception e4) {
            throw new JSONException(e4.getMessage());
        }
    }
}
