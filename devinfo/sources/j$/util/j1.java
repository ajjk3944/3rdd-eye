package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class j1 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f26420a;

    /* renamed from: b, reason: collision with root package name */
    public int f26421b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26422c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26423d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.a(this, consumer);
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
        return c.f(this, consumer);
    }

    public j1(double[] dArr, int i4, int i10, int i11) {
        this.f26420a = dArr;
        this.f26421b = i4;
        this.f26422c = i10;
        this.f26423d = i11 | 16448;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final u0 trySplit() {
        int i4 = this.f26421b;
        int i10 = (this.f26422c + i4) >>> 1;
        if (i4 >= i10) {
            return null;
        }
        this.f26421b = i10;
        return new j1(this.f26420a, i4, i10, this.f26423d);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i4;
        doubleConsumer.getClass();
        double[] dArr = this.f26420a;
        int length = dArr.length;
        int i10 = this.f26422c;
        if (length < i10 || (i4 = this.f26421b) < 0) {
            return;
        }
        this.f26421b = i10;
        if (i4 < i10) {
            do {
                doubleConsumer.accept(dArr[i4]);
                i4++;
            } while (i4 < i10);
        }
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i4 = this.f26421b;
        if (i4 < 0 || i4 >= this.f26422c) {
            return false;
        }
        this.f26421b = i4 + 1;
        doubleConsumer.accept(this.f26420a[i4]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26422c - this.f26421b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26423d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
