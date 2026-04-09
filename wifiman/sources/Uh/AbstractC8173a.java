package uh;

import Bh.InterfaceC2498h;
import Bh.l0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import pi.AbstractC7346d0;
import pi.C7360k0;
import pi.D0;
import pi.N0;
import pi.S;
import pi.V;
import pi.r0;
import pi.v0;
import ri.InterfaceC7621l;
import th.e;
import th.p;
import th.r;
import th.s;
import wh.U0;
import wh.Y;
import wh.Y0;

/* renamed from: uh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8173a {

    /* renamed from: uh.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2235a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63067a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63067a = iArr;
        }
    }

    private static final AbstractC7346d0 a(r0 r0Var, v0 v0Var, List list, boolean z10) {
        InterfaceC7621l c7360k0;
        List parameters = v0Var.getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            r rVar = (r) obj;
            U0 u02 = (U0) rVar.c();
            S sU = u02 != null ? u02.u() : null;
            s sVarD = rVar.d();
            int i12 = sVarD == null ? -1 : C2235a.f63067a[sVarD.ordinal()];
            if (i12 == -1) {
                Object obj2 = parameters.get(i10);
                AbstractC6492s.h(obj2, "get(...)");
                c7360k0 = new C7360k0((l0) obj2);
            } else if (i12 == 1) {
                N0 n02 = N0.INVARIANT;
                AbstractC6492s.f(sU);
                c7360k0 = new D0(n02, sU);
            } else if (i12 == 2) {
                N0 n03 = N0.IN_VARIANCE;
                AbstractC6492s.f(sU);
                c7360k0 = new D0(n03, sU);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                N0 n04 = N0.OUT_VARIANCE;
                AbstractC6492s.f(sU);
                c7360k0 = new D0(n04, sU);
            }
            arrayList.add(c7360k0);
            i10 = i11;
        }
        return V.k(r0Var, v0Var, arrayList, z10, null, 16, null);
    }

    public static final p b(e eVar, List arguments, boolean z10, List annotations) {
        InterfaceC2498h interfaceC2498hA;
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(annotations, "annotations");
        InterfaceC6824a interfaceC6824a = null;
        byte b10 = 0;
        Y y10 = eVar instanceof Y ? (Y) eVar : null;
        if (y10 == null || (interfaceC2498hA = y10.a()) == null) {
            throw new Y0("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        v0 v0VarK = interfaceC2498hA.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        List parameters = v0VarK.getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new U0(a(annotations.isEmpty() ? r0.f58162b.j() : r0.f58162b.j(), v0VarK, arguments, z10), interfaceC6824a, 2, b10 == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
