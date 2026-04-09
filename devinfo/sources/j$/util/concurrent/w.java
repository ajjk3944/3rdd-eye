package j$.util.concurrent;

import j$.util.u0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public long f26350a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26351b;

    /* renamed from: c, reason: collision with root package name */
    public final double f26352c;

    /* renamed from: d, reason: collision with root package name */
    public final double f26353d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
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
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j, long j8, double d10, double d11) {
        this.f26350a = j;
        this.f26351b = j8;
        this.f26352c = d10;
        this.f26353d = d11;
    }

    @Override // j$.util.u0, j$.util.c1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w trySplit() {
        long j = this.f26350a;
        long j8 = (this.f26351b + j) >>> 1;
        if (j8 <= j) {
            return null;
        }
        this.f26350a = j8;
        return new w(j, j8, this.f26352c, this.f26353d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26351b - this.f26350a;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f26350a;
        if (j >= this.f26351b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f26352c, this.f26353d));
        this.f26350a = j + 1;
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f26350a;
        long j8 = this.f26351b;
        if (j < j8) {
            this.f26350a = j8;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.f26352c, this.f26353d));
                j++;
            } while (j < j8);
        }
    }
}
