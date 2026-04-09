package d8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f22036a;

    public o(String str) {
        this.f22036a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f22036a.equals(((o) obj).f22036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22036a.hashCode();
    }

    public final String toString() {
        return d.h.w(new StringBuilder("StringHeaderFactory{value='"), this.f22036a, "'}");
    }
}
