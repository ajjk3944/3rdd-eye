package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class H0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f17311a = new H0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17312b = AppLovinMediationProvider.MAX;

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17313c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17314d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17315e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17313c = E.u.G(new a7.j(enumC1667d, true));
        f17314d = enumC1667d;
        f17315e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        if (list.isEmpty()) {
            C1666c.d(f17312b, list, "Function requires non empty argument list.", null);
            throw null;
        }
        Object objP0 = C2097r.p0(list);
        for (Object obj : list) {
            kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) objP0).doubleValue();
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Double");
            objP0 = Double.valueOf(Math.max(dDoubleValue, ((Double) obj).doubleValue()));
        }
        return objP0;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17313c;
    }

    @Override // a7.g
    public final String c() {
        return f17312b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17314d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17315e;
    }
}
