package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import c9.C2097r;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1911j3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1911j3 f17836a = new C1911j3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17837b = "mod";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17838c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17839d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17840e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17838c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17839d = enumC1667d;
        f17840e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objP0).longValue();
        Object objV0 = C2097r.v0(list);
        kotlin.jvm.internal.l.d(objV0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue2 = ((Long) objV0).longValue();
        if (jLongValue2 != 0) {
            return Long.valueOf(jLongValue % jLongValue2);
        }
        C1666c.d(f17837b, list, "Division by zero is not supported.", null);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17838c;
    }

    @Override // a7.g
    public final String c() {
        return f17837b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17839d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17840e;
    }
}
