package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends g0 implements rr.l0 {
    public ht.x J;
    public final i0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(rr.m0 m0Var, sr.h hVar, rr.z zVar, as.p pVar, boolean z10, boolean z11, boolean z12, rr.c cVar, i0 i0Var, rr.o0 o0Var) {
        super(zVar, pVar, m0Var, hVar, qs.g.g("<get-" + m0Var.getName() + ">"), z10, z11, z12, cVar, o0Var);
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
        this.K = i0Var != null ? i0Var : this;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // rr.b
    public final List Y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S0(7);
        throw null;
    }

    @Override // rr.b
    public final ht.x i() {
        return this.J;
    }

    @Override // rr.d, rr.b
    public final Collection p() {
        return w1(true);
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.F(this, obj);
    }

    @Override // ur.o
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final i0 u1() {
        i0 i0Var = this.K;
        if (i0Var != null) {
            return i0Var;
        }
        S0(8);
        throw null;
    }

    public final void y1(ht.x xVar) {
        if (xVar == null) {
            xVar = v1().getType();
        }
        this.J = xVar;
    }
}
