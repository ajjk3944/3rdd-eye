package A7;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f359a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f360b;

    /* renamed from: c, reason: collision with root package name */
    private final int f361c;

    public c(int i10, boolean z10, int i11) {
        this.f359a = i10;
        this.f360b = z10;
        this.f361c = i11;
    }

    public final int a() {
        return this.f361c;
    }

    public final int b() {
        return this.f359a;
    }

    public final boolean c() {
        return this.f360b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f359a == cVar.f359a && this.f360b == cVar.f360b && this.f361c == cVar.f361c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f359a) * 31;
        boolean z10 = this.f360b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((iHashCode + i10) * 31) + Integer.hashCode(this.f361c);
    }

    public String toString() {
        return "PacketHeader(version=" + this.f359a + ", isParsableToResult=" + this.f360b + ", dataLength=" + this.f361c + ")";
    }
}
