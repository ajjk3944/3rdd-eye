package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class R2 extends X2 implements j$.util.F {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S2 f20957g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.f(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.X2
    public final j$.util.N b(Object obj, int i, int i3) {
        double[] dArr = (double[]) obj;
        int i6 = i3 + i;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i, i6);
        return new j$.util.V(dArr, i, i6, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(S2 s22, int i, int i3, int i6, int i7) {
        super(s22, i, i3, i6, i7);
        this.f20957g = s22;
    }

    @Override // j$.util.stream.X2
    public final j$.util.N c(int i, int i3, int i6, int i7) {
        return new R2(this.f20957g, i, i3, i6, i7);
    }
}
