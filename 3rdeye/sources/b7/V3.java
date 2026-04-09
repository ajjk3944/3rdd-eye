package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToNumber.kt */
/* loaded from: classes.dex */
public final class V3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final V3 f17584a = new V3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17585b = "toNumber";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17586c = E.u.G(new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17587d = EnumC1667d.NUMBER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17588e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws NumberFormatException {
        String str = f17585b;
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.String");
        try {
            double d10 = Double.parseDouble((String) objP0);
            if (d10 != Double.POSITIVE_INFINITY && d10 != Double.NEGATIVE_INFINITY) {
                return Double.valueOf(d10);
            }
            C1666c.d(str, list, "Unable to convert value to Number.", null);
            throw null;
        } catch (NumberFormatException e4) {
            C1666c.d(str, list, "Unable to convert value to Number.", e4);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17586c;
    }

    @Override // a7.g
    public final String c() {
        return f17585b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17587d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17588e;
    }
}
