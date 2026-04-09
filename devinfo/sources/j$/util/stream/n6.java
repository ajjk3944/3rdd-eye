package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n6 extends b6 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f26687d;

    /* renamed from: e, reason: collision with root package name */
    public int f26688e;

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26687d = new Object[(int) j];
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void end() {
        int i4 = 0;
        Arrays.sort(this.f26687d, 0, this.f26688e, this.f26508b);
        long j = this.f26688e;
        m5 m5Var = this.f26617a;
        m5Var.c(j);
        if (!this.f26509c) {
            while (i4 < this.f26688e) {
                m5Var.accept((m5) this.f26687d[i4]);
                i4++;
            }
        } else {
            while (i4 < this.f26688e && !m5Var.e()) {
                m5Var.accept((m5) this.f26687d[i4]);
                i4++;
            }
        }
        m5Var.end();
        this.f26687d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f26687d;
        int i4 = this.f26688e;
        this.f26688e = i4 + 1;
        objArr[i4] = obj;
    }
}
