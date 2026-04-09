package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* renamed from: b7.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1970v3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1970v3 f18014a = new C1970v3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18015b = "padEnd";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18016c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18017d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18018e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f18016c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.INTEGER, false), new a7.j(enumC1667d, false));
        f18017d = enumC1667d;
        f18018e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Object obj3 = list.get(2);
        kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.String");
        return str.concat(E.u.o(nVar, abstractC1664a, (int) (jLongValue - str.length()), (String) obj3));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18016c;
    }

    @Override // a7.g
    public final String c() {
        return f18015b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18017d;
    }

    @Override // a7.g
    public final boolean f() {
        return f18018e;
    }
}
