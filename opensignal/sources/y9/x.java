package y9;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x extends p {

    /* renamed from: i, reason: collision with root package name */
    public final long f26007i = 150000;
    public final long j = 20000;
    public final short k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f26008l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26009m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f26010n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f26011o;

    /* renamed from: p, reason: collision with root package name */
    public int f26012p;

    /* renamed from: q, reason: collision with root package name */
    public int f26013q;

    /* renamed from: r, reason: collision with root package name */
    public int f26014r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26015s;

    /* renamed from: t, reason: collision with root package name */
    public long f26016t;

    public x() {
        byte[] bArr = qb.v.f20833f;
        this.f26010n = bArr;
        this.f26011o = bArr;
    }

    @Override // y9.p, y9.g
    public final boolean b() {
        return this.f26009m;
    }

    @Override // y9.g
    public final void d(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f25963g.hasRemaining()) {
            int i10 = this.f26012p;
            if (i10 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f26010n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i11 = this.f26008l;
                            iPosition = ((iLimit2 / i11) * i11) + i11;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f26012p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    k(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f26015s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i10 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iL = l(byteBuffer);
                int iPosition2 = iL - byteBuffer.position();
                byte[] bArr = this.f26010n;
                int length = bArr.length;
                int i12 = this.f26013q;
                int i13 = length - i12;
                if (iL >= iLimit3 || iPosition2 >= i13) {
                    int iMin = Math.min(iPosition2, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f26010n, this.f26013q, iMin);
                    int i14 = this.f26013q + iMin;
                    this.f26013q = i14;
                    byte[] bArr2 = this.f26010n;
                    if (i14 == bArr2.length) {
                        if (this.f26015s) {
                            m(this.f26014r, bArr2);
                            this.f26016t += (this.f26013q - (this.f26014r * 2)) / this.f26008l;
                        } else {
                            this.f26016t += (i14 - this.f26014r) / this.f26008l;
                        }
                        n(byteBuffer, this.f26010n, this.f26013q);
                        this.f26013q = 0;
                        this.f26012p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    m(i12, bArr);
                    this.f26013q = 0;
                    this.f26012p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iL2 = l(byteBuffer);
                byteBuffer.limit(iL2);
                this.f26016t += byteBuffer.remaining() / this.f26008l;
                n(byteBuffer, this.f26011o, this.f26014r);
                if (iL2 < iLimit4) {
                    m(this.f26014r, this.f26011o);
                    this.f26012p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // y9.p
    public final e g(e eVar) throws f {
        if (eVar.f25920c == 2) {
            return this.f26009m ? eVar : e.f25917e;
        }
        throw new f(eVar);
    }

    @Override // y9.p
    public final void h() {
        if (this.f26009m) {
            e eVar = this.f25958b;
            int i10 = eVar.f25921d;
            this.f26008l = i10;
            int i11 = eVar.f25918a;
            int i12 = ((int) ((this.f26007i * i11) / 1000000)) * i10;
            if (this.f26010n.length != i12) {
                this.f26010n = new byte[i12];
            }
            int i13 = ((int) ((this.j * i11) / 1000000)) * i10;
            this.f26014r = i13;
            if (this.f26011o.length != i13) {
                this.f26011o = new byte[i13];
            }
        }
        this.f26012p = 0;
        this.f26016t = 0L;
        this.f26013q = 0;
        this.f26015s = false;
    }

    @Override // y9.p
    public final void i() {
        int i10 = this.f26013q;
        if (i10 > 0) {
            m(i10, this.f26010n);
        }
        if (this.f26015s) {
            return;
        }
        this.f26016t += this.f26014r / this.f26008l;
    }

    @Override // y9.p
    public final void j() {
        this.f26009m = false;
        this.f26014r = 0;
        byte[] bArr = qb.v.f20833f;
        this.f26010n = bArr;
        this.f26011o = bArr;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i10 = this.f26008l;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void m(int i10, byte[] bArr) {
        k(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f26015s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f26014r);
        int i11 = this.f26014r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f26011o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f26011o, i11, iMin);
    }
}
