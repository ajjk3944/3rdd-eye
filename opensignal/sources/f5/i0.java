package f5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i0 extends p {

    /* renamed from: i, reason: collision with root package name */
    public int f8527i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f8528l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f8529m;

    /* renamed from: n, reason: collision with root package name */
    public int f8530n;

    /* renamed from: o, reason: collision with root package name */
    public long f8531o;

    @Override // f5.p, y4.c
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f8530n) > 0) {
            k(i10).put(this.f8529m, 0, this.f8530n).flip();
            this.f8530n = 0;
        }
        return super.a();
    }

    @Override // f5.p, y4.c
    public final boolean c() {
        return super.c() && this.f8530n == 0;
    }

    @Override // y4.c
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f8528l);
        this.f8531o += iMin / this.f8573b.f25843d;
        this.f8528l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f8528l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f8530n + i11) - this.f8529m.length;
        ByteBuffer byteBufferK = k(length);
        int iH = a5.d0.h(length, 0, this.f8530n);
        byteBufferK.put(this.f8529m, 0, iH);
        int iH2 = a5.d0.h(length - iH, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iH2;
        int i13 = this.f8530n - iH;
        this.f8530n = i13;
        byte[] bArr = this.f8529m;
        System.arraycopy(bArr, iH, bArr, 0, i13);
        byteBuffer.get(this.f8529m, this.f8530n, i12);
        this.f8530n += i12;
        byteBufferK.flip();
    }

    @Override // f5.p
    public final y4.a g(y4.a aVar) throws y4.b {
        if (aVar.f25842c != 2) {
            throw new y4.b(aVar);
        }
        this.k = true;
        return (this.f8527i == 0 && this.j == 0) ? y4.a.f25839e : aVar;
    }

    @Override // f5.p
    public final void h() {
        if (this.k) {
            this.k = false;
            int i10 = this.j;
            int i11 = this.f8573b.f25843d;
            this.f8529m = new byte[i10 * i11];
            this.f8528l = this.f8527i * i11;
        }
        this.f8530n = 0;
    }

    @Override // f5.p
    public final void i() {
        if (this.k) {
            if (this.f8530n > 0) {
                this.f8531o += r0 / this.f8573b.f25843d;
            }
            this.f8530n = 0;
        }
    }

    @Override // f5.p
    public final void j() {
        this.f8529m = a5.d0.f109e;
    }
}
