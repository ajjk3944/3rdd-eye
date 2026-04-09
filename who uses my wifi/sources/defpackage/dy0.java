package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dy0 {
    public final int a;
    public final su0 b;
    public final int[][] c;
    public final su0[] d;
    public final cy0 e;
    public final cy0 f;
    public final cy0 g;
    public final cy0 h;

    public dy0(q50 q50Var) {
        this.a = q50Var.a;
        this.b = (su0) q50Var.b;
        this.c = (int[][]) q50Var.c;
        this.d = (su0[]) q50Var.d;
        this.e = (cy0) q50Var.e;
        this.f = (cy0) q50Var.f;
        this.g = (cy0) q50Var.g;
        this.h = (cy0) q50Var.h;
    }

    public static void a(q50 q50Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = gn0.A;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                su0 su0VarA = su0.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new l(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                q50Var.a(StateSet.trimStateSet(iArr2, i), su0VarA);
            }
        }
    }

    public static dy0 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet attributeSetAsAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        q50 q50Var = new q50();
        q50Var.b();
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
            q50Var.b();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            a(q50Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
        }
        xml.close();
        if (q50Var.a == 0) {
            return null;
        }
        return new dy0(q50Var);
    }

    public final su0 c() {
        su0 su0Var = this.b;
        cy0 cy0Var = this.h;
        cy0 cy0Var2 = this.g;
        cy0 cy0Var3 = this.f;
        cy0 cy0Var4 = this.e;
        if (cy0Var4 == null && cy0Var3 == null && cy0Var2 == null && cy0Var == null) {
            return su0Var;
        }
        f2 f2VarF = su0Var.f();
        if (cy0Var4 != null) {
            f2VarF.e = cy0Var4.b;
        }
        if (cy0Var3 != null) {
            f2VarF.f = cy0Var3.b;
        }
        if (cy0Var2 != null) {
            f2VarF.h = cy0Var2.b;
        }
        if (cy0Var != null) {
            f2VarF.g = cy0Var.b;
        }
        return f2VarF.a();
    }

    public final boolean d() {
        cy0 cy0Var;
        cy0 cy0Var2;
        cy0 cy0Var3;
        cy0 cy0Var4;
        return this.a > 1 || ((cy0Var = this.e) != null && cy0Var.a > 1) || (((cy0Var2 = this.f) != null && cy0Var2.a > 1) || (((cy0Var3 = this.g) != null && cy0Var3.a > 1) || ((cy0Var4 = this.h) != null && cy0Var4.a > 1)));
    }
}
