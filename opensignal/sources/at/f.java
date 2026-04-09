package at;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final l f2272c = new l();

    /* renamed from: d, reason: collision with root package name */
    public static final int f2273d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2274e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2275f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2276g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2277h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2278i;
    public static final int j;
    public static final int k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2279l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f2280m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f2281n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f2282o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f2283p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f2284q;

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayList f2285r;

    /* renamed from: s, reason: collision with root package name */
    public static final ArrayList f2286s;

    /* renamed from: a, reason: collision with root package name */
    public final List f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2288b;

    static {
        e eVar;
        int i10 = f2273d;
        int i11 = i10 << 1;
        f2274e = i10;
        int i12 = i10 << 2;
        f2275f = i11;
        int i13 = i10 << 3;
        f2276g = i12;
        int i14 = i10 << 4;
        f2277h = i13;
        int i15 = i10 << 5;
        f2278i = i14;
        j = i15;
        f2273d = i10 << 7;
        int i16 = (i10 << 6) - 1;
        k = i16;
        int i17 = i10 | i11 | i12;
        f2279l = i17;
        f2280m = new f(i16);
        f2281n = new f(i14 | i15);
        new f(i10);
        new f(i11);
        new f(i12);
        f2282o = new f(i17);
        new f(i13);
        f2283p = new f(i14);
        f2284q = new f(i15);
        new f(i11 | i14 | i15);
        Field[] fields = f.class.getFields();
        br.l.d(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                int i18 = fVar.f2288b;
                String name = field2.getName();
                br.l.d(name, "field.name");
                eVar2 = new e(i18, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f2285r = arrayList2;
        Field[] fields2 = f.class.getFields();
        br.l.d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (br.l.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            br.l.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                br.l.d(name2, "field.name");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f2286s = arrayList5;
    }

    public f(int i10, List list) {
        br.l.e(list, "excludes");
        this.f2287a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((d) it.next()).a();
        }
        this.f2288b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f2288b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return br.l.a(this.f2287a, fVar.f2287a) && this.f2288b == fVar.f2288b;
    }

    public final int hashCode() {
        return (this.f2287a.hashCode() * 31) + this.f2288b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f2285r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).f2270a == this.f2288b) {
                break;
            }
        }
        e eVar = (e) next;
        String strX0 = eVar != null ? eVar.f2271b : null;
        if (strX0 == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = f2286s.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                String str = a(eVar2.f2270a) ? eVar2.f2271b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strX0 = mq.o.x0(arrayList, " | ", null, null, null, 62);
        }
        return h0.b.t(c7.a.u("DescriptorKindFilter(", strX0, ", "), this.f2287a, ')');
    }

    public /* synthetic */ f(int i10) {
        this(i10, w.f16945a);
    }
}
