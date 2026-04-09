package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class o1 implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f26433a;

    /* renamed from: b, reason: collision with root package name */
    public int f26434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26436d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.b(this, consumer);
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
        return c.g(this, consumer);
    }

    public o1(int[] iArr, int i4, int i10, int i11) {
        this.f26433a = iArr;
        this.f26434b = i4;
        this.f26435c = i10;
        this.f26436d = i11 | 16448;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i4 = this.f26434b;
        int i10 = (this.f26435c + i4) >>> 1;
        if (i4 >= i10) {
            return null;
        }
        this.f26434b = i10;
        return new o1(this.f26433a, i4, i10, this.f26436d);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i4;
        intConsumer.getClass();
        int[] iArr = this.f26433a;
        int length = iArr.length;
        int i10 = this.f26435c;
        if (length < i10 || (i4 = this.f26434b) < 0) {
            return;
        }
        this.f26434b = i10;
        if (i4 < i10) {
            do {
                intConsumer.accept(iArr[i4]);
                i4++;
            } while (i4 < i10);
        }
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i4 = this.f26434b;
        if (i4 < 0 || i4 >= this.f26435c) {
            return false;
        }
        this.f26434b = i4 + 1;
        intConsumer.accept(this.f26433a[i4]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f26435c - this.f26434b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f26436d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
