package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import rr.s0;

/* loaded from: classes.dex */
public final class r extends k {
    public final ht.k B;
    public final q D;
    public final gt.m E;
    public final sr.h F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(gt.o oVar, rr.f fVar, ht.b0 b0Var, qs.g gVar, gt.m mVar, sr.h hVar, rr.o0 o0Var) {
        super(oVar, fVar, gVar, o0Var);
        if (oVar == null) {
            J(6);
            throw null;
        }
        if (fVar == null) {
            J(7);
            throw null;
        }
        if (b0Var == null) {
            J(8);
            throw null;
        }
        if (gVar == null) {
            J(9);
            throw null;
        }
        if (mVar == null) {
            J(10);
            throw null;
        }
        this.F = hVar;
        this.B = new ht.k(this, Collections.EMPTY_LIST, Collections.singleton(b0Var), oVar);
        this.D = new q(this, oVar);
        this.E = mVar;
    }

    public static /* synthetic */ void J(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 12:
                objArr[0] = "source";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                objArr[0] = "storageManager";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "containingClass";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static r L(gt.o oVar, rr.f fVar, qs.g gVar, gt.i iVar, sr.h hVar, rr.o0 o0Var) {
        if (oVar == null) {
            J(0);
            throw null;
        }
        if (fVar == null) {
            J(1);
            throw null;
        }
        if (gVar == null) {
            J(2);
            throw null;
        }
        if (iVar != null) {
            return new r(oVar, fVar, fVar.q(), gVar, iVar, hVar, o0Var);
        }
        J(3);
        throw null;
    }

    @Override // rr.f
    public final s0 B0() {
        return null;
    }

    @Override // rr.f
    public final boolean D() {
        return false;
    }

    @Override // ur.z
    public final at.n H(jt.f fVar) {
        q qVar = this.D;
        if (qVar != null) {
            return qVar;
        }
        J(14);
        throw null;
    }

    @Override // rr.f
    public final Collection I() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        J(23);
        throw null;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return false;
    }

    @Override // rr.f
    public final boolean P0() {
        return false;
    }

    @Override // rr.f
    public final j R() {
        return null;
    }

    @Override // rr.f
    public final at.n S() {
        return at.m.f2303b;
    }

    @Override // rr.f, rr.o, rr.x
    public final as.p c() {
        as.p pVar = rr.p.f21701e;
        if (pVar != null) {
            return pVar;
        }
        J(20);
        throw null;
    }

    @Override // rr.f
    public final rr.g f() {
        rr.g gVar = rr.g.ENUM_ENTRY;
        if (gVar != null) {
            return gVar;
        }
        J(18);
        throw null;
    }

    @Override // rr.f
    public final boolean g() {
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        sr.h hVar = this.F;
        if (hVar != null) {
            return hVar;
        }
        J(21);
        throw null;
    }

    @Override // rr.f, rr.x
    public final rr.z j() {
        rr.z zVar = rr.z.FINAL;
        if (zVar != null) {
            return zVar;
        }
        J(19);
        throw null;
    }

    @Override // rr.f
    public final boolean k() {
        return false;
    }

    @Override // rr.j
    public final boolean m() {
        return false;
    }

    @Override // rr.f, rr.j
    public final List s() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        J(22);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // rr.i
    public final ht.m0 v() {
        ht.k kVar = this.B;
        if (kVar != null) {
            return kVar;
        }
        J(17);
        throw null;
    }

    @Override // rr.f
    public final boolean w() {
        return false;
    }

    @Override // rr.f
    public final Collection z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        J(16);
        throw null;
    }
}
