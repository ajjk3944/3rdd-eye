package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends ht.h {

    /* renamed from: c, reason: collision with root package name */
    public final rr.p0 f23642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f23643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gt.o oVar, rr.p0 p0Var) {
        super(oVar);
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.f23643d = iVar;
        this.f23642c = p0Var;
    }

    public static /* synthetic */ void h(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "type";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i10 == 2) {
            objArr[1] = "getParameters";
        } else if (i10 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ht.h
    public final Collection b() {
        List listW1 = this.f23643d.w1();
        if (listW1 != null) {
            return listW1;
        }
        h(1);
        throw null;
    }

    @Override // ht.h
    public final ht.x c() {
        return kt.k.c(kt.j.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // ht.h
    public final rr.p0 d() {
        rr.p0 p0Var = this.f23642c;
        if (p0Var != null) {
            return p0Var;
        }
        h(5);
        throw null;
    }

    @Override // ht.h
    public final boolean f(rr.i iVar) {
        if (!(iVar instanceof rr.r0)) {
            return false;
        }
        return ts.b.f22960a.d(this.f23643d, (rr.r0) iVar, true, ts.a.f22959d);
    }

    @Override // ht.h
    public final List g(List list) {
        List listV1 = this.f23643d.v1(list);
        if (listV1 != null) {
            return listV1;
        }
        h(8);
        throw null;
    }

    @Override // ht.m0
    public final or.h n() {
        or.h hVarE = xs.d.e(this.f23643d);
        if (hVarE != null) {
            return hVarE;
        }
        h(4);
        throw null;
    }

    @Override // ht.m0
    public final List o() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        h(2);
        throw null;
    }

    @Override // ht.m0
    public final rr.i p() {
        i iVar = this.f23643d;
        if (iVar != null) {
            return iVar;
        }
        h(3);
        throw null;
    }

    @Override // ht.m0
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return this.f23643d.getName().f21035a;
    }
}
