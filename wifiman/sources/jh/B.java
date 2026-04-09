package Jh;

import Jh.C;
import Yg.C3667k;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final Zh.c f10071a;

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.c f10072b;

    /* renamed from: c, reason: collision with root package name */
    private static final Zh.c f10073c;

    /* renamed from: d, reason: collision with root package name */
    private static final Zh.c f10074d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f10075e;

    /* renamed from: f, reason: collision with root package name */
    private static final Zh.c[] f10076f;

    /* renamed from: g, reason: collision with root package name */
    private static final K f10077g;

    /* renamed from: h, reason: collision with root package name */
    private static final C f10078h;

    static {
        Zh.c cVar = new Zh.c("org.jspecify.nullness");
        f10071a = cVar;
        Zh.c cVar2 = new Zh.c("org.jspecify.annotations");
        f10072b = cVar2;
        Zh.c cVar3 = new Zh.c("io.reactivex.rxjava3.annotations");
        f10073c = cVar3;
        Zh.c cVar4 = new Zh.c("org.checkerframework.checker.nullness.compatqual");
        f10074d = cVar4;
        String strB = cVar3.b();
        AbstractC6492s.h(strB, "asString(...)");
        f10075e = strB;
        f10076f = new Zh.c[]{new Zh.c(strB + ".Nullable"), new Zh.c(strB + ".NonNull")};
        Zh.c cVar5 = new Zh.c("org.jetbrains.annotations");
        C.a aVar = C.f10079d;
        Yg.s sVarA = Yg.z.a(cVar5, aVar.a());
        Yg.s sVarA2 = Yg.z.a(new Zh.c("androidx.annotation"), aVar.a());
        Yg.s sVarA3 = Yg.z.a(new Zh.c("android.support.annotation"), aVar.a());
        Yg.s sVarA4 = Yg.z.a(new Zh.c("android.annotation"), aVar.a());
        Yg.s sVarA5 = Yg.z.a(new Zh.c("com.android.annotations"), aVar.a());
        Yg.s sVarA6 = Yg.z.a(new Zh.c("org.eclipse.jdt.annotation"), aVar.a());
        Yg.s sVarA7 = Yg.z.a(new Zh.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Yg.s sVarA8 = Yg.z.a(cVar4, aVar.a());
        Yg.s sVarA9 = Yg.z.a(new Zh.c("javax.annotation"), aVar.a());
        Yg.s sVarA10 = Yg.z.a(new Zh.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Yg.s sVarA11 = Yg.z.a(new Zh.c("io.reactivex.annotations"), aVar.a());
        Zh.c cVar6 = new Zh.c("androidx.annotation.RecentlyNullable");
        O o10 = O.WARN;
        Yg.s sVarA12 = Yg.z.a(cVar6, new C(o10, null, null, 4, null));
        Yg.s sVarA13 = Yg.z.a(new Zh.c("androidx.annotation.RecentlyNonNull"), new C(o10, null, null, 4, null));
        Yg.s sVarA14 = Yg.z.a(new Zh.c("lombok"), aVar.a());
        C3667k c3667k = new C3667k(2, 1);
        O o11 = O.STRICT;
        f10077g = new M(Zg.U.k(sVarA, sVarA2, sVarA3, sVarA4, sVarA5, sVarA6, sVarA7, sVarA8, sVarA9, sVarA10, sVarA11, sVarA12, sVarA13, sVarA14, Yg.z.a(cVar, new C(o10, c3667k, o11)), Yg.z.a(cVar2, new C(o10, new C3667k(2, 1), o11)), Yg.z.a(cVar3, new C(o10, new C3667k(1, 8), o11))));
        f10078h = new C(o10, null, null, 4, null);
    }

    public static final G a(C3667k configuredKotlinVersion) {
        AbstractC6492s.i(configuredKotlinVersion, "configuredKotlinVersion");
        C c10 = f10078h;
        O oC = (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
        return new G(oC, c(oC), null, 4, null);
    }

    public static /* synthetic */ G b(C3667k c3667k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3667k = C3667k.f25008f;
        }
        return a(c3667k);
    }

    public static final O c(O globalReportLevel) {
        AbstractC6492s.i(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == O.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final O d(Zh.c annotationFqName) {
        AbstractC6492s.i(annotationFqName, "annotationFqName");
        return h(annotationFqName, K.f10150a.a(), null, 4, null);
    }

    public static final Zh.c e() {
        return f10072b;
    }

    public static final Zh.c[] f() {
        return f10076f;
    }

    public static final O g(Zh.c annotation, K configuredReportLevels, C3667k configuredKotlinVersion) {
        AbstractC6492s.i(annotation, "annotation");
        AbstractC6492s.i(configuredReportLevels, "configuredReportLevels");
        AbstractC6492s.i(configuredKotlinVersion, "configuredKotlinVersion");
        O o10 = (O) configuredReportLevels.a(annotation);
        if (o10 != null) {
            return o10;
        }
        C c10 = (C) f10077g.a(annotation);
        return c10 == null ? O.IGNORE : (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
    }

    public static /* synthetic */ O h(Zh.c cVar, K k10, C3667k c3667k, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c3667k = new C3667k(1, 7, 20);
        }
        return g(cVar, k10, c3667k);
    }
}
