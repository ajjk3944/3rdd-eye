package u3;

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
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.applovin.impl.adview.p;
import com.google.android.gms.common.api.internal.a0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f35068a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f35069b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f35070c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f35071d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f35072e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f35073f;
    public static boolean g;

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!e(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i4 = typedValue.type;
        if (i4 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i4 >= 28 && i4 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = c.f35074a;
        try {
            return c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    public static a0 c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4) {
        a0 a0VarC;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new a0((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                a0VarC = a0.c(typedArray.getResourceId(i4, 0), theme, typedArray.getResources());
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                a0VarC = null;
            }
            if (a0VarC != null) {
                return a0VarC;
            }
        }
        return new a0((Shader) null, (ColorStateList) null, 0);
    }

    public static String d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4) {
        if (e(xmlPullParser, str)) {
            return typedArray.getString(i4);
        }
        return null;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int f(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z3 = f13 > 0.008856452f;
        float f14 = z3 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f35070c;
        return v3.a.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float g(int i4) {
        float f10 = i4 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static d k(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i4;
        int i10;
        ?? r32;
        Throwable th2;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i4 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            n(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), q3.a.f32175b);
        int i11 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i12 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), q3.a.f32176c);
                        int i13 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z3 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i14 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i15 = typedArrayObtainAttributes2.getInt(i14, 0);
                        int i16 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i16, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i16);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            n(xmlResourceParser);
                        }
                        arrayList.add(new f(z3, i13, string7, i15, string6, resourceId2));
                    } else {
                        n(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List listL = l(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i12) {
            if (xmlResourceParser.getEventType() == i4) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), q3.a.f32177d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i11);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        i10 = integer;
                        String string10 = typedArrayObtainAttributes3.getString(i4);
                        if (string8 == null) {
                            r32 = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i12) {
                            try {
                                n(xmlResourceParser);
                            } catch (Throwable th3) {
                                th2 = th3;
                                typedArray = typedArrayObtainAttributes3;
                            }
                        }
                        r32 = typedArrayObtainAttributes3;
                        try {
                            b4.f fVar = new b4.f(string, string2, string8, listL, string9, string10);
                            if (r32 instanceof AutoCloseable) {
                                ((AutoCloseable) r32).close();
                            } else if (r32 instanceof ExecutorService) {
                                a3.a.k((ExecutorService) r32);
                            } else {
                                r32.recycle();
                            }
                            arrayList2.add(fVar);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th4;
                    } catch (Throwable th5) {
                        th = th5;
                        r32 = typedArrayObtainAttributes3;
                    }
                    th2 = th;
                    typedArray = r32;
                    if (typedArray == null) {
                        throw th2;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                        } else if (typedArray instanceof ExecutorService) {
                            a3.a.k((ExecutorService) typedArray);
                        } else {
                            typedArray.recycle();
                        }
                        throw th2;
                    } catch (Throwable th6) {
                        th2.addSuppressed(th6);
                        throw th2;
                    }
                }
                i10 = integer;
                n(xmlResourceParser);
                integer = i10;
                i4 = 2;
                i11 = 0;
                i12 = 3;
            }
        }
        int i17 = integer;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i17, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new b4.f(string, string2, string3, listL, null, null));
        if (string4 != null) {
            arrayList2.add(new b4.f(string, string2, string4, listL, null, null));
        }
        return new g(arrayList2, i17, integer2, string5);
    }

    public static List l(Resources resources, int i4) throws Resources.NotFoundException {
        if (i4 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
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
                String[] stringArray2 = resources.getStringArray(i4);
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            u3.j.a(r6)
            return
        La:
            java.lang.Object r0 = u3.b.f35072e
            monitor-enter(r0)
            boolean r1 = u3.b.g     // Catch: java.lang.Throwable -> L21
            r2 = 0
            if (r1 != 0) goto L2d
            r1 = 1
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            u3.b.f35073f = r3     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L21 java.lang.NoSuchMethodException -> L23
            goto L2b
        L21:
            r6 = move-exception
            goto L43
        L23:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r5 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L21
        L2b:
            u3.b.g = r1     // Catch: java.lang.Throwable -> L21
        L2d:
            java.lang.reflect.Method r1 = u3.b.f35073f     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L41
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L21 java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalAccessException -> L37
            goto L41
        L35:
            r6 = move-exception
            goto L38
        L37:
            r6 = move-exception
        L38:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L21
            u3.b.f35073f = r2     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.b.m(android.content.res.Resources$Theme):void");
    }

    public static void n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public static float o() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i4) {
        new Handler(Looper.getMainLooper()).post(new p(this, i4, 6));
    }

    public abstract void i(int i4);

    public abstract void j(Typeface typeface);
}
