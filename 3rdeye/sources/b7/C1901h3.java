package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1901h3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1901h3 f17807a = new C1901h3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17808b = "min";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17809c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17810d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17811e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17809c = E.u.G(new a7.j(enumC1667d, true));
        f17810d = enumC1667d;
        f17811e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        if (list.isEmpty()) {
            C1666c.d(f17808b, list, "Function requires non empty argument list.", null);
            throw null;
        }
        Long lValueOf = Long.MAX_VALUE;
        for (Object obj : list) {
            long jLongValue = lValueOf.longValue();
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
            lValueOf = Long.valueOf(Math.min(jLongValue, ((Long) obj).longValue()));
        }
        return lValueOf;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17809c;
    }

    @Override // a7.g
    public final String c() {
        return f17808b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17810d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17811e;
    }
}
