package wt;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class u0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient b1 f24660a;

    public u0(String str, Throwable th2, b1 b1Var) {
        super(str);
        this.f24660a = b1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return br.l.a(u0Var.getMessage(), getMessage()) && br.l.a(u0Var.f24660a, this.f24660a) && br.l.a(u0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        br.l.b(message);
        int iHashCode = (this.f24660a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f24660a;
    }
}
