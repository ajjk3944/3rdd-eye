package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class r7 extends t7 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.stream.v7
    public final Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10) {
        return new r7((Spliterator.OfInt) spliterator, j, j8, j9, j10);
    }

    @Override // j$.util.stream.t7
    public final Object b() {
        return new z1(1);
    }
}
