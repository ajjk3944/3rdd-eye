package z5;

import c5.C0407d;
import h5.C2371e;
import h5.InterfaceC2375i;

/* loaded from: classes3.dex */
public final class l0 extends E5.s {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f24538e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(InterfaceC2375i interfaceC2375i, j5.b bVar) {
        m0 m0Var = m0.f24544a;
        super(interfaceC2375i.h(m0Var) == null ? interfaceC2375i.m(m0Var) : interfaceC2375i, bVar);
        this.f24538e = new ThreadLocal();
        if (bVar.getContext().h(C2371e.f20485a) instanceof AbstractC3042s) {
            return;
        }
        Object objK = E5.a.k(interfaceC2375i, null);
        E5.a.f(interfaceC2375i, objK);
        P(interfaceC2375i, objK);
    }

    public final boolean O() {
        boolean z6 = this.threadLocalIsSet && this.f24538e.get() == null;
        this.f24538e.remove();
        return !z6;
    }

    public final void P(InterfaceC2375i interfaceC2375i, Object obj) {
        this.threadLocalIsSet = true;
        this.f24538e.set(new C0407d(interfaceC2375i, obj));
    }

    @Override // E5.s, z5.c0
    public final void f(Object obj) {
        if (this.threadLocalIsSet) {
            C0407d c0407d = (C0407d) this.f24538e.get();
            if (c0407d != null) {
                E5.a.f((InterfaceC2375i) c0407d.f5921a, c0407d.f5922b);
            }
            this.f24538e.remove();
        }
        Object objM = AbstractC3046w.m(obj);
        j5.b bVar = this.f1411d;
        InterfaceC2375i context = bVar.getContext();
        Object objK = E5.a.k(context, null);
        l0 l0VarQ = objK != E5.a.f1377f ? AbstractC3046w.q(bVar, context, objK) : null;
        try {
            this.f1411d.e(objM);
            if (l0VarQ == null || l0VarQ.O()) {
                E5.a.f(context, objK);
            }
        } catch (Throwable th) {
            if (l0VarQ == null || l0VarQ.O()) {
                E5.a.f(context, objK);
            }
            throw th;
        }
    }
}
