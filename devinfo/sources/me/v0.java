package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v0 extends a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29331b;

    /* renamed from: c, reason: collision with root package name */
    public final List f29332c;

    public v0(int i4, List list, String str) {
        this.f29330a = str;
        this.f29331b = i4;
        this.f29332c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f29330a.equals(v0Var.f29330a) && this.f29331b == v0Var.f29331b && this.f29332c.equals(v0Var.f29332c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29330a.hashCode() ^ 1000003) * 1000003) ^ this.f29331b) * 1000003) ^ this.f29332c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f29330a + ", importance=" + this.f29331b + ", frames=" + this.f29332c + "}";
    }
}
