package cs;

import ht.x;
import java.util.ArrayList;
import lq.l;
import mq.w;
import rr.o0;
import rr.u;
import ts.o;
import ur.j;

/* loaded from: classes.dex */
public final class b extends j implements a {

    /* renamed from: b0, reason: collision with root package name */
    public Boolean f6661b0;

    /* renamed from: c0, reason: collision with root package name */
    public Boolean f6662c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rr.f fVar, b bVar, sr.h hVar, boolean z10, rr.c cVar, o0 o0Var) {
        super(fVar, bVar, hVar, z10, cVar, o0Var);
        if (fVar == null) {
            S0(0);
            throw null;
        }
        if (hVar == null) {
            S0(1);
            throw null;
        }
        if (cVar == null) {
            S0(2);
            throw null;
        }
        if (o0Var == null) {
            S0(3);
            throw null;
        }
        this.f6661b0 = null;
        this.f6662c0 = null;
    }

    public static b M1(rr.f fVar, sr.h hVar, boolean z10, wr.f fVar2) {
        if (fVar != null) {
            return new b(fVar, null, hVar, z10, rr.c.DECLARATION, fVar2);
        }
        S0(4);
        throw null;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
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
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "createJavaConstructor";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
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

    @Override // ur.u
    public final void D1(boolean z10) {
        this.f6661b0 = Boolean.valueOf(z10);
    }

    @Override // ur.u
    public final void E1(boolean z10) {
        this.f6662c0 = Boolean.valueOf(z10);
    }

    @Override // ur.u, rr.b
    public final boolean G() {
        return this.f6662c0.booleanValue();
    }

    @Override // cs.a
    public final a G0(x xVar, ArrayList arrayList, x xVar2, l lVar) {
        b bVarN1 = N1(o(), null, f(), getAnnotations(), h());
        bVarN1.A1(xVar == null ? null : o.k(bVarN1, xVar, sr.g.f22217a), this.G, w.f16945a, getTypeParameters(), vc.e.l(arrayList, Y(), bVarN1), xVar2, j(), c());
        if (lVar != null) {
            bVarN1.C1((rr.a) lVar.f15571a, lVar.f15572d);
        }
        return bVarN1;
    }

    @Override // ur.j
    /* renamed from: G1 */
    public final /* bridge */ /* synthetic */ j x1(qs.g gVar, rr.c cVar, rr.l lVar, u uVar, o0 o0Var, sr.h hVar) {
        return N1(lVar, uVar, cVar, hVar, o0Var);
    }

    public final b N1(rr.l lVar, u uVar, rr.c cVar, sr.h hVar, o0 o0Var) {
        if (lVar == null) {
            S0(7);
            throw null;
        }
        if (cVar == null) {
            S0(8);
            throw null;
        }
        if (hVar == null) {
            S0(9);
            throw null;
        }
        if (o0Var == null) {
            S0(10);
            throw null;
        }
        if (cVar != rr.c.DECLARATION && cVar != rr.c.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + lVar + "\nkind: " + cVar);
        }
        b bVar = new b((rr.f) lVar, (b) uVar, hVar, this.f23645a0, cVar, o0Var);
        Boolean bool = this.f6661b0;
        bool.getClass();
        bVar.f6661b0 = bool;
        Boolean bool2 = this.f6662c0;
        bool2.getClass();
        bVar.f6662c0 = bool2;
        return bVar;
    }

    @Override // ur.j, ur.u
    public final /* bridge */ /* synthetic */ ur.u x1(qs.g gVar, rr.c cVar, rr.l lVar, u uVar, o0 o0Var, sr.h hVar) {
        return N1(lVar, uVar, cVar, hVar, o0Var);
    }
}
