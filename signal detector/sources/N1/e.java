package n1;

import java.security.MessageDigest;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class e implements InterfaceC2639e {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2639e f22183b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2639e f22184c;

    public e(InterfaceC2639e interfaceC2639e, InterfaceC2639e interfaceC2639e2) {
        this.f22183b = interfaceC2639e;
        this.f22184c = interfaceC2639e2;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        this.f22183b.a(messageDigest);
        this.f22184c.a(messageDigest);
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f22183b.equals(eVar.f22183b) && this.f22184c.equals(eVar.f22184c)) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return this.f22184c.hashCode() + (this.f22183b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f22183b + ", signature=" + this.f22184c + '}';
    }
}
