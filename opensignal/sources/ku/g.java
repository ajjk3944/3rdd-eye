package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14551a;

    /* renamed from: b, reason: collision with root package name */
    public int f14552b;

    @Override // ku.s0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f14551a, this.f14552b);
        br.l.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // ku.s0
    public final void b(int i10) {
        byte[] bArr = this.f14551a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            br.l.d(bArrCopyOf, "copyOf(...)");
            this.f14551a = bArrCopyOf;
        }
    }

    @Override // ku.s0
    public final int d() {
        return this.f14552b;
    }
}
