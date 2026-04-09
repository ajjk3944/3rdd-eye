package q5;

import c5.C0407d;
import d5.AbstractC2281i;
import d5.AbstractC2283k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5.s;
import p5.t;
import p5.u;
import p5.v;

/* loaded from: classes3.dex */
public final class d implements w5.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f23288b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f23289c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f23290a;

    static {
        int i = 0;
        List listQ = AbstractC2281i.Q(new Class[]{p5.a.class, p5.l.class, p5.p.class, p5.q.class, H0.b.class, p5.r.class, s.class, t.class, u.class, v.class, p5.b.class, p5.c.class, p5.d.class, p5.e.class, p5.f.class, p5.g.class, p5.h.class, p5.i.class, p5.j.class, p5.k.class, p5.m.class, p5.n.class, p5.o.class});
        ArrayList arrayList = new ArrayList(d5.l.P(listQ));
        for (Object obj : listQ) {
            int i3 = i + 1;
            if (i < 0) {
                AbstractC2283k.O();
                throw null;
            }
            arrayList.add(new C0407d((Class) obj, Integer.valueOf(i)));
            i = i3;
        }
        f23288b = d5.v.K(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
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
        i.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb.append(y5.l.i0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f23288b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f23289c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.v.J(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, y5.l.i0(str2));
        }
    }

    public d(Class cls) {
        this.f23290a = cls;
    }

    @Override // q5.c
    public final Class a() {
        return this.f23290a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && com.bumptech.glide.e.p(this).equals(com.bumptech.glide.e.p((w5.b) obj));
    }

    public final int hashCode() {
        return com.bumptech.glide.e.p(this).hashCode();
    }

    public final String toString() {
        return this.f23290a + " (Kotlin reflection is not available)";
    }
}
