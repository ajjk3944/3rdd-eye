package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f14641a;

    /* renamed from: b, reason: collision with root package name */
    public int f14642b;

    @Override // ku.s0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f14641a, this.f14642b);
        br.l.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        short[] sArr = this.f14641a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            br.l.d(sArrCopyOf, "copyOf(...)");
            this.f14641a = sArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14642b;
    }
}
