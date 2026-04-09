package ej;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class n implements InterfaceC5476D {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5483g f46486a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f46487b;

    /* renamed from: c, reason: collision with root package name */
    private int f46488c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46489d;

    public n(InterfaceC5483g source, Inflater inflater) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(inflater, "inflater");
        this.f46486a = source;
        this.f46487b = inflater;
    }

    private final void h() {
        int i10 = this.f46488c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f46487b.getRemaining();
        this.f46488c -= remaining;
        this.f46486a.d(remaining);
    }

    @Override // ej.InterfaceC5476D
    public long U(C5481e sink, long j10) throws DataFormatException, IOException {
        AbstractC6492s.i(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f46487b.finished() || this.f46487b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f46486a.t());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C5481e sink, long j10) throws DataFormatException, IOException {
        AbstractC6492s.i(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f46489d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            y yVarG0 = sink.G0(1);
            int iMin = (int) Math.min(j10, 8192 - yVarG0.f46528c);
            g();
            int iInflate = this.f46487b.inflate(yVarG0.f46526a, yVarG0.f46528c, iMin);
            h();
            if (iInflate > 0) {
                yVarG0.f46528c += iInflate;
                long j11 = iInflate;
                sink.C0(sink.D0() + j11);
                return j11;
            }
            if (yVarG0.f46527b == yVarG0.f46528c) {
                sink.f46459a = yVarG0.b();
                z.b(yVarG0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // ej.InterfaceC5476D
    public E c() {
        return this.f46486a.c();
    }

    @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f46489d) {
            return;
        }
        this.f46487b.end();
        this.f46489d = true;
        this.f46486a.close();
    }

    public final boolean g() {
        if (!this.f46487b.needsInput()) {
            return false;
        }
        if (this.f46486a.t()) {
            return true;
        }
        y yVar = this.f46486a.b().f46459a;
        AbstractC6492s.f(yVar);
        int i10 = yVar.f46528c;
        int i11 = yVar.f46527b;
        int i12 = i10 - i11;
        this.f46488c = i12;
        this.f46487b.setInput(yVar.f46526a, i11, i12);
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC5476D source, Inflater inflater) {
        this(p.d(source), inflater);
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(inflater, "inflater");
    }
}
