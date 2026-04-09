package ia;

import java.io.IOException;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes3.dex */
public abstract class j implements A {
    private final A delegate;

    public j(A delegate) {
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final A m140deprecated_delegate() {
        return this.delegate;
    }

    @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final A delegate() {
        return this.delegate;
    }

    @Override // ia.A, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // ia.A
    public D timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // ia.A
    public void write(C4468d source, long j4) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        this.delegate.write(source, j4);
    }
}
