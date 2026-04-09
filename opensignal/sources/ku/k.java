package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f14569a;

    /* renamed from: b, reason: collision with root package name */
    public int f14570b;

    @Override // ku.s0
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f14569a, this.f14570b);
        br.l.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        char[] cArr = this.f14569a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            br.l.d(cArrCopyOf, "copyOf(...)");
            this.f14569a = cArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14570b;
    }
}
