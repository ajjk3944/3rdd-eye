package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import c9.C2097r;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881d3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1881d3 f17730a = new C1881d3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17731b = "copySign";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17732c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17733d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17734e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17732c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17733d = enumC1667d;
        f17734e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Long");
        Long l5 = (Long) objP0;
        long jLongValue = l5.longValue();
        Object objV0 = C2097r.v0(list);
        kotlin.jvm.internal.l.d(objV0, "null cannot be cast to non-null type kotlin.Long");
        int iSignum = Long.signum(((Long) objV0).longValue());
        if (iSignum != 0) {
            if (jLongValue != Long.MIN_VALUE) {
                return Long.valueOf(Math.abs(jLongValue) * iSignum);
            }
            if (iSignum != -1) {
                C1666c.d(f17731b, list, "Integer overflow.", null);
                throw null;
            }
        }
        return l5;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17732c;
    }

    @Override // a7.g
    public final String c() {
        return f17731b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17733d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17734e;
    }
}
