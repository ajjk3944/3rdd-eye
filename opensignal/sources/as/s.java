package as;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final qs.c f2245a;

    /* renamed from: b, reason: collision with root package name */
    public static final qs.c[] f2246b;

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f2247c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f2248d;

    static {
        qs.c cVar = new qs.c("org.jspecify.nullness");
        qs.c cVar2 = new qs.c("org.jspecify.annotations");
        f2245a = cVar2;
        qs.c cVar3 = new qs.c("io.reactivex.rxjava3.annotations");
        qs.c cVar4 = new qs.c("org.checkerframework.checker.nullness.compatqual");
        String strB = cVar3.b();
        f2246b = new qs.c[]{new qs.c(strB.concat(".Nullable")), new qs.c(strB.concat(".NonNull"))};
        qs.c cVar5 = new qs.c("org.jetbrains.annotations");
        t tVar = t.f2249d;
        lq.l lVar = new lq.l(cVar5, tVar);
        lq.l lVar2 = new lq.l(new qs.c("androidx.annotation"), tVar);
        lq.l lVar3 = new lq.l(new qs.c("android.support.annotation"), tVar);
        lq.l lVar4 = new lq.l(new qs.c("android.annotation"), tVar);
        lq.l lVar5 = new lq.l(new qs.c("com.android.annotations"), tVar);
        lq.l lVar6 = new lq.l(new qs.c("org.eclipse.jdt.annotation"), tVar);
        lq.l lVar7 = new lq.l(new qs.c("org.checkerframework.checker.nullness.qual"), tVar);
        lq.l lVar8 = new lq.l(cVar4, tVar);
        lq.l lVar9 = new lq.l(new qs.c("javax.annotation"), tVar);
        lq.l lVar10 = new lq.l(new qs.c("edu.umd.cs.findbugs.annotations"), tVar);
        lq.l lVar11 = new lq.l(new qs.c("io.reactivex.annotations"), tVar);
        qs.c cVar6 = new qs.c("androidx.annotation.RecentlyNullable");
        f0 f0Var = f0.WARN;
        lq.l lVar12 = new lq.l(cVar6, new t(f0Var, 4));
        lq.l lVar13 = new lq.l(new qs.c("androidx.annotation.RecentlyNonNull"), new t(f0Var, 4));
        lq.l lVar14 = new lq.l(new qs.c("lombok"), tVar);
        lq.g gVar = new lq.g(1, 9, 0);
        f0 f0Var2 = f0.STRICT;
        f2247c = new io.sentry.internal.debugmeta.c(mq.b0.R(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, new lq.l(cVar, new t(f0Var, gVar, f0Var2)), new lq.l(cVar2, new t(f0Var, new lq.g(1, 9, 0), f0Var2)), new lq.l(cVar3, new t(f0Var, new lq.g(1, 8, 0), f0Var2))));
        f2248d = new t(f0Var, 4);
    }
}
