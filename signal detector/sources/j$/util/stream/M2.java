package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class M2 extends A2 {

    /* renamed from: c, reason: collision with root package name */
    public double[] f20915c;

    /* renamed from: d, reason: collision with root package name */
    public int f20916d;

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20915c = new double[(int) j6];
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = 0;
        Arrays.sort(this.f20915c, 0, this.f20916d);
        long j6 = this.f20916d;
        InterfaceC2472o2 interfaceC2472o2 = this.f21082a;
        interfaceC2472o2.c(j6);
        if (!this.f20824b) {
            while (i < this.f20916d) {
                interfaceC2472o2.accept(this.f20915c[i]);
                i++;
            }
        } else {
            while (i < this.f20916d && !interfaceC2472o2.e()) {
                interfaceC2472o2.accept(this.f20915c[i]);
                i++;
            }
        }
        interfaceC2472o2.m();
        this.f20915c = null;
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        double[] dArr = this.f20915c;
        int i = this.f20916d;
        this.f20916d = i + 1;
        dArr[i] = d6;
    }
}
