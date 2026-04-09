package hm;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f25186a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f25187b;

    /* renamed from: c, reason: collision with root package name */
    public int f25188c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25189d;

    public l(q qVar, Inflater inflater) {
        this.f25186a = qVar;
        this.f25187b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25189d) {
            return;
        }
        this.f25187b.end();
        this.f25189d = true;
        this.f25186a.close();
    }

    @Override // hm.w
    public final long n(e eVar, long j) throws DataFormatException, IOException {
        long j8;
        Inflater inflater = this.f25187b;
        nk.k.e(eVar, "sink");
        while (!this.f25189d) {
            try {
                r rVarW = eVar.w(1);
                int iMin = (int) Math.min(8192L, 8192 - rVarW.f25208c);
                boolean zNeedsInput = inflater.needsInput();
                q qVar = this.f25186a;
                if (zNeedsInput && !qVar.exhausted()) {
                    r rVar = qVar.f25204b.f25173a;
                    nk.k.b(rVar);
                    int i4 = rVar.f25208c;
                    int i10 = rVar.f25207b;
                    int i11 = i4 - i10;
                    this.f25188c = i11;
                    inflater.setInput(rVar.f25206a, i10, i11);
                }
                int iInflate = inflater.inflate(rVarW.f25206a, rVarW.f25208c, iMin);
                int i12 = this.f25188c;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f25188c -= remaining;
                    qVar.skip(remaining);
                }
                if (iInflate > 0) {
                    rVarW.f25208c += iInflate;
                    j8 = iInflate;
                    eVar.f25174b += j8;
                } else {
                    if (rVarW.f25207b == rVarW.f25208c) {
                        eVar.f25173a = rVarW.a();
                        s.a(rVarW);
                    }
                    j8 = 0;
                }
                if (j8 > 0) {
                    return j8;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (qVar.exhausted()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f25186a.f25203a.timeout();
    }
}
