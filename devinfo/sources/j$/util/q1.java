package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class q1 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f26445a;

    /* renamed from: b, reason: collision with root package name */
    public int f26446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26447c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26448d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return c.e(this, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return c.h(this, consumer);
    }

    public q1(long[] jArr, int i4, int i10, int i11) {
        this.f26445a = jArr;
        this.f26446b = i4;
        this.f26447c = i10;
        this.f26448d = i11 | 16448;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final z0 trySplit() {
        int i4 = this.f26446b;
        int i10 = (this.f26447c + i4) >>> 1;
        if (i4 >= i10) {
            return null;
        }
        this.f26446b = i10;
        return new q1(this.f26445a, i4, i10, this.f26448d);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i4;
        longConsumer.getClass();
        long[] jArr = this.f26445a;
        int length = jArr.length;
        int i10 = this.f26447c;
        if (length < i10 || (i4 = this.f26446b) < 0) {
            return;
        }
        this.f26446b = i10;
        if (i4 < i10) {
            do {
                longConsumer.accept(jArr[i4]);
                i4++;
            } while (i4 < i10);
        }
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i4 = this.f26446b;
        if (i4 < 0 || i4 >= this.f26447c) {
            return false;
        }
        this.f26446b = i4 + 1;
        longConsumer.accept(this.f26445a[i4]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26447c - this.f26446b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26448d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
