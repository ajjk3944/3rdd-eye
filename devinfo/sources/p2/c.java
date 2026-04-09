package p2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f31040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31041b;

    public c(int i4, int i10) {
        this.f31040a = i4;
        this.f31041b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f31040a == cVar.f31040a && this.f31041b == cVar.f31041b;
    }

    public final int hashCode() {
        return (this.f31040a * 31) + this.f31041b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f31040a);
        sb2.append(", columnCount=");
        return d.h.u(sb2, this.f31041b, ')');
    }
}
