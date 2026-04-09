package Lh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.g0;
import Dh.C2603i;
import Yg.s;
import Zg.AbstractC3689v;
import java.util.List;
import pi.S;

/* loaded from: classes4.dex */
public class b extends C2603i implements a {

    /* renamed from: F, reason: collision with root package name */
    private Boolean f11816F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f11817G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(InterfaceC2495e interfaceC2495e, b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, InterfaceC2492b.a aVar, g0 g0Var) {
        super(interfaceC2495e, bVar, hVar, z10, aVar, g0Var);
        if (interfaceC2495e == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (aVar == null) {
            I(2);
        }
        if (g0Var == null) {
            I(3);
        }
        this.f11816F = null;
        this.f11817G = null;
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b t1(InterfaceC2495e interfaceC2495e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, g0 g0Var) {
        if (interfaceC2495e == null) {
            I(4);
        }
        if (hVar == null) {
            I(5);
        }
        if (g0Var == null) {
            I(6);
        }
        return new b(interfaceC2495e, null, hVar, z10, InterfaceC2492b.a.DECLARATION, g0Var);
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2491a
    public boolean H() {
        return this.f11817G.booleanValue();
    }

    @Override // Dh.AbstractC2612s
    public boolean Q0() {
        return this.f11816F.booleanValue();
    }

    @Override // Dh.AbstractC2612s
    public void Y0(boolean z10) {
        this.f11816F = Boolean.valueOf(z10);
    }

    @Override // Dh.AbstractC2612s
    public void Z0(boolean z10) {
        this.f11817G = Boolean.valueOf(z10);
    }

    protected b s1(InterfaceC2495e interfaceC2495e, b bVar, InterfaceC2492b.a aVar, g0 g0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        if (interfaceC2495e == null) {
            I(12);
        }
        if (aVar == null) {
            I(13);
        }
        if (g0Var == null) {
            I(14);
        }
        if (hVar == null) {
            I(15);
        }
        return new b(interfaceC2495e, bVar, hVar, this.f3461E, aVar, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.C2603i
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public b L0(InterfaceC2503m interfaceC2503m, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a aVar, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(7);
        }
        if (aVar == null) {
            I(8);
        }
        if (hVar == null) {
            I(9);
        }
        if (g0Var == null) {
            I(10);
        }
        if (aVar == InterfaceC2492b.a.DECLARATION || aVar == InterfaceC2492b.a.SYNTHESIZED) {
            b bVarS1 = s1((InterfaceC2495e) interfaceC2503m, (b) interfaceC2515z, aVar, g0Var, hVar);
            bVarS1.Y0(Q0());
            bVarS1.Z0(H());
            return bVarS1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC2503m + "\nkind: " + aVar);
    }

    @Override // Lh.a
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b A0(S s10, List list, S s11, s sVar) {
        if (list == null) {
            I(16);
        }
        if (s11 == null) {
            I(17);
        }
        b bVarL0 = L0(b(), null, h(), null, getAnnotations(), j());
        bVarL0.R0(s10 == null ? null : bi.h.i(bVarL0, s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b()), d0(), AbstractC3689v.l(), getTypeParameters(), h.a(list, i(), bVarL0), s11, l(), getVisibility());
        if (sVar != null) {
            bVarL0.U0((InterfaceC2491a.InterfaceC0071a) sVar.h(), sVar.j());
        }
        return bVarL0;
    }
}
