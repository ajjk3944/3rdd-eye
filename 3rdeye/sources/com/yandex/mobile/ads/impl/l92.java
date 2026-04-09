package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class l92 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f29948a;

    /* renamed from: b, reason: collision with root package name */
    private final zb2 f29949b;

    public /* synthetic */ l92(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new zb2(context, mp1Var));
    }

    public final h92 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        tu.a(this.f29948a, parser, "parser", "version", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f29948a.getClass();
            if (!rk2.a(parser)) {
                break;
            }
            this.f29948a.getClass();
            if (rk2.b(parser)) {
                if ("Ad".equals(parser.getName())) {
                    za2 za2VarA = this.f29949b.a(parser, base64EncodingParameters);
                    if (za2VarA != null) {
                        arrayList.add(za2VarA);
                    }
                } else {
                    this.f29948a.getClass();
                    rk2.d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new h92(attributeValue, arrayList);
    }

    public l92(Context context, mp1 reporter, rk2 xmlHelper, zb2 videoAdParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(videoAdParser, "videoAdParser");
        this.f29948a = xmlHelper;
        this.f29949b = videoAdParser;
    }
}
