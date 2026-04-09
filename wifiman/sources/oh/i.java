package Oh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.l0;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.error.l;
import pi.A0;
import pi.AbstractC7338F;
import pi.AbstractC7346d0;
import pi.B0;
import pi.D0;
import pi.E0;
import pi.I0;
import pi.L;
import pi.N0;
import pi.S;
import pi.V;
import pi.W;
import pi.r0;
import pi.v0;

/* loaded from: classes4.dex */
public final class i extends E0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f17855e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Oh.a f17856f;

    /* renamed from: g, reason: collision with root package name */
    private static final Oh.a f17857g;

    /* renamed from: c, reason: collision with root package name */
    private final g f17858c;

    /* renamed from: d, reason: collision with root package name */
    private final A0 f17859d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        I0 i02 = I0.COMMON;
        f17856f = b.b(i02, false, true, null, 5, null).l(c.FLEXIBLE_LOWER_BOUND);
        f17857g = b.b(i02, false, true, null, 5, null).l(c.FLEXIBLE_UPPER_BOUND);
    }

    public i(A0 a02) {
        g gVar = new g();
        this.f17858c = gVar;
        if (a02 == null) {
            a02 = new A0(gVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f17859d = a02;
    }

    private final s j(AbstractC7346d0 abstractC7346d0, InterfaceC2495e interfaceC2495e, Oh.a aVar) {
        if (abstractC7346d0.N0().getParameters().isEmpty()) {
            return z.a(abstractC7346d0, Boolean.FALSE);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.i.c0(abstractC7346d0)) {
            B0 b02 = (B0) abstractC7346d0.L0().get(0);
            N0 n0A = b02.a();
            S type = b02.getType();
            AbstractC6492s.h(type, "getType(...)");
            return z.a(V.k(abstractC7346d0.M0(), abstractC7346d0.N0(), AbstractC3689v.e(new D0(n0A, l(type, aVar))), abstractC7346d0.O0(), null, 16, null), Boolean.FALSE);
        }
        if (W.a(abstractC7346d0)) {
            return z.a(l.d(kotlin.reflect.jvm.internal.impl.types.error.k.ERROR_RAW_TYPE, abstractC7346d0.N0().toString()), Boolean.FALSE);
        }
        InterfaceC6164k interfaceC6164kW0 = interfaceC2495e.w0(this);
        AbstractC6492s.h(interfaceC6164kW0, "getMemberScope(...)");
        r0 r0VarM0 = abstractC7346d0.M0();
        v0 v0VarK = interfaceC2495e.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        List parameters = interfaceC2495e.k().getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        List<l0> list = parameters;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (l0 l0Var : list) {
            g gVar = this.f17858c;
            AbstractC6492s.f(l0Var);
            arrayList.add(AbstractC7338F.b(gVar, l0Var, aVar, this.f17859d, null, 8, null));
        }
        return z.a(V.n(r0VarM0, v0VarK, arrayList, abstractC7346d0.O0(), interfaceC6164kW0, new h(interfaceC2495e, this, abstractC7346d0, aVar)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 k(InterfaceC2495e interfaceC2495e, i iVar, AbstractC7346d0 abstractC7346d0, Oh.a aVar, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        InterfaceC2495e interfaceC2495eB;
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        Zh.b bVarN = AbstractC5833e.n(interfaceC2495e);
        if (bVarN == null || (interfaceC2495eB = kotlinTypeRefiner.b(bVarN)) == null || AbstractC6492s.d(interfaceC2495eB, interfaceC2495e)) {
            return null;
        }
        return (AbstractC7346d0) iVar.j(abstractC7346d0, interfaceC2495eB, aVar).h();
    }

    private final S l(S s10, Oh.a aVar) {
        InterfaceC2498h interfaceC2498hC = s10.N0().c();
        if (interfaceC2498hC instanceof l0) {
            return l(this.f17859d.e((l0) interfaceC2498hC, aVar.j(true)), aVar);
        }
        if (!(interfaceC2498hC instanceof InterfaceC2495e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC2498hC).toString());
        }
        InterfaceC2498h interfaceC2498hC2 = L.d(s10).N0().c();
        if (interfaceC2498hC2 instanceof InterfaceC2495e) {
            s sVarJ = j(L.c(s10), (InterfaceC2495e) interfaceC2498hC, f17856f);
            AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) sVarJ.a();
            boolean zBooleanValue = ((Boolean) sVarJ.c()).booleanValue();
            s sVarJ2 = j(L.d(s10), (InterfaceC2495e) interfaceC2498hC2, f17857g);
            AbstractC7346d0 abstractC7346d02 = (AbstractC7346d0) sVarJ2.a();
            return (zBooleanValue || ((Boolean) sVarJ2.c()).booleanValue()) ? new k(abstractC7346d0, abstractC7346d02) : V.e(abstractC7346d0, abstractC7346d02);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC2498hC2 + "\" while for lower it's \"" + interfaceC2498hC + '\"').toString());
    }

    static /* synthetic */ S m(i iVar, S s10, Oh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new Oh.a(I0.COMMON, null, false, false, null, null, 62, null);
        }
        return iVar.l(s10, aVar);
    }

    @Override // pi.E0
    public boolean f() {
        return false;
    }

    @Override // pi.E0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public D0 e(S key) {
        AbstractC6492s.i(key, "key");
        return new D0(m(this, key, null, 2, null));
    }

    public /* synthetic */ i(A0 a02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : a02);
    }
}
