package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class F2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    public U2 f20860c;

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        U2 u22;
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j6 <= 0) {
            u22 = new U2();
        } else {
            u22 = new U2((int) j6);
        }
        this.f20860c = u22;
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        int[] iArr = (int[]) this.f20860c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC2472o2 interfaceC2472o2 = this.f21088a;
        interfaceC2472o2.c(length);
        int i = 0;
        if (!this.f20831b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC2472o2.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i3 = iArr[i];
                if (interfaceC2472o2.e()) {
                    break;
                }
                interfaceC2472o2.accept(i3);
                i++;
            }
        }
        interfaceC2472o2.m();
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        this.f20860c.accept(i);
    }
}
