package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.yandex.mobile.ads.impl.nu;
import java.io.IOException;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class uu implements qk2<nu> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f34217a;

    /* renamed from: b, reason: collision with root package name */
    private final fr0 f34218b;

    /* renamed from: c, reason: collision with root package name */
    private final ru f34219c;

    public /* synthetic */ uu(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new fr0(), new ru(context, mp1Var));
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    public final nu a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f34217a.getClass();
        parser.require(2, null, "Creative");
        tu.a(this.f34217a, parser, "parser", FacebookMediationAdapter.KEY_ID, "attributeName");
        String attributeValue = parser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        nu.a aVar = new nu.a();
        aVar.c(attributeValue);
        boolean z10 = false;
        while (true) {
            this.f34217a.getClass();
            if (!rk2.a(parser)) {
                break;
            }
            this.f34217a.getClass();
            if (rk2.b(parser)) {
                String name = parser.getName();
                if ("Linear".equals(name)) {
                    this.f34218b.a(parser, aVar, base64EncodingParameters);
                    z10 = true;
                } else if ("CreativeExtensions".equals(name)) {
                    aVar.a(this.f34219c.a(parser, base64EncodingParameters));
                } else {
                    this.f34217a.getClass();
                    rk2.d(parser);
                }
            }
        }
        if (z10) {
            return aVar.a();
        }
        return null;
    }

    public uu(Context context, mp1 reporter, rk2 xmlHelper, fr0 linearCreativeParser, ru creativeExtensionsParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(linearCreativeParser, "linearCreativeParser");
        kotlin.jvm.internal.l.f(creativeExtensionsParser, "creativeExtensionsParser");
        this.f34217a = xmlHelper;
        this.f34218b = linearCreativeParser;
        this.f34219c = creativeExtensionsParser;
    }
}
