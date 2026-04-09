package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: VariableFunctions.kt */
/* loaded from: classes.dex */
public final class V2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final V2 f17580a = new V2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17581b = "getStringValue";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17582c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17583d;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17582c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17583d = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object objMo0get = ((s6.k) nVar.f13448a).mo0get((String) obj);
        String str2 = objMo0get instanceof String ? (String) objMo0get : null;
        return str2 == null ? str : str2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17582c;
    }

    @Override // a7.g
    public final String c() {
        return f17581b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17583d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
