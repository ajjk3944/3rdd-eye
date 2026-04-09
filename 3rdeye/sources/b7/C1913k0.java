package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: TrigonometricFunctions.kt */
/* renamed from: b7.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1913k0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1913k0 f17844a = new C1913k0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17845b = "cos";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17846c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17847d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17848e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17846c = E.u.G(new a7.j(enumC1667d, false));
        f17847d = enumC1667d;
        f17848e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        return Double.valueOf(Math.cos(((Double) objP0).doubleValue()));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17846c;
    }

    @Override // a7.g
    public final String c() {
        return f17845b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17847d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17848e;
    }
}
