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
public final class C3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C3 f17236a = new C3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17237b = "setDay";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17238c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17239d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17240e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.DATETIME;
        f17238c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.INTEGER, false));
        f17239d = enumC1667d;
        f17240e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        C4279b c4279b = (C4279b) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Calendar calendarG = C5606d.G(c4279b);
        int actualMaximum = calendarG.getActualMaximum(5);
        if (1 <= jLongValue && jLongValue <= actualMaximum) {
            calendarG.set(5, (int) jLongValue);
        } else {
            if (jLongValue != -1) {
                C1666c.d(f17237b, list, "Unable to set day " + jLongValue + " for date " + c4279b + '.', null);
                throw null;
            }
            calendarG.set(5, 0);
        }
        return new C4279b(calendarG.getTimeInMillis(), c4279b.f37529c);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17238c;
    }

    @Override // a7.g
    public final String c() {
        return f17237b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17239d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17240e;
    }
}
