package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToString.kt */
/* loaded from: classes.dex */
public final class J extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final J f17347a = new J();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17348b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17349c = E.u.G(new a7.j(EnumC1667d.BOOLEAN, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17350d = EnumC1667d.STRING;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17351e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objP0).booleanValue() ? "true" : "false";
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17349c;
    }

    @Override // a7.g
    public final String c() {
        return f17348b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17350d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17351e;
    }
}
