package yj;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37638a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37639b;

    public i(Object obj, Object obj2) {
        this.f37638a = obj;
        this.f37639b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return nk.k.a(this.f37638a, iVar.f37638a) && nk.k.a(this.f37639b, iVar.f37639b);
    }

    public final int hashCode() {
        Object obj = this.f37638a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f37639b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f37638a + ", " + this.f37639b + ')';
    }
}
