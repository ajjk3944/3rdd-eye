package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4279b;
import java.util.Calendar;
import java.util.List;
import t4.C5606d;

/* compiled from: DateTimeFunctions.kt */
/* loaded from: classes.dex */
public final class G3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final G3 f17304a = new G3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17305b = "setMonth";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17306c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17307d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17308e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.DATETIME;
        f17306c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.INTEGER, false));
        f17307d = enumC1667d;
        f17308e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        C4279b c4279b = (C4279b) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        if (jLongValue <= 12 && jLongValue >= 1) {
            Calendar calendarG = C5606d.G(c4279b);
            calendarG.set(2, (int) (jLongValue - 1));
            return new C4279b(calendarG.getTimeInMillis(), c4279b.f37529c);
        }
        C1666c.d(f17305b, list, "Expecting month in [1..12], instead got " + jLongValue + '.', null);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17306c;
    }

    @Override // a7.g
    public final String c() {
        return f17305b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17307d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17308e;
    }
}
