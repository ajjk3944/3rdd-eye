package a3;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1789w;
import androidx.lifecycle.InterfaceC1790x;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: LifecycleLifecycle.java */
/* loaded from: classes.dex */
public final class h implements g, InterfaceC1789w {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f14117b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1781n f14118c;

    public h(AbstractC1781n abstractC1781n) {
        this.f14118c = abstractC1781n;
        abstractC1781n.addObserver(this);
    }

    @Override // a3.g
    public final void b(i iVar) {
        this.f14117b.remove(iVar);
    }

    @Override // a3.g
    public final void g(i iVar) {
        this.f14117b.add(iVar);
        AbstractC1781n abstractC1781n = this.f14118c;
        if (abstractC1781n.getCurrentState() == AbstractC1781n.b.DESTROYED) {
            iVar.onDestroy();
        } else if (abstractC1781n.getCurrentState().isAtLeast(AbstractC1781n.b.STARTED)) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    @G(AbstractC1781n.a.ON_DESTROY)
    public void onDestroy(InterfaceC1790x interfaceC1790x) {
        Iterator it = h3.l.e(this.f14117b).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
        interfaceC1790x.getLifecycle().removeObserver(this);
    }

    @G(AbstractC1781n.a.ON_START)
    public void onStart(InterfaceC1790x interfaceC1790x) {
        Iterator it = h3.l.e(this.f14117b).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    @G(AbstractC1781n.a.ON_STOP)
    public void onStop(InterfaceC1790x interfaceC1790x) {
        Iterator it = h3.l.e(this.f14117b).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }
}
