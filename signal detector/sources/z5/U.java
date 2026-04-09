package z5;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class U extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient c0 f24506a;

    public U(String str, Throwable th, c0 c0Var) {
        super(str);
        this.f24506a = c0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return q5.i.a(u6.getMessage(), getMessage()) && q5.i.a(u6.f24506a, this.f24506a) && q5.i.a(u6.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        q5.i.b(message);
        int iHashCode = (this.f24506a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f24506a;
    }
}
