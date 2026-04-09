package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j1 extends l2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29193a;

    public j1(String str) {
        this.f29193a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        return this.f29193a.equals(((j1) ((l2) obj)).f29193a);
    }

    public final int hashCode() {
        return this.f29193a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d.h.w(new StringBuilder("User{identifier="), this.f29193a, "}");
    }
}
