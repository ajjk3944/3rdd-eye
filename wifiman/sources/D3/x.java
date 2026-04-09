package D3;

/* loaded from: classes.dex */
final class x extends B {

    /* renamed from: a, reason: collision with root package name */
    private final String f2882a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2883b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2884c;

    /* synthetic */ x(String str, boolean z10, int i10, w wVar) {
        this.f2882a = str;
        this.f2883b = z10;
        this.f2884c = i10;
    }

    @Override // D3.B
    public final int a() {
        return this.f2884c;
    }

    @Override // D3.B
    public final String b() {
        return this.f2882a;
    }

    @Override // D3.B
    public final boolean c() {
        return this.f2883b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b10 = (B) obj;
            if (this.f2882a.equals(b10.b()) && this.f2883b == b10.c() && this.f2884c == b10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2882a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2883b ? 1237 : 1231)) * 1000003) ^ this.f2884c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f2882a + ", enableFirelog=" + this.f2883b + ", firelogEventType=" + this.f2884c + "}";
    }
}
