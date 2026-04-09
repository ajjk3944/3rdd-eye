package kotlin.jvm.internal;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import lh.AbstractC6596a;
import lh.C6597b;
import mh.InterfaceC6824a;
import mh.InterfaceC6825b;
import mh.InterfaceC6826c;
import mh.InterfaceC6827d;
import mh.InterfaceC6828e;
import mh.InterfaceC6829f;
import mh.InterfaceC6830g;
import mh.InterfaceC6831h;
import mh.InterfaceC6832i;
import mh.InterfaceC6833j;
import mh.InterfaceC6834k;
import mh.InterfaceC6835l;
import mh.InterfaceC6836m;
import mh.InterfaceC6837n;
import mh.InterfaceC6838o;
import mh.InterfaceC6839p;

/* renamed from: kotlin.jvm.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6483i implements th.d, InterfaceC6482h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f51717b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f51718c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f51719d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f51720e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f51721f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f51722g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f51723a;

    /* renamed from: kotlin.jvm.internal.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            AbstractC6492s.i(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C6483i.f51721f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C6483i.f51721f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.AbstractC6492s.i(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = kotlin.text.t.d1(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = kotlin.text.t.d1(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                java.lang.String r1 = kotlin.text.t.c1(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.C6483i.f()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.C6483i.f()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C6483i.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class jClass) {
            AbstractC6492s.i(jClass, "jClass");
            Map map = C6483i.f51718c;
            AbstractC6492s.g(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return V.m(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC6596a.c(AbstractC6596a.e(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List listO = AbstractC3689v.o(InterfaceC6824a.class, InterfaceC6835l.class, InterfaceC6839p.class, mh.q.class, mh.r.class, mh.s.class, mh.t.class, mh.u.class, mh.v.class, mh.w.class, InterfaceC6825b.class, InterfaceC6826c.class, InterfaceC6827d.class, InterfaceC6828e.class, InterfaceC6829f.class, InterfaceC6830g.class, InterfaceC6831h.class, InterfaceC6832i.class, InterfaceC6833j.class, InterfaceC6834k.class, InterfaceC6836m.class, InterfaceC6837n.class, InterfaceC6838o.class);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listO, 10));
        int i10 = 0;
        for (Object obj : listO) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            arrayList.add(Yg.z.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f51718c = Zg.U.r(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f51719d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f51720e = map2;
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
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            AbstractC6492s.f(str);
            sb2.append(kotlin.text.t.g1(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Yg.s sVarA = Yg.z.a(sb2.toString(), str + ".Companion");
            map3.put(sVarA.h(), sVarA.j());
        }
        for (Map.Entry entry : f51718c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f51721f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Zg.U.d(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC6492s.f(str2);
            linkedHashMap.put(key, kotlin.text.t.g1(str2, '.', null, 2, null));
        }
        f51722g = linkedHashMap;
    }

    public C6483i(Class jClass) {
        AbstractC6492s.i(jClass, "jClass");
        this.f51723a = jClass;
    }

    private final Void i() {
        throw new C6597b();
    }

    @Override // th.d
    public Object B() {
        i();
        throw new KotlinNothingValueException();
    }

    @Override // th.d
    public boolean J(Object obj) {
        return f51717b.c(obj, b());
    }

    @Override // kotlin.jvm.internal.InterfaceC6482h
    public Class b() {
        return this.f51723a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6483i) && AbstractC6492s.d(AbstractC6596a.c(this), AbstractC6596a.c((th.d) obj));
    }

    @Override // th.d
    public int hashCode() {
        return AbstractC6596a.c(this).hashCode();
    }

    @Override // th.d
    public String l() {
        return f51717b.a(b());
    }

    @Override // th.d
    public List n() {
        i();
        throw new KotlinNothingValueException();
    }

    @Override // th.d
    public boolean o() {
        i();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }

    @Override // th.d
    public String v() {
        return f51717b.b(b());
    }
}
