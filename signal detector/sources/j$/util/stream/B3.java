package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class B3 extends E3 implements j$.util.N {
    public abstract void g(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    public abstract AbstractC2443i3 j(int i);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != D3.NO_MORE && ((j$.util.N) this.f20852a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC2443i3 abstractC2443i3J = null;
        while (true) {
            D3 d3F = f();
            if (d3F == D3.NO_MORE) {
                return;
            }
            D3 d32 = D3.MAYBE_MORE;
            Spliterator spliterator = this.f20852a;
            if (d3F == d32) {
                int i = this.f20854c;
                if (abstractC2443i3J == null) {
                    abstractC2443i3J = j(i);
                } else {
                    abstractC2443i3J.f21089b = 0;
                }
                long j6 = 0;
                while (((j$.util.N) spliterator).tryAdvance(abstractC2443i3J)) {
                    j6++;
                    if (j6 >= i) {
                        break;
                    }
                }
                if (j6 == 0) {
                    return;
                } else {
                    abstractC2443i3J.a(obj, a(j6));
                }
            } else {
                ((j$.util.N) spliterator).forEachRemaining(obj);
                return;
            }
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
