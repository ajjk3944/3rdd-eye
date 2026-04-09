package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToNumber.kt */
/* renamed from: b7.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941p3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1941p3 f17932a = new C1941p3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17933b = "toNumber";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17934c = E.u.G(new a7.j(EnumC1667d.INTEGER, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17935d = EnumC1667d.NUMBER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17936e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        kotlin.jvm.internal.l.d(C2097r.p0(list), "null cannot be cast to non-null type kotlin.Long");
        return Double.valueOf(((Long) r1).longValue());
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17934c;
    }

    @Override // a7.g
    public final String c() {
        return f17933b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17935d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17936e;
    }
}
