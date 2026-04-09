package b7;

import a7.AbstractC1664a;
import a7.C1665b;
import a7.EnumC1667d;
import d7.C4279b;
import java.util.List;
import t4.C5606d;

/* compiled from: DateTimeFunctions.kt */
/* renamed from: b7.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871b3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1871b3 f17690a = new C1871b3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17691b = "getYear";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17692c = E.u.G(new a7.j(EnumC1667d.DATETIME, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17693d = EnumC1667d.INTEGER;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17694e = true;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws C1665b {
        kotlin.jvm.internal.l.d(list.get(0), "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        return Long.valueOf(C5606d.G((C4279b) r1).get(1));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17692c;
    }

    @Override // a7.g
    public final String c() {
        return f17691b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17693d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17694e;
    }
}
