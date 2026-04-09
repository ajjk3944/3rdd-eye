package z0;

import Y0.y;
import Y0.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import z0.C8705c;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8706d {

    /* renamed from: a, reason: collision with root package name */
    private final C8705c.a f67046a;

    /* renamed from: b, reason: collision with root package name */
    private final C8705c f67047b;

    /* renamed from: c, reason: collision with root package name */
    private final C8705c f67048c;

    /* renamed from: d, reason: collision with root package name */
    private long f67049d;

    /* renamed from: e, reason: collision with root package name */
    private long f67050e;

    public C8706d() {
        C8705c.a aVar = e.h() ? C8705c.a.Impulse : C8705c.a.Lsq2;
        this.f67046a = aVar;
        boolean z10 = false;
        int i10 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f67047b = new C8705c(z10, aVar, i10, defaultConstructorMarker);
        this.f67048c = new C8705c(z10, aVar, i10, defaultConstructorMarker);
        this.f67049d = C6531g.f52335b.c();
    }

    public final void a(long j10, long j11) {
        this.f67047b.a(j10, C6531g.m(j11));
        this.f67048c.a(j10, C6531g.n(j11));
    }

    public final long b(long j10) {
        if (!(y.h(j10) > 0.0f && y.i(j10) > 0.0f)) {
            B0.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(j10)));
        }
        return z.a(this.f67047b.d(y.h(j10)), this.f67048c.d(y.i(j10)));
    }

    public final long c() {
        return this.f67049d;
    }

    public final long d() {
        return this.f67050e;
    }

    public final void e() {
        this.f67047b.e();
        this.f67048c.e();
        this.f67050e = 0L;
    }

    public final void f(long j10) {
        this.f67049d = j10;
    }

    public final void g(long j10) {
        this.f67050e = j10;
    }
}
