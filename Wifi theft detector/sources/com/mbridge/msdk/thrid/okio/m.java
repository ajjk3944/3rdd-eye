package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f18183a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final r f18184b;

    /* renamed from: c, reason: collision with root package name */
    boolean f18185c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f18184b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f18183a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f18184b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f18185c) {
            return;
        }
        try {
            c cVar = this.f18183a;
            long j10 = cVar.f18158b;
            if (j10 > 0) {
                this.f18184b.a(cVar, j10);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f18184b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f18185c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f18183a.m();
        if (jM > 0) {
            this.f18184b.a(this.f18183a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f18183a;
        long j10 = cVar.f18158b;
        if (j10 > 0) {
            this.f18184b.a(cVar, j10);
        }
        this.f18184b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f18185c;
    }

    public String toString() {
        return "buffer(" + this.f18184b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        this.f18183a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        this.f18183a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        this.f18183a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        this.f18183a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f18185c) {
            throw new IllegalStateException("closed");
        }
        this.f18183a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f18185c) {
            this.f18183a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f18185c) {
            this.f18183a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f18185c) {
            int iWrite = this.f18183a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f18185c) {
            this.f18183a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
