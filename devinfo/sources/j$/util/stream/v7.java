package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class v7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26787a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26788b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f26789c;

    /* renamed from: d, reason: collision with root package name */
    public long f26790d;

    /* renamed from: e, reason: collision with root package name */
    public long f26791e;

    public abstract Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10);

    public v7(Spliterator spliterator, long j, long j8, long j9, long j10) {
        this.f26789c = spliterator;
        this.f26787a = j;
        this.f26788b = j8;
        this.f26790d = j9;
        this.f26791e = j10;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m179trySplit() {
        long j = this.f26791e;
        if (this.f26787a >= j || this.f26790d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f26789c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f26790d;
            long jMin = Math.min(jEstimateSize, this.f26788b);
            long j8 = this.f26787a;
            if (j8 >= jMin) {
                this.f26790d = jMin;
            } else {
                long j9 = this.f26788b;
                if (jMin >= j9) {
                    this.f26789c = spliteratorTrySplit;
                    this.f26791e = jMin;
                } else {
                    long j10 = this.f26790d;
                    if (j10 >= j8 && jEstimateSize <= j9) {
                        this.f26790d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f26790d = jMin;
                    return a(spliteratorTrySplit, j8, j9, j10, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.f26791e;
        long j8 = this.f26787a;
        if (j8 < j) {
            return j - Math.max(j8, this.f26790d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f26789c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c1 m180trySplit() {
        return (j$.util.c1) m179trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m179trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z0 m182trySplit() {
        return (j$.util.z0) m179trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.u0 m181trySplit() {
        return (j$.util.u0) m179trySplit();
    }
}
