package bt;

import br.l;
import ht.b0;
import ht.x;
import rr.f;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f f2950a;

    public c(f fVar) {
        this.f2950a = fVar;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return l.a(this.f2950a, cVar != null ? cVar.f2950a : null);
    }

    @Override // bt.d
    public final x getType() {
        b0 b0VarQ = this.f2950a.q();
        l.d(b0VarQ, "classDescriptor.defaultType");
        return b0VarQ;
    }

    public final int hashCode() {
        return this.f2950a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        b0 b0VarQ = this.f2950a.q();
        l.d(b0VarQ, "classDescriptor.defaultType");
        sb2.append(b0VarQ);
        sb2.append('}');
        return sb2.toString();
    }
}
