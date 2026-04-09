package G1;

import H1.g;
import java.security.MessageDigest;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class b implements InterfaceC2639e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1512b;

    public b(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f1512b = obj;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f1512b.toString().getBytes(InterfaceC2639e.f21817a));
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f1512b.equals(((b) obj).f1512b);
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return this.f1512b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f1512b + '}';
    }
}
