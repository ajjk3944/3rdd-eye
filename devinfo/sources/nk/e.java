package nk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements tk.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f29977b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f29978a;

    static {
        int i4 = 0;
        List listT = cm.g.t(mk.a.class, mk.c.class, mk.e.class, mk.f.class, mk.g.class, c1.d.class, mk.h.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, mk.b.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, c1.d.class, mk.d.class);
        ArrayList arrayList = new ArrayList(zj.o.T(listT, 10));
        for (Object obj : listT) {
            int i10 = i4 + 1;
            if (i4 < 0) {
                cm.g.N();
                throw null;
            }
            arrayList.add(new yj.i((Class) obj, Integer.valueOf(i4)));
            i4 = i10;
        }
        f29977b = zj.w.K(arrayList);
    }

    public e(Class cls) {
        k.e(cls, "jClass");
        this.f29978a = cls;
    }

    @Override // nk.d
    public final Class a() {
        return this.f29978a;
    }

    public final String b() {
        String strE;
        Class cls = this.f29978a;
        k.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strE2 = x.e(cls.getName());
            return strE2 == null ? cls.getCanonicalName() : strE2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strE = x.e(componentType.getName())) != null) {
            strConcat = strE.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strG;
        Class cls = this.f29978a;
        k.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strG2 = x.g(cls.getName());
                return strG2 == null ? cls.getSimpleName() : strG2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strG = x.g(componentType.getName())) != null) {
                strConcat = strG.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return vk.i.T0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return vk.i.T0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iE0 = vk.i.E0(simpleName, '$', 0, 6);
        if (iE0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iE0 + 1, simpleName.length());
        k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        Class clsI = this.f29978a;
        k.e(clsI, "jClass");
        Map map = f29977b;
        k.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsI);
        if (num != null) {
            return x.f(num.intValue(), obj);
        }
        if (clsI.isPrimitive()) {
            clsI = pk.a.i(v.a(clsI));
        }
        return clsI.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && pk.a.i(this).equals(pk.a.i((tk.b) obj));
    }

    public final int hashCode() {
        return pk.a.i(this).hashCode();
    }

    public final String toString() {
        return this.f29978a.toString() + " (Kotlin reflection is not available)";
    }
}
