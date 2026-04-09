package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* renamed from: b7.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920l2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1920l2 f17868a = new C1920l2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17869b = "getNumberValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17870c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17871d;

    static {
        a7.j jVar = new a7.j(EnumC1667d.STRING, false);
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17870c = C2092m.W(jVar, new a7.j(enumC1667d, false));
        f17871d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj2;
        s6.k kVar = (s6.k) nVar.f13448a;
        Number number2 = null;
        if (!(kVar.mo0get(str) instanceof Long)) {
            Object objMo0get = kVar.mo0get(str);
            if (objMo0get instanceof Number) {
                number2 = (Number) objMo0get;
            }
        }
        return number2 == null ? number : number2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17870c;
    }

    @Override // a7.g
    public final String c() {
        return f17869b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17871d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
