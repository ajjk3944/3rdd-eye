package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14539a;

    /* renamed from: b, reason: collision with root package name */
    public int f14540b;

    @Override // ku.s0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f14539a, this.f14540b);
        br.l.d(bArrCopyOf, "copyOf(...)");
        return new lq.t(bArrCopyOf);
    }

    @Override // ku.s0
    public final void b(int i10) {
        byte[] bArr = this.f14539a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            br.l.d(bArrCopyOf, "copyOf(...)");
            this.f14539a = bArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14540b;
    }
}
