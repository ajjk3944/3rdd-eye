package w3;

/* loaded from: classes2.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f24833a;

    public f(long j10) {
        this.f24833a = j10;
    }

    @Override // w3.j
    public long c() {
        return this.f24833a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j) && this.f24833a == ((j) obj).c();
    }

    public int hashCode() {
        long j10 = this.f24833a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f24833a + "}";
    }
}
