package F3;

/* loaded from: classes.dex */
final class L extends O {

    /* renamed from: a, reason: collision with root package name */
    private final String f5865a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5866b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5867c;

    /* synthetic */ L(String str, boolean z10, int i10, K k10) {
        this.f5865a = str;
        this.f5866b = z10;
        this.f5867c = i10;
    }

    @Override // F3.O
    public final int a() {
        return this.f5867c;
    }

    @Override // F3.O
    public final String b() {
        return this.f5865a;
    }

    @Override // F3.O
    public final boolean c() {
        return this.f5866b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O) {
            O o10 = (O) obj;
            if (this.f5865a.equals(o10.b()) && this.f5866b == o10.c() && this.f5867c == o10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5865a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f5866b ? 1237 : 1231)) * 1000003) ^ this.f5867c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5865a + ", enableFirelog=" + this.f5866b + ", firelogEventType=" + this.f5867c + "}";
    }
}
