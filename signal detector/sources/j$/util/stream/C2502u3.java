package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2502u3 extends AbstractC2507v3 implements j$.util.K {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2517x3
    public final Spliterator a(Spliterator spliterator, long j6, long j7, long j8, long j9) {
        return new C2502u3((j$.util.K) spliterator, j6, j7, j8, j9);
    }

    @Override // j$.util.stream.AbstractC2507v3
    public final Object b() {
        return new D0(1);
    }
}
