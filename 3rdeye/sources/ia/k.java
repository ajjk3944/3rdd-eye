package ia;

import java.io.IOException;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes3.dex */
public abstract class k implements C {
    private final C delegate;

    public k(C delegate) {
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final C m141deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final C delegate() {
        return this.delegate;
    }

    @Override // ia.C
    public long read(C4468d sink, long j4) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        return this.delegate.read(sink, j4);
    }

    @Override // ia.C
    public D timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
