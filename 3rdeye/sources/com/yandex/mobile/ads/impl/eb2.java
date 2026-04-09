package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.za2;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class eb2 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f26781a;

    /* renamed from: b, reason: collision with root package name */
    private final pk2<nu> f26782b;

    /* renamed from: c, reason: collision with root package name */
    private final pk2<ja2> f26783c;

    /* renamed from: d, reason: collision with root package name */
    private final nh2 f26784d;

    /* renamed from: e, reason: collision with root package name */
    private final ib2 f26785e;

    public /* synthetic */ eb2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new pk2(new uu(context, mp1Var), "Creatives", "Creative"), new pk2(new na2(), "AdVerifications", "Verification"), new nh2(), new ib2());
    }

    public final void a(XmlPullParser parser, za2.a videoAdBuilder, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(videoAdBuilder, "videoAdBuilder");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        String name = parser.getName();
        if ("Impression".equals(name)) {
            this.f26781a.getClass();
            videoAdBuilder.b(rk2.c(parser));
            return;
        }
        if ("ViewableImpression".equals(name)) {
            videoAdBuilder.a(this.f26784d.a(parser, base64EncodingParameters));
            return;
        }
        if ("Error".equals(name)) {
            this.f26781a.getClass();
            videoAdBuilder.a(rk2.c(parser));
            return;
        }
        if ("Survey".equals(name)) {
            this.f26781a.getClass();
            videoAdBuilder.g(rk2.c(parser));
            return;
        }
        if ("Description".equals(name)) {
            this.f26781a.getClass();
            videoAdBuilder.e(rk2.c(parser));
            return;
        }
        if ("AdTitle".equals(name)) {
            this.f26781a.getClass();
            videoAdBuilder.d(rk2.c(parser));
            return;
        }
        if ("AdSystem".equals(name)) {
            this.f26781a.getClass();
            videoAdBuilder.c(rk2.c(parser));
            return;
        }
        if ("Creatives".equals(name)) {
            videoAdBuilder.a(this.f26782b.a(parser, base64EncodingParameters));
            return;
        }
        if ("AdVerifications".equals(name)) {
            videoAdBuilder.a((List) this.f26783c.a(parser, base64EncodingParameters));
        } else if ("Extensions".equals(name)) {
            videoAdBuilder.a(this.f26785e.a(parser, base64EncodingParameters));
        } else {
            this.f26781a.getClass();
            rk2.d(parser);
        }
    }

    public eb2(Context context, mp1 reporter, rk2 xmlHelper, pk2<nu> creativeArrayParser, pk2<ja2> verificationArrayParser, nh2 viewableImpressionParser, ib2 videoAdExtensionsParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(creativeArrayParser, "creativeArrayParser");
        kotlin.jvm.internal.l.f(verificationArrayParser, "verificationArrayParser");
        kotlin.jvm.internal.l.f(viewableImpressionParser, "viewableImpressionParser");
        kotlin.jvm.internal.l.f(videoAdExtensionsParser, "videoAdExtensionsParser");
        this.f26781a = xmlHelper;
        this.f26782b = creativeArrayParser;
        this.f26783c = verificationArrayParser;
        this.f26784d = viewableImpressionParser;
        this.f26785e = videoAdExtensionsParser;
    }
}
