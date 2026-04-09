package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class P0 extends Q0 implements E0 {
    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2510w1.S(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.V(this, j6, j7);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC2510w1.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.F0
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.G0
    public final j$.util.N spliterator() {
        return new C2431g1(this);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C2431g1(this);
    }
}
