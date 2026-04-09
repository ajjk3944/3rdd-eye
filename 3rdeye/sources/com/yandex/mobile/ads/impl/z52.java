package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class z52 implements qk2<y52> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f36215a;

    /* renamed from: b, reason: collision with root package name */
    private final q42 f36216b;

    public /* synthetic */ z52() {
        rk2 rk2Var = new rk2();
        o42[] o42VarArrValues = o42.values();
        this(rk2Var, new q42(new HashSet(C2092m.W(Arrays.copyOf(o42VarArrValues, o42VarArrValues.length)))));
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y52 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f36215a.getClass();
        parser.require(2, null, "Tracking");
        String attributeValue = parser.getAttributeValue(null, "event");
        String attributeValue2 = parser.getAttributeValue(null, "offset");
        this.f36215a.getClass();
        String strC = rk2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || strC.length() <= 0) {
            return null;
        }
        return new y52(attributeValue, strC, attributeValue2 != null ? this.f36216b.a(attributeValue2) : null);
    }

    public z52(rk2 xmlHelper, q42 timeOffsetParser) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(timeOffsetParser, "timeOffsetParser");
        this.f36215a = xmlHelper;
        this.f36216b = timeOffsetParser;
    }
}
