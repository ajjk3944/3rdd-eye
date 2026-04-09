package i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f25543a;

    public d(float f10) {
        this.f25543a = f10;
    }

    public final int a(int i4, int i10) {
        return Math.round((1 + this.f25543a) * ((i10 - i4) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f25543a, ((d) obj).f25543a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25543a);
    }

    public final String toString() {
        return r5.c.k(new StringBuilder("Vertical(bias="), this.f25543a, ')');
    }
}
