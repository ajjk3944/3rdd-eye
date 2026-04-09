package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class G2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    public W2 f20868c;

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        W2 w22;
        if (j6 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j6 <= 0) {
            w22 = new W2();
        } else {
            w22 = new W2((int) j6);
        }
        this.f20868c = w22;
    }

    @Override // j$.util.stream.AbstractC2447j2, j$.util.stream.InterfaceC2472o2
    public final void m() {
        long[] jArr = (long[]) this.f20868c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC2472o2 interfaceC2472o2 = this.f21100a;
        interfaceC2472o2.c(length);
        int i = 0;
        if (!this.f20835b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC2472o2.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j6 = jArr[i];
                if (interfaceC2472o2.e()) {
                    break;
                }
                interfaceC2472o2.accept(j6);
                i++;
            }
        }
        interfaceC2472o2.m();
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        this.f20868c.accept(j6);
    }
}
