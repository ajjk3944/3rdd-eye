package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* loaded from: classes.dex */
public final class W1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final W1 f17592a = new W1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17593b = "getIntegerValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17594c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17595d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17594c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17595d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        Long l5 = (Long) obj2;
        Object objMo0get = ((s6.k) nVar.f13448a).mo0get((String) obj);
        Long l10 = objMo0get instanceof Long ? (Long) objMo0get : null;
        return l10 == null ? l5 : l10;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17594c;
    }

    @Override // a7.g
    public final String c() {
        return f17593b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17595d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
