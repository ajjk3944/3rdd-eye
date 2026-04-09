package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class E3 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f20852a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20853b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20854c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20855d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f20856e;

    public abstract Spliterator b(Spliterator spliterator);

    public E3(Spliterator spliterator, long j6, long j7) {
        this.f20852a = spliterator;
        this.f20853b = j7 < 0;
        this.f20855d = j7 >= 0 ? j7 : 0L;
        this.f20854c = 128;
        this.f20856e = new AtomicLong(j7 >= 0 ? j6 + j7 : j6);
    }

    public E3(Spliterator spliterator, E3 e32) {
        this.f20852a = spliterator;
        this.f20853b = e32.f20853b;
        this.f20856e = e32.f20856e;
        this.f20855d = e32.f20855d;
        this.f20854c = e32.f20854c;
    }

    public final long a(long j6) {
        long j7;
        boolean z6;
        long jMin;
        do {
            j7 = this.f20856e.get();
            z6 = this.f20853b;
            if (j7 != 0) {
                jMin = Math.min(j7, j6);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z6) {
                    return j6;
                }
                return 0L;
            }
        } while (!this.f20856e.compareAndSet(j7, j7 - jMin));
        if (z6) {
            return Math.max(j6 - jMin, 0L);
        }
        long j8 = this.f20855d;
        return j7 > j8 ? Math.max(jMin - (j7 - j8), 0L) : jMin;
    }

    public final D3 f() {
        if (this.f20856e.get() > 0) {
            return D3.MAYBE_MORE;
        }
        return this.f20853b ? D3.UNLIMITED : D3.NO_MORE;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m18trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f20856e.get() == 0 || (spliteratorTrySplit = this.f20852a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f20852a.estimateSize();
    }

    public final int characteristics() {
        return this.f20852a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m16trySplit() {
        return (j$.util.N) m18trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.OfInt m17trySplit() {
        return (Spliterator.OfInt) m18trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m15trySplit() {
        return (j$.util.K) m18trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) m18trySplit();
    }
}
