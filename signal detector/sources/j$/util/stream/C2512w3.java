package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2512w3 extends AbstractC2517x3 implements Spliterator {
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

    public C2512w3(Spliterator spliterator, long j6, long j7) {
        super(spliterator, j6, j7, 0L, Math.min(spliterator.estimateSize(), j7));
    }

    @Override // j$.util.stream.AbstractC2517x3
    public final Spliterator a(Spliterator spliterator, long j6, long j7, long j8, long j9) {
        return new C2512w3(spliterator, j6, j7, j8, j9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j6;
        Objects.requireNonNull(consumer);
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
            this.f21196c.tryAdvance(new Z1(4));
            this.f21197d++;
        }
        if (j6 >= this.f21198e) {
            return false;
        }
        this.f21197d = j6 + 1;
        return this.f21196c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j6 = this.f21198e;
        long j7 = this.f21194a;
        if (j7 >= j6) {
            return;
        }
        long j8 = this.f21197d;
        if (j8 >= j6) {
            return;
        }
        if (j8 >= j7 && this.f21196c.estimateSize() + j8 <= this.f21195b) {
            this.f21196c.forEachRemaining(consumer);
            this.f21197d = this.f21198e;
            return;
        }
        while (j7 > this.f21197d) {
            this.f21196c.tryAdvance(new Z1(5));
            this.f21197d++;
        }
        while (this.f21197d < this.f21198e) {
            this.f21196c.tryAdvance(consumer);
            this.f21197d++;
        }
    }
}
