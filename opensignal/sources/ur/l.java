package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import rr.s0;

/* loaded from: classes.dex */
public class l extends k {
    public final rr.z B;
    public final rr.g D;
    public final ht.k E;
    public at.n F;
    public Set G;
    public j H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rr.l lVar, qs.g gVar, rr.z zVar, rr.g gVar2, List list, gt.o oVar) {
        super(oVar, lVar, gVar, rr.o0.f21696s);
        if (lVar == null) {
            J(0);
            throw null;
        }
        if (gVar == null) {
            J(1);
            throw null;
        }
        if (zVar == null) {
            J(2);
            throw null;
        }
        if (gVar2 == null) {
            J(3);
            throw null;
        }
        if (oVar == null) {
            J(6);
            throw null;
        }
        this.B = zVar;
        this.D = gVar2;
        this.E = new ht.k(this, Collections.EMPTY_LIST, list, oVar);
    }

    public static /* synthetic */ void J(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "storageManager";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
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
        at.n nVar = this.F;
        if (nVar != null) {
            return nVar;
        }
        J(13);
        throw null;
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

    public final void L(at.n nVar, Set set, j jVar) {
        this.F = nVar;
        this.G = set;
        this.H = jVar;
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
        return this.H;
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
        J(17);
        throw null;
    }

    @Override // rr.f
    public final rr.g f() {
        rr.g gVar = this.D;
        if (gVar != null) {
            return gVar;
        }
        J(15);
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
        rr.z zVar = this.B;
        if (zVar != null) {
            return zVar;
        }
        J(16);
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
        J(18);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // rr.i
    public final ht.m0 v() {
        ht.k kVar = this.E;
        if (kVar != null) {
            return kVar;
        }
        J(10);
        throw null;
    }

    @Override // rr.f
    public final boolean w() {
        return false;
    }

    @Override // rr.f
    public final Collection z() {
        Set set = this.G;
        if (set != null) {
            return set;
        }
        J(11);
        throw null;
    }
}
