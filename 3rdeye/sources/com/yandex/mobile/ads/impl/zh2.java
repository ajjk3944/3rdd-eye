package com.yandex.mobile.ads.impl;

import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class zh2 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f36508a;

    /* renamed from: b, reason: collision with root package name */
    private final t70 f36509b;

    /* renamed from: c, reason: collision with root package name */
    private final C4106f2 f36510c;

    /* renamed from: d, reason: collision with root package name */
    private final C4183q2 f36511d;

    /* renamed from: e, reason: collision with root package name */
    private final C4099e2 f36512e;

    public /* synthetic */ zh2() {
        rk2 rk2Var = new rk2();
        t70 t70Var = new t70(rk2Var);
        this(rk2Var, t70Var, new C4106f2(rk2Var, t70Var), new C4183q2(), new C4099e2());
    }

    public final xh2 a(String data, pj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException, yh2 {
        Object next;
        Object next2;
        Object next3;
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        xmlPullParserNewPullParser.setInput(new StringReader(data));
        xmlPullParserNewPullParser.nextTag();
        this.f36508a.getClass();
        xmlPullParserNewPullParser.require(2, null, "VMAP");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
        while (true) {
            this.f36508a.getClass();
            if (!rk2.a(xmlPullParserNewPullParser)) {
                break;
            }
            this.f36508a.getClass();
            if (rk2.b(xmlPullParserNewPullParser)) {
                String name = xmlPullParserNewPullParser.getName();
                if ("AdBreak".equals(name)) {
                    C4078b2 c4078b2A = this.f36510c.a(xmlPullParserNewPullParser, base64EncodingParameters);
                    if (c4078b2A != null) {
                        arrayList.add(c4078b2A);
                    }
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f36509b.a(xmlPullParserNewPullParser, base64EncodingParameters));
                } else {
                    this.f36508a.getClass();
                    rk2.d(xmlPullParserNewPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            throw new yh2();
        }
        this.f36512e.getClass();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((p70) next).a(), "PageID")) {
                break;
            }
        }
        p70 p70Var = (p70) next;
        String strB = p70Var != null ? p70Var.b() : null;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (kotlin.jvm.internal.l.b(((p70) next2).a(), "CategoryID")) {
                break;
            }
        }
        p70 p70Var2 = (p70) next2;
        String strB2 = p70Var2 != null ? p70Var2.b() : null;
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (kotlin.jvm.internal.l.b(((p70) next3).a(), "SessionID")) {
                break;
            }
        }
        p70 p70Var3 = (p70) next3;
        C4092d2 c4092d2 = new C4092d2(strB, strB2, p70Var3 != null ? p70Var3.b() : null);
        this.f36511d.getClass();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((C4078b2) it4.next()).a(c4092d2);
        }
        return new xh2(attributeValue, arrayList, arrayList2);
    }

    public zh2(rk2 mXmlHelper, t70 extensionsParser, C4106f2 adBreakParser, C4183q2 adBreaksConfigurator, C4099e2 adBreakParametersCreator) {
        kotlin.jvm.internal.l.f(mXmlHelper, "mXmlHelper");
        kotlin.jvm.internal.l.f(extensionsParser, "extensionsParser");
        kotlin.jvm.internal.l.f(adBreakParser, "adBreakParser");
        kotlin.jvm.internal.l.f(adBreaksConfigurator, "adBreaksConfigurator");
        kotlin.jvm.internal.l.f(adBreakParametersCreator, "adBreakParametersCreator");
        this.f36508a = mXmlHelper;
        this.f36509b = extensionsParser;
        this.f36510c = adBreakParser;
        this.f36511d = adBreaksConfigurator;
        this.f36512e = adBreakParametersCreator;
    }
}
