package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4777a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4778b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f4779c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4780d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4781e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4782f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4783g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4784h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4785i;
    public Object j;
    public Object k;

    public x0(f0 f0Var, AnalyticsCollector analyticsCollector, Handler handler) {
        this.f4782f = f0Var;
        this.j = new ya.v0();
        this.f4779c = new IdentityHashMap();
        this.f4780d = new HashMap();
        this.f4778b = new ArrayList();
        ya.a0 a0Var = new ya.a0();
        this.f4783g = a0Var;
        ba.d dVar = new ba.d();
        this.f4784h = dVar;
        this.f4781e = new HashMap();
        this.f4785i = new HashSet();
        if (analyticsCollector != null) {
            ya.z zVar = new ya.z();
            zVar.f26201a = handler;
            zVar.f26202b = analyticsCollector;
            a0Var.f26037c.add(zVar);
            ba.c cVar = new ba.c();
            cVar.f2485a = analyticsCollector;
            dVar.f2488c.add(cVar);
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "modality";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "setOwner";
        } else if (i10 == 2) {
            objArr[1] = "setOriginal";
        } else if (i10 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i10 == 5) {
            objArr[1] = "setReturnType";
        } else if (i10 == 7) {
            objArr[1] = "setModality";
        } else if (i10 == 9) {
            objArr[1] = "setVisibility";
        } else if (i10 == 11) {
            objArr[1] = "setKind";
        } else if (i10 == 19) {
            objArr[1] = "setName";
        } else if (i10 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i10 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i10 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i10 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "setModality";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public w1 b(int i10, ArrayList arrayList, ya.v0 v0Var) {
        ArrayList arrayList2 = (ArrayList) this.f4778b;
        if (!arrayList.isEmpty()) {
            this.j = v0Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                w0 w0Var = (w0) arrayList.get(i11 - i10);
                if (i11 > 0) {
                    w0 w0Var2 = (w0) arrayList2.get(i11 - 1);
                    w0Var.f4772d = w0Var2.f4769a.f26143h.f26084b.o() + w0Var2.f4772d;
                    w0Var.f4773e = false;
                    w0Var.f4771c.clear();
                } else {
                    w0Var.f4772d = 0;
                    w0Var.f4773e = false;
                    w0Var.f4771c.clear();
                }
                int iO = w0Var.f4769a.f26143h.f26084b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((w0) arrayList2.get(i12)).f4772d += iO;
                }
                arrayList2.add(i11, w0Var);
                ((HashMap) this.f4780d).put(w0Var.f4770b, w0Var);
                if (this.f4777a) {
                    g(w0Var);
                    if (((IdentityHashMap) this.f4779c).isEmpty()) {
                        ((HashSet) this.f4785i).add(w0Var);
                    } else {
                        v0 v0Var2 = (v0) ((HashMap) this.f4781e).get(w0Var);
                        if (v0Var2 != null) {
                            v0Var2.f4735a.disable(v0Var2.f4736b);
                        }
                    }
                }
            }
        }
        return d();
    }

    public ur.h0 c() {
        ur.v vVar;
        ur.v vVar2;
        ur.i0 i0Var;
        ur.j0 j0Var;
        ar.a aVar;
        ur.v vVar3;
        ur.v vVar4;
        ur.h0 h0Var = (ur.h0) this.k;
        ur.h0 h0VarX1 = h0Var.x1((rr.l) this.f4778b, (rr.z) this.f4779c, (as.p) this.f4780d, (rr.m0) this.f4781e, (rr.c) this.f4782f, (qs.g) this.f4785i);
        List typeParameters = h0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        ht.x0 x0VarU = ht.c.u(typeParameters, (ht.s0) this.f4783g, h0VarX1, arrayList);
        ht.x xVar = (ht.x) this.j;
        ht.x xVarI = x0VarU.i(xVar, ht.d1.OUT_VARIANCE);
        if (xVarI != null) {
            ht.d1 d1Var = ht.d1.IN_VARIANCE;
            ht.x xVarI2 = x0VarU.i(xVar, d1Var);
            if (xVarI2 != null) {
                h0VarX1.B1(xVarI2);
            }
            ur.v vVar5 = (ur.v) this.f4784h;
            if (vVar5 != null) {
                ur.v vVarE = vVar5.e(x0VarU);
                vVar = vVarE != null ? vVarE : null;
            }
            ur.v vVar6 = h0Var.R;
            if (vVar6 != null) {
                ht.x xVarI3 = x0VarU.i(vVar6.getType(), d1Var);
                if (xVarI3 == null) {
                    vVar4 = null;
                } else {
                    vVar6.v1();
                    vVar4 = new ur.v(h0VarX1, new bt.b(h0VarX1, xVarI3), vVar6.getAnnotations());
                }
                vVar2 = vVar4;
            } else {
                vVar2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (ur.v vVar7 : h0Var.P) {
                ht.x xVarI4 = x0VarU.i(vVar7.getType(), ht.d1.IN_VARIANCE);
                if (xVarI4 == null) {
                    vVar3 = null;
                } else {
                    qs.g gVarT1 = ((bt.a) vVar7.v1()).t1();
                    vVar7.v1();
                    vVar3 = new ur.v(h0VarX1, new bt.a(h0VarX1, xVarI4, gVarT1), vVar7.getAnnotations());
                }
                if (vVar3 != null) {
                    arrayList2.add(vVar3);
                }
            }
            h0VarX1.C1(xVarI, arrayList, vVar, vVar2, arrayList2);
            ur.i0 i0Var2 = h0Var.T;
            rr.p0 p0Var = rr.o0.f21696s;
            if (i0Var2 == null) {
                i0Var = null;
            } else {
                sr.h annotations = i0Var2.getAnnotations();
                rr.z zVar = (rr.z) this.f4779c;
                as.p pVarC = h0Var.T.c();
                if (((rr.c) this.f4782f) == rr.c.FAKE_OVERRIDE && rr.p.e(rr.p.f(pVarC.f2239a.k()))) {
                    pVarC = rr.p.f21704h;
                }
                as.p pVar = pVarC;
                ur.i0 i0Var3 = h0Var.T;
                boolean z10 = i0Var3.f23641y;
                boolean z11 = i0Var3.B;
                boolean z12 = i0Var3.F;
                rr.c cVar = (rr.c) this.f4782f;
                rr.m0 m0Var = (rr.m0) this.f4781e;
                i0Var = new ur.i0(h0VarX1, annotations, zVar, pVar, z10, z11, z12, cVar, m0Var == null ? null : m0Var.b(), p0Var);
            }
            if (i0Var != null) {
                ur.i0 i0Var4 = h0Var.T;
                ht.x xVar2 = i0Var4.J;
                i0Var.I = ur.h0.y1(x0VarU, i0Var4);
                i0Var.y1(xVar2 != null ? x0VarU.i(xVar2, ht.d1.OUT_VARIANCE) : null);
            }
            ur.j0 j0Var2 = h0Var.U;
            if (j0Var2 == null) {
                j0Var = null;
            } else {
                sr.h annotations2 = j0Var2.getAnnotations();
                rr.z zVar2 = (rr.z) this.f4779c;
                as.p pVarC2 = h0Var.U.c();
                if (((rr.c) this.f4782f) == rr.c.FAKE_OVERRIDE && rr.p.e(rr.p.f(pVarC2.f2239a.k()))) {
                    pVarC2 = rr.p.f21704h;
                }
                as.p pVar2 = pVarC2;
                ur.j0 j0Var3 = h0Var.U;
                boolean z13 = j0Var3.f23641y;
                boolean z14 = j0Var3.B;
                boolean z15 = j0Var3.F;
                rr.c cVar2 = (rr.c) this.f4782f;
                rr.m0 m0Var2 = (rr.m0) this.f4781e;
                j0Var = new ur.j0(h0VarX1, annotations2, zVar2, pVar2, z13, z14, z15, cVar2, m0Var2 == null ? null : m0Var2.d(), p0Var);
            }
            if (j0Var != null) {
                List listZ1 = ur.u.z1(j0Var, h0Var.U.Y(), x0VarU, false, false, null);
                if (listZ1 == null) {
                    listZ1 = Collections.singletonList(ur.j0.x1(j0Var, xs.d.e((rr.l) this.f4778b).n(), ((ur.q0) h0Var.U.Y().get(0)).getAnnotations()));
                }
                if (listZ1.size() != 1) {
                    throw new IllegalStateException();
                }
                j0Var.I = ur.h0.y1(x0VarU, h0Var.U);
                ur.q0 q0Var = (ur.q0) listZ1.get(0);
                if (q0Var == null) {
                    ur.j0.S0(6);
                    throw null;
                }
                j0Var.J = q0Var;
            }
            ur.s sVar = h0Var.V;
            ur.s sVar2 = sVar == null ? null : new ur.s(sVar.getAnnotations(), h0VarX1);
            ur.s sVar3 = h0Var.W;
            h0VarX1.z1(i0Var, j0Var, sVar2, sVar3 == null ? null : new ur.s(sVar3.getAnnotations(), h0VarX1));
            if (this.f4777a) {
                rt.h hVar = new rt.h();
                Iterator it = h0Var.p().iterator();
                while (it.hasNext()) {
                    hVar.add(((rr.m0) it.next()).e(x0VarU));
                }
                h0VarX1.H = hVar;
            }
            if (h0Var.y() && (aVar = h0Var.E) != null) {
                h0VarX1.A1(h0Var.D, aVar);
            }
            return h0VarX1;
        }
        return null;
    }

    public w1 d() {
        ArrayList arrayList = (ArrayList) this.f4778b;
        if (arrayList.isEmpty()) {
            return w1.f4774a;
        }
        int iO = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w0 w0Var = (w0) arrayList.get(i10);
            w0Var.f4772d = iO;
            iO += w0Var.f4769a.f26143h.f26084b.o();
        }
        return new k1(arrayList, (ya.v0) this.j);
    }

    public void e() {
        Iterator it = ((HashSet) this.f4785i).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (w0Var.f4771c.isEmpty()) {
                v0 v0Var = (v0) ((HashMap) this.f4781e).get(w0Var);
                if (v0Var != null) {
                    v0Var.f4735a.disable(v0Var.f4736b);
                }
                it.remove();
            }
        }
    }

    public void f(w0 w0Var) {
        if (w0Var.f4773e && w0Var.f4771c.isEmpty()) {
            v0 v0Var = (v0) ((HashMap) this.f4781e).remove(w0Var);
            v0Var.getClass();
            kg.r rVar = v0Var.f4737c;
            ya.x xVar = v0Var.f4735a;
            xVar.releaseSource(v0Var.f4736b);
            xVar.removeEventListener(rVar);
            xVar.removeDrmEventListener(rVar);
            ((HashSet) this.f4785i).remove(w0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.u0, ya.w] */
    public void g(w0 w0Var) {
        ya.q qVar = w0Var.f4769a;
        ?? r12 = new ya.w() { // from class: com.google.android.exoplayer2.u0
            @Override // ya.w
            public final void a(ya.a aVar, w1 w1Var) {
                ((f0) this.f4593a.f4782f).B.c(22);
            }
        };
        kg.r rVar = new kg.r();
        rVar.f14398r = this;
        rVar.f14396d = (ya.a0) this.f4783g;
        rVar.f14397g = (ba.d) this.f4784h;
        rVar.f14395a = w0Var;
        ((HashMap) this.f4781e).put(w0Var, new v0(qVar, r12, rVar));
        int i10 = qb.v.f20828a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        qVar.addEventListener(new Handler(looperMyLooper, null), rVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        qVar.addDrmEventListener(new Handler(looperMyLooper2, null), rVar);
        qVar.prepareSource(r12, (pb.u0) this.k);
    }

    public void h(ya.t tVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f4779c;
        w0 w0Var = (w0) identityHashMap.remove(tVar);
        w0Var.getClass();
        w0Var.f4769a.releasePeriod(tVar);
        w0Var.f4771c.remove(((ya.n) tVar).f26112a);
        if (!identityHashMap.isEmpty()) {
            e();
        }
        f(w0Var);
    }

    public void i(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f4778b;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            w0 w0Var = (w0) arrayList.remove(i12);
            ((HashMap) this.f4780d).remove(w0Var.f4770b);
            int i13 = -w0Var.f4769a.f26143h.f26084b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((w0) arrayList.get(i14)).f4772d += i13;
            }
            w0Var.f4773e = true;
            if (this.f4777a) {
                f(w0Var);
            }
        }
    }

    public x0(ur.h0 h0Var) {
        this.k = h0Var;
        this.f4778b = h0Var.o();
        this.f4779c = h0Var.j();
        this.f4780d = h0Var.c();
        this.f4781e = null;
        this.f4782f = h0Var.f();
        this.f4783g = ht.s0.f10942a;
        this.f4777a = true;
        this.f4784h = h0Var.Q;
        this.f4785i = h0Var.getName();
        this.j = h0Var.getType();
    }
}
