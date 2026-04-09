package d4;

import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2268b {

    /* renamed from: c, reason: collision with root package name */
    public static final X3.e f19787c = new X3.e("LocalTestingConfigParser", 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f19788a;

    /* renamed from: b, reason: collision with root package name */
    public final V2.h f19789b;

    public C2268b(XmlPullParser xmlPullParser) {
        this.f19788a = xmlPullParser;
        C2269c c2269c = C2269c.f19790c;
        V2.h hVar = new V2.h(18, false);
        hVar.f3876c = new HashMap();
        this.f19789b = hVar;
    }

    public final void a(String str, i iVar) {
        while (true) {
            XmlPullParser xmlPullParser = this.f19788a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException("Expected '" + str + "' tag but found '" + xmlPullParser.getName() + "'.", xmlPullParser, null);
                }
                iVar.mo0a();
            }
        }
    }
}
