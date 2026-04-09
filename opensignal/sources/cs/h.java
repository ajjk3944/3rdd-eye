package cs;

import as.a0;
import as.p;
import g4.j;
import ht.a1;
import ht.x;
import is.r;
import java.util.ArrayList;
import lq.l;
import mq.w;
import or.s;
import rr.m0;
import rr.o0;
import rr.z;
import ts.o;
import ur.h0;
import ur.i0;
import ur.j0;
import ur.q0;

/* loaded from: classes.dex */
public class h extends h0 implements a {
    public final boolean X;
    public final l Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rr.l lVar, sr.h hVar, z zVar, p pVar, boolean z10, qs.g gVar, o0 o0Var, m0 m0Var, rr.c cVar, boolean z11, l lVar2) {
        super(lVar, m0Var, hVar, zVar, pVar, z10, gVar, cVar, o0Var, false, false, false, false, false);
        if (lVar == null) {
            S0(0);
            throw null;
        }
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
        if (gVar == null) {
            S0(4);
            throw null;
        }
        if (o0Var == null) {
            S0(5);
            throw null;
        }
        if (cVar == null) {
            S0(6);
            throw null;
        }
        this.X = z11;
        this.Y = lVar2;
    }

    public static h D1(rr.l lVar, ds.c cVar, z zVar, p pVar, boolean z10, qs.g gVar, wr.f fVar, boolean z11) {
        if (lVar == null) {
            S0(7);
            throw null;
        }
        if (zVar == null) {
            S0(9);
            throw null;
        }
        if (gVar != null) {
            return new h(lVar, cVar, zVar, pVar, z10, gVar, fVar, null, rr.c.DECLARATION, z11, null);
        }
        S0(11);
        throw null;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "kind";
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // ur.h0, rr.b
    public final Object A(rr.a aVar) {
        l lVar = this.Y;
        if (lVar == null || !((rr.a) lVar.f15571a).equals(aVar)) {
            return null;
        }
        return lVar.f15572d;
    }

    @Override // ur.r0, rr.b
    public final boolean G() {
        return false;
    }

    @Override // cs.a
    public final a G0(x xVar, ArrayList arrayList, x xVar2, l lVar) {
        x xVar3;
        i0 i0Var;
        j0 j0Var;
        m0 m0VarU1 = u1() == this ? null : u1();
        h hVar = new h(o(), getAnnotations(), j(), c(), this.B, getName(), h(), m0VarU1, f(), this.X, lVar);
        i0 i0Var2 = this.T;
        if (i0Var2 != null) {
            i0 i0Var3 = new i0(hVar, i0Var2.getAnnotations(), i0Var2.j(), i0Var2.c(), i0Var2.f23641y, i0Var2.B, i0Var2.F, f(), m0VarU1 == null ? null : m0VarU1.b(), i0Var2.h());
            i0Var3.I = i0Var2.I;
            xVar3 = xVar2;
            i0Var3.J = xVar3;
            i0Var = i0Var3;
        } else {
            xVar3 = xVar2;
            i0Var = null;
        }
        j0 j0Var2 = this.U;
        if (j0Var2 != null) {
            j0 j0Var3 = j0Var2;
            j0Var = new j0(hVar, j0Var2.getAnnotations(), j0Var3.j(), j0Var3.c(), j0Var3.f23641y, j0Var3.B, j0Var3.F, f(), m0VarU1 == null ? null : m0VarU1.d(), j0Var2.h());
            j0Var.I = j0Var.I;
            q0 q0Var = (q0) j0Var2.Y().get(0);
            if (q0Var == null) {
                j0.S0(6);
                throw null;
            }
            j0Var.J = q0Var;
        } else {
            j0Var = null;
        }
        hVar.z1(i0Var, j0Var, this.V, this.W);
        ar.a aVar = this.E;
        if (aVar != null) {
            hVar.A1(this.D, aVar);
        }
        hVar.y0(p());
        hVar.C1(xVar3, getTypeParameters(), this.Q, xVar != null ? o.k(this, xVar, sr.g.f22217a) : null, w.f16945a);
        return hVar;
    }

    @Override // ur.h0
    public final h0 x1(rr.l lVar, z zVar, p pVar, m0 m0Var, rr.c cVar, qs.g gVar) {
        if (lVar == null) {
            S0(13);
            throw null;
        }
        if (zVar == null) {
            S0(14);
            throw null;
        }
        if (pVar == null) {
            S0(15);
            throw null;
        }
        if (cVar == null) {
            S0(16);
            throw null;
        }
        if (gVar == null) {
            S0(17);
            throw null;
        }
        return new h(lVar, getAnnotations(), zVar, pVar, this.B, gVar, o0.f21696s, m0Var, cVar, this.X, this.Y);
    }

    @Override // ur.h0, rr.u0
    public final boolean y() {
        x type = getType();
        if (!this.X) {
            return false;
        }
        br.l.e(type, "type");
        if (((!or.h.F(type) && !s.a(type)) || a1.e(type)) && !or.h.G(type)) {
            return false;
        }
        sr.i iVar = r.f12980a;
        qs.c cVar = a0.f2179p;
        br.l.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return !jt.g.u(type, cVar) || or.h.G(type);
    }

    @Override // ur.h0
    public final void B1(x xVar) {
    }
}
