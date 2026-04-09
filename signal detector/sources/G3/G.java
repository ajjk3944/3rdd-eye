package G3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.apm.insight.R;
import d3.AbstractC2266a;
import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f1540a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1541b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f1542c;

    /* renamed from: d, reason: collision with root package name */
    public final o[] f1543d;

    /* renamed from: e, reason: collision with root package name */
    public final E f1544e;

    /* renamed from: f, reason: collision with root package name */
    public final E f1545f;

    /* renamed from: g, reason: collision with root package name */
    public final E f1546g;

    /* renamed from: h, reason: collision with root package name */
    public final E f1547h;

    public G(F f2) {
        this.f1540a = f2.f1532a;
        this.f1541b = f2.f1533b;
        this.f1542c = f2.f1534c;
        this.f1543d = f2.f1535d;
        this.f1544e = f2.f1536e;
        this.f1545f = f2.f1537f;
        this.f1546g = f2.f1538g;
        this.f1547h = f2.f1539h;
    }

    public static void a(F f2, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC2266a.f19725C;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o oVarA = o.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i6 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i6;
                    }
                }
                f2.a(StateSet.trimStateSet(iArr2, i), oVarA);
            }
        }
    }

    public static G b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet attributeSetAsAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        F f2 = new F();
        f2.b();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            f2.b();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            a(f2, context, xml, attributeSetAsAttributeSet, context.getTheme());
        }
        xml.close();
        if (f2.f1532a == 0) {
            return null;
        }
        return new G(f2);
    }

    public final o c() {
        o oVar = this.f1541b;
        E e6 = this.f1547h;
        E e7 = this.f1546g;
        E e8 = this.f1545f;
        E e9 = this.f1544e;
        if (e9 == null && e8 == null && e7 == null && e6 == null) {
            return oVar;
        }
        n nVarG = oVar.g();
        if (e9 != null) {
            nVarG.f1616e = e9.f1529b;
        }
        if (e8 != null) {
            nVarG.f1617f = e8.f1529b;
        }
        if (e7 != null) {
            nVarG.f1619h = e7.f1529b;
        }
        if (e6 != null) {
            nVarG.f1618g = e6.f1529b;
        }
        return nVarG.a();
    }

    public final boolean d() {
        E e6;
        E e7;
        E e8;
        E e9;
        return this.f1540a > 1 || ((e6 = this.f1544e) != null && e6.f1528a > 1) || (((e7 = this.f1545f) != null && e7.f1528a > 1) || (((e8 = this.f1546g) != null && e8.f1528a > 1) || ((e9 = this.f1547h) != null && e9.f1528a > 1)));
    }
}
