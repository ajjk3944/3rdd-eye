package ur;

/* loaded from: classes.dex */
public abstract class o extends n implements rr.m {

    /* renamed from: r, reason: collision with root package name */
    public final rr.l f23657r;

    /* renamed from: x, reason: collision with root package name */
    public final rr.o0 f23658x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rr.l lVar, sr.h hVar, qs.g gVar, rr.o0 o0Var) {
        super(hVar, gVar);
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
        if (o0Var == null) {
            S0(3);
            throw null;
        }
        this.f23657r = lVar;
        this.f23658x = o0Var;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public rr.o0 h() {
        rr.o0 o0Var = this.f23658x;
        if (o0Var != null) {
            return o0Var;
        }
        S0(6);
        throw null;
    }

    public rr.l o() {
        rr.l lVar = this.f23657r;
        if (lVar != null) {
            return lVar;
        }
        S0(5);
        throw null;
    }

    @Override // ur.n, rr.l, rr.i
    public rr.m u1() {
        return this;
    }
}
