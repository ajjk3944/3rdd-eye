package ng;

import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17544b;

    public a(String str, String str2) {
        this.f17543a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f17544b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17543a.equals(aVar.f17543a) && this.f17544b.equals(aVar.f17544b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17543a.hashCode() ^ 1000003) * 1000003) ^ this.f17544b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f17543a);
        sb2.append(", version=");
        return g.j(sb2, this.f17544b, "}");
    }
}
