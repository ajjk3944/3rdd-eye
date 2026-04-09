package wi;

import androidx.lifecycle.a0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import java.util.Iterator;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends k0 {

    /* renamed from: m, reason: collision with root package name */
    public final f f36749m = f.f36752a;

    /* renamed from: n, reason: collision with root package name */
    public final x.f f36750n = new x.f(0);

    /* renamed from: o, reason: collision with root package name */
    public boolean f36751o;

    @Override // androidx.lifecycle.l0
    public final void e(a0 a0Var, m0 m0Var) {
        Object next;
        k.e(a0Var, "owner");
        x.f fVar = this.f36750n;
        fVar.getClass();
        x.a aVar = new x.a(fVar);
        while (true) {
            if (!aVar.hasNext()) {
                next = null;
                break;
            } else {
                next = aVar.next();
                if (((d) next).f36747a == m0Var) {
                    break;
                }
            }
        }
        if (((d) next) != null) {
            return;
        }
        d dVar = new d(m0Var);
        if (this.f36751o) {
            this.f36751o = false;
            dVar.f36748b = true;
        }
        fVar.add(dVar);
        super.e(a0Var, dVar);
    }

    @Override // androidx.lifecycle.l0
    public final void i(m0 m0Var) {
        k.e(m0Var, "observer");
        boolean z3 = m0Var instanceof d;
        x.f fVar = this.f36750n;
        if (z3 && fVar.remove(m0Var)) {
            super.i(m0Var);
            return;
        }
        fVar.getClass();
        x.a aVar = new x.a(fVar);
        while (aVar.hasNext()) {
            d dVar = (d) aVar.next();
            if (dVar.f36747a.equals(m0Var)) {
                aVar.remove();
                super.i(dVar);
                return;
            }
        }
    }

    @Override // androidx.lifecycle.l0
    public final void j(Object obj) {
        f fVar = this.f36749m;
        f fVar2 = f.f36753b;
        x.f fVar3 = this.f36750n;
        if (fVar == fVar2 && fVar3.isEmpty()) {
            this.f36751o = true;
        }
        Iterator<E> it = fVar3.iterator();
        while (it.hasNext()) {
            ((d) it.next()).f36748b = true;
        }
        super.j(obj);
    }
}
