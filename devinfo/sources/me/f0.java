package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 extends q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29127a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29128b;

    public f0(String str, String str2) {
        this.f29127a = str;
        this.f29128b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.f29127a.equals(f0Var.f29127a) && this.f29128b.equals(f0Var.f29128b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29127a.hashCode() ^ 1000003) * 1000003) ^ this.f29128b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f29127a);
        sb2.append(", value=");
        return d.h.w(sb2, this.f29128b, "}");
    }
}
