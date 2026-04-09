package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f14632a;

    /* renamed from: b, reason: collision with root package name */
    public int f14633b;

    @Override // ku.s0
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f14632a, this.f14633b);
        br.l.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        float[] fArr = this.f14632a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            br.l.d(fArrCopyOf, "copyOf(...)");
            this.f14632a = fArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14633b;
    }
}
