package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nu;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class fr0 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f27434a;

    /* renamed from: b, reason: collision with root package name */
    private final vd2 f27435b;

    /* renamed from: c, reason: collision with root package name */
    private final o40 f27436c;

    /* renamed from: d, reason: collision with root package name */
    private final iz1 f27437d;

    /* renamed from: e, reason: collision with root package name */
    private final pk2<sv0> f27438e;

    /* renamed from: f, reason: collision with root package name */
    private final pk2<xh0> f27439f;

    /* renamed from: g, reason: collision with root package name */
    private final pk2<y52> f27440g;

    public /* synthetic */ fr0() {
        this(new rk2(), new vd2(), new o40(), new iz1(), new pk2(new uv0(), "MediaFiles", "MediaFile"), new pk2(new yh0(), "Icons", "Icon"), new pk2(new z52(), "TrackingEvents", "Tracking"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void a(XmlPullParser parser, nu.a creativeBuilder, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(creativeBuilder, "creativeBuilder");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f27434a.getClass();
        parser.require(2, null, "Linear");
        this.f27437d.getClass();
        String attributeValue = parser.getAttributeValue(null, "skipoffset");
        if (attributeValue == null) {
            attributeValue = "";
        }
        creativeBuilder.a(attributeValue.length() > 0 ? new hz1(attributeValue) : null);
        while (true) {
            this.f27434a.getClass();
            if (!rk2.a(parser)) {
                return;
            }
            this.f27434a.getClass();
            if (rk2.b(parser)) {
                String name = parser.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -2049897434:
                            if (!name.equals("VideoClicks")) {
                                break;
                            } else {
                                ud2 ud2VarA = this.f27435b.a(parser, base64EncodingParameters);
                                creativeBuilder.b(ud2VarA.a());
                                Iterator<String> it = ud2VarA.b().iterator();
                                while (it.hasNext()) {
                                    creativeBuilder.a(new y52("clickTracking", it.next(), null));
                                }
                                break;
                            }
                        case -1927368268:
                            if (!name.equals("Duration")) {
                                break;
                            } else {
                                creativeBuilder.a(this.f27436c.a(parser));
                                break;
                            }
                        case -1348833651:
                            if (!name.equals("AdParameters")) {
                                break;
                            } else {
                                this.f27434a.getClass();
                                creativeBuilder.a(rk2.c(parser));
                                break;
                            }
                        case -385055469:
                            if (!name.equals("MediaFiles")) {
                                break;
                            } else {
                                creativeBuilder.b(this.f27438e.a(parser, base64EncodingParameters));
                                break;
                            }
                        case 70476538:
                            if (!name.equals("Icons")) {
                                break;
                            } else {
                                creativeBuilder.a(this.f27439f.a(parser, base64EncodingParameters));
                                break;
                            }
                        case 611554000:
                            if (!name.equals("TrackingEvents")) {
                                break;
                            } else {
                                Iterator it2 = this.f27440g.a(parser, base64EncodingParameters).iterator();
                                while (it2.hasNext()) {
                                    creativeBuilder.a((y52) it2.next());
                                }
                                break;
                            }
                    }
                }
                this.f27434a.getClass();
                rk2.d(parser);
            }
        }
    }

    public fr0(rk2 xmlHelper, vd2 videoClicksParser, o40 durationParser, iz1 skipOffsetParser, pk2<sv0> mediaFileArrayParser, pk2<xh0> iconArrayParser, pk2<y52> trackingEventsArrayParser) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(videoClicksParser, "videoClicksParser");
        kotlin.jvm.internal.l.f(durationParser, "durationParser");
        kotlin.jvm.internal.l.f(skipOffsetParser, "skipOffsetParser");
        kotlin.jvm.internal.l.f(mediaFileArrayParser, "mediaFileArrayParser");
        kotlin.jvm.internal.l.f(iconArrayParser, "iconArrayParser");
        kotlin.jvm.internal.l.f(trackingEventsArrayParser, "trackingEventsArrayParser");
        this.f27434a = xmlHelper;
        this.f27435b = videoClicksParser;
        this.f27436c = durationParser;
        this.f27437d = skipOffsetParser;
        this.f27438e = mediaFileArrayParser;
        this.f27439f = iconArrayParser;
        this.f27440g = trackingEventsArrayParser;
    }
}
