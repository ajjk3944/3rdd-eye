package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4279b;
import java.util.List;

/* compiled from: DateTimeFunctions.kt */
/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862a extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1862a f17658a = new C1862a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17659b = "addMillis";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17660c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17661d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f17662e;

    static {
        EnumC1667d enumC1667d = EnumC1667d.DATETIME;
        f17660c = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.INTEGER, false));
        f17661d = enumC1667d;
        f17662e = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        C4279b c4279b = (C4279b) obj;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        return new C4279b(c4279b.f37528b + ((Long) obj2).longValue(), c4279b.f37529c);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17660c;
    }

    @Override // a7.g
    public final String c() {
        return f17659b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17661d;
    }

    @Override // a7.g
    public final boolean f() {
        return f17662e;
    }
}
