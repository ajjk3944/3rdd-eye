package y9;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: i, reason: collision with root package name */
    public int[] f25965i;
    public int[] j;

    @Override // y9.g
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f25958b.f25921d) * this.f25959c.f25921d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f25958b.f25921d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // y9.p
    public final e g(e eVar) throws f {
        int[] iArr = this.f25965i;
        if (iArr == null) {
            return e.f25917e;
        }
        int i10 = eVar.f25920c;
        int i11 = eVar.f25919b;
        if (i10 != 2) {
            throw new f(eVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new f(eVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new e(eVar.f25918a, iArr.length, 2) : e.f25917e;
    }

    @Override // y9.p
    public final void h() {
        this.j = this.f25965i;
    }

    @Override // y9.p
    public final void j() {
        this.j = null;
        this.f25965i = null;
    }
}
