package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2517x3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21194a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21195b;

    /* renamed from: c, reason: collision with root package name */
    public Spliterator f21196c;

    /* renamed from: d, reason: collision with root package name */
    public long f21197d;

    /* renamed from: e, reason: collision with root package name */
    public long f21198e;

    public abstract Spliterator a(Spliterator spliterator, long j6, long j7, long j8, long j9);

    public AbstractC2517x3(Spliterator spliterator, long j6, long j7, long j8, long j9) {
        this.f21196c = spliterator;
        this.f21194a = j6;
        this.f21195b = j7;
        this.f21197d = j8;
        this.f21198e = j9;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m22trySplit() {
        long j6 = this.f21198e;
        if (this.f21194a >= j6 || this.f21197d >= j6) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f21196c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f21197d;
            long jMin = Math.min(jEstimateSize, this.f21195b);
            long j7 = this.f21194a;
            if (j7 >= jMin) {
                this.f21197d = jMin;
            } else {
                long j8 = this.f21195b;
                if (jMin >= j8) {
                    this.f21196c = spliteratorTrySplit;
                    this.f21198e = jMin;
                } else {
                    long j9 = this.f21197d;
                    if (j9 >= j7 && jEstimateSize <= j8) {
                        this.f21197d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f21197d = jMin;
                    return a(spliteratorTrySplit, j7, j8, j9, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j6 = this.f21198e;
        long j7 = this.f21194a;
        if (j7 < j6) {
            return j6 - Math.max(j7, this.f21197d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f21196c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m20trySplit() {
        return (j$.util.N) m22trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.OfInt m21trySplit() {
        return (Spliterator.OfInt) m22trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m19trySplit() {
        return (j$.util.K) m22trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) m22trySplit();
    }
}
