package h4;

import br.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9895a;

    public e(String str) {
        l.e(str, "name");
        this.f9895a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return l.a(this.f9895a, ((e) obj).f9895a);
    }

    public final int hashCode() {
        return this.f9895a.hashCode();
    }

    public final String toString() {
        return this.f9895a;
    }
}
