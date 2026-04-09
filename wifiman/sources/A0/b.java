package A0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final float f208a;

    /* renamed from: b, reason: collision with root package name */
    private final float f209b;

    /* renamed from: c, reason: collision with root package name */
    private final long f210c;

    /* renamed from: d, reason: collision with root package name */
    private final int f211d;

    public b(float f10, float f11, long j10, int i10) {
        this.f208a = f10;
        this.f209b = f11;
        this.f210c = j10;
        this.f211d = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f208a == this.f208a && bVar.f209b == this.f209b && bVar.f210c == this.f210c && bVar.f211d == this.f211d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f208a) * 31) + Float.hashCode(this.f209b)) * 31) + Long.hashCode(this.f210c)) * 31) + Integer.hashCode(this.f211d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f208a + ",horizontalScrollPixels=" + this.f209b + ",uptimeMillis=" + this.f210c + ",deviceId=" + this.f211d + ')';
    }
}
