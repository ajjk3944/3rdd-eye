package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: IntervalFunctions.kt */
/* renamed from: b7.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875c2 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1875c2 f17704a = new C1875c2();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17705b = "getIntervalTotalMinutes";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17706c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17707d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17708e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        f17706c = E.u.G(new a7.j(enumC1667d, false));
        f17707d = enumC1667d;
        f17708e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj).longValue();
        if (jLongValue >= 0) {
            return Long.valueOf((jLongValue / 1000) / 60);
        }
        throw new C1665b(null, "Failed to evaluate [getIntervalTotalMinutes(-1)]. Expecting non-negative number of milliseconds.");
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17706c;
    }

    @Override // a7.g
    public final String c() {
        return f17705b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17707d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17708e;
    }
}
