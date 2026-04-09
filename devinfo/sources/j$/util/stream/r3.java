package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class r3 extends x6 implements e2, w1 {
    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(double d10) {
        v3.D();
        throw null;
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final void end() {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.W(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i4) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final void k(Object[] objArr, int i4) {
        long j = i4;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f26516c == 0) {
            System.arraycopy(this.f26817e, 0, objArr, i4, this.f26515b);
            return;
        }
        for (int i10 = 0; i10 < this.f26516c; i10++) {
            Object[] objArr2 = this.f26818f[i10];
            System.arraycopy(objArr2, 0, objArr, i4, objArr2.length);
            i4 += this.f26818f[i10].length;
        }
        int i11 = this.f26515b;
        if (i11 > 0) {
            System.arraycopy(this.f26817e, 0, objArr, i4, i11);
        }
    }

    @Override // j$.util.stream.e2
    public final Object[] m(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        clear();
        p(j);
    }
}
