package Q2;

import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4016n;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class k implements j, InterfaceC4016n {

    /* renamed from: a, reason: collision with root package name */
    private final Set f19132a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4013k f19133b;

    k(AbstractC4013k abstractC4013k) {
        this.f19133b = abstractC4013k;
        abstractC4013k.a(this);
    }

    @Override // Q2.j
    public void a(l lVar) {
        this.f19132a.remove(lVar);
    }

    @Override // Q2.j
    public void b(l lVar) {
        this.f19132a.add(lVar);
        if (this.f19133b.b() == AbstractC4013k.b.DESTROYED) {
            lVar.f();
        } else if (this.f19133b.b().isAtLeast(AbstractC4013k.b.STARTED)) {
            lVar.b();
        } else {
            lVar.a();
        }
    }

    @w(AbstractC4013k.a.ON_DESTROY)
    public void onDestroy(InterfaceC4017o interfaceC4017o) {
        Iterator it = W2.l.j(this.f19132a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).f();
        }
        interfaceC4017o.O().c(this);
    }

    @w(AbstractC4013k.a.ON_START)
    public void onStart(InterfaceC4017o interfaceC4017o) {
        Iterator it = W2.l.j(this.f19132a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
    }

    @w(AbstractC4013k.a.ON_STOP)
    public void onStop(InterfaceC4017o interfaceC4017o) {
        Iterator it = W2.l.j(this.f19132a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }
}
