package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4278a;
import java.util.List;

/* compiled from: ToString.kt */
/* renamed from: b7.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1908j0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1908j0 f17827a = new C1908j0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17828b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17829c = E.u.G(new a7.j(EnumC1667d.COLOR, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17830d = EnumC1667d.STRING;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17831e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return C4278a.a(((C4278a) objP0).f37526a);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17829c;
    }

    @Override // a7.g
    public final String c() {
        return f17828b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17830d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17831e;
    }
}
