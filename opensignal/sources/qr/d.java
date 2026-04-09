package qr;

import com.google.android.gms.internal.measurement.e5;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20965a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f20966b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f20967c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f20968d;

    /* renamed from: e, reason: collision with root package name */
    public static final qs.b f20969e;

    /* renamed from: f, reason: collision with root package name */
    public static final qs.c f20970f;

    /* renamed from: g, reason: collision with root package name */
    public static final qs.b f20971g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f20972h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f20973i;
    public static final HashMap j;
    public static final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f20974l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f20975m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f20976n;

    static {
        StringBuilder sb2 = new StringBuilder();
        pr.g gVar = pr.g.Function;
        sb2.append(gVar.getPackageFqName().f21025a.toString());
        sb2.append('.');
        sb2.append(gVar.getClassNamePrefix());
        f20965a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        pr.g gVar2 = pr.g.KFunction;
        sb3.append(gVar2.getPackageFqName().f21025a.toString());
        sb3.append('.');
        sb3.append(gVar2.getClassNamePrefix());
        f20966b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        pr.g gVar3 = pr.g.SuspendFunction;
        sb4.append(gVar3.getPackageFqName().f21025a.toString());
        sb4.append('.');
        sb4.append(gVar3.getClassNamePrefix());
        f20967c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        pr.g gVar4 = pr.g.KSuspendFunction;
        sb5.append(gVar4.getPackageFqName().f21025a.toString());
        sb5.append('.');
        sb5.append(gVar4.getClassNamePrefix());
        f20968d = sb5.toString();
        qs.b bVarJ = qs.b.j(new qs.c("kotlin.jvm.functions.FunctionN"));
        f20969e = bVarJ;
        f20970f = bVarJ.b();
        f20971g = qs.j.f21056n;
        d(Class.class);
        f20972h = new HashMap();
        f20973i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        f20974l = new HashMap();
        f20975m = new HashMap();
        qs.b bVarJ2 = qs.b.j(or.n.A);
        qs.c cVar = or.n.I;
        qs.c cVarG = bVarJ2.g();
        qs.c cVarG2 = bVarJ2.g();
        br.l.d(cVarG2, "kotlinReadOnly.packageFqName");
        qs.c cVarS = ba.m.S(cVar, cVarG2);
        c cVar2 = new c(d(Iterable.class), bVarJ2, new qs.b(cVarG, cVarS, false));
        qs.b bVarJ3 = qs.b.j(or.n.f19712z);
        qs.c cVar3 = or.n.H;
        qs.c cVarG3 = bVarJ3.g();
        qs.c cVarG4 = bVarJ3.g();
        br.l.d(cVarG4, "kotlinReadOnly.packageFqName");
        c cVar4 = new c(d(Iterator.class), bVarJ3, new qs.b(cVarG3, ba.m.S(cVar3, cVarG4), false));
        qs.b bVarJ4 = qs.b.j(or.n.B);
        qs.c cVar5 = or.n.J;
        qs.c cVarG5 = bVarJ4.g();
        qs.c cVarG6 = bVarJ4.g();
        br.l.d(cVarG6, "kotlinReadOnly.packageFqName");
        c cVar6 = new c(d(Collection.class), bVarJ4, new qs.b(cVarG5, ba.m.S(cVar5, cVarG6), false));
        qs.b bVarJ5 = qs.b.j(or.n.C);
        qs.c cVar7 = or.n.K;
        qs.c cVarG7 = bVarJ5.g();
        qs.c cVarG8 = bVarJ5.g();
        br.l.d(cVarG8, "kotlinReadOnly.packageFqName");
        c cVar8 = new c(d(List.class), bVarJ5, new qs.b(cVarG7, ba.m.S(cVar7, cVarG8), false));
        qs.b bVarJ6 = qs.b.j(or.n.E);
        qs.c cVar9 = or.n.M;
        qs.c cVarG9 = bVarJ6.g();
        qs.c cVarG10 = bVarJ6.g();
        br.l.d(cVarG10, "kotlinReadOnly.packageFqName");
        c cVar10 = new c(d(Set.class), bVarJ6, new qs.b(cVarG9, ba.m.S(cVar9, cVarG10), false));
        qs.b bVarJ7 = qs.b.j(or.n.D);
        qs.c cVar11 = or.n.L;
        qs.c cVarG11 = bVarJ7.g();
        qs.c cVarG12 = bVarJ7.g();
        br.l.d(cVarG12, "kotlinReadOnly.packageFqName");
        c cVar12 = new c(d(ListIterator.class), bVarJ7, new qs.b(cVarG11, ba.m.S(cVar11, cVarG12), false));
        qs.c cVar13 = or.n.F;
        qs.b bVarJ8 = qs.b.j(cVar13);
        qs.c cVar14 = or.n.N;
        qs.c cVarG13 = bVarJ8.g();
        qs.c cVarG14 = bVarJ8.g();
        br.l.d(cVarG14, "kotlinReadOnly.packageFqName");
        c cVar15 = new c(d(Map.class), bVarJ8, new qs.b(cVarG13, ba.m.S(cVar14, cVarG14), false));
        qs.b bVarD = qs.b.j(cVar13).d(or.n.G.f());
        qs.c cVar16 = or.n.O;
        qs.c cVarG15 = bVarD.g();
        qs.c cVarG16 = bVarD.g();
        br.l.d(cVarG16, "kotlinReadOnly.packageFqName");
        List<c> listI = e5.I(cVar2, cVar4, cVar6, cVar8, cVar10, cVar12, cVar15, new c(d(Map.Entry.class), bVarD, new qs.b(cVarG15, ba.m.S(cVar16, cVarG16), false)));
        f20976n = listI;
        c(Object.class, or.n.f19686a);
        c(String.class, or.n.f19694f);
        c(CharSequence.class, or.n.f19693e);
        a(d(Throwable.class), qs.b.j(or.n.k));
        c(Cloneable.class, or.n.f19690c);
        c(Number.class, or.n.f19697i);
        a(d(Comparable.class), qs.b.j(or.n.f19698l));
        c(Enum.class, or.n.j);
        a(d(Annotation.class), qs.b.j(or.n.f19705s));
        for (c cVar17 : listI) {
            qs.b bVar = cVar17.f20962a;
            qs.b bVar2 = cVar17.f20963b;
            qs.b bVar3 = cVar17.f20964c;
            a(bVar, bVar2);
            b(bVar3.b(), bVar);
            f20974l.put(bVar3, bVar2);
            f20975m.put(bVar2, bVar3);
            qs.c cVarB = bVar2.b();
            qs.c cVarB2 = bVar3.b();
            HashMap map = j;
            qs.e eVarI = bVar3.b().i();
            br.l.d(eVarI, "mutableClassId.asSingleFqName().toUnsafe()");
            map.put(eVarI, cVarB);
            HashMap map2 = k;
            qs.e eVarI2 = cVarB.i();
            br.l.d(eVarI2, "readOnlyFqName.toUnsafe()");
            map2.put(eVarI2, cVarB2);
        }
        for (ys.c cVar18 : ys.c.values()) {
            qs.b bVarJ9 = qs.b.j(cVar18.getWrapperFqName());
            or.k primitiveType = cVar18.getPrimitiveType();
            br.l.d(primitiveType, "jvmType.primitiveType");
            a(bVarJ9, qs.b.j(or.o.j.c(primitiveType.getTypeName())));
        }
        for (qs.b bVar4 : or.d.f19666a) {
            a(qs.b.j(new qs.c("kotlin.jvm.internal." + bVar4.i().b() + "CompanionObject")), bVar4.d(qs.i.f21039b));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            a(qs.b.j(new qs.c(h0.b.h(i10, "kotlin.jvm.functions.Function"))), new qs.b(or.o.j, qs.g.e("Function" + i10)));
            b(new qs.c(c7.a.l(i10, f20966b, new StringBuilder())), f20971g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            pr.g gVar5 = pr.g.KSuspendFunction;
            b(new qs.c((gVar5.getPackageFqName().f21025a.toString() + '.' + gVar5.getClassNamePrefix()) + i11), f20971g);
        }
        b(or.n.f19688b.g(), d(Void.class));
    }

    public static void a(qs.b bVar, qs.b bVar2) {
        qs.e eVarI = bVar.b().i();
        br.l.d(eVarI, "javaClassId.asSingleFqName().toUnsafe()");
        f20972h.put(eVarI, bVar2);
        b(bVar2.b(), bVar);
    }

    public static void b(qs.c cVar, qs.b bVar) {
        qs.e eVarI = cVar.i();
        br.l.d(eVarI, "kotlinFqNameUnsafe.toUnsafe()");
        f20973i.put(eVarI, bVar);
    }

    public static void c(Class cls, qs.e eVar) {
        a(d(cls), qs.b.j(eVar.g()));
    }

    public static qs.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? qs.b.j(new qs.c(cls.getCanonicalName())) : d(declaringClass).d(qs.g.e(cls.getSimpleName()));
    }

    public static boolean e(qs.e eVar, String str) {
        Integer numO0;
        String str2 = eVar.f21030a;
        if (str2 != null) {
            String strS0 = tt.l.S0(str2, str, "");
            return strS0.length() > 0 && !tt.l.Q0(strS0, '0') && (numO0 = tt.s.o0(strS0)) != null && numO0.intValue() >= 23;
        }
        qs.e.a(4);
        throw null;
    }

    public static qs.b f(qs.e eVar) {
        return (e(eVar, f20965a) || e(eVar, f20967c)) ? f20969e : (e(eVar, f20966b) || e(eVar, f20968d)) ? f20971g : (qs.b) f20973i.get(eVar);
    }
}
