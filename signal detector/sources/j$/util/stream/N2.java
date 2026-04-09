package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class N2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    public int[] f20925c;

    /* renamed from: d, reason: collision with root package name */
    public int f20926d;

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20925c = new int[(int) j6];
    }

    @Override // j$.util.stream.AbstractC2442i2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = 0;
        Arrays.sort(this.f20925c, 0, this.f20926d);
        long j6 = this.f20926d;
        InterfaceC2472o2 interfaceC2472o2 = this.f21088a;
        interfaceC2472o2.c(j6);
        if (!this.f20831b) {
            while (i < this.f20926d) {
                interfaceC2472o2.accept(this.f20925c[i]);
                i++;
            }
        } else {
            while (i < this.f20926d && !interfaceC2472o2.e()) {
                interfaceC2472o2.accept(this.f20925c[i]);
                i++;
            }
        }
        interfaceC2472o2.m();
        this.f20925c = null;
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        int[] iArr = this.f20925c;
        int i3 = this.f20926d;
        this.f20926d = i3 + 1;
        iArr[i3] = i;
    }
}
