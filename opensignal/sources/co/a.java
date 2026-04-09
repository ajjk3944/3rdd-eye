package co;

import br.l;
import h0.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3998b;

    public a(String str, String str2) {
        l.e(str, "key");
        l.e(str2, "value");
        this.f3997a = str;
        this.f3998b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f3997a, aVar.f3997a) && l.a(this.f3998b, aVar.f3998b);
    }

    public final int hashCode() {
        return this.f3998b.hashCode() + (this.f3997a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoreUserTrait(key=");
        sb2.append(this.f3997a);
        sb2.append(", value=");
        return b.r(sb2, this.f3998b, ')');
    }
}
