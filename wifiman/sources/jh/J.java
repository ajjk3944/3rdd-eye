package Jh;

import Zg.d0;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private static final Zh.c f10125a;

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.c f10126b;

    /* renamed from: c, reason: collision with root package name */
    private static final Zh.c f10127c;

    /* renamed from: d, reason: collision with root package name */
    private static final Zh.c f10128d;

    /* renamed from: e, reason: collision with root package name */
    private static final Zh.c f10129e;

    /* renamed from: f, reason: collision with root package name */
    private static final Zh.c f10130f;

    /* renamed from: g, reason: collision with root package name */
    private static final Zh.c f10131g;

    /* renamed from: h, reason: collision with root package name */
    private static final Zh.c f10132h;

    /* renamed from: i, reason: collision with root package name */
    private static final Zh.c f10133i;

    /* renamed from: j, reason: collision with root package name */
    private static final Zh.c f10134j;

    /* renamed from: k, reason: collision with root package name */
    private static final Zh.c f10135k;

    /* renamed from: l, reason: collision with root package name */
    private static final Zh.c f10136l;

    /* renamed from: m, reason: collision with root package name */
    private static final Zh.c f10137m;

    /* renamed from: n, reason: collision with root package name */
    private static final Zh.c f10138n;

    /* renamed from: o, reason: collision with root package name */
    private static final Zh.c f10139o;

    /* renamed from: p, reason: collision with root package name */
    private static final Zh.c f10140p;

    /* renamed from: q, reason: collision with root package name */
    private static final Set f10141q;

    /* renamed from: r, reason: collision with root package name */
    private static final Set f10142r;

    /* renamed from: s, reason: collision with root package name */
    private static final Set f10143s;

    /* renamed from: t, reason: collision with root package name */
    private static final Set f10144t;

    /* renamed from: u, reason: collision with root package name */
    private static final Set f10145u;

    /* renamed from: v, reason: collision with root package name */
    private static final Set f10146v;

    /* renamed from: w, reason: collision with root package name */
    private static final Set f10147w;

    /* renamed from: x, reason: collision with root package name */
    private static final Map f10148x;

    /* renamed from: y, reason: collision with root package name */
    private static final Zh.c f10149y;

    static {
        Zh.c cVar = new Zh.c("org.jspecify.nullness.Nullable");
        f10125a = cVar;
        Zh.c cVar2 = new Zh.c("org.jspecify.nullness.NullMarked");
        f10126b = cVar2;
        Zh.c cVar3 = new Zh.c("org.jspecify.nullness.NullnessUnspecified");
        f10127c = cVar3;
        Zh.c cVar4 = new Zh.c("org.jspecify.annotations.NonNull");
        f10128d = cVar4;
        Zh.c cVar5 = new Zh.c("org.jspecify.annotations.Nullable");
        f10129e = cVar5;
        Zh.c cVar6 = new Zh.c("org.jspecify.annotations.NullMarked");
        f10130f = cVar6;
        Zh.c cVar7 = new Zh.c("org.jspecify.annotations.NullnessUnspecified");
        f10131g = cVar7;
        Zh.c cVar8 = new Zh.c("org.jspecify.annotations.NullUnmarked");
        f10132h = cVar8;
        f10133i = new Zh.c("javax.annotation.meta.TypeQualifier");
        f10134j = new Zh.c("javax.annotation.meta.TypeQualifierNickname");
        f10135k = new Zh.c("javax.annotation.meta.TypeQualifierDefault");
        Zh.c cVar9 = new Zh.c("javax.annotation.Nonnull");
        f10136l = cVar9;
        Zh.c cVar10 = new Zh.c("javax.annotation.Nullable");
        f10137m = cVar10;
        Zh.c cVar11 = new Zh.c("javax.annotation.CheckForNull");
        f10138n = cVar11;
        f10139o = new Zh.c("javax.annotation.ParametersAreNonnullByDefault");
        f10140p = new Zh.c("javax.annotation.ParametersAreNullableByDefault");
        f10141q = d0.i(cVar9, cVar11);
        Set setI = d0.i(I.f10113l, cVar4, new Zh.c("android.annotation.NonNull"), new Zh.c("androidx.annotation.NonNull"), new Zh.c("androidx.annotation.RecentlyNonNull"), new Zh.c("android.support.annotation.NonNull"), new Zh.c("com.android.annotations.NonNull"), new Zh.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new Zh.c("org.checkerframework.checker.nullness.qual.NonNull"), new Zh.c("edu.umd.cs.findbugs.annotations.NonNull"), new Zh.c("io.reactivex.annotations.NonNull"), new Zh.c("io.reactivex.rxjava3.annotations.NonNull"), new Zh.c("org.eclipse.jdt.annotation.NonNull"), new Zh.c("lombok.NonNull"));
        f10142r = setI;
        Set setI2 = d0.i(I.f10114m, cVar, cVar5, cVar10, cVar11, new Zh.c("android.annotation.Nullable"), new Zh.c("androidx.annotation.Nullable"), new Zh.c("androidx.annotation.RecentlyNullable"), new Zh.c("android.support.annotation.Nullable"), new Zh.c("com.android.annotations.Nullable"), new Zh.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new Zh.c("org.checkerframework.checker.nullness.qual.Nullable"), new Zh.c("edu.umd.cs.findbugs.annotations.Nullable"), new Zh.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new Zh.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new Zh.c("io.reactivex.annotations.Nullable"), new Zh.c("io.reactivex.rxjava3.annotations.Nullable"), new Zh.c("org.eclipse.jdt.annotation.Nullable"));
        f10143s = setI2;
        f10144t = d0.i(cVar3, cVar7);
        f10145u = d0.m(d0.m(d0.m(d0.m(d0.l(d0.l(new LinkedHashSet(), setI), setI2), cVar9), cVar2), cVar6), cVar8);
        f10146v = d0.i(I.f10116o, I.f10117p);
        f10147w = d0.i(I.f10115n, I.f10118q);
        f10148x = Zg.U.k(Yg.z.a(I.f10105d, o.a.f51817H), Yg.z.a(I.f10107f, o.a.f51825L), Yg.z.a(I.f10109h, o.a.f51892y), Yg.z.a(I.f10110i, o.a.f51833P));
        f10149y = new Zh.c("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set a() {
        return f10141q;
    }

    public static final Set b() {
        return f10144t;
    }

    public static final Zh.c c() {
        return f10136l;
    }

    public static final Zh.c d() {
        return f10139o;
    }

    public static final Zh.c e() {
        return f10140p;
    }

    public static final Zh.c f() {
        return f10133i;
    }

    public static final Zh.c g() {
        return f10135k;
    }

    public static final Zh.c h() {
        return f10134j;
    }

    public static final Zh.c i() {
        return f10130f;
    }

    public static final Zh.c j() {
        return f10132h;
    }

    public static final Zh.c k() {
        return f10126b;
    }

    public static final Set l() {
        return f10147w;
    }

    public static final Set m() {
        return f10142r;
    }

    public static final Set n() {
        return f10143s;
    }

    public static final Set o() {
        return f10146v;
    }

    public static final Zh.c p() {
        return f10149y;
    }
}
