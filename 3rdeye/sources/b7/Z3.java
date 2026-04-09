package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import java.util.Locale;

/* compiled from: StringFunctions.kt */
/* loaded from: classes.dex */
public final class Z3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Z3 f17653a = new Z3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17654b = "toLowerCase";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17655c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17656d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17657e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        f17655c = E.u.G(new a7.j(enumC1667d, false));
        f17656d = enumC1667d;
        f17657e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17655c;
    }

    @Override // a7.g
    public final String c() {
        return f17654b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17656d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17657e;
    }
}
