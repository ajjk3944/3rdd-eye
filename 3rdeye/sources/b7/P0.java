package b7;

import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c7.e;
import c9.C2092m;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class P0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final P0 f17465a = new P0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17466b = "sub";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17467c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17468d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17469e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17467c = E.u.G(new a7.j(enumC1667d, true));
        f17468d = enumC1667d;
        f17469e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Double dValueOf = Double.valueOf(0.0d);
        int i = 0;
        for (Double dB : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            double dDoubleValue = dValueOf.doubleValue();
            if (i != 0) {
                dB = C1668e.a.b(e.c.a.f.C0295a.f18532a, Double.valueOf(dDoubleValue), dB);
            }
            kotlin.jvm.internal.l.d(dB, "null cannot be cast to non-null type kotlin.Double");
            dValueOf = dB;
            i = i10;
        }
        return dValueOf;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17467c;
    }

    @Override // a7.g
    public final String c() {
        return f17466b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17468d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17469e;
    }
}
