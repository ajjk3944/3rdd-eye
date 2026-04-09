package b7;

import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c7.e;
import java.util.Iterator;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class Q0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0 f17485a = new Q0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17486b = "sum";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17487c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17488d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17489e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17487c = E.u.G(new a7.j(enumC1667d, true));
        f17488d = enumC1667d;
        f17489e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Double dValueOf = Double.valueOf(0.0d);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objB = C1668e.a.b(e.c.a.f.b.f18533a, Double.valueOf(dValueOf.doubleValue()), it.next());
            kotlin.jvm.internal.l.d(objB, "null cannot be cast to non-null type kotlin.Double");
            dValueOf = (Double) objB;
        }
        return dValueOf;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17487c;
    }

    @Override // a7.g
    public final String c() {
        return f17486b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17488d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17489e;
    }
}
