package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14555a;

    /* renamed from: b, reason: collision with root package name */
    public int f14556b;

    @Override // ku.s0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f14555a, this.f14556b);
        br.l.d(iArrCopyOf, "copyOf(...)");
        return new lq.v(iArrCopyOf);
    }

    @Override // ku.s0
    public final void b(int i10) {
        int[] iArr = this.f14555a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f14555a = iArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14556b;
    }
}
