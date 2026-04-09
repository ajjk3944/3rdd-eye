package cs;

import as.p;
import g4.j;
import ht.x;
import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ot.q;
import rr.l;
import rr.o0;
import rr.z;
import ts.o;
import tt.k;
import ur.k0;
import ur.t;
import ur.u;
import ur.v;

/* loaded from: classes.dex */
public final class g extends k0 implements a {

    /* renamed from: c0, reason: collision with root package name */
    public static final e f6663c0 = new e();

    /* renamed from: d0, reason: collision with root package name */
    public static final e f6664d0 = new e();

    /* renamed from: a0, reason: collision with root package name */
    public f f6665a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f6666b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, k0 k0Var, sr.h hVar, qs.g gVar, rr.c cVar, o0 o0Var, boolean z10) {
        super(lVar, k0Var, hVar, gVar, cVar, o0Var);
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
        if (cVar == null) {
            S0(3);
            throw null;
        }
        this.f6665a0 = null;
        this.f6666b0 = z10;
    }

    public static g K1(l lVar, ds.c cVar, qs.g gVar, wr.f fVar, boolean z10) {
        if (lVar == null) {
            S0(5);
            throw null;
        }
        if (gVar != null) {
            return new g(lVar, null, cVar, gVar, rr.c.DECLARATION, fVar, z10);
        }
        S0(7);
        throw null;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 17:
                objArr[0] = "source";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case j.STRING_FIELD_NUMBER /* 5 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ur.u, rr.b
    public final boolean G() {
        return this.f6665a0.isSynthesized;
    }

    @Override // cs.a
    public final a G0(x xVar, ArrayList arrayList, x xVar2, lq.l lVar) {
        ArrayList arrayListL = vc.e.l(arrayList, Y(), this);
        v vVarK = xVar == null ? null : o.k(this, xVar, sr.g.f22217a);
        t tVarB1 = B1(x0.f10954b);
        tVarB1.B = arrayListL;
        tVarB1.G = xVar2;
        tVarB1.E = vVarK;
        tVarB1.L = true;
        tVarB1.K = true;
        g gVar = (g) tVarB1.T.y1(tVarB1);
        if (lVar != null) {
            gVar.C1((rr.a) lVar.f15571a, lVar.f15572d);
        }
        if (gVar != null) {
            return gVar;
        }
        S0(21);
        throw null;
    }

    @Override // ur.k0
    public final k0 J1(v vVar, v vVar2, List list, List list2, List list3, x xVar, z zVar, p pVar, Map map) {
        ot.f fVar;
        if (list == null) {
            S0(9);
            throw null;
        }
        if (list2 == null) {
            S0(10);
            throw null;
        }
        if (list3 == null) {
            S0(11);
            throw null;
        }
        if (pVar == null) {
            S0(12);
            throw null;
        }
        super.J1(vVar, vVar2, list, list2, list3, xVar, zVar, pVar, map);
        for (ot.i iVar : q.f19822c) {
            k kVar = iVar.f19806b;
            qs.g gVar = iVar.f19805a;
            if (gVar == null || br.l.a(getName(), gVar)) {
                if (kVar != null) {
                    String strB = getName().b();
                    br.l.d(strB, "functionDescriptor.name.asString()");
                    if (!kVar.a(strB)) {
                        continue;
                    }
                }
                Collection collection = iVar.f19807c;
                if (collection == null || collection.contains(getName())) {
                    ot.e[] eVarArr = iVar.f19809e;
                    int length = eVarArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            fVar = ((String) iVar.f19808d.a(this)) != null ? new ot.f(false) : ot.f.f19798c;
                        } else {
                            if (eVarArr[i10].b(this) != null) {
                                fVar = new ot.f(false);
                                break;
                            }
                            i10++;
                        }
                    }
                    this.J = fVar.f19799a;
                    return this;
                }
            }
        }
        fVar = ot.f.f19797b;
        this.J = fVar.f19799a;
        return this;
    }

    @Override // ur.k0, ur.u
    public final u x1(qs.g gVar, rr.c cVar, l lVar, rr.u uVar, o0 o0Var, sr.h hVar) {
        if (lVar == null) {
            S0(14);
            throw null;
        }
        if (cVar == null) {
            S0(15);
            throw null;
        }
        if (hVar == null) {
            S0(16);
            throw null;
        }
        k0 k0Var = (k0) uVar;
        if (gVar == null) {
            gVar = getName();
        }
        g gVar2 = new g(lVar, k0Var, hVar, gVar, cVar, o0Var, this.f6666b0);
        f fVar = this.f6665a0;
        gVar2.f6665a0 = f.get(fVar.isStable, fVar.isSynthesized);
        return gVar2;
    }
}
