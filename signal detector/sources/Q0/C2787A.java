package q0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: q0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2787A {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f22905c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f22906a;

    /* renamed from: b, reason: collision with root package name */
    public final M f22907b;

    public C2787A(Context context, M m6) {
        q5.i.e(m6, "navigatorProvider");
        this.f22906a = context;
        this.f22907b = m6;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q0.C2793f c(android.content.res.TypedArray r16, android.content.res.Resources r17, int r18) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C2787A.c(android.content.res.TypedArray, android.content.res.Resources, int):q0.f");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0245, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q0.v a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C2787A.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):q0.v");
    }

    public final x b(int i) throws Resources.NotFoundException {
        int next;
        Resources resources = this.f22906a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        q5.i.d(xml, "res.getXml(graphResId)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e6) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e6);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        q5.i.d(attributeSetAsAttributeSet, "attrs");
        v vVarA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (vVarA instanceof x) {
            return (x) vVarA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
