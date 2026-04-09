package s8;

import java.security.MessageDigest;
import t8.f;
import x7.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f33509b;

    public d(Object obj) {
        f.c(obj, "Argument must not be null");
        this.f33509b = obj;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f33509b.toString().getBytes(e.f36998a));
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f33509b.equals(((d) obj).f33509b);
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        return this.f33509b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f33509b + '}';
    }
}
