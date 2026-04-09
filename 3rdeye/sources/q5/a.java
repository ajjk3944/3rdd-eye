package q5;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f45436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45437b;

    public a(String str, String str2) {
        this.f45436a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f45437b = str2;
    }

    @Override // q5.d
    public final String a() {
        return this.f45436a;
    }

    @Override // q5.d
    public final String b() {
        return this.f45437b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f45436a.equals(dVar.a()) && this.f45437b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f45436a.hashCode() ^ 1000003) * 1000003) ^ this.f45437b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f45436a);
        sb.append(", version=");
        return B4.f.c(sb, this.f45437b, "}");
    }
}
