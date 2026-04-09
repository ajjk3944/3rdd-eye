package s0;

import b7.w;
import i1.m;
import i2.k;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f33219a;

    public b(w wVar) {
        this.f33219a = wVar;
    }

    @Override // i2.v0
    public final m d() {
        a aVar = new a();
        aVar.f33218o = this.f33219a;
        return aVar;
    }

    @Override // i2.v0
    public final void e(m mVar) {
        a aVar = (a) mVar;
        aVar.f33218o = this.f33219a;
        k.l(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f33219a == ((b) obj).f33219a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33219a.hashCode();
    }
}
