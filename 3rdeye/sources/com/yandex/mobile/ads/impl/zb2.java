package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.za2;
import java.io.IOException;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class zb2 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f36398a;

    /* renamed from: b, reason: collision with root package name */
    private final lk0 f36399b;

    /* renamed from: c, reason: collision with root package name */
    private final kk2 f36400c;

    /* renamed from: d, reason: collision with root package name */
    private final ax1 f36401d;

    /* renamed from: e, reason: collision with root package name */
    private final v22 f36402e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f36403f;

    public /* synthetic */ zb2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new lk0(new eb2(context, mp1Var)), new kk2(context, mp1Var), new ax1(), new v22());
    }

    public final za2 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        String strA = this.f36402e.a(parser);
        Integer numA = this.f36401d.a(parser);
        this.f36398a.getClass();
        za2 za2VarA = null;
        parser.require(2, null, "Ad");
        while (true) {
            this.f36398a.getClass();
            if (!rk2.a(parser)) {
                return za2VarA;
            }
            this.f36398a.getClass();
            if (rk2.b(parser)) {
                String name = parser.getName();
                if ("InLine".equals(name)) {
                    za2.a aVar = new za2.a(this.f36403f, false);
                    aVar.f(strA);
                    aVar.a(numA);
                    za2VarA = this.f36399b.a(parser, aVar, base64EncodingParameters);
                } else if ("Wrapper".equals(name)) {
                    za2.a aVar2 = new za2.a(this.f36403f, true);
                    aVar2.f(strA);
                    aVar2.a(numA);
                    za2VarA = this.f36400c.a(parser, aVar2, base64EncodingParameters);
                } else {
                    this.f36398a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public zb2(Context context, mp1 reporter, rk2 xmlHelper, lk0 inlineParser, kk2 wrapperParser, ax1 sequenceParser, v22 idXmlAttributeParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(inlineParser, "inlineParser");
        kotlin.jvm.internal.l.f(wrapperParser, "wrapperParser");
        kotlin.jvm.internal.l.f(sequenceParser, "sequenceParser");
        kotlin.jvm.internal.l.f(idXmlAttributeParser, "idXmlAttributeParser");
        this.f36398a = xmlHelper;
        this.f36399b = inlineParser;
        this.f36400c = wrapperParser;
        this.f36401d = sequenceParser;
        this.f36402e = idXmlAttributeParser;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f36403f = applicationContext;
    }
}
