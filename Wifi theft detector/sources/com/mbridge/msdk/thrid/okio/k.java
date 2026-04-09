package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class k implements s {

    /* renamed from: a, reason: collision with root package name */
    private final e f18173a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f18174b;

    /* renamed from: c, reason: collision with root package name */
    private int f18175c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18176d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f18173a = eVar;
        this.f18174b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f18175c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f18174b.getRemaining();
        this.f18175c -= remaining;
        this.f18173a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws DataFormatException, IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f18176d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f18174b.inflate(oVarB.f18190a, oVarB.f18192c, (int) Math.min(j10, 8192 - oVarB.f18192c));
                if (iInflate > 0) {
                    oVarB.f18192c += iInflate;
                    long j11 = iInflate;
                    cVar.f18158b += j11;
                    return j11;
                }
                if (!this.f18174b.finished() && !this.f18174b.needsDictionary()) {
                }
                h();
                if (oVarB.f18191b != oVarB.f18192c) {
                    return -1L;
                }
                cVar.f18157a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f18176d) {
            return;
        }
        this.f18174b.end();
        this.f18176d = true;
        this.f18173a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f18174b.needsInput()) {
            return false;
        }
        h();
        if (this.f18174b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f18173a.f()) {
            return true;
        }
        o oVar = this.f18173a.a().f18157a;
        int i10 = oVar.f18192c;
        int i11 = oVar.f18191b;
        int i12 = i10 - i11;
        this.f18175c = i12;
        this.f18174b.setInput(oVar.f18190a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f18173a.b();
    }
}
