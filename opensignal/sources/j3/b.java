package j3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import bc.f0;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f13168a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f13169b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f13170c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f13171d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f13172e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f13173f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f13174g;

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!d(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i10 >= 28 && i10 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = c.f13175a;
        try {
            return c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e4) {
            e0.c("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    public static f0 c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        f0 f0VarD;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new f0((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                f0VarD = f0.d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e4) {
                e0.c("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                f0VarD = null;
            }
            if (f0VarD != null) {
                return f0VarD;
            }
        }
        return new f0((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int e(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f13170c;
        return k3.c.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float f(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static d j(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            l(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), f3.d.FontFamily);
        String string = typedArrayObtainAttributes.getString(f3.d.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(f3.d.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(f3.d.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(f3.d.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(f3.d.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(f3.d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(f3.d.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(f3.d.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                l(xmlResourceParser);
            }
            List listK = k(resources, resourceId);
            return new g(new q3.d(string, string2, string3, listK), string4 != null ? new q3.d(string, string2, string4, listK) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), f3.d.FontFamilyFont);
                    int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(f3.d.FontFamilyFont_fontWeight) ? f3.d.FontFamilyFont_fontWeight : f3.d.FontFamilyFont_android_fontWeight, 400);
                    boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(f3.d.FontFamilyFont_fontStyle) ? f3.d.FontFamilyFont_fontStyle : f3.d.FontFamilyFont_android_fontStyle, 0);
                    int i11 = typedArrayObtainAttributes2.hasValue(f3.d.FontFamilyFont_ttcIndex) ? f3.d.FontFamilyFont_ttcIndex : f3.d.FontFamilyFont_android_ttcIndex;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(f3.d.FontFamilyFont_fontVariationSettings) ? f3.d.FontFamilyFont_fontVariationSettings : f3.d.FontFamilyFont_android_fontVariationSettings);
                    int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                    int i13 = typedArrayObtainAttributes2.hasValue(f3.d.FontFamilyFont_font) ? f3.d.FontFamilyFont_font : f3.d.FontFamilyFont_android_font;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i13);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        l(xmlResourceParser);
                    }
                    arrayList.add(new f(i10, i12, resourceId2, string7, string6, z10));
                } else {
                    l(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e((f[]) arrayList.toArray(new f[0]));
    }

    public static List k(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static float m() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i10) {
        new Handler(Looper.getMainLooper()).post(new com.google.android.exoplayer2.c(i10, 3, this));
    }

    public abstract void h(int i10);

    public abstract void i(Typeface typeface);
}
