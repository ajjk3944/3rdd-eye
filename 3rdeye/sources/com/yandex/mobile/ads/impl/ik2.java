package com.yandex.mobile.ads.impl;

import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ik2 {
    private static boolean a(XmlPullParser xmlPullParser, String str, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            Boolean boolV0 = y9.q.v0(lowerCase);
            if (boolV0 != null) {
                return boolV0.booleanValue();
            }
        }
        return z10;
    }

    public static hk2 a(XmlPullParser parser) {
        kotlin.jvm.internal.l.f(parser, "parser");
        return new hk2(a(parser, "allowMultipleAds", false), a(parser, "followAdditionalWrappers", true));
    }
}
