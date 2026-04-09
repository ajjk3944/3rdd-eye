package hr;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: r, reason: collision with root package name */
    public static final g f10878r = new g(1, 0);

    public g(long j, long j7) {
        super(j, j7, 1L);
    }

    @Override // hr.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f10871a == gVar.f10871a && this.f10872d == gVar.f10872d;
    }

    @Override // hr.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f10871a;
        long j7 = 31 * (j ^ (j >>> 32));
        long j10 = this.f10872d;
        return (int) (j7 + (j10 ^ (j10 >>> 32)));
    }

    @Override // hr.e
    public final boolean isEmpty() {
        return this.f10871a > this.f10872d;
    }

    @Override // hr.e
    public final String toString() {
        return this.f10871a + ".." + this.f10872d;
    }
}
