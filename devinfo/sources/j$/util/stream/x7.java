package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class x7 extends z7 implements Spliterator.OfInt, IntConsumer {

    /* renamed from: f, reason: collision with root package name */
    public int f26819f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.stream.c8
    public final Spliterator b(Spliterator spliterator) {
        return new x7((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.z7
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f26819f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i4) {
        this.f26819f = i4;
    }

    @Override // j$.util.stream.z7
    public final g7 j(int i4) {
        return new e7(i4);
    }
}
