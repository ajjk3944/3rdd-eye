package h1;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f24808a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f24809b;

    public i(Integer num, int i4) {
        this.f24808a = i4;
        this.f24809b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f24808a == iVar.f24808a && k.a(this.f24809b, iVar.f24809b);
    }

    public final int hashCode() {
        int i4 = this.f24808a * 31;
        Integer num = this.f24809b;
        return i4 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f24808a + ", dataOffset=" + this.f24809b + ')';
    }
}
