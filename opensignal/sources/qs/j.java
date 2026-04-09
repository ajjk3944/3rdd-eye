package qs;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Set;
import mq.b0;
import mq.f0;
import mq.p;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final c f21045a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f21046b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f21047c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f21048d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f21049e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f21050f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f21051g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f21052h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f21053i;
    public static final b j;
    public static final b k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f21054l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f21055m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f21056n;

    /* renamed from: o, reason: collision with root package name */
    public static final Set f21057o;

    /* renamed from: p, reason: collision with root package name */
    public static final Set f21058p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f21059q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f21060r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f21061s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f21062t;

    static {
        c cVar = new c("kotlin");
        f21045a = cVar;
        c cVarC = cVar.c(g.e("reflect"));
        f21046b = cVarC;
        c cVarC2 = cVar.c(g.e("collections"));
        f21047c = cVarC2;
        c cVarC3 = cVar.c(g.e("ranges"));
        f21048d = cVarC3;
        cVar.c(g.e(DebugImage.JVM)).c(g.e("internal"));
        c cVarC4 = cVar.c(g.e("annotation"));
        f21049e = cVarC4;
        c cVarC5 = cVar.c(g.e("internal"));
        cVarC5.c(g.e("ir"));
        c cVarC6 = cVar.c(g.e("coroutines"));
        f21050f = cVarC6;
        f21051g = cVar.c(g.e("enums"));
        mq.l.B0(new c[]{cVar, cVarC2, cVarC3, cVarC4, cVarC, cVarC5, cVarC6});
        k.a("Nothing");
        k.a("Unit");
        k.a("Any");
        k.a("Enum");
        k.a("Annotation");
        f21052h = k.a("Array");
        b bVarA = k.a("Boolean");
        b bVarA2 = k.a("Char");
        b bVarA3 = k.a("Byte");
        b bVarA4 = k.a("Short");
        b bVarA5 = k.a("Int");
        b bVarA6 = k.a("Long");
        b bVarA7 = k.a("Float");
        b bVarA8 = k.a("Double");
        f21053i = k.f(bVarA3);
        j = k.f(bVarA4);
        k = k.f(bVarA5);
        f21054l = k.f(bVarA6);
        k.a("CharSequence");
        f21055m = k.a("String");
        k.a("Throwable");
        k.a("Cloneable");
        k.e("KProperty");
        k.e("KMutableProperty");
        k.e("KProperty0");
        k.e("KMutableProperty0");
        k.e("KProperty1");
        k.e("KMutableProperty1");
        k.e("KProperty2");
        k.e("KMutableProperty2");
        f21056n = k.e("KFunction");
        k.e("KClass");
        k.e("KCallable");
        k.a("Comparable");
        k.a("Number");
        k.a("Function");
        Set setB0 = mq.l.B0(new b[]{bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8});
        f21057o = setB0;
        Set set = setB0;
        int iP = b0.P(p.a0(set, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj : set) {
            g gVarI = ((b) obj).i();
            br.l.d(gVarI, "id.shortClassName");
            linkedHashMap.put(obj, k.d(gVarI));
        }
        k.c(linkedHashMap);
        Set setB02 = mq.l.B0(new b[]{f21053i, j, k, f21054l});
        f21058p = setB02;
        Set set2 = setB02;
        int iP2 = b0.P(p.a0(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP2 >= 16 ? iP2 : 16);
        for (Object obj2 : set2) {
            g gVarI2 = ((b) obj2).i();
            br.l.d(gVarI2, "id.shortClassName");
            linkedHashMap2.put(obj2, k.d(gVarI2));
        }
        k.c(linkedHashMap2);
        f0.O(f0.N(f21057o, f21058p), f21055m);
        c cVar2 = f21050f;
        g gVarE = g.e("Continuation");
        if (cVar2 == null) {
            b.a(3);
            throw null;
        }
        c.j(gVarE);
        k.b("Iterator");
        k.b("Iterable");
        k.b("Collection");
        k.b("List");
        k.b("ListIterator");
        k.b("Set");
        b bVarB = k.b("Map");
        k.b("MutableIterator");
        k.b("CharIterator");
        k.b("MutableIterable");
        k.b("MutableCollection");
        f21059q = k.b("MutableList");
        k.b("MutableListIterator");
        f21060r = k.b("MutableSet");
        b bVarB2 = k.b("MutableMap");
        f21061s = bVarB2;
        bVarB.d(g.e("Entry"));
        bVarB2.d(g.e("MutableEntry"));
        k.a("Result");
        c cVar3 = f21048d;
        g gVarE2 = g.e("IntRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(gVarE2);
        c.j(g.e("LongRange"));
        c.j(g.e("CharRange"));
        c cVar4 = f21049e;
        g gVarE3 = g.e("AnnotationRetention");
        if (cVar4 == null) {
            b.a(3);
            throw null;
        }
        c.j(gVarE3);
        c.j(g.e("AnnotationTarget"));
        f21062t = new b(f21051g, g.e("EnumEntries"));
    }
}
