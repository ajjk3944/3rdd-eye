package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fk3 {
    public final pg3 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c = -1;
    public long d = -1;
    public Throwable e = null;
    public final int f;

    public fk3(int i, pg3 pg3Var) {
        this.f = i;
        this.a = pg3Var;
    }

    public final void a() {
        if (this.b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.d = SystemClock.uptimeMillis();
        ((wg3) this.a).b(this.f - 1, atomicBoolean.get() ? this.d - this.c : -1L, this.e, null);
    }
}
