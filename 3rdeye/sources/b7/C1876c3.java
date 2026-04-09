package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876c3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1876c3 f17709a = new C1876c3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17710b = "abs";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17711c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17712d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17713e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17711c = E.u.G(new a7.j(enumC1667d, false));
        f17712d = enumC1667d;
        f17713e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objP0).longValue();
        if (jLongValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(jLongValue));
        }
        C1666c.d(f17710b, list, "Integer overflow.", null);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17711c;
    }

    @Override // a7.g
    public final String c() {
        return f17710b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17712d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17713e;
    }
}
