package cv;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y implements h {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f6750a;

    /* renamed from: d, reason: collision with root package name */
    public final g f6751d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6752g;

    public y(d0 d0Var) {
        br.l.e(d0Var, "sink");
        this.f6750a = d0Var;
        this.f6751d = new g();
    }

    @Override // cv.h
    public final h B(j jVar) {
        br.l.e(jVar, "byteString");
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.n0(jVar);
        b();
        return this;
    }

    @Override // cv.h
    public final h H(String str) {
        br.l.e(str, "string");
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.u0(str);
        b();
        return this;
    }

    @Override // cv.h
    public final h M(String str, int i10, int i11) {
        br.l.e(str, "string");
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.v0(str, i10, i11);
        b();
        return this;
    }

    @Override // cv.h
    public final h P(long j) {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.r0(j);
        b();
        return this;
    }

    public final h b() {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f6751d;
        long jF = gVar.f();
        if (jF > 0) {
            this.f6750a.d0(gVar, jF);
        }
        return this;
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        d0 d0Var = this.f6750a;
        if (this.f6752g) {
            return;
        }
        try {
            g gVar = this.f6751d;
            long j = gVar.f6706d;
            if (j > 0) {
                d0Var.d0(gVar, j);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f6752g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // cv.d0
    public final void d0(g gVar, long j) {
        br.l.e(gVar, "source");
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.d0(gVar, j);
        b();
    }

    @Override // cv.h, cv.d0, java.io.Flushable
    public final void flush() {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f6751d;
        long j = gVar.f6706d;
        d0 d0Var = this.f6750a;
        if (j > 0) {
            d0Var.d0(gVar, j);
        }
        d0Var.flush();
    }

    @Override // cv.d0
    public final h0 g() {
        return this.f6750a.g();
    }

    @Override // cv.h
    public final h h0(long j) {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.q0(j);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6752g;
    }

    public final String toString() {
        return "buffer(" + this.f6750a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        br.l.e(byteBuffer, "source");
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f6751d.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // cv.h
    public final h writeByte(int i10) {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.p0(i10);
        b();
        return this;
    }

    @Override // cv.h
    public final h writeInt(int i10) {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.s0(i10);
        b();
        return this;
    }

    @Override // cv.h
    public final h writeShort(int i10) {
        if (this.f6752g) {
            throw new IllegalStateException("closed");
        }
        this.f6751d.t0(i10);
        b();
        return this;
    }

    @Override // cv.h
    public final h write(byte[] bArr) {
        if (!this.f6752g) {
            this.f6751d.i0(bArr.length, bArr);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
