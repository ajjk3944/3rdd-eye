package xk;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient f1 f37262a;

    public z0(String str, Throwable th2, f1 f1Var) {
        super(str);
        this.f37262a = f1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (!nk.k.a(z0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = z0Var.f37262a;
        if (obj2 == null) {
            obj2 = i1.f37197b;
        }
        Object obj3 = this.f37262a;
        if (obj3 == null) {
            obj3 = i1.f37197b;
        }
        return nk.k.a(obj2, obj3) && nk.k.a(z0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        nk.k.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f37262a;
        if (obj == null) {
            obj = i1.f37197b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f37262a;
        if (obj == null) {
            obj = i1.f37197b;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
