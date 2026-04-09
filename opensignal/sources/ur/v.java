package ur;

import ht.d1;
import ht.x0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends n implements rr.k0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23673r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final rr.l f23674x;

    /* renamed from: y, reason: collision with root package name */
    public final bt.d f23675y;

    public v(rr.f fVar) {
        super(sr.g.f22217a, qs.i.f21041d);
        this.f23674x = fVar;
        this.f23675y = new bt.c(fVar);
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void T0(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "name";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void u1(int i10) {
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getTypeParameters";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getType";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getValueParameters";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // rr.b
    public final boolean G() {
        return false;
    }

    @Override // rr.b
    public final List Y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        u1(7);
        throw null;
    }

    @Override // ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.b u1() {
        return this;
    }

    @Override // rr.o, rr.x
    public final as.p c() {
        as.p pVar = rr.p.f21702f;
        if (pVar != null) {
            return pVar;
        }
        u1(9);
        throw null;
    }

    @Override // rr.b
    public final v f0() {
        return null;
    }

    @Override // androidx.lifecycle.o, bt.d
    public final ht.x getType() {
        ht.x type = v1().getType();
        if (type != null) {
            return type;
        }
        u1(6);
        throw null;
    }

    @Override // rr.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        u1(5);
        throw null;
    }

    @Override // rr.m
    public final rr.o0 h() {
        return rr.o0.f21696s;
    }

    @Override // rr.b
    public final ht.x i() {
        return getType();
    }

    @Override // rr.b
    public final v j0() {
        return null;
    }

    @Override // rr.l
    public final rr.l o() {
        switch (this.f23673r) {
            case 0:
                rr.f fVar = (rr.f) this.f23674x;
                if (fVar != null) {
                    return fVar;
                }
                S0(2);
                throw null;
            default:
                rr.l lVar = this.f23674x;
                if (lVar != null) {
                    return lVar;
                }
                T0(8);
                throw null;
        }
    }

    @Override // rr.b
    public final Collection p() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        u1(8);
        throw null;
    }

    @Override // ur.n, androidx.lifecycle.o
    public String toString() {
        switch (this.f23673r) {
            case 0:
                return "class " + ((rr.f) this.f23674x).getName() + "::this";
            default:
                return super.toString();
        }
    }

    public final bt.d v1() {
        switch (this.f23673r) {
            case 0:
                bt.c cVar = (bt.c) this.f23675y;
                if (cVar != null) {
                    return cVar;
                }
                S0(1);
                throw null;
            default:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.f23675y;
                if (oVar != null) {
                    return oVar;
                }
                T0(7);
                throw null;
        }
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.j(this, obj);
    }

    @Override // rr.q0
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public final v e(x0 x0Var) {
        if (x0Var == null) {
            u1(3);
            throw null;
        }
        if (!x0Var.f10955a.e()) {
            ht.x xVarI = o() instanceof rr.f ? x0Var.i(getType(), d1.OUT_VARIANCE) : x0Var.i(getType(), d1.INVARIANT);
            if (xVarI == null) {
                return null;
            }
            if (xVarI != getType()) {
                return new v(o(), new bt.e(xVarI), getAnnotations());
            }
        }
        return this;
    }

    @Override // ur.n, rr.l, rr.i
    /* renamed from: a */
    public final rr.l u1() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(rr.l lVar, androidx.lifecycle.o oVar, sr.h hVar) {
        this(lVar, oVar, hVar, qs.i.f21041d);
        if (lVar == null) {
            T0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            T0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rr.l lVar, androidx.lifecycle.o oVar, sr.h hVar, qs.g gVar) {
        super(hVar, gVar);
        if (lVar == null) {
            T0(3);
            throw null;
        }
        if (hVar == null) {
            T0(5);
            throw null;
        }
        if (gVar != null) {
            this.f23674x = lVar;
            this.f23675y = oVar;
            return;
        }
        T0(6);
        throw null;
    }
}
