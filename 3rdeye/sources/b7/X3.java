package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4280c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* compiled from: ToUrl.kt */
/* loaded from: classes.dex */
public final class X3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final X3 f17615a = new X3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17616b = "toUrl";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17617c = E.u.G(new a7.j(EnumC1667d.STRING, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17618d = EnumC1667d.URL;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17619e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.String");
        String str = (String) objP0;
        try {
            try {
                new URL(str);
                return new C4280c(str);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str));
            }
        } catch (IllegalArgumentException e4) {
            C1666c.d(f17616b, list, "Unable to convert value to Url.", e4);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17617c;
    }

    @Override // a7.g
    public final String c() {
        return f17616b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17618d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17619e;
    }
}
