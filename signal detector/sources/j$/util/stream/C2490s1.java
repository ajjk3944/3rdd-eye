package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2490s1 extends Z2 implements G0, InterfaceC2519y0 {
    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2519y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.W(this, j6, j7, intFunction);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void m() {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i) {
        long j6 = i;
        long jCount = count() + j6;
        if (jCount > objArr.length || jCount < j6) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f21052c == 0) {
            System.arraycopy(this.f20990e, 0, objArr, i, this.f21051b);
            return;
        }
        for (int i3 = 0; i3 < this.f21052c; i3++) {
            Object[] objArr2 = this.f20991f[i3];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f20991f[i3].length;
        }
        int i6 = this.f21051b;
        if (i6 > 0) {
            System.arraycopy(this.f20990e, 0, objArr, i, i6);
        }
    }

    @Override // j$.util.stream.G0
    public final Object[] n(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        clear();
        q(j6);
    }
}
