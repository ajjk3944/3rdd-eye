package x3;

import N7.C1094a9;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
public final class u extends E {

    /* renamed from: a, reason: collision with root package name */
    public final long f47756a;

    public u(long j4) {
        this.f47756a = j4;
    }

    @Override // x3.E
    public final long b() {
        return this.f47756a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof E) && this.f47756a == ((E) obj).b();
    }

    public final int hashCode() {
        long j4 = this.f47756a;
        return ((int) (j4 ^ (j4 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return C1094a9.f(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f47756a, "}");
    }
}
