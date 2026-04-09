package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2527z3 extends B3 implements Spliterator.OfInt, IntConsumer {

    /* renamed from: f, reason: collision with root package name */
    public int f21211f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.g(this, consumer);
    }

    @Override // j$.util.stream.E3
    public final Spliterator b(Spliterator spliterator) {
        return new C2527z3((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.B3
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f21211f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f21211f = i;
    }

    @Override // j$.util.stream.B3
    public final AbstractC2443i3 j(int i) {
        return new C2433g3(i);
    }
}
