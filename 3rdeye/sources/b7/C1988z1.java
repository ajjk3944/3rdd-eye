package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.EnumC1667d;
import d7.C4279b;
import java.util.List;
import t4.C5606d;

/* compiled from: DateTimeFunctions.kt */
/* renamed from: b7.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988z1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1988z1 f18061a = new C1988z1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f18062b = "getDay";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f18063c = E.u.G(new a7.j(EnumC1667d.DATETIME, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f18064d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18065e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        kotlin.jvm.internal.l.d(list.get(0), "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        return Long.valueOf(C5606d.G((C4279b) r1).get(5));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f18063c;
    }

    @Override // a7.g
    public final String c() {
        return f18062b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f18064d;
    }

    @Override // a7.g
    public final boolean f() {
        return f18065e;
    }
}
