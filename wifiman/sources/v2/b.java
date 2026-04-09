package V2;

import C2.e;
import W2.k;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f22974b;

    public b(Object obj) {
        this.f22974b = k.d(obj);
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f22974b.toString().getBytes(e.f2192a));
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f22974b.equals(((b) obj).f22974b);
        }
        return false;
    }

    @Override // C2.e
    public int hashCode() {
        return this.f22974b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f22974b + '}';
    }
}
