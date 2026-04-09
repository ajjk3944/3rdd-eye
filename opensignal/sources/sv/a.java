package sv;

import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22363a;

    public a(String str) {
        this.f22363a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l.a(this.f22363a, ((a) obj).f22363a);
    }

    public final int hashCode() {
        return this.f22363a.hashCode();
    }

    public final String toString() {
        return this.f22363a;
    }
}
