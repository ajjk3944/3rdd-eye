package de;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f22208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22209b;

    public h(q qVar, boolean z3) {
        this.f22208a = qVar;
        this.f22209b = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f22208a.equals(this.f22208a) && hVar.f22209b == this.f22209b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22208a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f22209b).hashCode();
    }
}
