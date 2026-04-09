package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c1 extends f2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29089a;

    public c1(String str) {
        this.f29089a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.f29089a.equals(((c1) ((f2) obj)).f29089a);
    }

    public final int hashCode() {
        return this.f29089a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d.h.w(new StringBuilder("Log{content="), this.f29089a, "}");
    }
}
