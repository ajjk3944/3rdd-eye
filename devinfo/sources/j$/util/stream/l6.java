package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l6 extends z5 {

    /* renamed from: c, reason: collision with root package name */
    public int[] f26663c;

    /* renamed from: d, reason: collision with root package name */
    public int f26664d;

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26663c = new int[(int) j];
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void end() {
        int i4 = 0;
        Arrays.sort(this.f26663c, 0, this.f26664d);
        long j = this.f26664d;
        m5 m5Var = this.f26589a;
        m5Var.c(j);
        if (!this.f26836b) {
            while (i4 < this.f26664d) {
                m5Var.accept(this.f26663c[i4]);
                i4++;
            }
        } else {
            while (i4 < this.f26664d && !m5Var.e()) {
                m5Var.accept(this.f26663c[i4]);
                i4++;
            }
        }
        m5Var.end();
        this.f26663c = null;
    }

    @Override // j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        int[] iArr = this.f26663c;
        int i10 = this.f26664d;
        this.f26664d = i10 + 1;
        iArr[i10] = i4;
    }
}
