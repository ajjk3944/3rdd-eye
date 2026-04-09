package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToBoolean.kt */
/* renamed from: b7.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1936o3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1936o3 f17918a = new C1936o3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17919b = "toBoolean";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17920c = E.u.G(new a7.j(EnumC1667d.INTEGER, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17921d = EnumC1667d.BOOLEAN;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17922e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        boolean z10;
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objP0).longValue();
        if (jLongValue == 0) {
            z10 = false;
        } else {
            if (jLongValue != 1) {
                C1666c.d(f17919b, list, "Unable to convert value to Boolean.", null);
                throw null;
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17920c;
    }

    @Override // a7.g
    public final String c() {
        return f17919b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17921d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17922e;
    }
}
