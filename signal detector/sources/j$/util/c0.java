package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class c0 implements K {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f20703a;

    /* renamed from: b, reason: collision with root package name */
    public int f20704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20705c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20706d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    public c0(long[] jArr, int i, int i3, int i6) {
        this.f20703a = jArr;
        this.f20704b = i;
        this.f20705c = i3;
        this.f20706d = i6 | 16448;
    }

    @Override // j$.util.Spliterator
    public final K trySplit() {
        int i = this.f20704b;
        int i3 = (this.f20705c + i) >>> 1;
        if (i >= i3) {
            return null;
        }
        this.f20704b = i3;
        return new c0(this.f20703a, i, i3, this.f20706d);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        longConsumer.getClass();
        long[] jArr = this.f20703a;
        int length = jArr.length;
        int i3 = this.f20705c;
        if (length < i3 || (i = this.f20704b) < 0) {
            return;
        }
        this.f20704b = i3;
        if (i < i3) {
            do {
                longConsumer.accept(jArr[i]);
                i++;
            } while (i < i3);
        }
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i = this.f20704b;
        if (i < 0 || i >= this.f20705c) {
            return false;
        }
        this.f20704b = i + 1;
        longConsumer.accept(this.f20703a[i]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f20705c - this.f20704b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f20706d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2383c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
