package v1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r1.AbstractC7557c;

/* loaded from: classes.dex */
public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f63374a;

        public c(d[] dVarArr) {
            this.f63374a = dVarArr;
        }

        public d[] a() {
            return this.f63374a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f63375a;

        /* renamed from: b, reason: collision with root package name */
        private final int f63376b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f63377c;

        /* renamed from: d, reason: collision with root package name */
        private final String f63378d;

        /* renamed from: e, reason: collision with root package name */
        private final int f63379e;

        /* renamed from: f, reason: collision with root package name */
        private final int f63380f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f63375a = str;
            this.f63376b = i10;
            this.f63377c = z10;
            this.f63378d = str2;
            this.f63379e = i11;
            this.f63380f = i12;
        }

        public String a() {
            return this.f63375a;
        }

        public int b() {
            return this.f63380f;
        }

        public int c() {
            return this.f63379e;
        }

        public String d() {
            return this.f63378d;
        }

        public int e() {
            return this.f63376b;
        }

        public boolean f() {
            return this.f63377c;
        }
    }

    /* renamed from: v1.e$e, reason: collision with other inner class name */
    public static final class C2245e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final B1.e f63381a;

        /* renamed from: b, reason: collision with root package name */
        private final B1.e f63382b;

        /* renamed from: c, reason: collision with root package name */
        private final int f63383c;

        /* renamed from: d, reason: collision with root package name */
        private final int f63384d;

        /* renamed from: e, reason: collision with root package name */
        private final String f63385e;

        public C2245e(B1.e eVar, B1.e eVar2, int i10, int i11, String str) {
            this.f63381a = eVar;
            this.f63382b = eVar2;
            this.f63384d = i10;
            this.f63383c = i11;
            this.f63385e = str;
        }

        public B1.e a() {
            return this.f63382b;
        }

        public int b() {
            return this.f63384d;
        }

        public B1.e c() {
            return this.f63381a;
        }

        public String d() {
            return this.f63385e;
        }

        public int e() {
            return this.f63383c;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
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

    public static List c(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC7557c.f60027h);
        String string = typedArrayObtainAttributes.getString(AbstractC7557c.f60028i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC7557c.f60033n);
        String string3 = typedArrayObtainAttributes.getString(AbstractC7557c.f60034o);
        String string4 = typedArrayObtainAttributes.getString(AbstractC7557c.f60030k);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC7557c.f60029j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC7557c.f60031l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC7557c.f60032m, 500);
        String string5 = typedArrayObtainAttributes.getString(AbstractC7557c.f60035p);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List listC = c(resources, resourceId);
            return new C2245e(new B1.e(string, string2, string3, listC), string4 != null ? new B1.e(string, string2, string4, listC) : null, integer, integer2, string5);
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
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC7557c.f60036q);
        int i10 = AbstractC7557c.f60045z;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = AbstractC7557c.f60038s;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = AbstractC7557c.f60043x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = AbstractC7557c.f60039t;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = AbstractC7557c.f60003A;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = AbstractC7557c.f60040u;
        }
        int i14 = AbstractC7557c.f60044y;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = AbstractC7557c.f60041v;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = AbstractC7557c.f60042w;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = AbstractC7557c.f60037r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
