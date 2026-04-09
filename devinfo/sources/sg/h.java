package sg;

import java.util.List;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f33616a;

    /* renamed from: b, reason: collision with root package name */
    public final ng.b f33617b;

    public h(List list, ng.b bVar) {
        k.e(list, "partitions");
        this.f33616a = list;
        this.f33617b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.a(this.f33616a, hVar.f33616a) && k.a(this.f33617b, hVar.f33617b);
    }

    public final int hashCode() {
        return this.f33617b.hashCode() + (this.f33616a.hashCode() * 31);
    }

    public final String toString() {
        return "PartitionUiData(partitions=" + this.f33616a + ", searchData=" + this.f33617b + ")";
    }
}
