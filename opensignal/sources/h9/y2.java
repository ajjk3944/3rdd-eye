package h9;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes.dex */
public final class y2 extends DefaultHandler2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3 f10518a;

    public y2(c3 c3Var) {
        this.f10518a = c3Var;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i10, int i11) {
        this.f10518a.G(new String(cArr, i10, i11));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        this.f10518a.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f10518a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        c3.y(new b5.m(str2));
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f10518a.E();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws s2 {
        this.f10518a.F(str, str2, str3, attributes);
    }
}
