package pi;

import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: pi.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7362l0 {

    /* renamed from: pi.l0$a */
    public static final class a extends w0 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f58140d;

        a(List list) {
            this.f58140d = list;
        }

        @Override // pi.w0
        public B0 k(v0 key) {
            AbstractC6492s.i(key, "key");
            if (!this.f58140d.contains(key)) {
                return null;
            }
            InterfaceC2498h interfaceC2498hC = key.c();
            AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return J0.s((Bh.l0) interfaceC2498hC);
        }
    }

    private static final S a(List list, List list2, kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
        S sP = G0.g(new a(list)).p((S) AbstractC3689v.q0(list2), N0.OUT_VARIANCE);
        if (sP != null) {
            return sP;
        }
        AbstractC7346d0 abstractC7346d0Y = iVar.y();
        AbstractC6492s.h(abstractC7346d0Y, "getDefaultBound(...)");
        return abstractC7346d0Y;
    }

    public static final S b(Bh.l0 l0Var) {
        AbstractC6492s.i(l0Var, "<this>");
        InterfaceC2503m interfaceC2503mB = l0Var.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        if (interfaceC2503mB instanceof InterfaceC2499i) {
            List parameters = ((InterfaceC2499i) interfaceC2503mB).k().getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v0 v0VarK = ((Bh.l0) it.next()).k();
                AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
                arrayList.add(v0VarK);
            }
            List upperBounds = l0Var.getUpperBounds();
            AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, AbstractC5833e.m(l0Var));
        }
        if (!(interfaceC2503mB instanceof InterfaceC2515z)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC2515z) interfaceC2503mB).getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            v0 v0VarK2 = ((Bh.l0) it2.next()).k();
            AbstractC6492s.h(v0VarK2, "getTypeConstructor(...)");
            arrayList2.add(v0VarK2);
        }
        List upperBounds2 = l0Var.getUpperBounds();
        AbstractC6492s.h(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, AbstractC5833e.m(l0Var));
    }
}
