package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class z7 extends c8 implements j$.util.c1 {
    public abstract void g(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    public abstract g7 j(int i4);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != b8.NO_MORE && ((j$.util.c1) this.f26535a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        g7 g7VarJ = null;
        while (true) {
            b8 b8VarF = f();
            if (b8VarF == b8.NO_MORE) {
                return;
            }
            b8 b8Var = b8.MAYBE_MORE;
            Spliterator spliterator = this.f26535a;
            if (b8VarF == b8Var) {
                int i4 = this.f26537c;
                if (g7VarJ == null) {
                    g7VarJ = j(i4);
                } else {
                    g7VarJ.f26590b = 0;
                }
                long j = 0;
                while (((j$.util.c1) spliterator).tryAdvance(g7VarJ)) {
                    j++;
                    if (j >= i4) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    g7VarJ.a(obj, a(j));
                }
            } else {
                ((j$.util.c1) spliterator).forEachRemaining(obj);
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
