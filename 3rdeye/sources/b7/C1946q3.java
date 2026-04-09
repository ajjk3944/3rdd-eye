package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToString.kt */
/* renamed from: b7.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1946q3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1946q3 f17950a = new C1946q3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17951b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17952c = E.u.G(new a7.j(EnumC1667d.INTEGER, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17953d = EnumC1667d.STRING;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17954e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Long");
        return String.valueOf(((Long) objP0).longValue());
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17952c;
    }

    @Override // a7.g
    public final String c() {
        return f17951b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17953d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17954e;
    }
}
