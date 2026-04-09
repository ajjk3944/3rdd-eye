package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class K3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final K3 f17382a = new K3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17383b = "contains";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17384c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17385d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17386e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17384c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17385d = EnumC1667d.BOOLEAN;
        f17386e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        return Boolean.valueOf(y9.q.b0((String) obj, (String) obj2, false));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17384c;
    }

    @Override // a7.g
    public final String c() {
        return f17383b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17385d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17386e;
    }
}
