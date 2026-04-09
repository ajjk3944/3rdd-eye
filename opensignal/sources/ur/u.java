package ur;

import ht.d1;
import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u extends o implements rr.u {
    public List B;
    public ht.x D;
    public List E;
    public v F;
    public v G;
    public rr.z H;
    public as.p I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Collection U;
    public volatile g V;
    public final rr.u W;
    public final rr.c X;
    public rr.u Y;
    public Map Z;

    /* renamed from: y, reason: collision with root package name */
    public List f23672y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, rr.o0 o0Var, sr.h hVar) {
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
        if (cVar == null) {
            S0(3);
            throw null;
        }
        if (o0Var == null) {
            S0(4);
            throw null;
        }
        this.I = rr.p.f21705i;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = true;
        this.T = false;
        this.U = null;
        this.V = null;
        this.Y = null;
        this.Z = null;
        this.W = uVar == null ? this : uVar;
        this.X = cVar;
    }

    public static /* synthetic */ void S0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
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
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "typeParameters";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ArrayList z1(rr.u uVar, List list, x0 x0Var, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            S0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            q0 q0Var2 = q0Var;
            ht.x type = q0Var2.getType();
            d1 d1Var = d1.IN_VARIANCE;
            ht.x xVarI = x0Var.i(type, d1Var);
            ht.x xVar = q0Var.G;
            ht.x xVarI2 = xVar == null ? null : x0Var.i(xVar, d1Var);
            if (xVarI == null) {
                return null;
            }
            if ((xVarI != q0Var2.getType() || xVar != xVarI2) && zArr != null) {
                zArr[0] = true;
            }
            n0.d1 d1Var2 = q0Var instanceof p0 ? new n0.d1(3, (List) ((p0) q0Var).I.getValue()) : null;
            q0 q0Var3 = z10 ? null : q0Var;
            int i10 = q0Var.B;
            sr.h annotations = q0Var.getAnnotations();
            qs.g name = q0Var.getName();
            boolean zW1 = q0Var.w1();
            boolean z12 = q0Var.E;
            boolean z13 = q0Var.F;
            rr.o0 o0VarH = z11 ? q0Var.h() : rr.o0.f21696s;
            br.l.e(annotations, "annotations");
            br.l.e(name, "name");
            br.l.e(o0VarH, "source");
            arrayList.add(d1Var2 == null ? new q0(uVar, q0Var3, i10, annotations, name, xVarI, zW1, z12, z13, xVarI2, o0VarH) : new p0(uVar, q0Var3, i10, annotations, name, xVarI, zW1, z12, z13, xVarI2, o0VarH, d1Var2));
        }
        return arrayList;
    }

    public Object A(rr.a aVar) {
        Map map = this.Z;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public void A1(v vVar, v vVar2, List list, List list2, List list3, ht.x xVar, rr.z zVar, as.p pVar) {
        if (list == null) {
            S0(5);
            throw null;
        }
        if (list2 == null) {
            S0(6);
            throw null;
        }
        if (list3 == null) {
            S0(7);
            throw null;
        }
        if (pVar == null) {
            S0(8);
            throw null;
        }
        this.f23672y = mq.o.Q0(list2);
        this.B = mq.o.Q0(list3);
        this.D = xVar;
        this.H = zVar;
        this.I = pVar;
        this.F = vVar;
        this.G = vVar2;
        this.E = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            rr.r0 r0Var = (rr.r0) list2.get(i10);
            if (r0Var.getIndex() != i10) {
                throw new IllegalStateException(r0Var + " index is " + r0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            q0 q0Var = (q0) list3.get(i11);
            if (q0Var.B != i11) {
                throw new IllegalStateException(q0Var + "index is " + q0Var.B + " but position is " + i11);
            }
        }
    }

    public final t B1(x0 x0Var) {
        if (x0Var != null) {
            return new t(this, x0Var.f(), o(), j(), c(), f(), Y(), o0(), this.F, i());
        }
        S0(24);
        throw null;
    }

    public final void C1(rr.a aVar, Object obj) {
        if (this.Z == null) {
            this.Z = new LinkedHashMap();
        }
        this.Z.put(aVar, obj);
    }

    @Override // rr.u
    public final boolean D0() {
        return this.Q;
    }

    public void D1(boolean z10) {
        this.S = z10;
    }

    public void E1(boolean z10) {
        this.T = z10;
    }

    public rr.t F0() {
        return B1(x0.f10954b);
    }

    public final void F1(ht.b0 b0Var) {
        if (b0Var != null) {
            this.D = b0Var;
        } else {
            S0(11);
            throw null;
        }
    }

    public boolean G() {
        return this.T;
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    @Override // rr.u
    public final boolean L0() {
        if (this.K) {
            return true;
        }
        Iterator it = u1().p().iterator();
        while (it.hasNext()) {
            if (((rr.u) it.next()).L0()) {
                return true;
            }
        }
        return false;
    }

    @Override // rr.x
    public final boolean M() {
        return this.O;
    }

    public boolean P() {
        return this.N;
    }

    @Override // rr.u
    public final boolean Q() {
        if (this.J) {
            return true;
        }
        Iterator it = u1().p().iterator();
        while (it.hasNext()) {
            if (((rr.u) it.next()).Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // rr.b
    public final List Y() {
        List list = this.B;
        if (list != null) {
            return list;
        }
        S0(19);
        throw null;
    }

    @Override // ur.o, ur.n, rr.l, rr.i
    /* renamed from: a */
    public rr.u u1() {
        rr.u uVar = this.W;
        rr.u uVarU1 = uVar == this ? this : uVar.u1();
        if (uVarU1 != null) {
            return uVarU1;
        }
        S0(20);
        throw null;
    }

    @Override // rr.o, rr.x
    public final as.p c() {
        as.p pVar = this.I;
        if (pVar != null) {
            return pVar;
        }
        S0(16);
        throw null;
    }

    @Override // rr.u
    public final rr.u d0() {
        return this.Y;
    }

    @Override // rr.d
    public final rr.c f() {
        rr.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        S0(21);
        throw null;
    }

    @Override // rr.b
    public final v f0() {
        return this.G;
    }

    public boolean g() {
        return this.M;
    }

    @Override // rr.b
    public final List getTypeParameters() {
        List list = this.f23672y;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public ht.x i() {
        return this.D;
    }

    @Override // rr.x
    public final rr.z j() {
        rr.z zVar = this.H;
        if (zVar != null) {
            return zVar;
        }
        S0(15);
        throw null;
    }

    @Override // rr.b
    public final v j0() {
        return this.F;
    }

    @Override // rr.b
    public final List o0() {
        List list = this.E;
        if (list != null) {
            return list;
        }
        S0(13);
        throw null;
    }

    public Collection p() {
        g gVar = this.V;
        if (gVar != null) {
            this.U = (Collection) gVar.c();
            this.V = null;
        }
        Collection collection = this.U;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        S0(14);
        throw null;
    }

    public boolean r() {
        return this.R;
    }

    public boolean u() {
        return this.L;
    }

    public final rr.u v1(rr.l lVar, rr.z zVar, as.p pVar, rr.c cVar) {
        rr.u uVarBuild = F0().N(lVar).t(zVar).v(pVar).C(cVar).r().build();
        if (uVarBuild != null) {
            return uVarBuild;
        }
        S0(26);
        throw null;
    }

    public Object w0(rr.n nVar, Object obj) {
        return nVar.h(this, obj);
    }

    @Override // rr.d
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public k0 V(rr.l lVar, rr.z zVar, as.p pVar, rr.c cVar) {
        return (k0) v1(lVar, zVar, pVar, cVar);
    }

    @Override // rr.u
    public final boolean x0() {
        return this.P;
    }

    public abstract u x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, rr.o0 o0Var, sr.h hVar);

    public void y0(Collection collection) {
        if (collection == null) {
            S0(17);
            throw null;
        }
        this.U = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((rr.u) it.next()).D0()) {
                this.Q = true;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ur.u y1(ur.t r21) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.u.y1(ur.t):ur.u");
    }

    @Override // rr.q0
    public rr.u e(x0 x0Var) {
        if (x0Var == null) {
            S0(22);
            throw null;
        }
        if (x0Var.f10955a.e()) {
            return this;
        }
        t tVarB1 = B1(x0Var);
        tVarB1.f23670x = u1();
        tVarB1.K = true;
        tVarB1.S = true;
        return tVarB1.T.y1(tVarB1);
    }
}
