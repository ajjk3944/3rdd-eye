package w3;

import java.util.List;

/* loaded from: classes2.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final List f24804a;

    public c(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f24804a = list;
    }

    @Override // w3.g
    public List c() {
        return this.f24804a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f24804a.equals(((g) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f24804a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f24804a + "}";
    }
}
