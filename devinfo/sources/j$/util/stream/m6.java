package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m6 extends a6 {

    /* renamed from: c, reason: collision with root package name */
    public long[] f26673c;

    /* renamed from: d, reason: collision with root package name */
    public int f26674d;

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26673c = new long[(int) j];
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public final void end() {
        int i4 = 0;
        Arrays.sort(this.f26673c, 0, this.f26674d);
        long j = this.f26674d;
        m5 m5Var = this.f26600a;
        m5Var.c(j);
        if (!this.f26479b) {
            while (i4 < this.f26674d) {
                m5Var.accept(this.f26673c[i4]);
                i4++;
            }
        } else {
            while (i4 < this.f26674d && !m5Var.e()) {
                m5Var.accept(this.f26673c[i4]);
                i4++;
            }
        }
        m5Var.end();
        this.f26673c = null;
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        long[] jArr = this.f26673c;
        int i4 = this.f26674d;
        this.f26674d = i4 + 1;
        jArr[i4] = j;
    }
}
