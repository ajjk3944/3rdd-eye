package b3;

/* loaded from: classes.dex */
final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    private final long f32922a;

    l(long j10) {
        this.f32922a = j10;
    }

    @Override // b3.v
    public long c() {
        return this.f32922a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f32922a == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f32922a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f32922a + "}";
    }
}
