package s;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C0036c[] f3291a;

        public b(C0036c[] c0036cArr) {
            this.f3291a = c0036cArr;
        }

        public C0036c[] a() {
            return this.f3291a;
        }
    }

    /* renamed from: s.c$c, reason: collision with other inner class name */
    public static final class C0036c {

        /* renamed from: a, reason: collision with root package name */
        private final String f3292a;

        /* renamed from: b, reason: collision with root package name */
        private int f3293b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3294c;

        /* renamed from: d, reason: collision with root package name */
        private String f3295d;

        /* renamed from: e, reason: collision with root package name */
        private int f3296e;

        /* renamed from: f, reason: collision with root package name */
        private int f3297f;

        public C0036c(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.f3292a = str;
            this.f3293b = i2;
            this.f3294c = z2;
            this.f3295d = str2;
            this.f3296e = i3;
            this.f3297f = i4;
        }

        public String a() {
            return this.f3292a;
        }

        public int b() {
            return this.f3297f;
        }

        public int c() {
            return this.f3296e;
        }

        public String d() {
            return this.f3295d;
        }

        public int e() {
            return this.f3293b;
        }

        public boolean f() {
            return this.f3294c;
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        private final x.a f3298a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3299b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3300c;

        public d(x.a aVar, int i2, int i3) {
            this.f3298a = aVar;
            this.f3300c = i2;
            this.f3299b = i3;
        }

        public int a() {
            return this.f3300c;
        }

        public x.a b() {
            return this.f3298a;
        }

        public int c() {
            return this.f3299b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), p.c.f3088e);
        String string = typedArrayObtainAttributes.getString(p.c.f3089f);
        String string2 = typedArrayObtainAttributes.getString(p.c.f3093j);
        String string3 = typedArrayObtainAttributes.getString(p.c.f3094k);
        int resourceId = typedArrayObtainAttributes.getResourceId(p.c.f3090g, 0);
        int integer = typedArrayObtainAttributes.getInteger(p.c.f3091h, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(p.c.f3092i, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new x.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0036c[]) arrayList.toArray(new C0036c[arrayList.size()]));
    }

    private static C0036c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), p.c.f3095l);
        int i2 = p.c.f3104u;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = p.c.f3097n;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, 400);
        int i4 = p.c.f3102s;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = p.c.f3098o;
        }
        boolean z2 = 1 == typedArrayObtainAttributes.getInt(i4, 0);
        int i5 = p.c.f3105v;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = p.c.f3099p;
        }
        int i6 = p.c.f3103t;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = p.c.f3100q;
        }
        String string = typedArrayObtainAttributes.getString(i6);
        int i7 = typedArrayObtainAttributes.getInt(i5, 0);
        int i8 = p.c.f3101r;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = p.c.f3096m;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i8, 0);
        String string2 = typedArrayObtainAttributes.getString(i8);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0036c(string2, i3, z2, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
