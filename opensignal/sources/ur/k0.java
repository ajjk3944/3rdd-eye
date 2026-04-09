package ur;

import ht.x0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class k0 extends u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(rr.l lVar, k0 k0Var, sr.h hVar, qs.g gVar, rr.c cVar, rr.o0 o0Var) {
        super(gVar, cVar, lVar, k0Var, o0Var, hVar);
        if (lVar == null) {
            S0(0);
            throw null;
        }
        if (hVar == null) {
            S0(1);
            throw null;
        }
        if (gVar == null) {
            S0(2);
            throw null;
        }
        if (cVar == null) {
            S0(3);
            throw null;
        }
        if (o0Var != null) {
        } else {
            S0(4);
            throw null;
        }
    }

    public static k0 G1(b bVar, qs.g gVar, rr.c cVar, rr.o0 o0Var) {
        if (bVar == null) {
            S0(5);
            throw null;
        }
        if (gVar == null) {
            S0(7);
            throw null;
        }
        if (cVar == null) {
            S0(8);
            throw null;
        }
        if (o0Var != null) {
            return new k0(bVar, null, sr.g.f22217a, gVar, cVar, o0Var);
        }
        S0(9);
        throw null;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 3:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ur.u, rr.u
    public rr.t F0() {
        return B1(x0.f10954b);
    }

    @Override // ur.o
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public final k0 u1() {
        k0 k0Var = (k0) super.u1();
        if (k0Var != null) {
            return k0Var;
        }
        S0(24);
        throw null;
    }

    @Override // ur.u
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public final k0 A1(v vVar, v vVar2, List list, List list2, List list3, ht.x xVar, rr.z zVar, as.p pVar) {
        if (list == null) {
            S0(14);
            throw null;
        }
        if (list2 == null) {
            S0(15);
            throw null;
        }
        if (list3 == null) {
            S0(16);
            throw null;
        }
        if (pVar != null) {
            return J1(vVar, vVar2, list, list2, list3, xVar, zVar, pVar, null);
        }
        S0(17);
        throw null;
    }

    public k0 J1(v vVar, v vVar2, List list, List list2, List list3, ht.x xVar, rr.z zVar, as.p pVar, Map map) {
        if (list == null) {
            S0(19);
            throw null;
        }
        if (list2 == null) {
            S0(20);
            throw null;
        }
        if (list3 == null) {
            S0(21);
            throw null;
        }
        if (pVar == null) {
            S0(22);
            throw null;
        }
        super.A1(vVar, vVar2, list, list2, list3, xVar, zVar, pVar);
        if (map != null && !map.isEmpty()) {
            this.Z = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // ur.u
    public u x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, rr.o0 o0Var, sr.h hVar) {
        if (lVar == null) {
            S0(25);
            throw null;
        }
        if (cVar == null) {
            S0(26);
            throw null;
        }
        if (hVar == null) {
            S0(27);
            throw null;
        }
        k0 k0Var = (k0) uVar;
        if (gVar == null) {
            gVar = getName();
        }
        return new k0(lVar, k0Var, hVar, gVar, cVar, o0Var);
    }
}
