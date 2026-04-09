package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class P3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final P3 f17476a = new P3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17477b = "len";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17478c = E.u.G(new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17479d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17480e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        kotlin.jvm.internal.l.d(C2097r.p0(list), "null cannot be cast to non-null type kotlin.String");
        return Long.valueOf(((String) r1).length());
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17478c;
    }

    @Override // a7.g
    public final String c() {
        return f17477b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17479d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17480e;
    }
}
