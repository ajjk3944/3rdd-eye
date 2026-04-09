package m4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f16278a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16279b;

    public e(long j, long j7) {
        if (j7 == 0) {
            this.f16278a = 0L;
            this.f16279b = 1L;
        } else {
            this.f16278a = j;
            this.f16279b = j7;
        }
    }

    public final String toString() {
        return this.f16278a + "/" + this.f16279b;
    }
}
