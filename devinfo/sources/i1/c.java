package i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f25542a;

    public c(float f10) {
        this.f25542a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f25542a, ((c) obj).f25542a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25542a);
    }

    public final String toString() {
        return r5.c.k(new StringBuilder("Horizontal(bias="), this.f25542a, ')');
    }
}
