package y9;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z extends p {

    /* renamed from: i, reason: collision with root package name */
    public int f26030i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f26031l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f26032m;

    /* renamed from: n, reason: collision with root package name */
    public int f26033n;

    /* renamed from: o, reason: collision with root package name */
    public long f26034o;

    @Override // y9.p, y9.g
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f26033n) > 0) {
            k(i10).put(this.f26032m, 0, this.f26033n).flip();
            this.f26033n = 0;
        }
        return super.a();
    }

    @Override // y9.p, y9.g
    public final boolean c() {
        return super.c() && this.f26033n == 0;
    }

    @Override // y9.g
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f26031l);
        this.f26034o += iMin / this.f25958b.f25921d;
        this.f26031l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f26031l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f26033n + i11) - this.f26032m.length;
        ByteBuffer byteBufferK = k(length);
        int i12 = qb.v.i(length, 0, this.f26033n);
        byteBufferK.put(this.f26032m, 0, i12);
        int i13 = qb.v.i(length - i12, 0, i11);
        byteBuffer.limit(byteBuffer.position() + i13);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - i13;
        int i15 = this.f26033n - i12;
        this.f26033n = i15;
        byte[] bArr = this.f26032m;
        System.arraycopy(bArr, i12, bArr, 0, i15);
        byteBuffer.get(this.f26032m, this.f26033n, i14);
        this.f26033n += i14;
        byteBufferK.flip();
    }

    @Override // y9.p
    public final e g(e eVar) throws f {
        if (eVar.f25920c != 2) {
            throw new f(eVar);
        }
        this.k = true;
        return (this.f26030i == 0 && this.j == 0) ? e.f25917e : eVar;
    }

    @Override // y9.p
    public final void h() {
        if (this.k) {
            this.k = false;
            int i10 = this.j;
            int i11 = this.f25958b.f25921d;
            this.f26032m = new byte[i10 * i11];
            this.f26031l = this.f26030i * i11;
        }
        this.f26033n = 0;
    }

    @Override // y9.p
    public final void i() {
        if (this.k) {
            if (this.f26033n > 0) {
                this.f26034o += r0 / this.f25958b.f25921d;
            }
            this.f26033n = 0;
        }
    }

    @Override // y9.p
    public final void j() {
        this.f26032m = qb.v.f20833f;
    }
}
