package ia;

import java.io.EOFException;

/* compiled from: Okio.kt */
/* renamed from: ia.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4467c implements A {
    @Override // ia.A
    public final D timeout() {
        return D.NONE;
    }

    @Override // ia.A
    public final void write(C4468d source, long j4) throws EOFException {
        kotlin.jvm.internal.l.f(source, "source");
        source.skip(j4);
    }

    @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ia.A, java.io.Flushable
    public final void flush() {
    }
}
