package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.EnumC1667d;
import d7.C4279b;
import java.util.List;
import t4.C5606d;

/* compiled from: DateTimeFunctions.kt */
/* renamed from: b7.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895g2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1895g2 f17787a = new C1895g2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17788b = "getMinutes";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17789c = E.u.G(new a7.j(EnumC1667d.DATETIME, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17790d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17791e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        kotlin.jvm.internal.l.d(list.get(0), "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        return Long.valueOf(C5606d.G((C4279b) r1).get(12));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17789c;
    }

    @Override // a7.g
    public final String c() {
        return f17788b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17790d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17791e;
    }
}
