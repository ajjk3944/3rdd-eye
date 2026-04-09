package ej;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class m implements InterfaceC5476D {

    /* renamed from: a, reason: collision with root package name */
    private byte f46481a;

    /* renamed from: b, reason: collision with root package name */
    private final x f46482b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f46483c;

    /* renamed from: d, reason: collision with root package name */
    private final n f46484d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f46485e;

    public m(InterfaceC5476D source) {
        AbstractC6492s.i(source, "source");
        x xVar = new x(source);
        this.f46482b = xVar;
        Inflater inflater = new Inflater(true);
        this.f46483c = inflater;
        this.f46484d = new n((InterfaceC5483g) xVar, inflater);
        this.f46485e = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        AbstractC6492s.h(str2, "format(...)");
        throw new IOException(str2);
    }

    private final void g() throws IOException {
        this.f46482b.g0(10L);
        byte bF0 = this.f46482b.f46522b.f0(3L);
        boolean z10 = ((bF0 >> 1) & 1) == 1;
        if (z10) {
            j(this.f46482b.f46522b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f46482b.readShort());
        this.f46482b.d(8L);
        if (((bF0 >> 2) & 1) == 1) {
            this.f46482b.g0(2L);
            if (z10) {
                j(this.f46482b.f46522b, 0L, 2L);
            }
            long jX0 = this.f46482b.f46522b.x0() & 65535;
            this.f46482b.g0(jX0);
            if (z10) {
                j(this.f46482b.f46522b, 0L, jX0);
            }
            this.f46482b.d(jX0);
        }
        if (((bF0 >> 3) & 1) == 1) {
            long jJ0 = this.f46482b.j0((byte) 0);
            if (jJ0 == -1) {
                throw new EOFException();
            }
            if (z10) {
                j(this.f46482b.f46522b, 0L, jJ0 + 1);
            }
            this.f46482b.d(jJ0 + 1);
        }
        if (((bF0 >> 4) & 1) == 1) {
            long jJ02 = this.f46482b.j0((byte) 0);
            if (jJ02 == -1) {
                throw new EOFException();
            }
            if (z10) {
                j(this.f46482b.f46522b, 0L, jJ02 + 1);
            }
            this.f46482b.d(jJ02 + 1);
        }
        if (z10) {
            a("FHCRC", this.f46482b.s(), (short) this.f46485e.getValue());
            this.f46485e.reset();
        }
    }

    private final void h() throws IOException {
        a("CRC", this.f46482b.p(), (int) this.f46485e.getValue());
        a("ISIZE", this.f46482b.p(), (int) this.f46483c.getBytesWritten());
    }

    private final void j(C5481e c5481e, long j10, long j11) {
        y yVar = c5481e.f46459a;
        AbstractC6492s.f(yVar);
        while (true) {
            int i10 = yVar.f46528c;
            int i11 = yVar.f46527b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
        }
        while (j11 > 0) {
            int iMin = (int) Math.min(yVar.f46528c - r6, j11);
            this.f46485e.update(yVar.f46526a, (int) (yVar.f46527b + j10), iMin);
            j11 -= iMin;
            yVar = yVar.f46531f;
            AbstractC6492s.f(yVar);
            j10 = 0;
        }
    }

    @Override // ej.InterfaceC5476D
    public long U(C5481e sink, long j10) throws DataFormatException, IOException {
        AbstractC6492s.i(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f46481a == 0) {
            g();
            this.f46481a = (byte) 1;
        }
        if (this.f46481a == 1) {
            long jD0 = sink.D0();
            long jU = this.f46484d.U(sink, j10);
            if (jU != -1) {
                j(sink, jD0, jU);
                return jU;
            }
            this.f46481a = (byte) 2;
        }
        if (this.f46481a == 2) {
            h();
            this.f46481a = (byte) 3;
            if (!this.f46482b.t()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // ej.InterfaceC5476D
    /* renamed from: c */
    public E getTimeout() {
        return this.f46482b.getTimeout();
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46484d.close();
    }
}
