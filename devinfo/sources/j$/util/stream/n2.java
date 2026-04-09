package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class n2 extends p2 implements a2 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.R(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.U(this, j, j8);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void k(Object[] objArr, int i4) {
        v3.O(this, (Integer[]) objArr, i4);
    }

    @Override // j$.util.stream.d2
    public final Object newArray(int i4) {
        return new int[i4];
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return new e3(this);
    }

    @Override // j$.util.stream.e2
    public final j$.util.c1 spliterator() {
        return new e3(this);
    }
}
