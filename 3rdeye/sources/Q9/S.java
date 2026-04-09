package Q9;

import java.util.List;
import w9.InterfaceC5748c;

/* compiled from: Caching.kt */
/* loaded from: classes3.dex */
public final class S implements w9.j {

    /* renamed from: b, reason: collision with root package name */
    public final w9.j f11453b;

    public S(w9.j origin) {
        kotlin.jvm.internal.l.f(origin, "origin");
        this.f11453b = origin;
    }

    @Override // w9.j
    public final boolean b() {
        return this.f11453b.b();
    }

    @Override // w9.j
    public final List<w9.k> e() {
        return this.f11453b.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        S s10 = obj instanceof S ? (S) obj : null;
        w9.j jVar = s10 != null ? s10.f11453b : null;
        w9.j jVar2 = this.f11453b;
        if (!kotlin.jvm.internal.l.b(jVar2, jVar)) {
            return false;
        }
        InterfaceC5748c interfaceC5748cF = jVar2.f();
        if (!(interfaceC5748cF instanceof InterfaceC5748c)) {
            return false;
        }
        w9.j jVar3 = obj instanceof w9.j ? (w9.j) obj : null;
        InterfaceC5748c interfaceC5748cF2 = jVar3 != null ? jVar3.f() : null;
        if (interfaceC5748cF2 == null || !(interfaceC5748cF2 instanceof InterfaceC5748c)) {
            return false;
        }
        return E.u.C(interfaceC5748cF).equals(E.u.C(interfaceC5748cF2));
    }

    @Override // w9.j
    public final InterfaceC5748c f() {
        return this.f11453b.f();
    }

    public final int hashCode() {
        return this.f11453b.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f11453b;
    }
}
