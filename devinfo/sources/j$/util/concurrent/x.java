package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class x implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public long f26354a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26356c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26357d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
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
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public x(long j, long j8, int i4, int i10) {
        this.f26354a = j;
        this.f26355b = j8;
        this.f26356c = i4;
        this.f26357d = i10;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j = this.f26354a;
        long j8 = (this.f26355b + j) >>> 1;
        if (j8 <= j) {
            return null;
        }
        this.f26354a = j8;
        return new x(j, j8, this.f26356c, this.f26357d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26355b - this.f26354a;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f26354a;
        if (j >= this.f26355b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f26356c, this.f26357d));
        this.f26354a = j + 1;
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f26354a;
        long j8 = this.f26355b;
        if (j < j8) {
            this.f26354a = j8;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.b(this.f26356c, this.f26357d));
                j++;
            } while (j < j8);
        }
    }
}
