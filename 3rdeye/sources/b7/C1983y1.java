package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* renamed from: b7.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983y1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1983y1 f18048a = new C1983y1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18049b = "getColorValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18050c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18051d;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f18050c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f18051d = EnumC1667d.COLOR;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws IllegalArgumentException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        int iA = C4278a.C0440a.a((String) obj2);
        Object objMo0get = ((s6.k) nVar.f13448a).mo0get((String) obj);
        C4278a c4278a = objMo0get instanceof C4278a ? (C4278a) objMo0get : null;
        return c4278a == null ? new C4278a(iA) : c4278a;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18050c;
    }

    @Override // a7.g
    public final String c() {
        return f18049b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18051d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
