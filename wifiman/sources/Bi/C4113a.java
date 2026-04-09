package bi;

import Bh.D;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.M;
import Bh.k0;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import fi.AbstractC5833e;
import ii.C6157d;
import ii.InterfaceC6164k;
import ii.InterfaceC6167n;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4113a extends t {

    /* renamed from: a, reason: collision with root package name */
    public static final C4113a f33345a = new C4113a();

    /* renamed from: bi.a$a, reason: collision with other inner class name */
    public static final class C1166a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(AbstractC5833e.o((InterfaceC2495e) obj).b(), AbstractC5833e.o((InterfaceC2495e) obj2).b());
        }
    }

    private C4113a() {
    }

    private static final void b(InterfaceC2495e interfaceC2495e, LinkedHashSet linkedHashSet, InterfaceC6164k interfaceC6164k, boolean z10) {
        for (InterfaceC2503m interfaceC2503m : InterfaceC6167n.a.a(interfaceC6164k, C6157d.f49199t, null, 2, null)) {
            if (interfaceC2503m instanceof InterfaceC2495e) {
                InterfaceC2495e interfaceC2495eT = (InterfaceC2495e) interfaceC2503m;
                if (interfaceC2495eT.L()) {
                    Zh.f name = interfaceC2495eT.getName();
                    AbstractC6492s.h(name, "getName(...)");
                    InterfaceC2498h interfaceC2498hG = interfaceC6164k.g(name, Ih.d.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC2495eT = interfaceC2498hG instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hG : interfaceC2498hG instanceof k0 ? ((k0) interfaceC2498hG).t() : null;
                }
                if (interfaceC2495eT != null) {
                    if (i.z(interfaceC2495eT, interfaceC2495e)) {
                        linkedHashSet.add(interfaceC2495eT);
                    }
                    if (z10) {
                        InterfaceC6164k interfaceC6164kY0 = interfaceC2495eT.y0();
                        AbstractC6492s.h(interfaceC6164kY0, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC2495e, linkedHashSet, interfaceC6164kY0, z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public Collection a(InterfaceC2495e sealedClass, boolean z10) {
        InterfaceC2503m next;
        InterfaceC2503m interfaceC2503mB;
        AbstractC6492s.i(sealedClass, "sealedClass");
        if (sealedClass.l() != D.SEALED) {
            return AbstractC3689v.l();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = AbstractC5833e.u(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (((InterfaceC2503m) next) instanceof M) {
                    break;
                }
            }
            interfaceC2503mB = next;
        } else {
            interfaceC2503mB = sealedClass.b();
        }
        if (interfaceC2503mB instanceof M) {
            b(sealedClass, linkedHashSet, ((M) interfaceC2503mB).r(), z10);
        }
        InterfaceC6164k interfaceC6164kY0 = sealedClass.y0();
        AbstractC6492s.h(interfaceC6164kY0, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, interfaceC6164kY0, true);
        return AbstractC3689v.X0(linkedHashSet, new C1166a());
    }
}
