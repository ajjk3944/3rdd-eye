package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class V2 extends X2 implements j$.util.K {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W2 f20973g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    public final j$.util.N b(Object obj, int i, int i3) {
        long[] jArr = (long[]) obj;
        int i6 = i3 + i;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i, i6);
        return new j$.util.c0(jArr, i, i6, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(W2 w22, int i, int i3, int i6, int i7) {
        super(w22, i, i3, i6, i7);
        this.f20973g = w22;
    }

    @Override // j$.util.stream.X2
    public final j$.util.N c(int i, int i3, int i6, int i7) {
        return new V2(this.f20973g, i, i3, i6, i7);
    }
}
