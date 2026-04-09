package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.m;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class le2 {

    /* renamed from: a, reason: collision with root package name */
    private final qj f29982a;

    /* renamed from: b, reason: collision with root package name */
    private final b92 f29983b;

    /* renamed from: c, reason: collision with root package name */
    private final qb2<ab1> f29984c;

    /* renamed from: d, reason: collision with root package name */
    private final ha2 f29985d;

    /* renamed from: e, reason: collision with root package name */
    private final of2 f29986e;

    /* renamed from: f, reason: collision with root package name */
    private final bj0 f29987f;

    public /* synthetic */ le2(Context context, mp1 mp1Var, qj qjVar) {
        this(context, mp1Var, qjVar, c92.a(qjVar.b()), new qb2(context, new bb1()), new ha2(context, mp1Var), new of2(), new bj0());
    }

    public final Object a(JSONObject jsonValue) throws k61 {
        h92 h92VarA;
        nf2 nf2Var;
        Object objA;
        kotlin.jvm.internal.l.f(jsonValue, "jsonValue");
        try {
            h92VarA = this.f29985d.a(this.f29983b.a("vast", jsonValue), this.f29982a);
        } catch (Exception unused) {
            h92VarA = null;
        }
        if (h92VarA == null || h92VarA.b().isEmpty()) {
            throw new k61("Invalid VAST in response");
        }
        ArrayList arrayListA = this.f29984c.a(h92VarA.b());
        if (arrayListA.isEmpty()) {
            throw new k61("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject = jsonValue.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            this.f29986e.getClass();
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("volumeControlVisible", true);
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("isProgressBarHidden", false);
            try {
                objA = Double.valueOf(jSONObjectOptJSONObject.getDouble("initialVolume"));
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                objA = null;
            }
            nf2Var = new nf2(zOptBoolean, zOptBoolean2, (Double) objA);
        } else {
            nf2Var = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jsonValue.optJSONObject("preview");
        return new ya2(arrayListA, nf2Var, jSONObjectOptJSONObject2 != null ? this.f29987f.b(jSONObjectOptJSONObject2) : null);
    }

    public le2(Context context, mp1 reporter, qj base64EncodingParameters, b92 valueReader, qb2<ab1> videoAdInfoListCreator, ha2 vastXmlParser, of2 videoSettingsParser, bj0 imageParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        kotlin.jvm.internal.l.f(valueReader, "valueReader");
        kotlin.jvm.internal.l.f(videoAdInfoListCreator, "videoAdInfoListCreator");
        kotlin.jvm.internal.l.f(vastXmlParser, "vastXmlParser");
        kotlin.jvm.internal.l.f(videoSettingsParser, "videoSettingsParser");
        kotlin.jvm.internal.l.f(imageParser, "imageParser");
        this.f29982a = base64EncodingParameters;
        this.f29983b = valueReader;
        this.f29984c = videoAdInfoListCreator;
        this.f29985d = vastXmlParser;
        this.f29986e = videoSettingsParser;
        this.f29987f = imageParser;
    }
}
