package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.qu;
import java.io.IOException;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ru {

    /* renamed from: e, reason: collision with root package name */
    private static final String f32776e = "yandex_tracking_events";

    /* renamed from: f, reason: collision with root package name */
    private static final String f32777f = "yandex_linear_creative_info";

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f32778a;

    /* renamed from: b, reason: collision with root package name */
    private final er0 f32779b;

    /* renamed from: c, reason: collision with root package name */
    private final pu<h80> f32780c;

    /* renamed from: d, reason: collision with root package name */
    private final pk2<y52> f32781d;

    public /* synthetic */ ru(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new er0(mp1Var, new wg(context, mp1Var, (jr0) null, 12)));
    }

    private static pk2 b() {
        return new pk2(new z52(), "CreativeExtension", "Tracking", new rk2());
    }

    public final qu a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f32778a.getClass();
        parser.require(2, null, "CreativeExtensions");
        qu.a aVar = new qu.a();
        while (true) {
            this.f32778a.getClass();
            if (!rk2.a(parser)) {
                return aVar.a();
            }
            this.f32778a.getClass();
            if (rk2.b(parser)) {
                if ("CreativeExtension".equals(parser.getName())) {
                    String attributeValue = parser.getAttributeValue(null, "type");
                    if ("false_click".equals(attributeValue)) {
                        aVar.a(this.f32780c.a(parser, base64EncodingParameters));
                    } else if (kotlin.jvm.internal.l.b(f32776e, attributeValue)) {
                        aVar.a(this.f32781d.a(parser, base64EncodingParameters));
                    } else if (kotlin.jvm.internal.l.b(f32777f, attributeValue)) {
                        aVar.a(this.f32779b.a(parser, base64EncodingParameters));
                    } else {
                        this.f32778a.getClass();
                        rk2.d(parser);
                    }
                } else {
                    this.f32778a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public ru(Context context, mp1 reporter, rk2 xmlHelper, er0 linearCreativeInfoParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(linearCreativeInfoParser, "linearCreativeInfoParser");
        this.f32778a = xmlHelper;
        this.f32779b = linearCreativeInfoParser;
        this.f32780c = a();
        this.f32781d = b();
    }

    private static pu a() {
        return new pu(new m80(new rk2()), new rk2());
    }
}
