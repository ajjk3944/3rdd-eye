package Jh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2515z;
import Jh.U;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Jh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3115i extends U {

    /* renamed from: o, reason: collision with root package name */
    public static final C3115i f10188o = new C3115i();

    private C3115i() {
    }

    private final boolean k(InterfaceC2492b interfaceC2492b) {
        return AbstractC3689v.f0(U.f10160a.e(), Sh.C.d(interfaceC2492b));
    }

    public static final InterfaceC2515z l(InterfaceC2515z functionDescriptor) {
        AbstractC6492s.i(functionDescriptor, "functionDescriptor");
        C3115i c3115i = f10188o;
        Zh.f name = functionDescriptor.getName();
        AbstractC6492s.h(name, "getName(...)");
        if (c3115i.n(name)) {
            return (InterfaceC2515z) AbstractC5833e.i(functionDescriptor, false, C3113g.f10186a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return f10188o.k(it);
    }

    public static final U.b o(InterfaceC2492b interfaceC2492b) {
        InterfaceC2492b interfaceC2492bI;
        String strD;
        AbstractC6492s.i(interfaceC2492b, "<this>");
        U.a aVar = U.f10160a;
        if (!aVar.d().contains(interfaceC2492b.getName()) || (interfaceC2492bI = AbstractC5833e.i(interfaceC2492b, false, C3114h.f10187a, 1, null)) == null || (strD = Sh.C.d(interfaceC2492bI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC2492b it) {
        AbstractC6492s.i(it, "it");
        return (it instanceof InterfaceC2515z) && f10188o.k(it);
    }

    public final boolean n(Zh.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return U.f10160a.d().contains(fVar);
    }
}
