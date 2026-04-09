package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class T2 extends X2 implements Spliterator.OfInt {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U2 f20968g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.g(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    public final j$.util.N b(Object obj, int i, int i3) {
        return Spliterators.spliterator((int[]) obj, i, i3 + i, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(U2 u22, int i, int i3, int i6, int i7) {
        super(u22, i, i3, i6, i7);
        this.f20968g = u22;
    }

    @Override // j$.util.stream.X2
    public final j$.util.N c(int i, int i3, int i6, int i7) {
        return new T2(this.f20968g, i, i3, i6, i7);
    }
}
