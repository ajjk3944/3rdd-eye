package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToInteger.kt */
/* renamed from: b7.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955s3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1955s3 f17975a = new C1955s3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17976b = "toInteger";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17977c = E.u.G(new a7.j(EnumC1667d.NUMBER, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17978d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17979e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) objP0).doubleValue();
        if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
            return Long.valueOf((long) dDoubleValue);
        }
        C1666c.d(f17976b, list, "Unable to convert value to Integer.", null);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17977c;
    }

    @Override // a7.g
    public final String c() {
        return f17976b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17978d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17979e;
    }
}
