package ur;

import ht.d1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 extends i {
    public final ArrayList H;
    public boolean I;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(rr.l lVar, sr.h hVar, boolean z10, d1 d1Var, qs.g gVar, int i10, gt.o oVar) {
        rr.p0 p0Var = rr.p0.f21711g;
        if (lVar == null) {
            S0(19);
            throw null;
        }
        if (hVar == null) {
            S0(20);
            throw null;
        }
        if (d1Var == null) {
            S0(21);
            throw null;
        }
        if (gVar == null) {
            S0(22);
            throw null;
        }
        if (oVar == null) {
            S0(25);
            throw null;
        }
        super(oVar, lVar, hVar, gVar, d1Var, z10, i10, p0Var);
        this.H = new ArrayList(1);
        this.I = false;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
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
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 28:
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
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
            case 22:
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

    public static o0 x1(rr.l lVar, sr.h hVar, boolean z10, d1 d1Var, qs.g gVar, int i10, gt.o oVar) {
        if (lVar == null) {
            S0(6);
            throw null;
        }
        if (hVar == null) {
            S0(7);
            throw null;
        }
        if (d1Var == null) {
            S0(8);
            throw null;
        }
        if (gVar == null) {
            S0(9);
            throw null;
        }
        if (oVar != null) {
            return new o0(lVar, hVar, z10, d1Var, gVar, i10, oVar);
        }
        S0(11);
        throw null;
    }

    public static o0 y1(b bVar, d1 d1Var, qs.g gVar, int i10, gt.o oVar) {
        if (d1Var == null) {
            S0(2);
            throw null;
        }
        if (oVar == null) {
            S0(4);
            throw null;
        }
        o0 o0VarX1 = x1(bVar, sr.g.f22217a, false, d1Var, gVar, i10, oVar);
        ht.b0 b0VarM = xs.d.e(bVar).m();
        if (o0VarX1.I) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0VarX1.z1());
        }
        if (!ht.c.i(b0VarM)) {
            o0VarX1.H.add(b0VarM);
        }
        if (!o0VarX1.I) {
            o0VarX1.I = true;
            return o0VarX1;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0VarX1.z1());
    }

    @Override // ur.i
    public final List w1() {
        if (!this.I) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + z1());
        }
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            return arrayList;
        }
        S0(28);
        throw null;
    }

    public final String z1() {
        return getName() + " declared in " + ts.d.g(o());
    }
}
