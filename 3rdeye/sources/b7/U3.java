package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToInteger.kt */
/* loaded from: classes.dex */
public final class U3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final U3 f17565a = new U3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17566b = "toInteger";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17567c = E.u.G(new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17568d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17569e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.String");
        try {
            return Long.valueOf(Long.parseLong((String) objP0));
        } catch (NumberFormatException e4) {
            C1666c.d(f17566b, list, "Unable to convert value to Integer.", e4);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17567c;
    }

    @Override // a7.g
    public final String c() {
        return f17566b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17568d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17569e;
    }
}
