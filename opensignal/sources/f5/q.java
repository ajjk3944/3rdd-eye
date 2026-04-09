package f5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: i, reason: collision with root package name */
    public int[] f8580i;
    public int[] j;

    @Override // y4.c
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f8573b.f25843d) * this.f8574c.f25843d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f8573b.f25843d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // f5.p
    public final y4.a g(y4.a aVar) throws y4.b {
        int[] iArr = this.f8580i;
        if (iArr == null) {
            return y4.a.f25839e;
        }
        int i10 = aVar.f25842c;
        int i11 = aVar.f25841b;
        if (i10 != 2) {
            throw new y4.b(aVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new y4.b(aVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new y4.a(aVar.f25840a, iArr.length, 2) : y4.a.f25839e;
    }

    @Override // f5.p
    public final void h() {
        this.j = this.f8580i;
    }

    @Override // f5.p
    public final void j() {
        this.j = null;
        this.f8580i = null;
    }
}
