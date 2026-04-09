package k5;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends com.bumptech.glide.f {

    /* renamed from: a, reason: collision with root package name */
    public final b f27954a;

    public g(b bVar) {
        k.e(bVar, "latestEvent");
        this.f27954a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && k.a(this.f27954a, ((g) obj).f27954a);
    }

    public final int hashCode() {
        return this.f27954a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f27954a + ", direction=-1)";
    }
}
