package com.yandex.mobile.ads.impl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class v22 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f34312a = new rk2();

    public final String a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f34312a.getClass();
        parser.require(2, null, "Ad");
        String attributeValue = parser.getAttributeValue(null, FacebookMediationAdapter.KEY_ID);
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
