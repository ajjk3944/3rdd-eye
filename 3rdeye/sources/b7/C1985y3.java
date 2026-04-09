package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4279b;
import java.util.List;
import java.util.TimeZone;

/* compiled from: DateTimeFunctions.kt */
/* renamed from: b7.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985y3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1985y3 f18054a = new C1985y3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18055b = "parseUnixTime";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18056c = E.u.G(new a7.j(EnumC1667d.INTEGER, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18057d = EnumC1667d.DATETIME;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18058e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objP0).longValue() * 1000;
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        kotlin.jvm.internal.l.e(timeZone, "getTimeZone(\"UTC\")");
        return new C4279b(jLongValue, timeZone);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18056c;
    }

    @Override // a7.g
    public final String c() {
        return f18055b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18057d;
    }

    @Override // a7.g
    public final boolean f() {
        return f18058e;
    }
}
