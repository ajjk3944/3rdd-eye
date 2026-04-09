package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ha2 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f28150a;

    /* renamed from: b, reason: collision with root package name */
    private final l92 f28151b;

    public /* synthetic */ ha2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new l92(context, mp1Var));
    }

    public final h92 a(String data, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(data));
        xmlPullParserNewPullParser.nextTag();
        this.f28150a.getClass();
        xmlPullParserNewPullParser.require(2, null, "VAST");
        return this.f28151b.a(xmlPullParserNewPullParser, base64EncodingParameters);
    }

    public ha2(Context context, mp1 reporter, rk2 xmlHelper, l92 vastAdsParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(vastAdsParser, "vastAdsParser");
        this.f28150a = xmlHelper;
        this.f28151b = vastAdsParser;
    }
}
