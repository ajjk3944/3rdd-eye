package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f2735c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f2736d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2738b;

    public s(int i4, boolean z3) {
        this.f2737a = i4;
        this.f2738b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2737a == sVar.f2737a && this.f2738b == sVar.f2738b;
    }

    public final int hashCode() {
        return (this.f2737a * 31) + (this.f2738b ? 1231 : 1237);
    }

    public final String toString() {
        return equals(f2735c) ? "TextMotion.Static" : equals(f2736d) ? "TextMotion.Animated" : "Invalid";
    }
}
