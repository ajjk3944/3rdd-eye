package ur;

import ht.s0;
import ht.x0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends z {

    /* renamed from: a, reason: collision with root package name */
    public final qs.g f23625a;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f23626d;

    /* renamed from: g, reason: collision with root package name */
    public final gt.i f23627g;

    /* renamed from: r, reason: collision with root package name */
    public final gt.i f23628r;

    public b(gt.o oVar, qs.g gVar) {
        if (oVar == null) {
            J(0);
            throw null;
        }
        if (gVar == null) {
            J(1);
            throw null;
        }
        this.f23625a = gVar;
        gt.l lVar = (gt.l) oVar;
        this.f23626d = new gt.i(lVar, new a(this, 0));
        this.f23627g = new gt.i(lVar, new a(this, 1));
        this.f23628r = new gt.i(lVar, new a(this, 2));
    }

    public static /* synthetic */ void J(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // rr.f
    public at.n H0() {
        xs.d.i(ts.d.d(this));
        at.n nVarH = H(jt.f.f13843a);
        if (nVarH != null) {
            return nVarH;
        }
        J(17);
        throw null;
    }

    @Override // rr.q0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public rr.f e(x0 x0Var) {
        if (x0Var != null) {
            return x0Var.f10955a.e() ? this : new y(this, x0Var);
        }
        J(18);
        throw null;
    }

    @Override // rr.f
    public List K0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        J(6);
        throw null;
    }

    @Override // rr.f
    public final v R0() {
        v vVar = (v) this.f23628r.c();
        if (vVar != null) {
            return vVar;
        }
        J(5);
        throw null;
    }

    @Override // ur.z, rr.f, rr.l, rr.i
    /* renamed from: a */
    public final rr.i u1() {
        return this;
    }

    @Override // rr.f
    public final at.n e0(s0 s0Var) {
        xs.d.i(ts.d.d(this));
        at.n nVarX = x(s0Var, jt.f.f13843a);
        if (nVarX != null) {
            return nVarX;
        }
        J(16);
        throw null;
    }

    @Override // rr.l
    public final qs.g getName() {
        qs.g gVar = this.f23625a;
        if (gVar != null) {
            return gVar;
        }
        J(2);
        throw null;
    }

    @Override // rr.f, rr.i
    public final ht.b0 q() {
        ht.b0 b0Var = (ht.b0) this.f23626d.c();
        if (b0Var != null) {
            return b0Var;
        }
        J(20);
        throw null;
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.B(this, obj);
    }

    @Override // ur.z
    public at.n x(s0 s0Var, jt.f fVar) {
        if (!s0Var.e()) {
            return new at.s(H(fVar), new x0(s0Var));
        }
        at.n nVarH = H(fVar);
        if (nVarH != null) {
            return nVarH;
        }
        J(12);
        throw null;
    }

    @Override // rr.f
    public at.n z0() {
        at.n nVar = (at.n) this.f23627g.c();
        if (nVar != null) {
            return nVar;
        }
        J(4);
        throw null;
    }

    @Override // ur.z, rr.l, rr.i
    /* renamed from: a */
    public final rr.l u1() {
        return this;
    }

    @Override // ur.z, rr.f, rr.l, rr.i
    /* renamed from: a */
    public final rr.f u1() {
        return this;
    }
}
