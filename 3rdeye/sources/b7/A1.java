package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.EnumC1667d;
import d7.C4279b;
import java.util.List;
import t4.C5606d;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes.dex */
public final class A1 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final A1 f17200a = new A1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17201b = "getDayOfWeek";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17202c = E.u.G(new a7.j(EnumC1667d.DATETIME, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17203d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17204e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        int i = C5606d.G((C4279b) obj).get(7) - 1;
        return Long.valueOf(i == 0 ? 7L : i);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17202c;
    }

    @Override // a7.g
    public final String c() {
        return f17201b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17203d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17204e;
    }
}
