package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class O0 extends Q0 implements C0 {
    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC2510w1.R(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.U(this, j6, j7);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC2510w1.O(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.F0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.G0
    public final j$.util.N spliterator() {
        return new C2426f1(this);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C2426f1(this);
    }
}
