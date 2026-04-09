package ur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import rr.s0;

/* loaded from: classes.dex */
public final class b0 extends k {
    public final rr.g B;
    public rr.z D;
    public as.p E;
    public ht.k F;
    public ArrayList G;
    public final ArrayList H;
    public final gt.o I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(qr.o oVar, rr.g gVar, qs.g gVar2, gt.o oVar2) {
        super(oVar2, oVar, gVar2, rr.o0.f21696s);
        if (gVar == null) {
            J(1);
            throw null;
        }
        if (gVar2 == null) {
            J(2);
            throw null;
        }
        if (oVar2 == null) {
            J(4);
            throw null;
        }
        this.H = new ArrayList();
        this.I = oVar2;
        this.B = gVar;
    }

    public static /* synthetic */ void J(int i10) {
        String str;
        int i11;
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getAnnotations";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getModality";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
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
        return at.m.f2303b;
    }

    @Override // rr.f
    public final Collection I() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        J(19);
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
        as.p pVar = this.E;
        if (pVar != null) {
            return pVar;
        }
        J(10);
        throw null;
    }

    @Override // rr.f
    public final rr.g f() {
        rr.g gVar = this.B;
        if (gVar != null) {
            return gVar;
        }
        J(8);
        throw null;
    }

    @Override // rr.f
    public final boolean g() {
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return sr.g.f22217a;
    }

    @Override // rr.f, rr.x
    public final rr.z j() {
        rr.z zVar = this.D;
        if (zVar != null) {
            return zVar;
        }
        J(7);
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
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            return arrayList;
        }
        J(15);
        throw null;
    }

    public final String toString() {
        return n.t1(this);
    }

    @Override // rr.i
    public final ht.m0 v() {
        ht.k kVar = this.F;
        if (kVar != null) {
            return kVar;
        }
        J(11);
        throw null;
    }

    @Override // rr.f
    public final boolean w() {
        return false;
    }

    @Override // rr.f
    public final Collection z() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        J(13);
        throw null;
    }
}
