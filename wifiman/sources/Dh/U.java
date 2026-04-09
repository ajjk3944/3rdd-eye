package Dh;

import Bh.InterfaceC2503m;
import Bh.g0;
import Bh.j0;
import Bh.l0;
import com.google.ar.core.ImageFormat;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.List;
import mh.InterfaceC6835l;
import pi.N0;

/* loaded from: classes4.dex */
public class U extends AbstractC2602h {

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6835l f3413k;

    /* renamed from: l, reason: collision with root package name */
    private final List f3414l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f3415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private U(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, N0 n02, Zh.f fVar, int i10, g0 g0Var, InterfaceC6835l interfaceC6835l, j0 j0Var, oi.n nVar) {
        super(nVar, interfaceC2503m, hVar, fVar, n02, z10, i10, g0Var, j0Var);
        if (interfaceC2503m == null) {
            I(19);
        }
        if (hVar == null) {
            I(20);
        }
        if (n02 == null) {
            I(21);
        }
        if (fVar == null) {
            I(22);
        }
        if (g0Var == null) {
            I(23);
        }
        if (j0Var == null) {
            I(24);
        }
        if (nVar == null) {
            I(25);
        }
        this.f3414l = new ArrayList(1);
        this.f3415m = false;
        this.f3413k = interfaceC6835l;
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private void N0() {
        if (this.f3415m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
    }

    private void O0() {
        if (this.f3415m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public static U P0(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, N0 n02, Zh.f fVar, int i10, g0 g0Var, InterfaceC6835l interfaceC6835l, j0 j0Var, oi.n nVar) {
        if (interfaceC2503m == null) {
            I(12);
        }
        if (hVar == null) {
            I(13);
        }
        if (n02 == null) {
            I(14);
        }
        if (fVar == null) {
            I(15);
        }
        if (g0Var == null) {
            I(16);
        }
        if (j0Var == null) {
            I(17);
        }
        if (nVar == null) {
            I(18);
        }
        return new U(interfaceC2503m, hVar, z10, n02, fVar, i10, g0Var, interfaceC6835l, j0Var, nVar);
    }

    public static U Q0(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, N0 n02, Zh.f fVar, int i10, g0 g0Var, oi.n nVar) {
        if (interfaceC2503m == null) {
            I(6);
        }
        if (hVar == null) {
            I(7);
        }
        if (n02 == null) {
            I(8);
        }
        if (fVar == null) {
            I(9);
        }
        if (g0Var == null) {
            I(10);
        }
        if (nVar == null) {
            I(11);
        }
        return P0(interfaceC2503m, hVar, z10, n02, fVar, i10, g0Var, null, j0.a.f1787a, nVar);
    }

    public static l0 R0(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, N0 n02, Zh.f fVar, int i10, oi.n nVar) {
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (n02 == null) {
            I(2);
        }
        if (fVar == null) {
            I(3);
        }
        if (nVar == null) {
            I(4);
        }
        U uQ0 = Q0(interfaceC2503m, hVar, z10, n02, fVar, i10, g0.f1784a, nVar);
        uQ0.M0(AbstractC5833e.m(interfaceC2503m).y());
        uQ0.V0();
        return uQ0;
    }

    private void S0(pi.S s10) {
        if (pi.W.a(s10)) {
            return;
        }
        this.f3414l.add(s10);
    }

    private String U0() {
        return getName() + " declared in " + bi.i.m(b());
    }

    @Override // Dh.AbstractC2602h
    protected void K0(pi.S s10) {
        if (s10 == null) {
            I(27);
        }
        InterfaceC6835l interfaceC6835l = this.f3413k;
        if (interfaceC6835l == null) {
            return;
        }
        interfaceC6835l.invoke(s10);
    }

    @Override // Dh.AbstractC2602h
    protected List L0() {
        N0();
        List list = this.f3414l;
        if (list == null) {
            I(28);
        }
        return list;
    }

    public void M0(pi.S s10) {
        if (s10 == null) {
            I(26);
        }
        O0();
        S0(s10);
    }

    public boolean T0() {
        return this.f3415m;
    }

    public void V0() {
        O0();
        this.f3415m = true;
    }
}
