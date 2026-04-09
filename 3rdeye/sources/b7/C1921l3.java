package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1921l3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1921l3 f17872a = new C1921l3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17873b = "signum";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17874c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17875d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17876e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17874c = E.u.G(new a7.j(enumC1667d, false));
        f17875d = enumC1667d;
        f17876e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        kotlin.jvm.internal.l.d(C2097r.p0(list), "null cannot be cast to non-null type kotlin.Long");
        return Long.valueOf(Long.signum(((Long) r1).longValue()));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17874c;
    }

    @Override // a7.g
    public final String c() {
        return f17873b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17875d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17876e;
    }
}
