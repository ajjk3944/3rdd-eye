package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class R0 extends I0 {
    @Override // j$.util.stream.G0
    public final G0 j(long j6, long j7, IntFunction intFunction) {
        if (j6 == 0 && j7 == this.f20882c) {
            return this;
        }
        long jCount = this.f20880a.count();
        if (j6 >= jCount) {
            return this.f20881b.j(j6 - jCount, j7 - jCount, intFunction);
        }
        if (j7 > jCount) {
            return AbstractC2510w1.c0(EnumC2418d3.REFERENCE, this.f20880a.j(j6, jCount, intFunction), this.f20881b.j(0L, j7 - jCount, intFunction));
        }
        return this.f20880a.j(j6, j7, intFunction);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C2441i1(this);
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        G0 g02 = this.f20880a;
        g02.k(objArr, i);
        this.f20881b.k(objArr, i + ((int) g02.count()));
    }

    @Override // j$.util.stream.G0
    public final Object[] n(IntFunction intFunction) {
        long j6 = this.f20882c;
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j6);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        this.f20880a.forEach(consumer);
        this.f20881b.forEach(consumer);
    }

    public final String toString() {
        long j6 = this.f20882c;
        return j6 < 32 ? String.format("ConcNode[%s.%s]", this.f20880a, this.f20881b) : String.format("ConcNode[size=%d]", Long.valueOf(j6));
    }
}
