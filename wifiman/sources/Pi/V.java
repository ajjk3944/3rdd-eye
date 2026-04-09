package pi;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.InterfaceC6164k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import pi.InterfaceC7368o0;

/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f58097a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6835l f58098b = a.f58099a;

    static final class a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58099a = new a();

        a() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            AbstractC6492s.i(gVar, "<unused var>");
            return null;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7346d0 f58100a;

        /* renamed from: b, reason: collision with root package name */
        private final v0 f58101b;

        public b(AbstractC7346d0 abstractC7346d0, v0 v0Var) {
            this.f58100a = abstractC7346d0;
            this.f58101b = v0Var;
        }

        public final AbstractC7346d0 a() {
            return this.f58100a;
        }

        public final v0 b() {
            return this.f58101b;
        }
    }

    private V() {
    }

    public static final AbstractC7346d0 c(Bh.k0 k0Var, List arguments) {
        AbstractC6492s.i(k0Var, "<this>");
        AbstractC6492s.i(arguments, "arguments");
        return new C7364m0(InterfaceC7368o0.a.f58154a, false).h(C7366n0.f58147e.a(null, k0Var, arguments), r0.f58162b.j());
    }

    private final InterfaceC6164k d(v0 v0Var, List list, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        InterfaceC2498h interfaceC2498hC = v0Var.c();
        if (interfaceC2498hC instanceof Bh.l0) {
            return ((Bh.l0) interfaceC2498hC).u().r();
        }
        if (interfaceC2498hC instanceof InterfaceC2495e) {
            if (gVar == null) {
                gVar = AbstractC5833e.r(AbstractC5833e.s(interfaceC2498hC));
            }
            return list.isEmpty() ? Dh.A.b((InterfaceC2495e) interfaceC2498hC, gVar) : Dh.A.a((InterfaceC2495e) interfaceC2498hC, w0.f58185c.b(v0Var, list), gVar);
        }
        if (interfaceC2498hC instanceof Bh.k0) {
            return kotlin.reflect.jvm.internal.impl.types.error.l.a(kotlin.reflect.jvm.internal.impl.types.error.h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((Bh.k0) interfaceC2498hC).getName().toString());
        }
        if (v0Var instanceof Q) {
            return ((Q) v0Var).i();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC2498hC + " for constructor: " + v0Var);
    }

    public static final M0 e(AbstractC7346d0 lowerBound, AbstractC7346d0 upperBound) {
        AbstractC6492s.i(lowerBound, "lowerBound");
        AbstractC6492s.i(upperBound, "upperBound");
        return AbstractC6492s.d(lowerBound, upperBound) ? lowerBound : new J(lowerBound, upperBound);
    }

    public static final AbstractC7346d0 f(r0 attributes, di.q constructor, boolean z10) {
        AbstractC6492s.i(attributes, "attributes");
        AbstractC6492s.i(constructor, "constructor");
        return m(attributes, constructor, AbstractC3689v.l(), z10, kotlin.reflect.jvm.internal.impl.types.error.l.a(kotlin.reflect.jvm.internal.impl.types.error.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    private final b g(v0 v0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, List list) {
        InterfaceC2498h interfaceC2498hF;
        InterfaceC2498h interfaceC2498hC = v0Var.c();
        if (interfaceC2498hC == null || (interfaceC2498hF = gVar.f(interfaceC2498hC)) == null) {
            return null;
        }
        if (interfaceC2498hF instanceof Bh.k0) {
            return new b(c((Bh.k0) interfaceC2498hF, list), null);
        }
        v0 v0VarB = interfaceC2498hF.k().b(gVar);
        AbstractC6492s.h(v0VarB, "refine(...)");
        return new b(null, v0VarB);
    }

    public static final AbstractC7346d0 h(r0 attributes, InterfaceC2495e descriptor, List arguments) {
        AbstractC6492s.i(attributes, "attributes");
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(arguments, "arguments");
        v0 v0VarK = descriptor.k();
        AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
        return k(attributes, v0VarK, arguments, false, null, 16, null);
    }

    public static final AbstractC7346d0 i(r0 attributes, v0 constructor, List arguments, boolean z10) {
        AbstractC6492s.i(attributes, "attributes");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(arguments, "arguments");
        return k(attributes, constructor, arguments, z10, null, 16, null);
    }

    public static final AbstractC7346d0 j(r0 attributes, v0 constructor, List arguments, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        AbstractC6492s.i(attributes, "attributes");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.c() == null) {
            return n(attributes, constructor, arguments, z10, f58097a.d(constructor, arguments, gVar), new T(constructor, arguments, attributes, z10));
        }
        InterfaceC2498h interfaceC2498hC = constructor.c();
        AbstractC6492s.f(interfaceC2498hC);
        AbstractC7346d0 abstractC7346d0U = interfaceC2498hC.u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        return abstractC7346d0U;
    }

    public static /* synthetic */ AbstractC7346d0 k(r0 r0Var, v0 v0Var, List list, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return j(r0Var, v0Var, list, z10, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 l(v0 v0Var, List list, r0 r0Var, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.g refiner) {
        AbstractC6492s.i(refiner, "refiner");
        b bVarG = f58097a.g(v0Var, refiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC7346d0 abstractC7346d0A = bVarG.a();
        if (abstractC7346d0A != null) {
            return abstractC7346d0A;
        }
        v0 v0VarB = bVarG.b();
        AbstractC6492s.f(v0VarB);
        return j(r0Var, v0VarB, list, z10, refiner);
    }

    public static final AbstractC7346d0 m(r0 attributes, v0 constructor, List arguments, boolean z10, InterfaceC6164k memberScope) {
        AbstractC6492s.i(attributes, "attributes");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(memberScope, "memberScope");
        C7348e0 c7348e0 = new C7348e0(constructor, arguments, z10, memberScope, new U(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? c7348e0 : new C7350f0(c7348e0, attributes);
    }

    public static final AbstractC7346d0 n(r0 attributes, v0 constructor, List arguments, boolean z10, InterfaceC6164k memberScope, InterfaceC6835l refinedTypeFactory) {
        AbstractC6492s.i(attributes, "attributes");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(memberScope, "memberScope");
        AbstractC6492s.i(refinedTypeFactory, "refinedTypeFactory");
        C7348e0 c7348e0 = new C7348e0(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? c7348e0 : new C7350f0(c7348e0, attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 o(v0 v0Var, List list, r0 r0Var, boolean z10, InterfaceC6164k interfaceC6164k, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        b bVarG = f58097a.g(v0Var, kotlinTypeRefiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC7346d0 abstractC7346d0A = bVarG.a();
        if (abstractC7346d0A != null) {
            return abstractC7346d0A;
        }
        v0 v0VarB = bVarG.b();
        AbstractC6492s.f(v0VarB);
        return m(r0Var, v0VarB, list, z10, interfaceC6164k);
    }
}
