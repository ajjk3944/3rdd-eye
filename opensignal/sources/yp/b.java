package yp;

import br.l;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f26411a;

    public b(String str) {
        l.e(str, "question");
        this.f26411a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.a(this.f26411a, ((b) obj).f26411a);
    }

    public final int hashCode() {
        return this.f26411a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("Success(question="), this.f26411a, ')');
    }
}
