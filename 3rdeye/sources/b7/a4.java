package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import java.util.Locale;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class a4 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final a4 f17676a = new a4();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17677b = "toUpperCase";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17678c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17679d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17680e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17678c = E.u.G(new a7.j(enumC1667d, false));
        f17679d = enumC1667d;
        f17680e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17678c;
    }

    @Override // a7.g
    public final String c() {
        return f17677b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17679d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17680e;
    }
}
