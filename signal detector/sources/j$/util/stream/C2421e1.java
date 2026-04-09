package j$.util.stream;

import j$.util.AbstractC2383c;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2421e1 extends AbstractC2436h1 implements j$.util.F {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.f(this, consumer);
    }
}
