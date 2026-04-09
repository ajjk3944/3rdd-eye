package ur;

import ht.d1;

/* loaded from: classes.dex */
public abstract class c extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gt.o oVar, rr.l lVar, sr.h hVar, qs.g gVar, d1 d1Var, boolean z10, int i10, rr.p0 p0Var) {
        super(oVar, lVar, hVar, gVar, d1Var, z10, i10, p0Var);
        if (oVar == null) {
            S0(0);
            throw null;
        }
        if (lVar == null) {
            S0(1);
            throw null;
        }
        if (d1Var == null) {
            S0(4);
            throw null;
        }
        if (p0Var != null) {
        } else {
            S0(6);
            throw null;
        }
    }

    public static /* synthetic */ void S0(int i10) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ur.n, androidx.lifecycle.o
    public final String toString() {
        String str = "";
        String str2 = this.B ? "reified " : "";
        if (N() != d1.INVARIANT) {
            str = N() + " ";
        }
        return str2 + str + getName();
    }
}
