package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class Q3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Q3 f17496a = new Q3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17497b = "replaceAll";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17498c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17499d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17500e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17498c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17499d = enumC1667d;
        f17500e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = list.get(2);
        kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.String");
        return str2.length() == 0 ? str : y9.n.X(str, str2, (String) obj3);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17498c;
    }

    @Override // a7.g
    public final String c() {
        return f17497b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17499d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17500e;
    }
}
