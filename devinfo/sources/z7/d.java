package z7;

import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements x7.e {

    /* renamed from: b, reason: collision with root package name */
    public final x7.e f37998b;

    /* renamed from: c, reason: collision with root package name */
    public final x7.e f37999c;

    public d(x7.e eVar, x7.e eVar2) {
        this.f37998b = eVar;
        this.f37999c = eVar2;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        this.f37998b.b(messageDigest);
        this.f37999c.b(messageDigest);
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f37998b.equals(dVar.f37998b) && this.f37999c.equals(dVar.f37999c)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        return this.f37999c.hashCode() + (this.f37998b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f37998b + ", signature=" + this.f37999c + '}';
    }
}
