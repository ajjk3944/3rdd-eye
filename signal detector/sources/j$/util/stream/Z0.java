package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class Z0 implements G0 {
    @Override // j$.util.stream.G0
    public final long count() {
        return 0L;
    }

    public final void f(Object obj, int i) {
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.G0
    public /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.W(this, j6, j7, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final Object[] n(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }
}
