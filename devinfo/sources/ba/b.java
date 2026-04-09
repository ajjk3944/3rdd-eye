package ba;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2089a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f2089a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f2089a.equals(((b) obj).f2089a);
    }

    public final int hashCode() {
        return this.f2089a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return h.w(new StringBuilder("Encoding{name=\""), this.f2089a, "\"}");
    }
}
