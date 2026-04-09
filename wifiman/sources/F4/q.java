package F4;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final A f6002a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6003b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6004c;

    private q(Class cls, int i10, int i11) {
        this(A.b(cls), i10, i11);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(A a10) {
        return new q(a10, 1, 0);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q k(A a10) {
        return new q(a10, 1, 1);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public A c() {
        return this.f6002a;
    }

    public boolean d() {
        return this.f6004c == 2;
    }

    public boolean e() {
        return this.f6004c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f6002a.equals(qVar.f6002a) && this.f6003b == qVar.f6003b && this.f6004c == qVar.f6004c;
    }

    public boolean f() {
        return this.f6003b == 1;
    }

    public boolean g() {
        return this.f6003b == 2;
    }

    public int hashCode() {
        return ((((this.f6002a.hashCode() ^ 1000003) * 1000003) ^ this.f6003b) * 1000003) ^ this.f6004c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f6002a);
        sb2.append(", type=");
        int i10 = this.f6003b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f6004c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(A a10, int i10, int i11) {
        this.f6002a = (A) z.c(a10, "Null dependency anInterface.");
        this.f6003b = i10;
        this.f6004c = i11;
    }
}
