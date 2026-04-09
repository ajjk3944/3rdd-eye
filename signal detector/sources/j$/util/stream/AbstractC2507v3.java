package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2507v3 extends AbstractC2517x3 implements j$.util.N {
    public abstract Object b();

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

    public AbstractC2507v3(j$.util.N n6, long j6, long j7) {
        super(n6, j6, j7, 0L, Math.min(n6.estimateSize(), j7));
    }

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        long j6;
        Objects.requireNonNull(obj);
        long j7 = this.f21198e;
        long j8 = this.f21194a;
        if (j8 >= j7) {
            return false;
        }
        while (true) {
            j6 = this.f21197d;
            if (j8 <= j6) {
                break;
            }
            ((j$.util.N) this.f21196c).tryAdvance(b());
            this.f21197d++;
        }
        if (j6 >= this.f21198e) {
            return false;
        }
        this.f21197d = j6 + 1;
        return ((j$.util.N) this.f21196c).tryAdvance(obj);
    }

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j6 = this.f21198e;
        long j7 = this.f21194a;
        if (j7 >= j6) {
            return;
        }
        long j8 = this.f21197d;
        if (j8 >= j6) {
            return;
        }
        if (j8 >= j7 && ((j$.util.N) this.f21196c).estimateSize() + j8 <= this.f21195b) {
            ((j$.util.N) this.f21196c).forEachRemaining(obj);
            this.f21197d = this.f21198e;
            return;
        }
        while (j7 > this.f21197d) {
            ((j$.util.N) this.f21196c).tryAdvance(b());
            this.f21197d++;
        }
        while (this.f21197d < this.f21198e) {
            ((j$.util.N) this.f21196c).tryAdvance(obj);
            this.f21197d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
