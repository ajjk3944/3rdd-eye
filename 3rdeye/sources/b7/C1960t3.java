package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToString.kt */
/* renamed from: b7.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1960t3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1960t3 f17988a = new C1960t3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17989b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17990c = E.u.G(new a7.j(EnumC1667d.NUMBER, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17991d = EnumC1667d.STRING;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17992e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        return String.valueOf(((Double) objP0).doubleValue());
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17990c;
    }

    @Override // a7.g
    public final String c() {
        return f17989b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17991d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17992e;
    }
}
