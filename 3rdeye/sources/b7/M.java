package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class M extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final M f17403a = new M();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17404b = "argb";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17405c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17406d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17407e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        f17405c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(enumC1667d, false), new a7.j(enumC1667d, false), new a7.j(enumC1667d, false));
        f17406d = EnumC1667d.COLOR;
        f17407e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        try {
            Object obj = list.get(0);
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Double");
            int iA = T.a(((Double) obj).doubleValue());
            Object obj2 = list.get(1);
            kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Double");
            int iA2 = T.a(((Double) obj2).doubleValue());
            Object obj3 = list.get(2);
            kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.Double");
            int iA3 = T.a(((Double) obj3).doubleValue());
            Object obj4 = list.get(3);
            kotlin.jvm.internal.l.d(obj4, "null cannot be cast to non-null type kotlin.Double");
            return new C4278a(T.a(((Double) obj4).doubleValue()) | (iA << 24) | (iA2 << 16) | (iA3 << 8));
        } catch (IllegalArgumentException unused) {
            C1666c.d(f17404b, list, "Value out of range 0..1.", null);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17405c;
    }

    @Override // a7.g
    public final String c() {
        return f17404b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17406d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17407e;
    }
}
