package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14532a;

    /* renamed from: b, reason: collision with root package name */
    public int f14533b;

    @Override // ku.s0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f14532a, this.f14533b);
        br.l.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        int[] iArr = this.f14532a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f14532a = iArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14533b;
    }
}
