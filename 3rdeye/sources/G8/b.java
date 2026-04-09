package G8;

import B4.f;
import B4.g;

/* compiled from: SecretItem.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1941b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1942c;

    public b(int i, String str, String str2) {
        this.f1940a = i;
        this.f1941b = str;
        this.f1942c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1940a == bVar.f1940a && this.f1941b.equals(bVar.f1941b) && this.f1942c.equals(bVar.f1942c);
    }

    public final int hashCode() {
        return this.f1942c.hashCode() + g.n(this.f1940a * 31, 31, this.f1941b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecretItem(id=");
        sb.append(this.f1940a);
        sb.append(", title=");
        sb.append(this.f1941b);
        sb.append(", description=");
        return f.c(sb, this.f1942c, ")");
    }
}
