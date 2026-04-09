package Ah;

import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import Zg.d0;
import fi.AbstractC5833e;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f791a = new d();

    private d() {
    }

    public static /* synthetic */ InterfaceC2495e f(d dVar, Zh.c cVar, kotlin.reflect.jvm.internal.impl.builtins.i iVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, iVar, num);
    }

    public final InterfaceC2495e a(InterfaceC2495e mutable) {
        AbstractC6492s.i(mutable, "mutable");
        Zh.c cVarO = c.f771a.o(bi.i.m(mutable));
        if (cVarO != null) {
            InterfaceC2495e interfaceC2495eO = AbstractC5833e.m(mutable).o(cVarO);
            AbstractC6492s.h(interfaceC2495eO, "getBuiltInClassByFqName(...)");
            return interfaceC2495eO;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final InterfaceC2495e b(InterfaceC2495e readOnly) {
        AbstractC6492s.i(readOnly, "readOnly");
        Zh.c cVarP = c.f771a.p(bi.i.m(readOnly));
        if (cVarP != null) {
            InterfaceC2495e interfaceC2495eO = AbstractC5833e.m(readOnly).o(cVarP);
            AbstractC6492s.h(interfaceC2495eO, "getBuiltInClassByFqName(...)");
            return interfaceC2495eO;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(InterfaceC2495e mutable) {
        AbstractC6492s.i(mutable, "mutable");
        return c.f771a.k(bi.i.m(mutable));
    }

    public final boolean d(InterfaceC2495e readOnly) {
        AbstractC6492s.i(readOnly, "readOnly");
        return c.f771a.l(bi.i.m(readOnly));
    }

    public final InterfaceC2495e e(Zh.c fqName, kotlin.reflect.jvm.internal.impl.builtins.i builtIns, Integer num) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(builtIns, "builtIns");
        Zh.b bVarM = (num == null || !AbstractC6492s.d(fqName, c.f771a.h())) ? c.f771a.m(fqName) : kotlin.reflect.jvm.internal.impl.builtins.o.a(num.intValue());
        if (bVarM != null) {
            return builtIns.o(bVarM.a());
        }
        return null;
    }

    public final Collection g(Zh.c fqName, kotlin.reflect.jvm.internal.impl.builtins.i builtIns) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(builtIns, "builtIns");
        InterfaceC2495e interfaceC2495eF = f(this, fqName, builtIns, null, 4, null);
        if (interfaceC2495eF == null) {
            return d0.e();
        }
        Zh.c cVarP = c.f771a.p(AbstractC5833e.p(interfaceC2495eF));
        return cVarP == null ? d0.c(interfaceC2495eF) : AbstractC3689v.o(interfaceC2495eF, builtIns.o(cVarP));
    }
}
