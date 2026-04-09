package ur;

/* loaded from: classes.dex */
public abstract class k extends b {

    /* renamed from: x, reason: collision with root package name */
    public final rr.l f23646x;

    /* renamed from: y, reason: collision with root package name */
    public final rr.o0 f23647y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gt.o oVar, rr.l lVar, qs.g gVar, rr.o0 o0Var) {
        super(oVar, gVar);
        if (oVar == null) {
            J(0);
            throw null;
        }
        if (lVar == null) {
            J(1);
            throw null;
        }
        if (gVar == null) {
            J(2);
            throw null;
        }
        this.f23646x = lVar;
        this.f23647y = o0Var;
    }

    public static /* synthetic */ void J(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // rr.m
    public final rr.o0 h() {
        rr.o0 o0Var = this.f23647y;
        if (o0Var != null) {
            return o0Var;
        }
        J(5);
        throw null;
    }

    @Override // rr.l
    public final rr.l o() {
        rr.l lVar = this.f23646x;
        if (lVar != null) {
            return lVar;
        }
        J(4);
        throw null;
    }

    public boolean u() {
        return false;
    }
}
