package lq;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f15573a;

    public n(Throwable th2) {
        br.l.e(th2, "exception");
        this.f15573a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return br.l.a(this.f15573a, ((n) obj).f15573a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15573a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f15573a + ')';
    }
}
