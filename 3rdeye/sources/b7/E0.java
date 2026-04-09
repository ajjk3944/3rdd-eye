package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import c9.C2097r;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class E0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f17259a = new E0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17260b = "copySign";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17261c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17262d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17263e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17261c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17262d = enumC1667d;
        f17263e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) objP0).doubleValue();
        Object objV0 = C2097r.v0(list);
        kotlin.jvm.internal.l.d(objV0, "null cannot be cast to non-null type kotlin.Double");
        return Double.valueOf(Math.copySign(dDoubleValue, ((Double) objV0).doubleValue()));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17261c;
    }

    @Override // a7.g
    public final String c() {
        return f17260b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17262d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17263e;
    }
}
