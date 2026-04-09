package A9;

import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
/* renamed from: A9.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0596p0 extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient C0605u0 f264b;

    public C0596p0(String str, Throwable th, C0605u0 c0605u0) {
        super(str);
        this.f264b = c0605u0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0596p0)) {
            return false;
        }
        C0596p0 c0596p0 = (C0596p0) obj;
        return kotlin.jvm.internal.l.b(c0596p0.getMessage(), getMessage()) && kotlin.jvm.internal.l.b(c0596p0.f264b, this.f264b) && kotlin.jvm.internal.l.b(c0596p0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l.c(message);
        int iHashCode = (this.f264b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f264b;
    }
}
