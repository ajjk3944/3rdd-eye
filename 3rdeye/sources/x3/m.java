package x3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f47724a;

    public m(ArrayList arrayList) {
        this.f47724a = arrayList;
    }

    @Override // x3.w
    public final List<D> a() {
        return this.f47724a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f47724a.equals(((w) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f47724a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f47724a + "}";
    }
}
