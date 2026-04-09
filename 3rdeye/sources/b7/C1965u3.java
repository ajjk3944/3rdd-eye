package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: StringFunctions.kt */
/* renamed from: b7.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965u3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1965u3 f18001a = new C1965u3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18002b = "padEnd";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18003c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18004d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18005e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        a7.j jVar = new a7.j(enumC1667d, false);
        a7.j jVar2 = new a7.j(enumC1667d, false);
        EnumC1667d enumC1667d2 = EnumC1667d.STRING;
        f18003c = C2092m.W(jVar, jVar2, new a7.j(enumC1667d2, false));
        f18004d = enumC1667d2;
        f18005e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
        String strValueOf = String.valueOf(((Long) obj).longValue());
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Object obj3 = list.get(2);
        kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.String");
        return strValueOf.concat(E.u.o(nVar, abstractC1664a, (int) (jLongValue - strValueOf.length()), (String) obj3));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18003c;
    }

    @Override // a7.g
    public final String c() {
        return f18002b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18004d;
    }

    @Override // a7.g
    public final boolean f() {
        return f18005e;
    }
}
