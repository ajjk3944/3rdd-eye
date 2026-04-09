package Zi;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;

/* loaded from: classes4.dex */
final class Y implements th.p {

    /* renamed from: a, reason: collision with root package name */
    private final th.p f25604a;

    public Y(th.p origin) {
        AbstractC6492s.i(origin, "origin");
        this.f25604a = origin;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        th.p pVar = this.f25604a;
        Y y10 = obj instanceof Y ? (Y) obj : null;
        if (!AbstractC6492s.d(pVar, y10 != null ? y10.f25604a : null)) {
            return false;
        }
        th.e eVarR = r();
        if (eVarR instanceof th.d) {
            th.p pVar2 = obj instanceof th.p ? (th.p) obj : null;
            th.e eVarR2 = pVar2 != null ? pVar2.r() : null;
            if (eVarR2 != null && (eVarR2 instanceof th.d)) {
                return AbstractC6492s.d(AbstractC6596a.b((th.d) eVarR), AbstractC6596a.b((th.d) eVarR2));
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f25604a.hashCode();
    }

    @Override // th.p
    public List j() {
        return this.f25604a.j();
    }

    @Override // th.p
    public th.e r() {
        return this.f25604a.r();
    }

    @Override // th.p
    public boolean t() {
        return this.f25604a.t();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f25604a;
    }
}
