package ia;

import io.appmetrica.analytics.impl.Oo;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes3.dex */
public final class o implements C {

    /* renamed from: b, reason: collision with root package name */
    public final w f38664b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f38665c;

    /* renamed from: d, reason: collision with root package name */
    public int f38666d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38667e;

    public o(w wVar, Inflater inflater) {
        this.f38664b = wVar;
        this.f38665c = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f38667e) {
            return;
        }
        this.f38665c.end();
        this.f38667e = true;
        this.f38664b.close();
    }

    @Override // ia.C
    public final long read(C4468d sink, long j4) throws IOException {
        long j10;
        kotlin.jvm.internal.l.f(sink, "sink");
        while (j4 >= 0) {
            if (this.f38667e) {
                throw new IllegalStateException("closed");
            }
            w wVar = this.f38664b;
            Inflater inflater = this.f38665c;
            if (j4 == 0) {
                j10 = 0;
            } else {
                try {
                    x xVarW0 = sink.w0(1);
                    int iMin = (int) Math.min(j4, 8192 - xVarW0.f38690c);
                    if (inflater.needsInput() && !wVar.K()) {
                        x xVar = wVar.f38685c.f38642b;
                        kotlin.jvm.internal.l.c(xVar);
                        int i = xVar.f38690c;
                        int i10 = xVar.f38689b;
                        int i11 = i - i10;
                        this.f38666d = i11;
                        inflater.setInput(xVar.f38688a, i10, i11);
                    }
                    int iInflate = inflater.inflate(xVarW0.f38688a, xVarW0.f38690c, iMin);
                    int i12 = this.f38666d;
                    if (i12 != 0) {
                        int remaining = i12 - inflater.getRemaining();
                        this.f38666d -= remaining;
                        wVar.skip(remaining);
                    }
                    if (iInflate > 0) {
                        xVarW0.f38690c += iInflate;
                        j10 = iInflate;
                        sink.f38643c += j10;
                    } else {
                        if (xVarW0.f38689b == xVarW0.f38690c) {
                            sink.f38642b = xVarW0.a();
                            y.a(xVarW0);
                        }
                        j10 = 0;
                    }
                } catch (DataFormatException e4) {
                    throw new IOException(e4);
                }
            }
            if (j10 > 0) {
                return j10;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (wVar.K()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
    }

    @Override // ia.C
    public final D timeout() {
        return this.f38664b.f38684b.timeout();
    }
}
