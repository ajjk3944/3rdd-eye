package r2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f21220c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f21221d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f21222a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21223b;

    public s(int i10, boolean z10) {
        this.f21222a = i10;
        this.f21223b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f21222a == sVar.f21222a && this.f21223b == sVar.f21223b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21223b) + (Integer.hashCode(this.f21222a) * 31);
    }

    public final String toString() {
        return equals(f21220c) ? "TextMotion.Static" : equals(f21221d) ? "TextMotion.Animated" : "Invalid";
    }
}
