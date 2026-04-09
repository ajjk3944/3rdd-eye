package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4278a;
import java.util.List;

/* compiled from: ToColor.kt */
/* loaded from: classes.dex */
public final class T3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final T3 f17548a = new T3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17549b = "toColor";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17550c = E.u.G(new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17551d = EnumC1667d.COLOR;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17552e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.String");
        try {
            return new C4278a(C4278a.C0440a.a((String) objP0));
        } catch (IllegalArgumentException e4) {
            C1666c.d(f17549b, list, "Unable to convert value to Color, expected format #AARRGGBB.", e4);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17550c;
    }

    @Override // a7.g
    public final String c() {
        return f17549b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17551d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17552e;
    }
}
