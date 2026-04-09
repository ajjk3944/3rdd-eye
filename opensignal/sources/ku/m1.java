package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f14582a;

    /* renamed from: b, reason: collision with root package name */
    public int f14583b;

    @Override // ku.s0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f14582a, this.f14583b);
        br.l.d(sArrCopyOf, "copyOf(...)");
        return new lq.a0(sArrCopyOf);
    }

    @Override // ku.s0
    public final void b(int i10) {
        short[] sArr = this.f14582a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            br.l.d(sArrCopyOf, "copyOf(...)");
            this.f14582a = sArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14583b;
    }
}
