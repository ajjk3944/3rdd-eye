package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class n1 extends q1 implements k5 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void d(Integer num) {
        v3.G(this, num);
    }

    @Override // j$.util.stream.q1, j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        if (this.f26725a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i4);
        throw null;
    }
}
