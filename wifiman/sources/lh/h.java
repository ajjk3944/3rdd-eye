package Lh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.g0;
import Bh.s0;
import Dh.V;
import Nh.a0;
import Yg.s;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* loaded from: classes4.dex */
public abstract class h {
    public static final List a(Collection newValueParameterTypes, Collection oldValueParameters, InterfaceC2491a newOwner) {
        AbstractC6492s.i(newValueParameterTypes, "newValueParameterTypes");
        AbstractC6492s.i(oldValueParameters, "oldValueParameters");
        AbstractC6492s.i(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List listS1 = AbstractC3689v.s1(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listS1, 10));
        for (Iterator it = listS1.iterator(); it.hasNext(); it = it) {
            s sVar = (s) it.next();
            S s10 = (S) sVar.a();
            s0 s0Var = (s0) sVar.c();
            int index = s0Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = s0Var.getAnnotations();
            Zh.f name = s0Var.getName();
            AbstractC6492s.h(name, "getName(...)");
            boolean zS0 = s0Var.s0();
            boolean zY = s0Var.Y();
            boolean zW = s0Var.W();
            S sK = s0Var.j0() != null ? AbstractC5833e.s(newOwner).q().k(s10) : null;
            g0 g0VarJ = s0Var.j();
            AbstractC6492s.h(g0VarJ, "getSource(...)");
            arrayList.add(new V(newOwner, null, index, annotations, name, s10, zS0, zY, zW, sK, g0VarJ));
        }
        return arrayList;
    }

    public static final a0 b(InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(interfaceC2495e, "<this>");
        InterfaceC2495e interfaceC2495eX = AbstractC5833e.x(interfaceC2495e);
        if (interfaceC2495eX == null) {
            return null;
        }
        InterfaceC6164k interfaceC6164kQ = interfaceC2495eX.Q();
        a0 a0Var = interfaceC6164kQ instanceof a0 ? (a0) interfaceC6164kQ : null;
        return a0Var == null ? b(interfaceC2495eX) : a0Var;
    }
}
