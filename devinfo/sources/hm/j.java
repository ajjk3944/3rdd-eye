package hm;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f25180e;

    public j(y yVar) {
        nk.k.e(yVar, "delegate");
        this.f25180e = yVar;
    }

    @Override // hm.y
    public final y a() {
        return this.f25180e.a();
    }

    @Override // hm.y
    public final y b() {
        return this.f25180e.b();
    }

    @Override // hm.y
    public final long c() {
        return this.f25180e.c();
    }

    @Override // hm.y
    public final y d(long j) {
        return this.f25180e.d(j);
    }

    @Override // hm.y
    public final boolean e() {
        return this.f25180e.e();
    }

    @Override // hm.y
    public final void f() throws InterruptedIOException {
        this.f25180e.f();
    }

    @Override // hm.y
    public final y g(long j) {
        nk.k.e(TimeUnit.MILLISECONDS, "unit");
        return this.f25180e.g(j);
    }
}
