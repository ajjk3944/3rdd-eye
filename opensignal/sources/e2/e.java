package e2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f7683b = new e(new hr.a());

    /* renamed from: a, reason: collision with root package name */
    public final hr.a f7684a;

    public e(hr.a aVar) {
        this.f7684a = aVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final hr.a a() {
        return this.f7684a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f7684a.equals(((e) obj).f7684a);
    }

    public final int hashCode() {
        return (this.f7684a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f7684a + ", steps=0)";
    }
}
