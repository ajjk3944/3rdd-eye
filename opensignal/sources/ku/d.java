package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f14536a;

    /* renamed from: b, reason: collision with root package name */
    public int f14537b;

    @Override // ku.s0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f14536a, this.f14537b);
        br.l.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        boolean[] zArr = this.f14536a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            br.l.d(zArrCopyOf, "copyOf(...)");
            this.f14536a = zArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14537b;
    }
}
