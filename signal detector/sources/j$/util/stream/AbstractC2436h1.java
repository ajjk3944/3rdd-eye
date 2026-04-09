package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2436h1 extends AbstractC2446j1 implements j$.util.N {
    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        F0 f02;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.N) this.f21098d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f21097c == null && (f02 = (F0) AbstractC2446j1.a(this.f21099e)) != null) {
                j$.util.N nSpliterator = f02.spliterator();
                this.f21098d = nSpliterator;
                return nSpliterator.tryAdvance(obj);
            }
            this.f21095a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        if (this.f21095a == null) {
            return;
        }
        if (this.f21098d == null) {
            Spliterator spliterator = this.f21097c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    F0 f02 = (F0) AbstractC2446j1.a(dequeB);
                    if (f02 != null) {
                        f02.g(obj);
                    } else {
                        this.f21095a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.N) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
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
