package com.yandex.mobile.ads.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.yandex.mobile.ads.impl.sv0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class uv0 implements qk2<sv0> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f34226a;

    public /* synthetic */ uv0() {
        this(new rk2());
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    public final sv0 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f34226a.getClass();
        parser.require(2, null, "MediaFile");
        tu.a(this.f34226a, parser, "parser", "delivery", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "delivery");
        tu.a(this.f34226a, parser, "parser", "type", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "type");
        tu.a(this.f34226a, parser, "parser", "height", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "height");
        tu.a(this.f34226a, parser, "parser", "width", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "width");
        tu.a(this.f34226a, parser, "parser", "bitrate", "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, "bitrate");
        tu.a(this.f34226a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        tu.a(this.f34226a, parser, "parser", FacebookMediationAdapter.KEY_ID, "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        tu.a(this.f34226a, parser, "parser", "codec", "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, "codec");
        tu.a(this.f34226a, parser, "parser", "vmaf", "attributeName");
        String attributeValue9 = parser.getAttributeValue(null, "vmaf");
        this.f34226a.getClass();
        return new sv0.a(rk2.c(parser)).f(attributeValue7).d(attributeValue).e(attributeValue3).i(attributeValue4).b(attributeValue5).a(attributeValue6).g(attributeValue2).c(attributeValue8).h(attributeValue9).a();
    }

    public uv0(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f34226a = xmlHelper;
    }
}
