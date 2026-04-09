package ur;

import java.util.Collections;
import java.util.List;
import rr.u0;

/* loaded from: classes.dex */
public abstract class r0 extends o implements u0 {

    /* renamed from: y, reason: collision with root package name */
    public ht.x f23665y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(rr.l lVar, sr.h hVar, qs.g gVar, ht.x xVar, rr.o0 o0Var) {
        super(lVar, hVar, gVar, o0Var);
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
        this.f23665y = xVar;
    }

    public static /* synthetic */ void S0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getOriginal";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getValueParameters";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public boolean G() {
        return false;
    }

    @Override // rr.b
    public final List Y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S0(6);
        throw null;
    }

    public v f0() {
        return null;
    }

    @Override // androidx.lifecycle.o, bt.d
    public final ht.x getType() {
        ht.x xVar = this.f23665y;
        if (xVar != null) {
            return xVar;
        }
        S0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        S0(8);
        throw null;
    }

    public ht.x i() {
        ht.x type = getType();
        if (type != null) {
            return type;
        }
        S0(10);
        throw null;
    }

    public v j0() {
        return null;
    }
}
