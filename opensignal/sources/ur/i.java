package ur;

import ht.d1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends o implements rr.r0 {
    public final boolean B;
    public final int D;
    public final gt.i E;
    public final gt.i F;
    public final gt.l G;

    /* renamed from: y, reason: collision with root package name */
    public final d1 f23644y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gt.o oVar, rr.l lVar, sr.h hVar, qs.g gVar, d1 d1Var, boolean z10, int i10, rr.p0 p0Var) {
        super(lVar, hVar, gVar, rr.o0.f21696s);
        if (oVar == null) {
            S0(0);
            throw null;
        }
        if (lVar == null) {
            S0(1);
            throw null;
        }
        if (hVar == null) {
            S0(2);
            throw null;
        }
        if (gVar == null) {
            S0(3);
            throw null;
        }
        if (d1Var == null) {
            S0(4);
            throw null;
        }
        if (p0Var == null) {
            S0(6);
            throw null;
        }
        this.f23644y = d1Var;
        this.B = z10;
        this.D = i10;
        f fVar = new f(this, oVar, p0Var);
        gt.l lVar2 = (gt.l) oVar;
        this.E = new gt.i(lVar2, fVar);
        this.F = new gt.i(lVar2, new g(this, 0, gVar));
        this.G = lVar2;
    }

    public static /* synthetic */ void S0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVariance";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // rr.r0
    public final boolean F() {
        return this.B;
    }

    @Override // rr.r0
    public final d1 N() {
        d1 d1Var = this.f23644y;
        if (d1Var != null) {
            return d1Var;
        }
        S0(7);
        throw null;
    }

    @Override // ur.o, ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.i u1() {
        return this;
    }

    @Override // rr.r0
    public final gt.o g0() {
        gt.l lVar = this.G;
        if (lVar != null) {
            return lVar;
        }
        S0(14);
        throw null;
    }

    @Override // rr.r0
    public final int getIndex() {
        return this.D;
    }

    @Override // rr.r0
    public final List getUpperBounds() {
        List listQ = ((h) v()).q();
        if (listQ != null) {
            return listQ;
        }
        S0(8);
        throw null;
    }

    @Override // rr.r0
    public final boolean m0() {
        return false;
    }

    @Override // rr.i
    public final ht.b0 q() {
        ht.b0 b0Var = (ht.b0) this.F.c();
        if (b0Var != null) {
            return b0Var;
        }
        S0(10);
        throw null;
    }

    @Override // rr.i
    public final ht.m0 v() {
        ht.m0 m0Var = (ht.m0) this.E.c();
        if (m0Var != null) {
            return m0Var;
        }
        S0(9);
        throw null;
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.O(this, obj);
    }

    public abstract List w1();

    @Override // ur.o, ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.l u1() {
        return this;
    }

    @Override // ur.o, ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.r0 u1() {
        return this;
    }

    @Override // ur.o
    public final rr.m u1() {
        return this;
    }

    public List v1(List list) {
        return list;
    }
}
