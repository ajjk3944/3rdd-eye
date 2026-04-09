package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.v3;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class o0 implements a0 {
    public final boolean B;
    public final boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final long f11709d;

    /* renamed from: g, reason: collision with root package name */
    public ih.f f11710g;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f11708a = new AtomicLong(0);

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.e f11711r = new io.sentry.util.e(new d5.v(29));

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.util.a f11712x = new io.sentry.util.a();

    /* renamed from: y, reason: collision with root package name */
    public final v3 f11713y = v3.f12830a;
    public final io.sentry.transport.d E = io.sentry.transport.d.f12759a;

    public o0(long j, boolean z10, boolean z11) {
        this.f11709d = j;
        this.B = z10;
        this.D = z11;
    }

    public final void a(String str) {
        if (this.D) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.f12204x = "navigation";
            eVar.b(str, "state");
            eVar.B = "app.lifecycle";
            eVar.E = b5.INFO;
            this.f11713y.m(eVar);
        }
    }

    @Override // io.sentry.android.core.a0
    public final void b() {
        c();
        this.E.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bf.a aVar = new bf.a(26, this);
        v3 v3Var = this.f11713y;
        v3Var.r(aVar);
        AtomicLong atomicLong = this.f11708a;
        long j = atomicLong.get();
        if (j == 0 || j + this.f11709d <= jCurrentTimeMillis) {
            if (this.B) {
                v3Var.p();
            }
            v3Var.k().getReplayController().y();
        }
        v3Var.k().getReplayController().h();
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    public final void c() {
        io.sentry.q qVarA = this.f11712x.a();
        try {
            ih.f fVar = this.f11710g;
            if (fVar != null) {
                fVar.cancel();
                this.f11710g = null;
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.a0
    public final void f() {
        this.E.getClass();
        this.f11708a.set(System.currentTimeMillis());
        this.f11713y.k().getReplayController().pause();
        io.sentry.q qVarA = this.f11712x.a();
        try {
            c();
            this.f11710g = new ih.f(2, this);
            ((Timer) this.f11711r.a()).schedule(this.f11710g, this.f11709d);
            qVarA.close();
            a("background");
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
