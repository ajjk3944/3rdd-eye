package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class q7 extends t7 implements j$.util.u0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.v7
    public final Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10) {
        return new q7((j$.util.u0) spliterator, j, j8, j9, j10);
    }

    @Override // j$.util.stream.t7
    public final Object b() {
        return new x1(1);
    }
}
