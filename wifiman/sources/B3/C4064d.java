package b3;

import java.util.List;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4064d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final List f32873a;

    C4064d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f32873a = list;
    }

    @Override // b3.n
    public List c() {
        return this.f32873a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f32873a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f32873a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f32873a + "}";
    }
}
