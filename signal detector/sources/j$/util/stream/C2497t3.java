package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2497t3 extends AbstractC2507v3 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2517x3
    public final Spliterator a(Spliterator spliterator, long j6, long j7, long j8, long j9) {
        return new C2497t3((Spliterator.OfInt) spliterator, j6, j7, j8, j9);
    }

    @Override // j$.util.stream.AbstractC2507v3
    public final Object b() {
        return new B0(1);
    }
}
