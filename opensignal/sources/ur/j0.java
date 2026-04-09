package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends g0 implements rr.l0 {
    public q0 J;
    public final j0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(rr.m0 m0Var, sr.h hVar, rr.z zVar, as.p pVar, boolean z10, boolean z11, boolean z12, rr.c cVar, j0 j0Var, rr.o0 o0Var) {
        super(zVar, pVar, m0Var, hVar, qs.g.g("<set-" + m0Var.getName() + ">"), z10, z11, z12, cVar, o0Var);
        if (hVar == null) {
            S0(1);
            throw null;
        }
        if (zVar == null) {
            S0(2);
            throw null;
        }
        if (pVar == null) {
            S0(3);
            throw null;
        }
        if (cVar == null) {
            S0(4);
            throw null;
        }
        if (o0Var == null) {
            S0(5);
            throw null;
        }
        this.K = j0Var != null ? j0Var : this;
    }

    public static /* synthetic */ void S0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "parameter";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "setterDescriptor";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "initialize";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static q0 x1(j0 j0Var, ht.x xVar, sr.h hVar) {
        if (xVar == null) {
            S0(8);
            throw null;
        }
        if (hVar != null) {
            return new q0(j0Var, null, 0, hVar, qs.i.f21044g, xVar, false, false, false, null, rr.o0.f21696s);
        }
        S0(9);
        throw null;
    }

    @Override // rr.b
    public final List Y() {
        q0 q0Var = this.J;
        if (q0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(q0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        S0(11);
        throw null;
    }

    @Override // rr.b
    public final ht.x i() {
        return xs.d.e(this).w();
    }

    @Override // rr.d, rr.b
    public final Collection p() {
        return w1(false);
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.u(this, obj);
    }

    @Override // ur.o
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public final j0 u1() {
        j0 j0Var = this.K;
        if (j0Var != null) {
            return j0Var;
        }
        S0(13);
        throw null;
    }
}
