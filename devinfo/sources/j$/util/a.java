package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f26283a;

    /* renamed from: b, reason: collision with root package name */
    public int f26284b;

    /* renamed from: c, reason: collision with root package name */
    public int f26285c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    public a(java.util.List list) {
        this.f26283a = list;
        this.f26284b = 0;
        this.f26285c = -1;
    }

    public a(a aVar, int i4, int i10) {
        this.f26283a = aVar.f26283a;
        this.f26284b = i4;
        this.f26285c = i10;
    }

    public final int a() {
        java.util.List list = this.f26283a;
        int i4 = this.f26285c;
        if (i4 >= 0) {
            return i4;
        }
        int size = list.size();
        this.f26285c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i4 = this.f26284b;
        int i10 = (iA + i4) >>> 1;
        if (i4 >= i10) {
            return null;
        }
        this.f26284b = i10;
        return new a(this, i4, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i4 = this.f26284b;
        if (i4 >= iA) {
            return false;
        }
        this.f26284b = i4 + 1;
        try {
            consumer.accept(this.f26283a.get(i4));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.f26283a;
        int iA = a();
        this.f26284b = iA;
        for (int i4 = this.f26284b; i4 < iA; i4++) {
            try {
                consumer.accept(list.get(i4));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f26284b;
    }
}
