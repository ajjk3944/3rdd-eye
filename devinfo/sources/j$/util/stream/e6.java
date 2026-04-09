package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e6 extends a6 {

    /* renamed from: c, reason: collision with root package name */
    public u6 f26567c;

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        u6 u6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            u6Var = new u6();
        } else {
            u6Var = new u6((int) j);
        }
        this.f26567c = u6Var;
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void end() {
        long[] jArr = (long[]) this.f26567c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        m5 m5Var = this.f26600a;
        m5Var.c(length);
        int i4 = 0;
        if (!this.f26479b) {
            int length2 = jArr.length;
            while (i4 < length2) {
                m5Var.accept(jArr[i4]);
                i4++;
            }
        } else {
            int length3 = jArr.length;
            while (i4 < length3) {
                long j = jArr[i4];
                if (m5Var.e()) {
                    break;
                }
                m5Var.accept(j);
                i4++;
            }
        }
        m5Var.end();
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f26567c.accept(j);
    }
}
