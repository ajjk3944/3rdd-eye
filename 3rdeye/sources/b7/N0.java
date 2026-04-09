package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class N0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final N0 f17426a = new N0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17427b = "round";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17428c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17429d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17430e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17428c = E.u.G(new a7.j(enumC1667d, false));
        f17429d = enumC1667d;
        f17430e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) objP0).doubleValue();
        return Double.valueOf(Math.floor(Math.abs(dDoubleValue) + 0.5d) * Math.signum(dDoubleValue));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17428c;
    }

    @Override // a7.g
    public final String c() {
        return f17427b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17429d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17430e;
    }
}
