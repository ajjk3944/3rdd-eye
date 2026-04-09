package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import java.util.List;

/* compiled from: ToBoolean.kt */
/* loaded from: classes.dex */
public final class S3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final S3 f17533a = new S3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17534b = "toBoolean";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17535c = E.u.G(new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17536d = EnumC1667d.BOOLEAN;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17537e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        boolean z10;
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.String");
        String str = (String) objP0;
        if (str.equals("true")) {
            z10 = true;
        } else {
            if (!str.equals("false")) {
                C1666c.d(f17534b, list, "Unable to convert value to Boolean.", null);
                throw null;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17535c;
    }

    @Override // a7.g
    public final String c() {
        return f17534b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17536d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17537e;
    }
}
