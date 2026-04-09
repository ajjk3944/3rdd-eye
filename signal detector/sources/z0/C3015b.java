package z0;

import j$.util.Objects;
import java.util.HashSet;
import java.util.List;
import q5.i;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3015b {

    /* renamed from: a, reason: collision with root package name */
    public final List f24439a;

    public C3015b(List list) {
        i.e(list, "topics");
        this.f24439a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3015b)) {
            return false;
        }
        List list = this.f24439a;
        C3015b c3015b = (C3015b) obj;
        if (list.size() != c3015b.f24439a.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(c3015b.f24439a));
    }

    public final int hashCode() {
        return Objects.hash(this.f24439a);
    }

    public final String toString() {
        return "Topics=" + this.f24439a;
    }
}
