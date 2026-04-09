package b7;

import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c7.e;
import c9.C2092m;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class M0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f17408a = new M0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17409b = "mul";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17410c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17411d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17412e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17410c = E.u.G(new a7.j(enumC1667d, true));
        f17411d = enumC1667d;
        f17412e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Double dValueOf = Double.valueOf(0.0d);
        int i = 0;
        for (Object objA : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            double dDoubleValue = dValueOf.doubleValue();
            if (i != 0) {
                objA = C1668e.a.a(e.c.a.InterfaceC0290c.C0292c.f18528a, Double.valueOf(dDoubleValue), objA);
            }
            kotlin.jvm.internal.l.d(objA, "null cannot be cast to non-null type kotlin.Double");
            dValueOf = (Double) objA;
            i = i10;
        }
        return dValueOf;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17410c;
    }

    @Override // a7.g
    public final String c() {
        return f17409b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17411d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17412e;
    }
}
