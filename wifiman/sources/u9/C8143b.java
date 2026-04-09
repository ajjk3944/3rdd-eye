package u9;

/* renamed from: u9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8143b {

    /* renamed from: a, reason: collision with root package name */
    private final int f62741a;

    public C8143b(int i10) {
        this.f62741a = i10;
    }

    public final int a() {
        return this.f62741a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8143b) && this.f62741a == ((C8143b) obj).f62741a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f62741a);
    }

    public String toString() {
        return "Field(length=" + this.f62741a + ")";
    }
}
