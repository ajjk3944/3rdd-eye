package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class X2 implements j$.util.N {

    /* renamed from: a, reason: collision with root package name */
    public int f20980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20981b;

    /* renamed from: c, reason: collision with root package name */
    public int f20982c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20983d;

    /* renamed from: e, reason: collision with root package name */
    public Object f20984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2 f20985f;

    public abstract void a(int i, Object obj, Object obj2);

    public abstract j$.util.N b(Object obj, int i, int i3);

    public abstract j$.util.N c(int i, int i3, int i6, int i7);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public X2(Y2 y22, int i, int i3, int i6, int i7) {
        this.f20985f = y22;
        this.f20980a = i;
        this.f20981b = i3;
        this.f20982c = i6;
        this.f20983d = i7;
        Object[] objArr = y22.f20988f;
        this.f20984e = objArr == null ? y22.f20987e : objArr[i];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f20980a;
        int i3 = this.f20983d;
        int i6 = this.f20981b;
        if (i == i6) {
            return i3 - this.f20982c;
        }
        long[] jArr = this.f20985f.f21053d;
        return ((jArr[i6] + i3) - jArr[i]) - this.f20982c;
    }

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.f20980a;
        int i3 = this.f20981b;
        if (i >= i3 && (i != i3 || this.f20982c >= this.f20983d)) {
            return false;
        }
        Object obj2 = this.f20984e;
        int i6 = this.f20982c;
        this.f20982c = i6 + 1;
        a(i6, obj2, obj);
        int i7 = this.f20982c;
        Object obj3 = this.f20984e;
        Y2 y22 = this.f20985f;
        if (i7 == y22.r(obj3)) {
            this.f20982c = 0;
            int i8 = this.f20980a + 1;
            this.f20980a = i8;
            Object[] objArr = y22.f20988f;
            if (objArr != null && i8 <= i3) {
                this.f20984e = objArr[i8];
            }
        }
        return true;
    }

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Y2 y22;
        Objects.requireNonNull(obj);
        int i = this.f20980a;
        int i3 = this.f20983d;
        int i6 = this.f20981b;
        if (i < i6 || (i == i6 && this.f20982c < i3)) {
            int i7 = this.f20982c;
            while (true) {
                y22 = this.f20985f;
                if (i >= i6) {
                    break;
                }
                Object obj2 = y22.f20988f[i];
                y22.q(obj2, i7, y22.r(obj2), obj);
                i++;
                i7 = 0;
            }
            y22.q(this.f20980a == i6 ? this.f20984e : y22.f20988f[i6], i7, i3, obj);
            this.f20980a = i6;
            this.f20982c = i3;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.N trySplit() {
        int i = this.f20980a;
        int i3 = this.f20981b;
        if (i < i3) {
            int i6 = i3 - 1;
            int i7 = this.f20982c;
            Y2 y22 = this.f20985f;
            j$.util.N nC = c(i, i6, i7, y22.r(y22.f20988f[i6]));
            this.f20980a = i3;
            this.f20982c = 0;
            this.f20984e = y22.f20988f[i3];
            return nC;
        }
        if (i != i3) {
            return null;
        }
        int i8 = this.f20982c;
        int i9 = (this.f20983d - i8) / 2;
        if (i9 == 0) {
            return null;
        }
        j$.util.N nB = b(this.f20984e, i8, i9);
        this.f20982c += i9;
        return nB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.N, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }
}
