package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class na2 implements qk2<ja2> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f30824a;

    /* renamed from: b, reason: collision with root package name */
    private final cq0 f30825b;

    /* renamed from: c, reason: collision with root package name */
    private final ma2 f30826c;

    /* renamed from: d, reason: collision with root package name */
    private final a62 f30827d;

    public /* synthetic */ na2() {
        this(new rk2(), new cq0(), new ma2(), new a62());
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    public final ja2 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f30824a.getClass();
        parser.require(2, null, "Verification");
        tu.a(this.f30824a, parser, "parser", "vendor", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "vendor");
        HashMap map = new HashMap();
        bq0 bq0VarA = null;
        String strA = null;
        while (true) {
            this.f30824a.getClass();
            if (!rk2.a(parser)) {
                break;
            }
            this.f30824a.getClass();
            if (rk2.b(parser)) {
                String name = parser.getName();
                if ("JavaScriptResource".equals(name)) {
                    bq0VarA = this.f30825b.a(parser);
                } else if ("VerificationParameters".equals(name)) {
                    strA = this.f30826c.a(parser);
                } else if ("TrackingEvents".equals(name)) {
                    map = this.f30827d.a(parser, base64EncodingParameters);
                } else {
                    this.f30824a.getClass();
                    rk2.d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new ja2(attributeValue, bq0VarA, strA, map);
    }

    public na2(rk2 xmlHelper, cq0 javaScriptResourceParser, ma2 verificationParametersParser, a62 trackingEventsParser) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(javaScriptResourceParser, "javaScriptResourceParser");
        kotlin.jvm.internal.l.f(verificationParametersParser, "verificationParametersParser");
        kotlin.jvm.internal.l.f(trackingEventsParser, "trackingEventsParser");
        this.f30824a = xmlHelper;
        this.f30825b = javaScriptResourceParser;
        this.f30826c = verificationParametersParser;
        this.f30827d = trackingEventsParser;
    }
}
