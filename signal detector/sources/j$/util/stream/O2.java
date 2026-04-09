package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class O2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    public long[] f20932c;

    /* renamed from: d, reason: collision with root package name */
    public int f20933d;

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20932c = new long[(int) j6];
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = 0;
        Arrays.sort(this.f20932c, 0, this.f20933d);
        long j6 = this.f20933d;
        InterfaceC2472o2 interfaceC2472o2 = this.f21100a;
        interfaceC2472o2.c(j6);
        if (!this.f20835b) {
            while (i < this.f20933d) {
                interfaceC2472o2.accept(this.f20932c[i]);
                i++;
            }
        } else {
            while (i < this.f20933d && !interfaceC2472o2.e()) {
                interfaceC2472o2.accept(this.f20932c[i]);
                i++;
            }
        }
        interfaceC2472o2.m();
        this.f20932c = null;
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        long[] jArr = this.f20932c;
        int i = this.f20933d;
        this.f20933d = i + 1;
        jArr[i] = j6;
    }
}
