package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k6 extends y5 {

    /* renamed from: c, reason: collision with root package name */
    public double[] f26646c;

    /* renamed from: d, reason: collision with root package name */
    public int f26647d;

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26646c = new double[(int) j];
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void end() {
        int i4 = 0;
        Arrays.sort(this.f26646c, 0, this.f26647d);
        long j = this.f26647d;
        m5 m5Var = this.f26578a;
        m5Var.c(j);
        if (!this.f26828b) {
            while (i4 < this.f26647d) {
                m5Var.accept(this.f26646c[i4]);
                i4++;
            }
        } else {
            while (i4 < this.f26647d && !m5Var.e()) {
                m5Var.accept(this.f26646c[i4]);
                i4++;
            }
        }
        m5Var.end();
        this.f26646c = null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) {
        double[] dArr = this.f26646c;
        int i4 = this.f26647d;
        this.f26647d = i4 + 1;
        dArr[i4] = d10;
    }
}
