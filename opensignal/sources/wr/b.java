package wr;

import br.l;
import tt.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24588a;

    /* renamed from: b, reason: collision with root package name */
    public final ks.c f24589b;

    public b(Class cls, ks.c cVar) {
        this.f24588a = cls;
        this.f24589b = cVar;
    }

    public final String a() {
        return s.k0(this.f24588a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f24588a, ((b) obj).f24588a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24588a.hashCode();
    }

    public final String toString() {
        return b.class.getName() + ": " + this.f24588a;
    }
}
