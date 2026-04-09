package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qi0 implements gx0 {
    public final /* synthetic */ InputStream f;

    public qi0(us0 us0Var, InputStream inputStream) {
        this.f = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.close();
    }

    @Override // defpackage.gx0
    public final long e(ac acVar, long j) throws IOException {
        try {
            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
            xt0 xt0VarI = acVar.i(1);
            int i = this.f.read(xt0VarI.a, xt0VarI.c, (int) Math.min(8192L, 8192 - xt0VarI.c));
            if (i != -1) {
                xt0VarI.c += i;
                long j2 = i;
                acVar.g += j2;
                return j2;
            }
            if (xt0VarI.b != xt0VarI.c) {
                return -1L;
            }
            acVar.f = xt0VarI.a();
            zt0.r(xt0VarI);
            return -1L;
        } catch (AssertionError e) {
            if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public final String toString() {
        return "source(" + this.f + ")";
    }
}
