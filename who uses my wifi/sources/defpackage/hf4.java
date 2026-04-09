package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hf4 extends bg2 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.bg2, defpackage.qf2
    public final ByteBuffer c() {
        int i;
        if (super.e() && (i = this.n) > 0) {
            i(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override // defpackage.qf2
    public final long d(long j) {
        return Math.max(0L, j - v23.s(this.b.a, this.j + this.i));
    }

    @Override // defpackage.bg2, defpackage.qf2
    public final boolean e() {
        return super.e() && this.n == 0;
    }

    @Override // defpackage.qf2
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += iMin / this.b.d;
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l <= 0) {
            int i2 = i - iMin;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer byteBufferI = i(length);
            int i3 = this.n;
            String str = v23.a;
            int iMax = Math.max(0, Math.min(length, i3));
            byteBufferI.put(this.m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i2));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferI.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i4 = i2 - iMax2;
            int i5 = this.n - iMax;
            this.n = i5;
            byte[] bArr = this.m;
            System.arraycopy(bArr, iMax, bArr, 0, i5);
            byteBuffer.get(this.m, this.n, i4);
            this.n += i4;
            byteBufferI.flip();
        }
    }

    @Override // defpackage.bg2
    public final ce2 k(ce2 ce2Var) throws af2 {
        if (!v23.a(ce2Var.c)) {
            throw new af2("Unhandled input format:", ce2Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? ce2.e : ce2Var;
    }

    @Override // defpackage.bg2
    public final void l() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.bg2
    public final void m() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.bg2
    public final void n() {
        this.m = v23.b;
    }
}
