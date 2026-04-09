package cv;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public h0 f6725e;

    public o(h0 h0Var) {
        br.l.e(h0Var, "delegate");
        this.f6725e = h0Var;
    }

    @Override // cv.h0
    public final h0 a() {
        return this.f6725e.a();
    }

    @Override // cv.h0
    public final h0 b() {
        return this.f6725e.b();
    }

    @Override // cv.h0
    public final long c() {
        return this.f6725e.c();
    }

    @Override // cv.h0
    public final h0 d(long j) {
        return this.f6725e.d(j);
    }

    @Override // cv.h0
    public final boolean e() {
        return this.f6725e.e();
    }

    @Override // cv.h0
    public final void f() throws InterruptedIOException {
        this.f6725e.f();
    }

    @Override // cv.h0
    public final h0 g(long j) {
        br.l.e(TimeUnit.MILLISECONDS, "unit");
        return this.f6725e.g(j);
    }
}
