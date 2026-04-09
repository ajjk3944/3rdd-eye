package qf;

import je.j;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final gl.c f32286a;

    /* renamed from: b, reason: collision with root package name */
    public j f32287b = null;

    public a(gl.c cVar) {
        this.f32286a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32286a.equals(aVar.f32286a) && k.a(this.f32287b, aVar.f32287b);
    }

    public final int hashCode() {
        int iHashCode = this.f32286a.hashCode() * 31;
        j jVar = this.f32287b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f32286a + ", subscriber=" + this.f32287b + ')';
    }
}
