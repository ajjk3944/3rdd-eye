package b7;

import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c7.e;
import java.util.Iterator;
import java.util.List;

/* compiled from: IntegerArithmeticFunctions.kt */
/* renamed from: b7.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931n3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1931n3 f17905a = new C1931n3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17906b = "sum";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17907c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17908d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17909e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17907c = E.u.G(new a7.j(enumC1667d, true));
        f17908d = enumC1667d;
        f17909e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Long l5 = 0L;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objB = C1668e.a.b(e.c.a.f.b.f18533a, Long.valueOf(l5.longValue()), it.next());
            kotlin.jvm.internal.l.d(objB, "null cannot be cast to non-null type kotlin.Long");
            l5 = (Long) objB;
        }
        return l5;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17907c;
    }

    @Override // a7.g
    public final String c() {
        return f17906b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17908d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17909e;
    }
}
