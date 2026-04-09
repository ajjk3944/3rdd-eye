package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: NumberArithmeticFunctions.kt */
/* loaded from: classes.dex */
public final class G0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final G0 f17292a = new G0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17293b = "floor";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17294c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17295d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17296e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17294c = E.u.G(new a7.j(enumC1667d, false));
        f17295d = enumC1667d;
        f17296e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        return Double.valueOf(Math.floor(((Double) objP0).doubleValue()));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17294c;
    }

    @Override // a7.g
    public final String c() {
        return f17293b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17295d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17296e;
    }
}
