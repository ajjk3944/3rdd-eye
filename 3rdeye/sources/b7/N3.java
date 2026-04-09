package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class N3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final N3 f17437a = new N3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17438b = "index";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17439c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17440d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17441e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17439c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17440d = EnumC1667d.INTEGER;
        f17441e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        kotlin.jvm.internal.l.d(list.get(0), "null cannot be cast to non-null type kotlin.String");
        kotlin.jvm.internal.l.d(list.get(1), "null cannot be cast to non-null type kotlin.String");
        return Long.valueOf(y9.q.g0((String) r4, (String) r5, 0, false, 2));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17439c;
    }

    @Override // a7.g
    public final String c() {
        return f17438b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17440d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17441e;
    }
}
