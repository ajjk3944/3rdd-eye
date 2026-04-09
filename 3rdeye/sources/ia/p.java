package ia;

import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class p implements C {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f38668b;

    /* renamed from: c, reason: collision with root package name */
    public final D f38669c;

    public p(InputStream input, D timeout) {
        kotlin.jvm.internal.l.f(input, "input");
        kotlin.jvm.internal.l.f(timeout, "timeout");
        this.f38668b = input;
        this.f38669c = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38668b.close();
    }

    @Override // ia.C
    public final long read(C4468d sink, long j4) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        if (j4 == 0) {
            return 0L;
        }
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "byteCount < 0: ").toString());
        }
        try {
            this.f38669c.throwIfReached();
            x xVarW0 = sink.w0(1);
            int i = this.f38668b.read(xVarW0.f38688a, xVarW0.f38690c, (int) Math.min(j4, 8192 - xVarW0.f38690c));
            if (i != -1) {
                xVarW0.f38690c += i;
                long j10 = i;
                sink.f38643c += j10;
                return j10;
            }
            if (xVarW0.f38689b != xVarW0.f38690c) {
                return -1L;
            }
            sink.f38642b = xVarW0.a();
            y.a(xVarW0);
            return -1L;
        } catch (AssertionError e4) {
            if (q.d(e4)) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }

    @Override // ia.C
    public final D timeout() {
        return this.f38669c;
    }

    public final String toString() {
        return "source(" + this.f38668b + ')';
    }
}
