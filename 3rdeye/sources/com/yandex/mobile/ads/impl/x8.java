package com.yandex.mobile.ads.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f35213a;

    /* renamed from: b, reason: collision with root package name */
    private final g9 f35214b;

    public /* synthetic */ x8(rk2 rk2Var) {
        this(rk2Var, new g9(rk2Var));
    }

    public final w8 a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f35213a.getClass();
        w8 w8Var = null;
        parser.require(2, null, "AdSource");
        tu.a(this.f35213a, parser, "parser", "allowMultipleAds", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "allowMultipleAds");
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        tu.a(this.f35213a, parser, "parser", "followRedirects", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = parser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        while (true) {
            this.f35213a.getClass();
            if (!rk2.a(parser)) {
                return w8Var;
            }
            this.f35213a.getClass();
            if (rk2.b(parser)) {
                if ("AdTagURI".equals(parser.getName())) {
                    f9 f9VarA = this.f35214b.a(parser);
                    if (f9VarA != null) {
                        w8Var = new w8(f9VarA, attributeValue3);
                    }
                } else {
                    this.f35213a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public x8(rk2 xmlHelper, g9 adTagUriParser) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(adTagUriParser, "adTagUriParser");
        this.f35213a = xmlHelper;
        this.f35214b = adTagUriParser;
    }
}
