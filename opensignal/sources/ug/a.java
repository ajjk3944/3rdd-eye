package ug;

import br.l;
import hf.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final eu.d f23553a;

    /* renamed from: b, reason: collision with root package name */
    public i f23554b = null;

    public a(eu.d dVar) {
        this.f23553a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23553a.equals(aVar.f23553a) && l.a(this.f23554b, aVar.f23554b);
    }

    public final int hashCode() {
        int iHashCode = this.f23553a.hashCode() * 31;
        i iVar = this.f23554b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f23553a + ", subscriber=" + this.f23554b + ')';
    }
}
