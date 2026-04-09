package vl;

import b5.i0;
import hm.w;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends hm.i {

    /* renamed from: b, reason: collision with root package name */
    public final long f36318b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36319c;

    /* renamed from: d, reason: collision with root package name */
    public long f36320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36322f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f36323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i0 i0Var, w wVar, long j, boolean z3) {
        super(wVar);
        nk.k.e(wVar, "delegate");
        this.f36323h = i0Var;
        this.f36318b = j;
        this.f36319c = z3;
        this.f36321e = true;
        if (j == 0) {
            c(null);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f36322f) {
            return iOException;
        }
        this.f36322f = true;
        if (iOException == null && this.f36321e) {
            this.f36321e = false;
        }
        return i0.b(this.f36323h, this.f36319c, iOException, 8);
    }

    @Override // hm.i, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
            c(null);
        } catch (IOException e2) {
            IOException iOExceptionC = c(e2);
            nk.k.b(iOExceptionC);
            throw iOExceptionC;
        }
    }

    @Override // hm.w
    public final long n(hm.e eVar, long j) throws IOException {
        i0 i0Var = this.f36323h;
        nk.k.e(eVar, "sink");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jN = this.f25179a.n(eVar, 8192L);
            if (this.f36321e) {
                this.f36321e = false;
            }
            if (jN == -1) {
                c(null);
                return -1L;
            }
            long j8 = this.f36320d + jN;
            long j9 = this.f36318b;
            if (j9 == -1 || j8 <= j9) {
                this.f36320d = j8;
                if (((wl.f) i0Var.f1823d).a()) {
                    c(null);
                }
                return jN;
            }
            throw new ProtocolException("expected " + j9 + " bytes but received " + j8);
        } catch (IOException e2) {
            IOException iOExceptionC = c(e2);
            nk.k.b(iOExceptionC);
            throw iOExceptionC;
        }
    }
}
