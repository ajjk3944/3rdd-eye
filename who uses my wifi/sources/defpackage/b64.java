package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b64 extends InputStream {
    public Iterator f;
    public ByteBuffer g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public byte[] l;
    public int m;
    public long n;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.f;
        do {
            this.i++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.g = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.j = this.g.position();
        if (this.g.hasArray()) {
            this.k = true;
            this.l = this.g.array();
            this.m = this.g.arrayOffset();
        } else {
            this.k = false;
            this.n = g74.n(this.g);
            this.l = null;
        }
        return true;
    }

    public final void c(int i) {
        int i2 = this.j + i;
        this.j = i2;
        if (i2 == this.g.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.i == this.h) {
            return -1;
        }
        if (this.k) {
            int i = this.l[this.j + this.m] & 255;
            c(1);
            return i;
        }
        int iA1 = g74.c.A1(this.j + this.n) & 255;
        c(1);
        return iA1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.i == this.h) {
            return -1;
        }
        int iLimit = this.g.limit();
        int i3 = this.j;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.k) {
            System.arraycopy(this.l, i3 + this.m, bArr, i, i2);
            c(i2);
            return i2;
        }
        int iPosition = this.g.position();
        this.g.position(this.j);
        this.g.get(bArr, i, i2);
        this.g.position(iPosition);
        c(i2);
        return i2;
    }
}
