package f5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f0 extends p {

    /* renamed from: i, reason: collision with root package name */
    public final long f8474i = 150000;
    public final long j = 20000;
    public final short k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f8475l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8476m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f8477n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f8478o;

    /* renamed from: p, reason: collision with root package name */
    public int f8479p;

    /* renamed from: q, reason: collision with root package name */
    public int f8480q;

    /* renamed from: r, reason: collision with root package name */
    public int f8481r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8482s;

    /* renamed from: t, reason: collision with root package name */
    public long f8483t;

    public f0() {
        byte[] bArr = a5.d0.f109e;
        this.f8477n = bArr;
        this.f8478o = bArr;
    }

    @Override // f5.p, y4.c
    public final boolean b() {
        return this.f8476m;
    }

    @Override // y4.c
    public final void d(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f8578g.hasRemaining()) {
            int i10 = this.f8479p;
            if (i10 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f8477n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i11 = this.f8475l;
                            iPosition = ((iLimit2 / i11) * i11) + i11;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f8479p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    k(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f8482s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i10 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iL = l(byteBuffer);
                int iPosition2 = iL - byteBuffer.position();
                byte[] bArr = this.f8477n;
                int length = bArr.length;
                int i12 = this.f8480q;
                int i13 = length - i12;
                if (iL >= iLimit3 || iPosition2 >= i13) {
                    int iMin = Math.min(iPosition2, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f8477n, this.f8480q, iMin);
                    int i14 = this.f8480q + iMin;
                    this.f8480q = i14;
                    byte[] bArr2 = this.f8477n;
                    if (i14 == bArr2.length) {
                        if (this.f8482s) {
                            m(this.f8481r, bArr2);
                            this.f8483t += (this.f8480q - (this.f8481r * 2)) / this.f8475l;
                        } else {
                            this.f8483t += (i14 - this.f8481r) / this.f8475l;
                        }
                        n(byteBuffer, this.f8477n, this.f8480q);
                        this.f8480q = 0;
                        this.f8479p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    m(i12, bArr);
                    this.f8480q = 0;
                    this.f8479p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iL2 = l(byteBuffer);
                byteBuffer.limit(iL2);
                this.f8483t += byteBuffer.remaining() / this.f8475l;
                n(byteBuffer, this.f8478o, this.f8481r);
                if (iL2 < iLimit4) {
                    m(this.f8481r, this.f8478o);
                    this.f8479p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // f5.p
    public final y4.a g(y4.a aVar) throws y4.b {
        if (aVar.f25842c == 2) {
            return this.f8476m ? aVar : y4.a.f25839e;
        }
        throw new y4.b(aVar);
    }

    @Override // f5.p
    public final void h() {
        if (this.f8476m) {
            y4.a aVar = this.f8573b;
            int i10 = aVar.f25843d;
            this.f8475l = i10;
            int i11 = aVar.f25840a;
            int i12 = ((int) ((this.f8474i * i11) / 1000000)) * i10;
            if (this.f8477n.length != i12) {
                this.f8477n = new byte[i12];
            }
            int i13 = ((int) ((this.j * i11) / 1000000)) * i10;
            this.f8481r = i13;
            if (this.f8478o.length != i13) {
                this.f8478o = new byte[i13];
            }
        }
        this.f8479p = 0;
        this.f8483t = 0L;
        this.f8480q = 0;
        this.f8482s = false;
    }

    @Override // f5.p
    public final void i() {
        int i10 = this.f8480q;
        if (i10 > 0) {
            m(i10, this.f8477n);
        }
        if (this.f8482s) {
            return;
        }
        this.f8483t += this.f8481r / this.f8475l;
    }

    @Override // f5.p
    public final void j() {
        this.f8476m = false;
        this.f8481r = 0;
        byte[] bArr = a5.d0.f109e;
        this.f8477n = bArr;
        this.f8478o = bArr;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i10 = this.f8475l;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void m(int i10, byte[] bArr) {
        k(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f8482s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f8481r);
        int i11 = this.f8481r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f8478o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f8478o, i11, iMin);
    }
}
