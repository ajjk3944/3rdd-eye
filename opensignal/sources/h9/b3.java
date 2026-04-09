package h9;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class b3 implements Attributes {

    /* renamed from: a, reason: collision with root package name */
    public XmlPullParser f10309a;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f10309a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i10) {
        return this.f10309a.getAttributeName(i10);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i10) {
        XmlPullParser xmlPullParser = this.f10309a;
        String attributeName = xmlPullParser.getAttributeName(i10);
        if (xmlPullParser.getAttributePrefix(i10) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i10) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i10) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i10) {
        return this.f10309a.getAttributeNamespace(i10);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i10) {
        return this.f10309a.getAttributeValue(i10);
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }
}
