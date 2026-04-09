package ur;

import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g0 extends o implements rr.l0 {
    public final boolean B;
    public final rr.z D;
    public final rr.m0 E;
    public final boolean F;
    public final rr.c G;
    public as.p H;
    public rr.u I;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23641y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(rr.z zVar, as.p pVar, rr.m0 m0Var, sr.h hVar, qs.g gVar, boolean z10, boolean z11, boolean z12, rr.c cVar, rr.o0 o0Var) {
        super(m0Var.o(), hVar, gVar, o0Var);
        if (zVar == null) {
            S0(0);
            throw null;
        }
        if (pVar == null) {
            S0(1);
            throw null;
        }
        if (hVar == null) {
            S0(3);
            throw null;
        }
        if (o0Var == null) {
            S0(5);
            throw null;
        }
        this.I = null;
        this.D = zVar;
        this.H = pVar;
        this.E = m0Var;
        this.f23641y = z10;
        this.B = z11;
        this.F = z12;
        this.G = cVar;
    }

    public static /* synthetic */ void S0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getKind";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // rr.b
    public final Object A(rr.a aVar) {
        return null;
    }

    @Override // rr.u
    public final boolean D0() {
        return false;
    }

    @Override // rr.b
    public final boolean G() {
        return false;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.u
    public final boolean L0() {
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return false;
    }

    @Override // rr.u
    public final boolean P() {
        return false;
    }

    @Override // rr.u
    public final boolean Q() {
        return false;
    }

    @Override // rr.d
    public final rr.d V(rr.f fVar, rr.z zVar, as.p pVar, rr.c cVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // rr.o, rr.x
    public final as.p c() {
        as.p pVar = this.H;
        if (pVar != null) {
            return pVar;
        }
        S0(11);
        throw null;
    }

    @Override // rr.u
    public final rr.u d0() {
        return this.I;
    }

    @Override // rr.u, rr.q0
    public final rr.u e(x0 x0Var) {
        if (x0Var != null) {
            return this;
        }
        S0(7);
        throw null;
    }

    @Override // rr.d
    public final rr.c f() {
        rr.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        S0(6);
        throw null;
    }

    @Override // rr.b
    public final v f0() {
        return v1().f0();
    }

    @Override // rr.u
    public final boolean g() {
        return this.F;
    }

    @Override // rr.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S0(9);
        throw null;
    }

    @Override // rr.x
    public final rr.z j() {
        rr.z zVar = this.D;
        if (zVar != null) {
            return zVar;
        }
        S0(10);
        throw null;
    }

    @Override // rr.b
    public final v j0() {
        return v1().j0();
    }

    @Override // rr.b
    public final List o0() {
        List listO0 = v1().o0();
        if (listO0 != null) {
            return listO0;
        }
        S0(14);
        throw null;
    }

    @Override // rr.u
    public final boolean r() {
        return false;
    }

    @Override // rr.x
    public final boolean u() {
        return this.B;
    }

    public final rr.m0 v1() {
        rr.m0 m0Var = this.E;
        if (m0Var != null) {
            return m0Var;
        }
        S0(13);
        throw null;
    }

    public final ArrayList w1(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (rr.m0 m0Var : v1().p()) {
            rr.b bVarB = z10 ? m0Var.b() : m0Var.d();
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        return arrayList;
    }

    @Override // rr.u
    public final boolean x0() {
        return false;
    }

    @Override // rr.d
    public final void y0(Collection collection) {
        if (collection != null) {
            return;
        }
        S0(16);
        throw null;
    }

    @Override // rr.q0
    public final /* bridge */ /* synthetic */ rr.m e(x0 x0Var) {
        e(x0Var);
        return this;
    }
}
