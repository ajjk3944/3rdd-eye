package hm;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements f {

    /* renamed from: a, reason: collision with root package name */
    public final u f25200a;

    /* renamed from: b, reason: collision with root package name */
    public final e f25201b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25202c;

    public p(u uVar) {
        nk.k.e(uVar, "sink");
        this.f25200a = uVar;
        this.f25201b = new e();
    }

    @Override // hm.f
    public final f J(h hVar) {
        nk.k.e(hVar, "byteString");
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.y(hVar);
        c();
        return this;
    }

    @Override // hm.u
    public final void Q(e eVar, long j) {
        nk.k.e(eVar, "source");
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.Q(eVar, j);
        c();
    }

    public final f c() {
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f25201b;
        long jG = eVar.g();
        if (jG > 0) {
            this.f25200a.Q(eVar, jG);
        }
        return this;
    }

    @Override // hm.u, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        u uVar = this.f25200a;
        if (this.f25202c) {
            return;
        }
        try {
            e eVar = this.f25201b;
            long j = eVar.f25174b;
            if (j > 0) {
                uVar.Q(eVar, j);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            uVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f25202c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // hm.f, hm.u, java.io.Flushable
    public final void flush() {
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f25201b;
        long j = eVar.f25174b;
        u uVar = this.f25200a;
        if (j > 0) {
            uVar.Q(eVar, j);
        }
        uVar.flush();
    }

    @Override // hm.f
    public final e getBuffer() {
        return this.f25201b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f25202c;
    }

    @Override // hm.u
    public final y timeout() {
        return this.f25200a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f25200a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        nk.k.e(byteBuffer, "source");
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f25201b.write(byteBuffer);
        c();
        return iWrite;
    }

    @Override // hm.f
    public final f writeByte(int i4) {
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.E(i4);
        c();
        return this;
    }

    @Override // hm.f
    public final f writeInt(int i4) {
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.L(i4);
        c();
        return this;
    }

    @Override // hm.f
    public final f writeShort(int i4) {
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.N(i4);
        c();
        return this;
    }

    @Override // hm.f
    public final f writeUtf8(String str) {
        nk.k.e(str, "string");
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.T(str);
        c();
        return this;
    }

    @Override // hm.f
    public final f x(int i4, byte[] bArr) {
        if (this.f25202c) {
            throw new IllegalStateException("closed");
        }
        this.f25201b.write(bArr, 0, i4);
        c();
        return this;
    }

    @Override // hm.f
    public final f write(byte[] bArr) {
        nk.k.e(bArr, "source");
        if (!this.f25202c) {
            this.f25201b.write(bArr, 0, bArr.length);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
