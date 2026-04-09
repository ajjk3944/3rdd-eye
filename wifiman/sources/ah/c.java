package Ah;

import Zg.AbstractC3689v;
import Zh.b;
import gi.EnumC5923e;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import zh.AbstractC8767f;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f771a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f772b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f773c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f774d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f775e;

    /* renamed from: f, reason: collision with root package name */
    private static final Zh.b f776f;

    /* renamed from: g, reason: collision with root package name */
    private static final Zh.c f777g;

    /* renamed from: h, reason: collision with root package name */
    private static final Zh.b f778h;

    /* renamed from: i, reason: collision with root package name */
    private static final Zh.b f779i;

    /* renamed from: j, reason: collision with root package name */
    private static final Zh.b f780j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap f781k;

    /* renamed from: l, reason: collision with root package name */
    private static final HashMap f782l;

    /* renamed from: m, reason: collision with root package name */
    private static final HashMap f783m;

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap f784n;

    /* renamed from: o, reason: collision with root package name */
    private static final HashMap f785o;

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap f786p;

    /* renamed from: q, reason: collision with root package name */
    private static final List f787q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Zh.b f788a;

        /* renamed from: b, reason: collision with root package name */
        private final Zh.b f789b;

        /* renamed from: c, reason: collision with root package name */
        private final Zh.b f790c;

        public a(Zh.b javaClass, Zh.b kotlinReadOnly, Zh.b kotlinMutable) {
            AbstractC6492s.i(javaClass, "javaClass");
            AbstractC6492s.i(kotlinReadOnly, "kotlinReadOnly");
            AbstractC6492s.i(kotlinMutable, "kotlinMutable");
            this.f788a = javaClass;
            this.f789b = kotlinReadOnly;
            this.f790c = kotlinMutable;
        }

        public final Zh.b a() {
            return this.f788a;
        }

        public final Zh.b b() {
            return this.f789b;
        }

        public final Zh.b c() {
            return this.f790c;
        }

        public final Zh.b d() {
            return this.f788a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f788a, aVar.f788a) && AbstractC6492s.d(this.f789b, aVar.f789b) && AbstractC6492s.d(this.f790c, aVar.f790c);
        }

        public int hashCode() {
            return (((this.f788a.hashCode() * 31) + this.f789b.hashCode()) * 31) + this.f790c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f788a + ", kotlinReadOnly=" + this.f789b + ", kotlinMutable=" + this.f790c + ')';
        }
    }

    static {
        c cVar = new c();
        f771a = cVar;
        StringBuilder sb2 = new StringBuilder();
        AbstractC8767f.a aVar = AbstractC8767f.a.f67310e;
        sb2.append(aVar.b());
        sb2.append('.');
        sb2.append(aVar.a());
        f772b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        AbstractC8767f.b bVar = AbstractC8767f.b.f67311e;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f773c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        AbstractC8767f.d dVar = AbstractC8767f.d.f67313e;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f774d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        AbstractC8767f.c cVar2 = AbstractC8767f.c.f67312e;
        sb5.append(cVar2.b());
        sb5.append('.');
        sb5.append(cVar2.a());
        f775e = sb5.toString();
        b.a aVar2 = Zh.b.f25401d;
        Zh.b bVarC = aVar2.c(new Zh.c("kotlin.jvm.functions.FunctionN"));
        f776f = bVarC;
        f777g = bVarC.a();
        Zh.i iVar = Zh.i.f25477a;
        f778h = iVar.k();
        f779i = iVar.j();
        f780j = cVar.g(Class.class);
        f781k = new HashMap();
        f782l = new HashMap();
        f783m = new HashMap();
        f784n = new HashMap();
        f785o = new HashMap();
        f786p = new HashMap();
        Zh.b bVarC2 = aVar2.c(o.a.f51840W);
        a aVar3 = new a(cVar.g(Iterable.class), bVarC2, new Zh.b(bVarC2.f(), Zh.e.g(o.a.f51853e0, bVarC2.f()), false));
        Zh.b bVarC3 = aVar2.c(o.a.f51839V);
        a aVar4 = new a(cVar.g(Iterator.class), bVarC3, new Zh.b(bVarC3.f(), Zh.e.g(o.a.f51851d0, bVarC3.f()), false));
        Zh.b bVarC4 = aVar2.c(o.a.f51841X);
        a aVar5 = new a(cVar.g(Collection.class), bVarC4, new Zh.b(bVarC4.f(), Zh.e.g(o.a.f51855f0, bVarC4.f()), false));
        Zh.b bVarC5 = aVar2.c(o.a.f51842Y);
        a aVar6 = new a(cVar.g(List.class), bVarC5, new Zh.b(bVarC5.f(), Zh.e.g(o.a.f51857g0, bVarC5.f()), false));
        Zh.b bVarC6 = aVar2.c(o.a.f51845a0);
        a aVar7 = new a(cVar.g(Set.class), bVarC6, new Zh.b(bVarC6.f(), Zh.e.g(o.a.f51861i0, bVarC6.f()), false));
        Zh.b bVarC7 = aVar2.c(o.a.f51843Z);
        a aVar8 = new a(cVar.g(ListIterator.class), bVarC7, new Zh.b(bVarC7.f(), Zh.e.g(o.a.f51859h0, bVarC7.f()), false));
        Zh.c cVar3 = o.a.f51847b0;
        Zh.b bVarC8 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), bVarC8, new Zh.b(bVarC8.f(), Zh.e.g(o.a.f51863j0, bVarC8.f()), false));
        Zh.b bVarC9 = aVar2.c(cVar3);
        Zh.f fVarG = o.a.f51849c0.g();
        AbstractC6492s.h(fVarG, "shortName(...)");
        Zh.b bVarD = bVarC9.d(fVarG);
        List listO = AbstractC3689v.o(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), bVarD, new Zh.b(bVarD.f(), Zh.e.g(o.a.f51865k0, bVarD.f()), false)));
        f787q = listO;
        cVar.f(Object.class, o.a.f51846b);
        cVar.f(String.class, o.a.f51858h);
        cVar.f(CharSequence.class, o.a.f51856g);
        cVar.e(Throwable.class, o.a.f51884u);
        cVar.f(Cloneable.class, o.a.f51850d);
        cVar.f(Number.class, o.a.f51878r);
        cVar.e(Comparable.class, o.a.f51886v);
        cVar.f(Enum.class, o.a.f51880s);
        cVar.e(Annotation.class, o.a.f51815G);
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            f771a.d((a) it.next());
        }
        for (EnumC5923e enumC5923e : EnumC5923e.values()) {
            c cVar4 = f771a;
            b.a aVar10 = Zh.b.f25401d;
            Zh.c wrapperFqName = enumC5923e.getWrapperFqName();
            AbstractC6492s.h(wrapperFqName, "getWrapperFqName(...)");
            Zh.b bVarC10 = aVar10.c(wrapperFqName);
            kotlin.reflect.jvm.internal.impl.builtins.l primitiveType = enumC5923e.getPrimitiveType();
            AbstractC6492s.h(primitiveType, "getPrimitiveType(...)");
            cVar4.a(bVarC10, aVar10.c(kotlin.reflect.jvm.internal.impl.builtins.o.c(primitiveType)));
        }
        for (Zh.b bVar2 : kotlin.reflect.jvm.internal.impl.builtins.d.f51733a.a()) {
            f771a.a(Zh.b.f25401d.c(new Zh.c("kotlin.jvm.internal." + bVar2.h().b() + "CompanionObject")), bVar2.d(Zh.h.f25424d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar5 = f771a;
            cVar5.a(Zh.b.f25401d.c(new Zh.c("kotlin.jvm.functions.Function" + i10)), kotlin.reflect.jvm.internal.impl.builtins.o.a(i10));
            cVar5.c(new Zh.c(f773c + i10), f778h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            AbstractC8767f.c cVar6 = AbstractC8767f.c.f67312e;
            f771a.c(new Zh.c((cVar6.b() + '.' + cVar6.a()) + i11), f778h);
        }
        c cVar7 = f771a;
        Zh.c cVarL = o.a.f51848c.l();
        AbstractC6492s.h(cVarL, "toSafe(...)");
        cVar7.c(cVarL, cVar7.g(Void.class));
    }

    private c() {
    }

    private final void a(Zh.b bVar, Zh.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(Zh.b bVar, Zh.b bVar2) {
        f781k.put(bVar.a().j(), bVar2);
    }

    private final void c(Zh.c cVar, Zh.b bVar) {
        f782l.put(cVar.j(), bVar);
    }

    private final void d(a aVar) {
        Zh.b bVarA = aVar.a();
        Zh.b bVarB = aVar.b();
        Zh.b bVarC = aVar.c();
        a(bVarA, bVarB);
        c(bVarC.a(), bVarA);
        f785o.put(bVarC, bVarB);
        f786p.put(bVarB, bVarC);
        Zh.c cVarA = bVarB.a();
        Zh.c cVarA2 = bVarC.a();
        f783m.put(bVarC.a().j(), cVarA);
        f784n.put(cVarA.j(), cVarA2);
    }

    private final void e(Class cls, Zh.c cVar) {
        a(g(cls), Zh.b.f25401d.c(cVar));
    }

    private final void f(Class cls, Zh.d dVar) {
        Zh.c cVarL = dVar.l();
        AbstractC6492s.h(cVarL, "toSafe(...)");
        e(cls, cVarL);
    }

    private final Zh.b g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return Zh.b.f25401d.c(new Zh.c(cls.getCanonicalName()));
        }
        Zh.b bVarG = g(declaringClass);
        Zh.f fVarH = Zh.f.h(cls.getSimpleName());
        AbstractC6492s.h(fVarH, "identifier(...)");
        return bVarG.d(fVarH);
    }

    private final boolean j(Zh.d dVar, String str) {
        Integer numQ;
        String strB = dVar.b();
        AbstractC6492s.h(strB, "asString(...)");
        if (!kotlin.text.t.P(strB, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strB.substring(str.length());
        AbstractC6492s.h(strSubstring, "substring(...)");
        return (kotlin.text.t.W0(strSubstring, '0', false, 2, null) || (numQ = kotlin.text.t.q(strSubstring)) == null || numQ.intValue() < 23) ? false : true;
    }

    public final Zh.c h() {
        return f777g;
    }

    public final List i() {
        return f787q;
    }

    public final boolean k(Zh.d dVar) {
        return f783m.containsKey(dVar);
    }

    public final boolean l(Zh.d dVar) {
        return f784n.containsKey(dVar);
    }

    public final Zh.b m(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return (Zh.b) f781k.get(fqName.j());
    }

    public final Zh.b n(Zh.d kotlinFqName) {
        AbstractC6492s.i(kotlinFqName, "kotlinFqName");
        if (!j(kotlinFqName, f772b) && !j(kotlinFqName, f774d)) {
            if (!j(kotlinFqName, f773c) && !j(kotlinFqName, f775e)) {
                return (Zh.b) f782l.get(kotlinFqName);
            }
            return f778h;
        }
        return f776f;
    }

    public final Zh.c o(Zh.d dVar) {
        return (Zh.c) f783m.get(dVar);
    }

    public final Zh.c p(Zh.d dVar) {
        return (Zh.c) f784n.get(dVar);
    }
}
