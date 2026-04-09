package Jh;

import Zg.AbstractC3689v;
import Zg.d0;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gi.EnumC5923e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10160a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final List f10161b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f10162c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f10163d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f10164e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map f10165f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f10166g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f10167h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.C0416a f10168i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map f10169j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f10170k;

    /* renamed from: l, reason: collision with root package name */
    private static final Set f10171l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set f10172m;

    /* renamed from: n, reason: collision with root package name */
    private static final Map f10173n;

    public static final class a {

        /* renamed from: Jh.U$a$a, reason: collision with other inner class name */
        public static final class C0416a {

            /* renamed from: a, reason: collision with root package name */
            private final String f10174a;

            /* renamed from: b, reason: collision with root package name */
            private final Zh.f f10175b;

            /* renamed from: c, reason: collision with root package name */
            private final String f10176c;

            /* renamed from: d, reason: collision with root package name */
            private final String f10177d;

            /* renamed from: e, reason: collision with root package name */
            private final String f10178e;

            public C0416a(String classInternalName, Zh.f name, String parameters, String returnType) {
                AbstractC6492s.i(classInternalName, "classInternalName");
                AbstractC6492s.i(name, "name");
                AbstractC6492s.i(parameters, "parameters");
                AbstractC6492s.i(returnType, "returnType");
                this.f10174a = classInternalName;
                this.f10175b = name;
                this.f10176c = parameters;
                this.f10177d = returnType;
                this.f10178e = Sh.F.f20704a.l(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0416a b(C0416a c0416a, String str, Zh.f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0416a.f10174a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0416a.f10175b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c0416a.f10176c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c0416a.f10177d;
                }
                return c0416a.a(str, fVar, str2, str3);
            }

            public final C0416a a(String classInternalName, Zh.f name, String parameters, String returnType) {
                AbstractC6492s.i(classInternalName, "classInternalName");
                AbstractC6492s.i(name, "name");
                AbstractC6492s.i(parameters, "parameters");
                AbstractC6492s.i(returnType, "returnType");
                return new C0416a(classInternalName, name, parameters, returnType);
            }

            public final Zh.f c() {
                return this.f10175b;
            }

            public final String d() {
                return this.f10178e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0416a)) {
                    return false;
                }
                C0416a c0416a = (C0416a) obj;
                return AbstractC6492s.d(this.f10174a, c0416a.f10174a) && AbstractC6492s.d(this.f10175b, c0416a.f10175b) && AbstractC6492s.d(this.f10176c, c0416a.f10176c) && AbstractC6492s.d(this.f10177d, c0416a.f10177d);
            }

            public int hashCode() {
                return (((((this.f10174a.hashCode() * 31) + this.f10175b.hashCode()) * 31) + this.f10176c.hashCode()) * 31) + this.f10177d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f10174a + ", name=" + this.f10175b + ", parameters=" + this.f10176c + ", returnType=" + this.f10177d + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0416a m(String str, String str2, String str3, String str4) {
            Zh.f fVarH = Zh.f.h(str2);
            AbstractC6492s.h(fVarH, "identifier(...)");
            return new C0416a(str, fVarH, str3, str4);
        }

        public final Zh.f b(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return (Zh.f) f().get(name);
        }

        public final List c() {
            return U.f10162c;
        }

        public final Set d() {
            return U.f10166g;
        }

        public final Set e() {
            return U.f10167h;
        }

        public final Map f() {
            return U.f10173n;
        }

        public final Set g() {
            return U.f10172m;
        }

        public final C0416a h() {
            return U.f10168i;
        }

        public final Map i() {
            return U.f10165f;
        }

        public final Map j() {
            return U.f10170k;
        }

        public final boolean k(Zh.f fVar) {
            AbstractC6492s.i(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            AbstractC6492s.i(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? b.ONE_COLLECTION_PARAMETER : ((c) Zg.U.i(i(), builtinSignature)) == c.NULL ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;
        public static final b ONE_COLLECTION_PARAMETER = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
        public static final b OBJECT_PARAMETER_NON_GENERIC = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
        public static final b OBJECT_PARAMETER_GENERIC = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        private static final /* synthetic */ b[] $values() {
            return new b[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, String str2, boolean z10) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z10;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final Object defaultValue;
        public static final c NULL = new c("NULL", 0, null);
        public static final c INDEX = new c("INDEX", 1, -1);
        public static final c FALSE = new c("FALSE", 2, Boolean.FALSE);
        public static final c MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);

        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i10) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i10, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        public /* synthetic */ c(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        private c(String str, int i10, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> setI = d0.i("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(setI, 10));
        for (String str : setI) {
            a aVar = f10160a;
            String desc = EnumC5923e.BOOLEAN.getDesc();
            AbstractC6492s.h(desc, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f10161b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a.C0416a) it.next()).d());
        }
        f10162c = arrayList3;
        List list = f10161b;
        ArrayList arrayList4 = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0416a) it2.next()).c().b());
        }
        f10163d = arrayList4;
        Sh.F f10 = Sh.F.f20704a;
        a aVar2 = f10160a;
        String strI = f10.i("Collection");
        EnumC5923e enumC5923e = EnumC5923e.BOOLEAN;
        String desc2 = enumC5923e.getDesc();
        AbstractC6492s.h(desc2, "getDesc(...)");
        a.C0416a c0416aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", desc2);
        c cVar = c.FALSE;
        Yg.s sVarA = Yg.z.a(c0416aM, cVar);
        String strI2 = f10.i("Collection");
        String desc3 = enumC5923e.getDesc();
        AbstractC6492s.h(desc3, "getDesc(...)");
        Yg.s sVarA2 = Yg.z.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", desc3), cVar);
        String strI3 = f10.i("Map");
        String desc4 = enumC5923e.getDesc();
        AbstractC6492s.h(desc4, "getDesc(...)");
        Yg.s sVarA3 = Yg.z.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", desc4), cVar);
        String strI4 = f10.i("Map");
        String desc5 = enumC5923e.getDesc();
        AbstractC6492s.h(desc5, "getDesc(...)");
        Yg.s sVarA4 = Yg.z.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", desc5), cVar);
        String strI5 = f10.i("Map");
        String desc6 = enumC5923e.getDesc();
        AbstractC6492s.h(desc6, "getDesc(...)");
        Yg.s sVarA5 = Yg.z.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), cVar);
        Yg.s sVarA6 = Yg.z.a(aVar2.m(f10.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT);
        a.C0416a c0416aM2 = aVar2.m(f10.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        Yg.s sVarA7 = Yg.z.a(c0416aM2, cVar2);
        Yg.s sVarA8 = Yg.z.a(aVar2.m(f10.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = f10.i("List");
        EnumC5923e enumC5923e2 = EnumC5923e.INT;
        String desc7 = enumC5923e2.getDesc();
        AbstractC6492s.h(desc7, "getDesc(...)");
        a.C0416a c0416aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", desc7);
        c cVar3 = c.INDEX;
        Yg.s sVarA9 = Yg.z.a(c0416aM3, cVar3);
        String strI7 = f10.i("List");
        String desc8 = enumC5923e2.getDesc();
        AbstractC6492s.h(desc8, "getDesc(...)");
        Map mapK = Zg.U.k(sVarA, sVarA2, sVarA3, sVarA4, sVarA5, sVarA6, sVarA7, sVarA8, sVarA9, Yg.z.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", desc8), cVar3));
        f10164e = mapK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Zg.U.d(mapK.size()));
        for (Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(((a.C0416a) entry.getKey()).d(), entry.getValue());
        }
        f10165f = linkedHashMap;
        Set setL = d0.l(f10164e.keySet(), f10161b);
        ArrayList arrayList5 = new ArrayList(AbstractC3689v.w(setL, 10));
        Iterator it3 = setL.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((a.C0416a) it3.next()).c());
        }
        f10166g = AbstractC3689v.n1(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC3689v.w(setL, 10));
        Iterator it4 = setL.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((a.C0416a) it4.next()).d());
        }
        f10167h = AbstractC3689v.n1(arrayList6);
        a aVar3 = f10160a;
        EnumC5923e enumC5923e3 = EnumC5923e.INT;
        String desc9 = enumC5923e3.getDesc();
        AbstractC6492s.h(desc9, "getDesc(...)");
        a.C0416a c0416aM4 = aVar3.m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f10168i = c0416aM4;
        Sh.F f11 = Sh.F.f20704a;
        String strH = f11.h("Number");
        String desc10 = EnumC5923e.BYTE.getDesc();
        AbstractC6492s.h(desc10, "getDesc(...)");
        Yg.s sVarA10 = Yg.z.a(aVar3.m(strH, "toByte", "", desc10), Zh.f.h("byteValue"));
        String strH2 = f11.h("Number");
        String desc11 = EnumC5923e.SHORT.getDesc();
        AbstractC6492s.h(desc11, "getDesc(...)");
        Yg.s sVarA11 = Yg.z.a(aVar3.m(strH2, "toShort", "", desc11), Zh.f.h("shortValue"));
        String strH3 = f11.h("Number");
        String desc12 = enumC5923e3.getDesc();
        AbstractC6492s.h(desc12, "getDesc(...)");
        Yg.s sVarA12 = Yg.z.a(aVar3.m(strH3, "toInt", "", desc12), Zh.f.h("intValue"));
        String strH4 = f11.h("Number");
        String desc13 = EnumC5923e.LONG.getDesc();
        AbstractC6492s.h(desc13, "getDesc(...)");
        Yg.s sVarA13 = Yg.z.a(aVar3.m(strH4, "toLong", "", desc13), Zh.f.h("longValue"));
        String strH5 = f11.h("Number");
        String desc14 = EnumC5923e.FLOAT.getDesc();
        AbstractC6492s.h(desc14, "getDesc(...)");
        Yg.s sVarA14 = Yg.z.a(aVar3.m(strH5, "toFloat", "", desc14), Zh.f.h("floatValue"));
        String strH6 = f11.h("Number");
        String desc15 = EnumC5923e.DOUBLE.getDesc();
        AbstractC6492s.h(desc15, "getDesc(...)");
        Yg.s sVarA15 = Yg.z.a(aVar3.m(strH6, "toDouble", "", desc15), Zh.f.h("doubleValue"));
        Yg.s sVarA16 = Yg.z.a(c0416aM4, Zh.f.h("remove"));
        String strH7 = f11.h("CharSequence");
        String desc16 = enumC5923e3.getDesc();
        AbstractC6492s.h(desc16, "getDesc(...)");
        String desc17 = EnumC5923e.CHAR.getDesc();
        AbstractC6492s.h(desc17, "getDesc(...)");
        Map mapK2 = Zg.U.k(sVarA10, sVarA11, sVarA12, sVarA13, sVarA14, sVarA15, sVarA16, Yg.z.a(aVar3.m(strH7, "get", desc16, desc17), Zh.f.h("charAt")));
        f10169j = mapK2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Zg.U.d(mapK2.size()));
        for (Map.Entry entry2 : mapK2.entrySet()) {
            linkedHashMap2.put(((a.C0416a) entry2.getKey()).d(), entry2.getValue());
        }
        f10170k = linkedHashMap2;
        Map map = f10169j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0416a.b((a.C0416a) entry3.getKey(), null, (Zh.f) entry3.getValue(), null, null, 13, null).d());
        }
        f10171l = linkedHashSet;
        Set setKeySet = f10169j.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0416a) it5.next()).c());
        }
        f10172m = hashSet;
        Set<Map.Entry> setEntrySet = f10169j.entrySet();
        ArrayList<Yg.s> arrayList7 = new ArrayList(AbstractC3689v.w(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Yg.s(((a.C0416a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(arrayList7, 10)), 16));
        for (Yg.s sVar : arrayList7) {
            linkedHashMap3.put((Zh.f) sVar.j(), (Zh.f) sVar.h());
        }
        f10173n = linkedHashMap3;
    }
}
