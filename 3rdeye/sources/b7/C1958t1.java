package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* renamed from: b7.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1958t1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1958t1 f17982a = new C1958t1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17983b = "getBooleanValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17984c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17985d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.BOOLEAN;
        f17984c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17985d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj2;
        Object objMo0get = ((s6.k) nVar.f13448a).mo0get((String) obj);
        Boolean bool2 = objMo0get instanceof Boolean ? (Boolean) objMo0get : null;
        return bool2 == null ? bool : bool2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17984c;
    }

    @Override // a7.g
    public final String c() {
        return f17983b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17985d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
