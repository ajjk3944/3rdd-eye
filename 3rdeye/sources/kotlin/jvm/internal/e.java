package kotlin.jvm.internal;

import b9.InterfaceC1997d;
import c9.C2077A;
import c9.C2078B;
import c9.C2092m;
import com.singular.sdk.internal.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p9.InterfaceC5480a;
import p9.InterfaceC5481b;
import p9.InterfaceC5482c;
import p9.InterfaceC5483d;
import p9.InterfaceC5484e;
import w9.InterfaceC5748c;

/* compiled from: ClassReference.kt */
/* loaded from: classes3.dex */
public final class e implements InterfaceC5748c<Object>, d {

    /* renamed from: c, reason: collision with root package name */
    public static final Map<Class<? extends InterfaceC1997d<?>>, Integer> f43650c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap<String, String> f43651d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f43652e;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f43653b;

    static {
        int i = 0;
        List listW = C2092m.W(InterfaceC5480a.class, p9.l.class, p9.p.class, p9.q.class, p9.r.class, p9.s.class, p9.t.class, p9.u.class, p9.v.class, p9.w.class, InterfaceC5481b.class, InterfaceC5482c.class, InterfaceC5483d.class, InterfaceC5484e.class, p9.f.class, p9.g.class, p9.h.class, p9.i.class, p9.j.class, p9.k.class, p9.m.class, p9.n.class, p9.o.class);
        ArrayList arrayList = new ArrayList(C2092m.T(listW, 10));
        for (Object obj : listW) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            arrayList.add(new b9.l((Class) obj, Integer.valueOf(i)));
            i = i10;
        }
        f43650c = C2078B.s(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
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
        l.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            l.c(str);
            sb.append(y9.q.u0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends InterfaceC1997d<?>>, Integer> entry : f43650c.entrySet()) {
            Class<? extends InterfaceC1997d<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        f43651d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2077A.l(map3.size()));
        Iterator<T> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            l.c(str2);
            linkedHashMap.put(key2, y9.q.u0(str2, str2));
        }
        f43652e = linkedHashMap;
    }

    public e(Class<?> jClass) {
        l.f(jClass, "jClass");
        this.f43653b = jClass;
    }

    @Override // w9.InterfaceC5748c
    public final String a() {
        String str;
        Class<?> jClass = this.f43653b;
        l.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap<String, String> map = f43651d;
        if (!zIsArray) {
            String str2 = map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // w9.InterfaceC5748c
    public final String d() {
        String str;
        Class<?> jClass = this.f43653b;
        l.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f43652e;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return y9.q.t0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return y9.q.t0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int iF0 = y9.q.f0(simpleName, '$', 0, 6);
        if (iF0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iF0 + 1, simpleName.length());
        l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && E.u.D(this).equals(E.u.D((InterfaceC5748c) obj));
    }

    @Override // w9.InterfaceC5748c
    public final boolean g(Object obj) {
        Class<?> jClass = this.f43653b;
        l.f(jClass, "jClass");
        Map<Class<? extends InterfaceC1997d<?>>, Integer> map = f43650c;
        l.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return z.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = E.u.D(x.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final int hashCode() {
        return E.u.D(this).hashCode();
    }

    @Override // kotlin.jvm.internal.d
    public final Class<?> i() {
        return this.f43653b;
    }

    public final String toString() {
        return this.f43653b + " (Kotlin reflection is not available)";
    }
}
