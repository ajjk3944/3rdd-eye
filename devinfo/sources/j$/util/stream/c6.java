package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c6 extends y5 {

    /* renamed from: c, reason: collision with root package name */
    public q6 f26526c;

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void c(long j) {
        q6 q6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            q6Var = new q6();
        } else {
            q6Var = new q6((int) j);
        }
        this.f26526c = q6Var;
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public final void end() {
        double[] dArr = (double[]) this.f26526c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        m5 m5Var = this.f26578a;
        m5Var.c(length);
        int i4 = 0;
        if (!this.f26828b) {
            int length2 = dArr.length;
            while (i4 < length2) {
                m5Var.accept(dArr[i4]);
                i4++;
            }
        } else {
            int length3 = dArr.length;
            while (i4 < length3) {
                double d10 = dArr[i4];
                if (m5Var.e()) {
                    break;
                }
                m5Var.accept(d10);
                i4++;
            }
        }
        m5Var.end();
    }

    @Override // j$.util.stream.j5, j$.util.stream.m5
    public final void accept(double d10) {
        this.f26526c.accept(d10);
    }
}
