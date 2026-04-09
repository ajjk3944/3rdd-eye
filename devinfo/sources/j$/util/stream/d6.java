package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d6 extends z5 {

    /* renamed from: c, reason: collision with root package name */
    public s6 f26555c;

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        s6 s6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            s6Var = new s6();
        } else {
            s6Var = new s6((int) j);
        }
        this.f26555c = s6Var;
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void end() {
        int[] iArr = (int[]) this.f26555c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        m5 m5Var = this.f26589a;
        m5Var.c(length);
        int i4 = 0;
        if (!this.f26836b) {
            int length2 = iArr.length;
            while (i4 < length2) {
                m5Var.accept(iArr[i4]);
                i4++;
            }
        } else {
            int length3 = iArr.length;
            while (i4 < length3) {
                int i10 = iArr[i4];
                if (m5Var.e()) {
                    break;
                }
                m5Var.accept(i10);
                i4++;
            }
        }
        m5Var.end();
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        this.f26555c.accept(i4);
    }
}
