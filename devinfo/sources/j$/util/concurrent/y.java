package j$.util.concurrent;

import j$.util.z0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class y implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public long f26358a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26359b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26360c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26361d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public y(long j, long j8, long j9, long j10) {
        this.f26358a = j;
        this.f26359b = j8;
        this.f26360c = j9;
        this.f26361d = j10;
    }

    @Override // j$.util.z0, j$.util.c1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j = this.f26358a;
        long j8 = (this.f26359b + j) >>> 1;
        if (j8 <= j) {
            return null;
        }
        this.f26358a = j8;
        return new y(j, j8, this.f26360c, this.f26361d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26359b - this.f26358a;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f26358a;
        if (j >= this.f26359b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.f26360c, this.f26361d));
        this.f26358a = j + 1;
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f26358a;
        long j8 = this.f26359b;
        if (j < j8) {
            this.f26358a = j8;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.c(this.f26360c, this.f26361d));
                j++;
            } while (j < j8);
        }
    }
}
