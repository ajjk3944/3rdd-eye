package W;

/* compiled from: AutoValue_RecordingStats.java */
/* renamed from: W.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1624l extends N {

    /* renamed from: a, reason: collision with root package name */
    public final long f13279a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13280b;

    /* renamed from: c, reason: collision with root package name */
    public final C1616d f13281c;

    public C1624l(long j4, long j10, C1616d c1616d) {
        this.f13279a = j4;
        this.f13280b = j10;
        this.f13281c = c1616d;
    }

    @Override // W.N
    public final AbstractC1614b a() {
        return this.f13281c;
    }

    @Override // W.N
    public final long b() {
        return this.f13280b;
    }

    @Override // W.N
    public final long c() {
        return this.f13279a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n9 = (N) obj;
        return this.f13279a == n9.c() && this.f13280b == n9.b() && this.f13281c.equals(n9.a());
    }

    public final int hashCode() {
        long j4 = this.f13279a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f13280b;
        return ((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13281c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f13279a + ", numBytesRecorded=" + this.f13280b + ", audioStats=" + this.f13281c + "}";
    }
}
