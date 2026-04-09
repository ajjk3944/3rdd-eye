package ee;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f8173a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8174b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f8175c;

    /* renamed from: d, reason: collision with root package name */
    public final l[] f8176d;

    /* renamed from: e, reason: collision with root package name */
    public final w f8177e;

    /* renamed from: f, reason: collision with root package name */
    public final w f8178f;

    /* renamed from: g, reason: collision with root package name */
    public final w f8179g;

    /* renamed from: h, reason: collision with root package name */
    public final w f8180h;

    public y(x xVar) {
        this.f8173a = xVar.f8165b;
        this.f8174b = (l) xVar.f8166c;
        this.f8175c = (int[][]) xVar.f8167d;
        this.f8176d = (l[]) xVar.f8168e;
        this.f8177e = (w) xVar.f8169f;
        this.f8178f = (w) xVar.f8170g;
        this.f8179g = (w) xVar.f8171h;
        this.f8180h = (w) xVar.f8172i;
    }

    public static void a(x xVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ed.l.MaterialShape) : theme.obtainStyledAttributes(attributeSet, ed.l.MaterialShape, 0, 0);
                l lVarB = l.a(context, typedArrayObtainAttributes.getResourceId(ed.l.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(ed.l.MaterialShape_shapeAppearanceOverlay, 0)).b();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != ed.b.shapeAppearance && attributeNameResource != ed.b.shapeAppearanceOverlay) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                xVar.a(StateSet.trimStateSet(iArr, i10), lVarB);
            }
        }
    }

    public static y b(Context context, TypedArray typedArray, int i10) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        x xVar = new x(0);
        xVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            xVar.e();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                a(xVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (xVar.f8165b == 0) {
                return null;
            }
            return new y(xVar);
        } catch (Throwable th2) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final l c() {
        l lVar = this.f8174b;
        w wVar = this.f8180h;
        w wVar2 = this.f8179g;
        w wVar3 = this.f8178f;
        w wVar4 = this.f8177e;
        if (wVar4 == null && wVar3 == null && wVar2 == null && wVar == null) {
            return lVar;
        }
        bk.f fVarG = lVar.g();
        if (wVar4 != null) {
            fVarG.f2807e = wVar4.f8161b;
        }
        if (wVar3 != null) {
            fVarG.f2808f = wVar3.f8161b;
        }
        if (wVar2 != null) {
            fVarG.f2810h = wVar2.f8161b;
        }
        if (wVar != null) {
            fVarG.f2809g = wVar.f8161b;
        }
        return fVarG.b();
    }

    public final boolean d() {
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        return this.f8173a > 1 || ((wVar = this.f8177e) != null && wVar.f8160a > 1) || (((wVar2 = this.f8178f) != null && wVar2.f8160a > 1) || (((wVar3 = this.f8179g) != null && wVar3.f8160a > 1) || ((wVar4 = this.f8180h) != null && wVar4.f8160a > 1)));
    }
}
