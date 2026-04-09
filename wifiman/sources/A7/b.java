package A7;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f357a;

    /* renamed from: b, reason: collision with root package name */
    private final int f358b;

    public b(int i10, int i11) {
        this.f357a = i10;
        this.f358b = i11;
    }

    public final int a() {
        return this.f358b;
    }

    public final int b() {
        return this.f357a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f357a == bVar.f357a && this.f358b == bVar.f358b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f357a) * 31) + Integer.hashCode(this.f358b);
    }

    public String toString() {
        return "PacketFieldHeader(type=" + this.f357a + ", fieldLength=" + this.f358b + ")";
    }
}
