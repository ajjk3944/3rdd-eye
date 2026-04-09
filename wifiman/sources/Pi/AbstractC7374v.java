package pi;

import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7374v implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private int f58184a;

    private final boolean g(InterfaceC2498h interfaceC2498h) {
        return (kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2498h) || bi.i.E(interfaceC2498h)) ? false : true;
    }

    @Override // pi.v0
    public abstract InterfaceC2498h c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0) || obj.hashCode() != hashCode()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC2498h interfaceC2498hC = c();
        InterfaceC2498h interfaceC2498hC2 = v0Var.c();
        if (interfaceC2498hC2 != null && g(interfaceC2498hC) && g(interfaceC2498hC2)) {
            return h(interfaceC2498hC2);
        }
        return false;
    }

    protected final boolean f(InterfaceC2498h first, InterfaceC2498h second) {
        AbstractC6492s.i(first, "first");
        AbstractC6492s.i(second, "second");
        if (!AbstractC6492s.d(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC2503m interfaceC2503mB = first.b();
        for (InterfaceC2503m interfaceC2503mB2 = second.b(); interfaceC2503mB != null && interfaceC2503mB2 != null; interfaceC2503mB2 = interfaceC2503mB2.b()) {
            if (interfaceC2503mB instanceof Bh.G) {
                return interfaceC2503mB2 instanceof Bh.G;
            }
            if (interfaceC2503mB2 instanceof Bh.G) {
                return false;
            }
            if (interfaceC2503mB instanceof Bh.M) {
                return (interfaceC2503mB2 instanceof Bh.M) && AbstractC6492s.d(((Bh.M) interfaceC2503mB).e(), ((Bh.M) interfaceC2503mB2).e());
            }
            if ((interfaceC2503mB2 instanceof Bh.M) || !AbstractC6492s.d(interfaceC2503mB.getName(), interfaceC2503mB2.getName())) {
                return false;
            }
            interfaceC2503mB = interfaceC2503mB.b();
        }
        return true;
    }

    protected abstract boolean h(InterfaceC2498h interfaceC2498h);

    public int hashCode() {
        int i10 = this.f58184a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC2498h interfaceC2498hC = c();
        int iHashCode = g(interfaceC2498hC) ? bi.i.m(interfaceC2498hC).hashCode() : System.identityHashCode(this);
        this.f58184a = iHashCode;
        return iHashCode;
    }
}
