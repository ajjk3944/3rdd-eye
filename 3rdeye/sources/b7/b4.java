package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class b4 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final b4 f17695a = new b4();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17696b = "trim";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17697c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17698d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17699e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17697c = E.u.G(new a7.j(enumC1667d, false));
        f17698d = enumC1667d;
        f17699e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        return y9.q.w0((String) obj).toString();
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17697c;
    }

    @Override // a7.g
    public final String c() {
        return f17696b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17698d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17699e;
    }
}
