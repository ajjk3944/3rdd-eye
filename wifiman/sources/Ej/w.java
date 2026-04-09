package ej;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class w implements InterfaceC5482f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5474B f46518a;

    /* renamed from: b, reason: collision with root package name */
    public final C5481e f46519b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46520c;

    public w(InterfaceC5474B sink) {
        AbstractC6492s.i(sink, "sink");
        this.f46518a = sink;
        this.f46519b = new C5481e();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f F(String string) {
        AbstractC6492s.i(string, "string");
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.F(string);
        return z();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f H(String string, int i10, int i11) {
        AbstractC6492s.i(string, "string");
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.H(string, i10, i11);
        return z();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f K(long j10) {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.K(j10);
        return z();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f R(h byteString) {
        AbstractC6492s.i(byteString, "byteString");
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.R(byteString);
        return z();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f X(byte[] source) {
        AbstractC6492s.i(source, "source");
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.X(source);
        return z();
    }

    @Override // ej.InterfaceC5474B
    public void Z(C5481e source, long j10) {
        AbstractC6492s.i(source, "source");
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.Z(source, j10);
        z();
    }

    @Override // ej.InterfaceC5482f
    public C5481e b() {
        return this.f46519b;
    }

    @Override // ej.InterfaceC5474B
    public E c() {
        return this.f46518a.c();
    }

    @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f46520c) {
            return;
        }
        try {
            if (this.f46519b.D0() > 0) {
                InterfaceC5474B interfaceC5474B = this.f46518a;
                C5481e c5481e = this.f46519b;
                interfaceC5474B.Z(c5481e, c5481e.D0());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f46518a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f46520c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ej.InterfaceC5482f
    public long e0(InterfaceC5476D source) {
        AbstractC6492s.i(source, "source");
        long j10 = 0;
        while (true) {
            long jU = source.U(this.f46519b, 8192L);
            if (jU == -1) {
                return j10;
            }
            j10 += jU;
            z();
        }
    }

    @Override // ej.InterfaceC5482f, ej.InterfaceC5474B, java.io.Flushable
    public void flush() {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        if (this.f46519b.D0() > 0) {
            InterfaceC5474B interfaceC5474B = this.f46518a;
            C5481e c5481e = this.f46519b;
            interfaceC5474B.Z(c5481e, c5481e.D0());
        }
        this.f46518a.flush();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f h0(long j10) {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.h0(j10);
        return z();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f46520c;
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f m() {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        long jD0 = this.f46519b.D0();
        if (jD0 > 0) {
            this.f46518a.Z(this.f46519b, jD0);
        }
        return this;
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f n(int i10) {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.n(i10);
        return z();
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f o(int i10) {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.o(i10);
        return z();
    }

    public String toString() {
        return "buffer(" + this.f46518a + ')';
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f u(int i10) {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        this.f46519b.u(i10);
        return z();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC6492s.i(source, "source");
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f46519b.write(source);
        z();
        return iWrite;
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f z() {
        if (this.f46520c) {
            throw new IllegalStateException("closed");
        }
        long jP = this.f46519b.p();
        if (jP > 0) {
            this.f46518a.Z(this.f46519b, jP);
        }
        return this;
    }

    @Override // ej.InterfaceC5482f
    public InterfaceC5482f write(byte[] source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        if (!this.f46520c) {
            this.f46519b.write(source, i10, i11);
            return z();
        }
        throw new IllegalStateException("closed");
    }
}
