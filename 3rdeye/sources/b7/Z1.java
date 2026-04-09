package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: IntervalFunctions.kt */
/* loaded from: classes.dex */
public final class Z1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Z1 f17644a = new Z1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17645b = "getIntervalSeconds";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17646c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17647d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17648e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17646c = E.u.G(new a7.j(enumC1667d, false));
        f17647d = enumC1667d;
        f17648e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue >= 0) {
            return Long.valueOf((jLongValue / 1000) % 60);
        }
        throw new C1665b(null, "Failed to evaluate [getIntervalSeconds(-1)]. Expecting non-negative number of milliseconds.");
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17646c;
    }

    @Override // a7.g
    public final String c() {
        return f17645b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17647d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17648e;
    }
}
