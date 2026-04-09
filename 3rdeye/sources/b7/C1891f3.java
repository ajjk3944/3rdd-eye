package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1891f3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1891f3 f17771a = new C1891f3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17772b = AppLovinMediationProvider.MAX;

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17773c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17774d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17775e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17773c = E.u.G(new a7.j(enumC1667d, true));
        f17774d = enumC1667d;
        f17775e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        if (list.isEmpty()) {
            C1666c.d(f17772b, list, "Function requires non empty argument list.", null);
            throw null;
        }
        Long lValueOf = Long.MIN_VALUE;
        for (Object obj : list) {
            long jLongValue = lValueOf.longValue();
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
            lValueOf = Long.valueOf(Math.max(jLongValue, ((Long) obj).longValue()));
        }
        return lValueOf;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17773c;
    }

    @Override // a7.g
    public final String c() {
        return f17772b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17774d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17775e;
    }
}
