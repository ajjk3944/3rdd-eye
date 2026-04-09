package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class c8 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f26535a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26537c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26538d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f26539e;

    public abstract Spliterator b(Spliterator spliterator);

    public c8(Spliterator spliterator, long j, long j8) {
        this.f26535a = spliterator;
        this.f26536b = j8 < 0;
        this.f26538d = j8 >= 0 ? j8 : 0L;
        this.f26537c = 128;
        this.f26539e = new AtomicLong(j8 >= 0 ? j + j8 : j);
    }

    public c8(Spliterator spliterator, c8 c8Var) {
        this.f26535a = spliterator;
        this.f26536b = c8Var.f26536b;
        this.f26539e = c8Var.f26539e;
        this.f26538d = c8Var.f26538d;
        this.f26537c = c8Var.f26537c;
    }

    public final long a(long j) {
        long j8;
        boolean z3;
        long jMin;
        do {
            j8 = this.f26539e.get();
            z3 = this.f26536b;
            if (j8 != 0) {
                jMin = Math.min(j8, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z3) {
                    return j;
                }
                return 0L;
            }
        } while (!this.f26539e.compareAndSet(j8, j8 - jMin));
        if (z3) {
            return Math.max(j - jMin, 0L);
        }
        long j9 = this.f26538d;
        return j8 > j9 ? Math.max(jMin - (j8 - j9), 0L) : jMin;
    }

    public final b8 f() {
        if (this.f26539e.get() > 0) {
            return b8.MAYBE_MORE;
        }
        return this.f26536b ? b8.UNLIMITED : b8.NO_MORE;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m175trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f26539e.get() == 0 || (spliteratorTrySplit = this.f26535a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f26535a.estimateSize();
    }

    public final int characteristics() {
        return this.f26535a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c1 m176trySplit() {
        return (j$.util.c1) m175trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m175trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z0 m178trySplit() {
        return (j$.util.z0) m175trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.u0 m177trySplit() {
        return (j$.util.u0) m175trySplit();
    }
}
