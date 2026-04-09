package b7;

import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c7.e;
import c9.C2092m;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1916k3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1916k3 f17853a = new C1916k3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17854b = "mul";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17855c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17856d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17857e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17855c = E.u.G(new a7.j(enumC1667d, true));
        f17856d = enumC1667d;
        f17857e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Long l5 = 0L;
        int i = 0;
        for (Object objA : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            long jLongValue = l5.longValue();
            if (i != 0) {
                objA = C1668e.a.a(e.c.a.InterfaceC0290c.C0292c.f18528a, Long.valueOf(jLongValue), objA);
            }
            kotlin.jvm.internal.l.d(objA, "null cannot be cast to non-null type kotlin.Long");
            l5 = (Long) objA;
            i = i10;
        }
        return l5;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17855c;
    }

    @Override // a7.g
    public final String c() {
        return f17854b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17856d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17857e;
    }
}
