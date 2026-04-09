package N2;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
public final class f implements L2.f {

    /* renamed from: b, reason: collision with root package name */
    public final L2.f f4482b;

    /* renamed from: c, reason: collision with root package name */
    public final L2.f f4483c;

    public f(L2.f fVar, L2.f fVar2) {
        this.f4482b = fVar;
        this.f4483c = fVar2;
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        this.f4482b.b(messageDigest);
        this.f4483c.b(messageDigest);
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f4482b.equals(fVar.f4482b) && this.f4483c.equals(fVar.f4483c)) {
                return true;
            }
        }
        return false;
    }

    @Override // L2.f
    public final int hashCode() {
        return this.f4483c.hashCode() + (this.f4482b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f4482b + ", signature=" + this.f4483c + '}';
    }
}
