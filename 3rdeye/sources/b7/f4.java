package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4280c;
import java.util.List;

/* compiled from: ToString.kt */
/* loaded from: classes.dex */
public final class f4 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final f4 f17776a = new f4();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17777b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17778c = E.u.G(new a7.j(EnumC1667d.URL, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17779d = EnumC1667d.STRING;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17780e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        return ((C4280c) objP0).f37533a;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17778c;
    }

    @Override // a7.g
    public final String c() {
        return f17777b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17779d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17780e;
    }
}
