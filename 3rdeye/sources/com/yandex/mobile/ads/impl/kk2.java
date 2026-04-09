package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.za2;
import java.io.IOException;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class kk2 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f29692a;

    /* renamed from: b, reason: collision with root package name */
    private final eb2 f29693b;

    /* renamed from: c, reason: collision with root package name */
    private final ik2 f29694c;

    public /* synthetic */ kk2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new rk2(), new eb2(context, mp1Var), new ik2());
    }

    public final za2 a(XmlPullParser parser, za2.a videoAdBuilder, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(videoAdBuilder, "videoAdBuilder");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f29692a.getClass();
        parser.require(2, null, "Wrapper");
        this.f29694c.getClass();
        videoAdBuilder.a(ik2.a(parser));
        while (true) {
            this.f29692a.getClass();
            if (!rk2.a(parser)) {
                return videoAdBuilder.a();
            }
            this.f29692a.getClass();
            if (rk2.b(parser)) {
                if ("VASTAdTagURI".equals(parser.getName())) {
                    this.f29692a.getClass();
                    videoAdBuilder.h(rk2.c(parser));
                } else {
                    this.f29693b.a(parser, videoAdBuilder, base64EncodingParameters);
                }
            }
        }
    }

    public kk2(Context context, mp1 reporter, rk2 xmlHelper, eb2 videoAdElementParser, ik2 wrapperConfigurationParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(videoAdElementParser, "videoAdElementParser");
        kotlin.jvm.internal.l.f(wrapperConfigurationParser, "wrapperConfigurationParser");
        this.f29692a = xmlHelper;
        this.f29693b = videoAdElementParser;
        this.f29694c = wrapperConfigurationParser;
    }
}
