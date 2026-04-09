package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class D0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f17241a = new D0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17242b = "ceil";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17243c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17244d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17245e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17243c = E.u.G(new a7.j(enumC1667d, false));
        f17244d = enumC1667d;
        f17245e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        return Double.valueOf(Math.ceil(((Double) objP0).doubleValue()));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17243c;
    }

    @Override // a7.g
    public final String c() {
        return f17242b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17244d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17245e;
    }
}
