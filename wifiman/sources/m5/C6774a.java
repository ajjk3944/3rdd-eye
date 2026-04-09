package m5;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6774a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f53140a;

    /* renamed from: b, reason: collision with root package name */
    private final String f53141b;

    C6774a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f53140a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f53141b = str2;
    }

    @Override // m5.f
    public String b() {
        return this.f53140a;
    }

    @Override // m5.f
    public String c() {
        return this.f53141b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f53140a.equals(fVar.b()) && this.f53141b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f53140a.hashCode() ^ 1000003) * 1000003) ^ this.f53141b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f53140a + ", version=" + this.f53141b + "}";
    }
}
