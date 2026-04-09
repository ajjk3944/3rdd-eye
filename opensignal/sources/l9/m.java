package l9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15038a;

    public m(ArrayList arrayList) {
        this.f15038a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.f15038a.equals(((m) ((w) obj)).f15038a);
    }

    public final int hashCode() {
        return this.f15038a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f15038a + "}";
    }
}
