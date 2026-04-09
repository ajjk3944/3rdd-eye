package ur;

/* loaded from: classes.dex */
public abstract class n extends androidx.lifecycle.o implements rr.l {

    /* renamed from: g, reason: collision with root package name */
    public final qs.g f23652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sr.h hVar, qs.g gVar) {
        super(hVar);
        if (hVar == null) {
            S0(0);
            throw null;
        }
        if (gVar == null) {
            S0(1);
            throw null;
        }
        this.f23652g = gVar;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String t1(rr.l lVar) {
        try {
            String str = ss.j.f22245e.w(lVar) + "[" + lVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(lVar)) + "]";
            if (str != null) {
                return str;
            }
            S0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = lVar.getClass().getSimpleName() + " " + lVar.getName();
            if (str2 != null) {
                return str2;
            }
            S0(6);
            throw null;
        }
    }

    @Override // rr.l
    public final qs.g getName() {
        qs.g gVar = this.f23652g;
        if (gVar != null) {
            return gVar;
        }
        S0(2);
        throw null;
    }

    @Override // androidx.lifecycle.o
    public String toString() {
        return t1(this);
    }

    /* renamed from: a */
    public rr.l u1() {
        return this;
    }
}
