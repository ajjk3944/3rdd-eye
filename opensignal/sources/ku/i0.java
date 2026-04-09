package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f14562a;

    /* renamed from: b, reason: collision with root package name */
    public int f14563b;

    @Override // ku.s0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f14562a, this.f14563b);
        br.l.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        long[] jArr = this.f14562a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            br.l.d(jArrCopyOf, "copyOf(...)");
            this.f14562a = jArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14563b;
    }
}
