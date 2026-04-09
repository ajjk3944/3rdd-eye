package b7;

import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c7.e;
import c9.C2092m;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1926m3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1926m3 f17889a = new C1926m3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17890b = "sub";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17891c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17892d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17893e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17891c = E.u.G(new a7.j(enumC1667d, true));
        f17892d = enumC1667d;
        f17893e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Long l5 = 0L;
        int i = 0;
        for (Long lB : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            long jLongValue = l5.longValue();
            if (i != 0) {
                lB = C1668e.a.b(e.c.a.f.C0295a.f18532a, Long.valueOf(jLongValue), lB);
            }
            kotlin.jvm.internal.l.d(lB, "null cannot be cast to non-null type kotlin.Long");
            l5 = lB;
            i = i10;
        }
        return l5;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17891c;
    }

    @Override // a7.g
    public final String c() {
        return f17890b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17892d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17893e;
    }
}
