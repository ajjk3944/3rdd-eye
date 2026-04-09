package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2426f1 extends AbstractC2436h1 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.g(this, consumer);
    }
}
