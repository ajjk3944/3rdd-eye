package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface F extends N {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.N, j$.util.Spliterator
    F trySplit();
}
