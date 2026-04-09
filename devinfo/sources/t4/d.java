package t4;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f34168a;

    public d(String str) {
        k.e(str, "name");
        this.f34168a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return k.a(this.f34168a, ((d) obj).f34168a);
    }

    public final int hashCode() {
        return this.f34168a.hashCode();
    }

    public final String toString() {
        return this.f34168a;
    }
}
