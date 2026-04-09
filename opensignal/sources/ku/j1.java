package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f14567a;

    /* renamed from: b, reason: collision with root package name */
    public int f14568b;

    @Override // ku.s0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f14567a, this.f14568b);
        br.l.d(jArrCopyOf, "copyOf(...)");
        return new lq.x(jArrCopyOf);
    }

    @Override // ku.s0
    public final void b(int i10) {
        long[] jArr = this.f14567a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            br.l.d(jArrCopyOf, "copyOf(...)");
            this.f14567a = jArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14568b;
    }
}
