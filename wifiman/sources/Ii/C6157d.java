package ii;

import Zg.AbstractC3689v;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ii.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6157d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f49182c;

    /* renamed from: d, reason: collision with root package name */
    private static int f49183d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f49184e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f49185f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f49186g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f49187h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f49188i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f49189j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f49190k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f49191l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f49192m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f49193n;

    /* renamed from: o, reason: collision with root package name */
    public static final C6157d f49194o;

    /* renamed from: p, reason: collision with root package name */
    public static final C6157d f49195p;

    /* renamed from: q, reason: collision with root package name */
    public static final C6157d f49196q;

    /* renamed from: r, reason: collision with root package name */
    public static final C6157d f49197r;

    /* renamed from: s, reason: collision with root package name */
    public static final C6157d f49198s;

    /* renamed from: t, reason: collision with root package name */
    public static final C6157d f49199t;

    /* renamed from: u, reason: collision with root package name */
    public static final C6157d f49200u;

    /* renamed from: v, reason: collision with root package name */
    public static final C6157d f49201v;

    /* renamed from: w, reason: collision with root package name */
    public static final C6157d f49202w;

    /* renamed from: x, reason: collision with root package name */
    public static final C6157d f49203x;

    /* renamed from: y, reason: collision with root package name */
    private static final List f49204y;

    /* renamed from: z, reason: collision with root package name */
    private static final List f49205z;

    /* renamed from: a, reason: collision with root package name */
    private final List f49206a;

    /* renamed from: b, reason: collision with root package name */
    private final int f49207b;

    /* renamed from: ii.d$a */
    public static final class a {

        /* renamed from: ii.d$a$a, reason: collision with other inner class name */
        private static final class C1852a {

            /* renamed from: a, reason: collision with root package name */
            private final int f49208a;

            /* renamed from: b, reason: collision with root package name */
            private final String f49209b;

            public C1852a(int i10, String name) {
                AbstractC6492s.i(name, "name");
                this.f49208a = i10;
                this.f49209b = name;
            }

            public final int a() {
                return this.f49208a;
            }

            public final String b() {
                return this.f49209b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = C6157d.f49183d;
            C6157d.f49183d <<= 1;
            return i10;
        }

        public final int b() {
            return C6157d.f49190k;
        }

        public final int c() {
            return C6157d.f49191l;
        }

        public final int d() {
            return C6157d.f49188i;
        }

        public final int e() {
            return C6157d.f49184e;
        }

        public final int f() {
            return C6157d.f49187h;
        }

        public final int g() {
            return C6157d.f49185f;
        }

        public final int h() {
            return C6157d.f49186g;
        }

        public final int i() {
            return C6157d.f49189j;
        }

        private a() {
        }
    }

    static {
        a.C1852a c1852a;
        a.C1852a c1852a2;
        a aVar = new a(null);
        f49182c = aVar;
        f49183d = 1;
        int iJ = aVar.j();
        f49184e = iJ;
        int iJ2 = aVar.j();
        f49185f = iJ2;
        int iJ3 = aVar.j();
        f49186g = iJ3;
        int iJ4 = aVar.j();
        f49187h = iJ4;
        int iJ5 = aVar.j();
        f49188i = iJ5;
        int iJ6 = aVar.j();
        f49189j = iJ6;
        int iJ7 = aVar.j() - 1;
        f49190k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f49191l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f49192m = i11;
        int i12 = iJ5 | iJ6;
        f49193n = i12;
        int i13 = 2;
        f49194o = new C6157d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49195p = new C6157d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49196q = new C6157d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49197r = new C6157d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49198s = new C6157d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49199t = new C6157d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49200u = new C6157d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49201v = new C6157d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49202w = new C6157d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f49203x = new C6157d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = C6157d.class.getFields();
        AbstractC6492s.h(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C6157d c6157d = obj instanceof C6157d ? (C6157d) obj : null;
            if (c6157d != null) {
                int i14 = c6157d.f49207b;
                String name = field2.getName();
                AbstractC6492s.h(name, "getName(...)");
                c1852a2 = new a.C1852a(i14, name);
            } else {
                c1852a2 = null;
            }
            if (c1852a2 != null) {
                arrayList2.add(c1852a2);
            }
        }
        f49204y = arrayList2;
        Field[] fields2 = C6157d.class.getFields();
        AbstractC6492s.h(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC6492s.d(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC6492s.h(name2, "getName(...)");
                c1852a = new a.C1852a(iIntValue, name2);
            } else {
                c1852a = null;
            }
            if (c1852a != null) {
                arrayList5.add(c1852a);
            }
        }
        f49205z = arrayList5;
    }

    public C6157d(int i10, List excludes) {
        AbstractC6492s.i(excludes, "excludes");
        this.f49206a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC6156c) it.next()).a();
        }
        this.f49207b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f49207b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(C6157d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C6157d c6157d = (C6157d) obj;
        return AbstractC6492s.d(this.f49206a, c6157d.f49206a) && this.f49207b == c6157d.f49207b;
    }

    public int hashCode() {
        return (this.f49206a.hashCode() * 31) + this.f49207b;
    }

    public final List l() {
        return this.f49206a;
    }

    public final int m() {
        return this.f49207b;
    }

    public final C6157d n(int i10) {
        int i11 = i10 & this.f49207b;
        if (i11 == 0) {
            return null;
        }
        return new C6157d(i11, this.f49206a);
    }

    public String toString() {
        Object next;
        Iterator it = f49204y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C1852a) next).a() == this.f49207b) {
                break;
            }
        }
        a.C1852a c1852a = (a.C1852a) next;
        String strB = c1852a != null ? c1852a.b() : null;
        if (strB == null) {
            List<a.C1852a> list = f49205z;
            ArrayList arrayList = new ArrayList();
            for (a.C1852a c1852a2 : list) {
                String strB2 = a(c1852a2.a()) ? c1852a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = AbstractC3689v.z0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f49206a + ')';
    }

    public /* synthetic */ C6157d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? AbstractC3689v.l() : list);
    }
}
