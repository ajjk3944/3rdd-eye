package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import z8.h0;

/* loaded from: classes4.dex */
public final class g implements r9.c, f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22029b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Map f22030c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f22031d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f22032e;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f22033f;

    /* renamed from: g, reason: collision with root package name */
    public static final Map f22034g;

    /* renamed from: a, reason: collision with root package name */
    public final Class f22035a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            p.e(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) g.f22033f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) g.f22033f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            p.e(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) g.f22034g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) g.f22034g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                p.b(simpleName);
                String strM0 = s9.u.M0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strM0 != null) {
                    return strM0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                p.b(simpleName);
                return s9.u.L0(simpleName, '$', null, 2, null);
            }
            p.b(simpleName);
            return s9.u.M0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            p.e(jClass, "jClass");
            Map map = g.f22030c;
            p.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return x.e(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = k9.a.b(k9.a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        int i10 = 0;
        List listL = z8.r.l(l9.a.class, l9.l.class, l9.p.class, l9.q.class, l9.r.class, l9.s.class, l9.t.class, l9.u.class, l9.v.class, l9.w.class, l9.b.class, l9.c.class, l9.d.class, l9.e.class, l9.f.class, l9.g.class, l9.h.class, l9.i.class, l9.j.class, l9.k.class, l9.m.class, l9.n.class, l9.o.class);
        ArrayList arrayList = new ArrayList(z8.s.s(listL, 10));
        for (Object obj : listL) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                z8.r.r();
            }
            arrayList.add(y8.i.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f22030c = kotlin.collections.a.s(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f22031d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f22032e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        p.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            p.b(str);
            sb.append(s9.u.P0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            Pair pairA = y8.i.a(sb.toString(), str + ".Companion");
            map3.put(pairA.h(), pairA.i());
        }
        for (Map.Entry entry : f22030c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f22033f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0.e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            p.b(str2);
            linkedHashMap.put(key, s9.u.P0(str2, '.', null, 2, null));
        }
        f22034g = linkedHashMap;
    }

    public g(Class jClass) {
        p.e(jClass, "jClass");
        this.f22035a = jClass;
    }

    @Override // r9.c
    public boolean a(Object obj) {
        return f22029b.c(obj, b());
    }

    @Override // kotlin.jvm.internal.f
    public Class b() {
        return this.f22035a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && p.a(k9.a.b(this), k9.a.b((r9.c) obj));
    }

    @Override // r9.c
    public String h() {
        return f22029b.a(b());
    }

    public int hashCode() {
        return k9.a.b(this).hashCode();
    }

    @Override // r9.c
    public String i() {
        return f22029b.b(b());
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
