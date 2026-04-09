package Lh;

import Bh.AbstractC2510u;
import Bh.D;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.f0;
import Bh.g0;
import Dh.O;
import java.util.List;
import java.util.Map;
import pi.S;
import ui.s;

/* loaded from: classes4.dex */
public class e extends O implements Lh.a {

    /* renamed from: G, reason: collision with root package name */
    public static final InterfaceC2491a.InterfaceC0071a f11821G = new a();

    /* renamed from: H, reason: collision with root package name */
    public static final InterfaceC2491a.InterfaceC0071a f11822H = new b();

    /* renamed from: E, reason: collision with root package name */
    private c f11823E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f11824F;

    static class a implements InterfaceC2491a.InterfaceC0071a {
        a() {
        }
    }

    static class b implements InterfaceC2491a.InterfaceC0071a {
        b() {
        }
    }

    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        c(boolean z10, boolean z11) {
            this.isStable = z10;
            this.isSynthesized = z11;
        }

        public static c get(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                $$$reportNull$$$0(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(InterfaceC2503m interfaceC2503m, f0 f0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, InterfaceC2492b.a aVar, g0 g0Var, boolean z10) {
        super(interfaceC2503m, f0Var, hVar, fVar, aVar, g0Var);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (fVar == null) {
            I(2);
        }
        if (aVar == null) {
            I(3);
        }
        if (g0Var == null) {
            I(4);
        }
        this.f11823E = null;
        this.f11824F = z10;
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e p1(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, g0 g0Var, boolean z10) {
        if (interfaceC2503m == null) {
            I(5);
        }
        if (hVar == null) {
            I(6);
        }
        if (fVar == null) {
            I(7);
        }
        if (g0Var == null) {
            I(8);
        }
        return new e(interfaceC2503m, null, hVar, fVar, InterfaceC2492b.a.DECLARATION, g0Var, z10);
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2491a
    public boolean H() {
        return this.f11823E.isSynthesized;
    }

    @Override // Dh.AbstractC2612s
    public boolean Q0() {
        return this.f11823E.isStable;
    }

    @Override // Dh.O
    public O o1(b0 b0Var, b0 b0Var2, List list, List list2, List list3, S s10, D d10, AbstractC2510u abstractC2510u, Map map) {
        if (list == null) {
            I(9);
        }
        if (list2 == null) {
            I(10);
        }
        if (list3 == null) {
            I(11);
        }
        if (abstractC2510u == null) {
            I(12);
        }
        O oO1 = super.o1(b0Var, b0Var2, list, list2, list3, s10, d10, abstractC2510u, map);
        f1(s.f63108a.a(oO1).a());
        if (oO1 == null) {
            I(13);
        }
        return oO1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.O, Dh.AbstractC2612s
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public e L0(InterfaceC2503m interfaceC2503m, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a aVar, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(14);
        }
        if (aVar == null) {
            I(15);
        }
        if (hVar == null) {
            I(16);
        }
        if (g0Var == null) {
            I(17);
        }
        f0 f0Var = (f0) interfaceC2515z;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC2503m, f0Var, hVar, fVar, aVar, g0Var, this.f11824F);
        eVar.s1(Q0(), H());
        return eVar;
    }

    @Override // Lh.a
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public e A0(S s10, List list, S s11, Yg.s sVar) {
        if (list == null) {
            I(19);
        }
        if (s11 == null) {
            I(20);
        }
        e eVar = (e) v().d(h.a(list, i(), this)).g(s11).c(s10 == null ? null : bi.h.i(this, s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b())).b().i().a();
        if (sVar != null) {
            eVar.U0((InterfaceC2491a.InterfaceC0071a) sVar.h(), sVar.j());
        }
        if (eVar == null) {
            I(21);
        }
        return eVar;
    }

    public void s1(boolean z10, boolean z11) {
        this.f11823E = c.get(z10, z11);
    }
}
