package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class E2 extends A2 {

    /* renamed from: c, reason: collision with root package name */
    public S2 f20851c;

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        S2 s22;
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j6 <= 0) {
            s22 = new S2();
        } else {
            s22 = new S2((int) j6);
        }
        this.f20851c = s22;
    }

    @Override // j$.util.stream.AbstractC2437h2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        double[] dArr = (double[]) this.f20851c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC2472o2 interfaceC2472o2 = this.f21082a;
        interfaceC2472o2.c(length);
        int i = 0;
        if (!this.f20824b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC2472o2.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d6 = dArr[i];
                if (interfaceC2472o2.e()) {
                    break;
                }
                interfaceC2472o2.accept(d6);
                i++;
            }
        }
        interfaceC2472o2.m();
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f20851c.accept(d6);
    }
}
