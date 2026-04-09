package ed;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.liuzh.deviceinfo.R;
import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23266a;

    /* renamed from: b, reason: collision with root package name */
    public final o f23267b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f23268c;

    /* renamed from: d, reason: collision with root package name */
    public final o[] f23269d;

    /* renamed from: e, reason: collision with root package name */
    public final z f23270e;

    /* renamed from: f, reason: collision with root package name */
    public final z f23271f;
    public final z g;

    /* renamed from: h, reason: collision with root package name */
    public final z f23272h;

    public b0(a0 a0Var) {
        this.f23266a = a0Var.f23257b;
        this.f23267b = (o) a0Var.f23258c;
        this.f23268c = (int[][]) a0Var.f23259d;
        this.f23269d = (o[]) a0Var.f23260e;
        this.f23270e = (z) a0Var.f23261f;
        this.f23271f = (z) a0Var.g;
        this.g = (z) a0Var.f23262h;
        this.f23272h = (z) a0Var.f23263i;
    }

    public static void a(a0 a0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = ic.a.f25963x;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o oVarA = o.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i11 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i11;
                    }
                }
                a0Var.a(StateSet.trimStateSet(iArr2, i4), oVarA);
            }
        }
    }

    public static b0 b(Context context, TypedArray typedArray, int i4) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i4, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a0 a0Var = new a0(0);
        a0Var.d();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a0Var.d();
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
                a(a0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (a0Var.f23257b == 0) {
                return null;
            }
            return new b0(a0Var);
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

    public final o c() {
        o oVar = this.f23267b;
        z zVar = this.f23272h;
        z zVar2 = this.g;
        z zVar3 = this.f23271f;
        z zVar4 = this.f23270e;
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            return oVar;
        }
        n nVarG = oVar.g();
        if (zVar4 != null) {
            nVarG.f23346e = zVar4.f23389b;
        }
        if (zVar3 != null) {
            nVarG.f23347f = zVar3.f23389b;
        }
        if (zVar2 != null) {
            nVarG.f23348h = zVar2.f23389b;
        }
        if (zVar != null) {
            nVarG.g = zVar.f23389b;
        }
        return nVarG.a();
    }

    public final boolean d() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        return this.f23266a > 1 || ((zVar = this.f23270e) != null && zVar.f23388a > 1) || (((zVar2 = this.f23271f) != null && zVar2.f23388a > 1) || (((zVar3 = this.g) != null && zVar3.f23388a > 1) || ((zVar4 = this.f23272h) != null && zVar4.f23388a > 1)));
    }
}
