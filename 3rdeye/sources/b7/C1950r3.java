package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2099t;
import d7.C4279b;
import java.util.List;
import java.util.TimeZone;

/* compiled from: DateTimeFunctions.kt */
/* renamed from: b7.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950r3 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1950r3 f17961a = new C1950r3();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17962b = "nowLocal";

    /* renamed from: c, reason: collision with root package name */
    public static final C2099t f17963c = C2099t.f18581b;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17964d = EnumC1667d.DATETIME;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.l.e(timeZone, "getDefault()");
        return new C4279b(jCurrentTimeMillis, timeZone);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17963c;
    }

    @Override // a7.g
    public final String c() {
        return f17962b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17964d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
