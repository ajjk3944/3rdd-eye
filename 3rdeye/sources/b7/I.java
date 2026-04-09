package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToInteger.kt */
/* loaded from: classes.dex */
public final class I extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final I f17326a = new I();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17327b = "toInteger";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17328c = E.u.G(new a7.j(EnumC1667d.BOOLEAN, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17329d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17330e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Boolean");
        return Long.valueOf(((Boolean) objP0).booleanValue() ? 1L : 0L);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17328c;
    }

    @Override // a7.g
    public final String c() {
        return f17327b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17329d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17330e;
    }
}
