package i0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {
    public static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayK = i.k(resources, theme, attributeSet, e0.d.GradientColor);
        float f10 = i.f(typedArrayK, xmlPullParser, "startX", e0.d.GradientColor_android_startX, 0.0f);
        float f11 = i.f(typedArrayK, xmlPullParser, "startY", e0.d.GradientColor_android_startY, 0.0f);
        float f12 = i.f(typedArrayK, xmlPullParser, "endX", e0.d.GradientColor_android_endX, 0.0f);
        float f13 = i.f(typedArrayK, xmlPullParser, "endY", e0.d.GradientColor_android_endY, 0.0f);
        float f14 = i.f(typedArrayK, xmlPullParser, "centerX", e0.d.GradientColor_android_centerX, 0.0f);
        float f15 = i.f(typedArrayK, xmlPullParser, "centerY", e0.d.GradientColor_android_centerY, 0.0f);
        int iG = i.g(typedArrayK, xmlPullParser, HandleInvocationsFromAdViewer.KEY_AD_TYPE, e0.d.GradientColor_android_type, 0);
        int iB = i.b(typedArrayK, xmlPullParser, "startColor", e0.d.GradientColor_android_startColor, 0);
        boolean zJ = i.j(xmlPullParser, "centerColor");
        int iB2 = i.b(typedArrayK, xmlPullParser, "centerColor", e0.d.GradientColor_android_centerColor, 0);
        int iB3 = i.b(typedArrayK, xmlPullParser, "endColor", e0.d.GradientColor_android_endColor, 0);
        int iG2 = i.g(typedArrayK, xmlPullParser, "tileMode", e0.d.GradientColor_android_tileMode, 0);
        float f16 = i.f(typedArrayK, xmlPullParser, "gradientRadius", e0.d.GradientColor_android_gradientRadius, 0.0f);
        typedArrayK.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f21540a, aVarA.f21541b, d(iG2)) : new SweepGradient(f14, f15, aVarA.f21540a, aVarA.f21541b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, aVarA.f21540a, aVarA.f21541b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new i0.e.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i0.e.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = e0.d.GradientColorItem
            android.content.res.TypedArray r3 = i0.i.k(r9, r12, r11, r3)
            int r5 = e0.d.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = e0.d.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            i0.e$a r9 = new i0.e$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):i0.e$a");
    }

    public static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f21540a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f21541b;

        public a(List list, List list2) {
            int size = list.size();
            this.f21540a = new int[size];
            this.f21541b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f21540a[i10] = ((Integer) list.get(i10)).intValue();
                this.f21541b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.f21540a = new int[]{i10, i11};
            this.f21541b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f21540a = new int[]{i10, i11, i12};
            this.f21541b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
