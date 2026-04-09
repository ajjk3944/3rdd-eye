package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class P2 extends D2 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f20939d;

    /* renamed from: e, reason: collision with root package name */
    public int f20940e;

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20939d = new Object[(int) j6];
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = 0;
        Arrays.sort(this.f20939d, 0, this.f20940e, this.f20843b);
        long j6 = this.f20940e;
        InterfaceC2472o2 interfaceC2472o2 = this.f21108a;
        interfaceC2472o2.c(j6);
        if (!this.f20844c) {
            while (i < this.f20940e) {
                interfaceC2472o2.accept((InterfaceC2472o2) this.f20939d[i]);
                i++;
            }
        } else {
            while (i < this.f20940e && !interfaceC2472o2.e()) {
                interfaceC2472o2.accept((InterfaceC2472o2) this.f20939d[i]);
                i++;
            }
        }
        interfaceC2472o2.m();
        this.f20939d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f20939d;
        int i = this.f20940e;
        this.f20940e = i + 1;
        objArr[i] = obj;
    }
}
