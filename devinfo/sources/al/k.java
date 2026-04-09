package al;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f547b;

    /* renamed from: c, reason: collision with root package name */
    public int f548c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i4, ck.c cVar) {
        super(i4, cVar);
        this.f547b = 5;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f547b) {
            case 0:
                return new k((v) this.f549d, cVar, 0);
            case 1:
                return new k((va.o) this.f549d, cVar, 1);
            case 2:
                return new k((c0.d0) this.f549d, cVar, 2);
            case 3:
                return new k((c0.j0) this.f549d, cVar, 3);
            case 4:
                return new k((c2.m0) this.f549d, cVar, 4);
            case 5:
                k kVar = new k(2, cVar);
                kVar.f549d = obj;
                return kVar;
            case 6:
                return new k((d0.z0) this.f549d, cVar, 6);
            case 7:
                return new k((ConstraintTrackingWorker) this.f549d, cVar, 7);
            case 8:
                return new k((gg.b) this.f549d, cVar, 8);
            case 9:
                return new k((y4.a) this.f549d, cVar, 9);
            case 10:
                return new k((jj.i) this.f549d, cVar, 10);
            case 11:
                return new k((n5.a) this.f549d, cVar, 11);
            case 12:
                return new k((nm.e0) this.f549d, cVar, 12);
            case 13:
                return new k((r0.v0) this.f549d, cVar, 13);
            case 14:
                return new k((t5.g) this.f549d, cVar, 14);
            case 15:
                return new k((t5.f0) this.f549d, cVar, 15);
            case 16:
                return new k((te.c) this.f549d, cVar, 16);
            case 17:
                return new k((th.q) this.f549d, cVar, 17);
            default:
                return new k((xk.n) this.f549d, cVar, 18);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f547b) {
        }
        return ((k) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        xk.v vVar;
        int i4 = this.f547b;
        bl.u uVar = bl.u.f2330a;
        int i10 = 0;
        int i11 = 7;
        int i12 = 2;
        ck.c cVar = null;
        yj.u uVar2 = yj.u.f37649a;
        dk.a aVar = dk.a.f22275a;
        switch (i4) {
            case 0:
                int i13 = this.f548c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                v vVar2 = (v) this.f549d;
                this.f548c = 1;
                Object objA = vVar2.a(uVar, this);
                if (objA != aVar) {
                    objA = uVar2;
                }
                return objA == aVar ? aVar : uVar2;
            case 1:
                va.o oVar = (va.o) this.f549d;
                int i14 = this.f548c;
                if (i14 == 0) {
                    ci.b.D(obj);
                    oVar.getClass();
                    this.f548c = 1;
                    if (xk.x.i(5000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                if (((androidx.lifecycle.g) oVar.f36146b).f1163c > 0) {
                    return uVar2;
                }
                xk.a0 a0Var = (xk.a0) oVar.f36150f;
                if (a0Var != null) {
                    a0Var.e(null);
                }
                oVar.f36150f = null;
                return uVar2;
            case 2:
                int i15 = this.f548c;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                nk.s sVar = new nk.s();
                nk.s sVar2 = new nk.s();
                nk.s sVar3 = new nk.s();
                c0.d0 d0Var = (c0.d0) this.f549d;
                y0 y0Var = d0Var.f2385o.f22290a;
                bl.j jVar = new bl.j(sVar, sVar2, sVar3, d0Var, 1);
                this.f548c = 1;
                y0Var.getClass();
                y0.k(y0Var, jVar, this);
                return aVar;
            case 3:
                int i16 = this.f548c;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                c0.j0 j0Var = (c0.j0) this.f549d;
                this.f548c = 1;
                return t6.i0.c(j0Var, null, this) == aVar ? aVar : uVar2;
            case 4:
                c2.m0 m0Var = (c2.m0) this.f549d;
                int i17 = this.f548c;
                if (i17 == 0) {
                    ci.b.D(obj);
                    PointerInputEventHandler pointerInputEventHandler = m0Var.f2649q;
                    this.f548c = 2;
                    return pointerInputEventHandler.invoke(m0Var, this) == aVar ? aVar : uVar2;
                }
                if (i17 != 1 && i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ci.b.D(obj);
                return uVar2;
            case 5:
                int i18 = this.f548c;
                if (i18 == 0) {
                    ci.b.D(obj);
                    vVar = (xk.v) this.f549d;
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = (xk.v) this.f549d;
                    ci.b.D(obj);
                }
                while (xk.x.s(vVar.A())) {
                    b7.w wVar = new b7.w(i11);
                    this.f549d = vVar;
                    this.f548c = 1;
                    if (u0.q.o(getContext()).a(wVar, this) == aVar) {
                        return aVar;
                    }
                }
                return uVar2;
            case 6:
                int i19 = this.f548c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                zk.h hVar = (zk.h) ((d0.z0) this.f549d).f21917f;
                this.f548c = 1;
                Object objH = xk.x.h(new p(hVar, cVar, 12), this);
                return objH == aVar ? aVar : objH;
            case 7:
                int i20 = this.f548c;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f549d;
                this.f548c = 1;
                Object objC = ConstraintTrackingWorker.c(constraintTrackingWorker, this);
                return objC == aVar ? aVar : objC;
            case 8:
                gg.b bVar = (gg.b) this.f549d;
                i1 i1Var = bVar.f24718a;
                i1 i1Var2 = bVar.f24720c;
                int i21 = this.f548c;
                try {
                    if (i21 == 0) {
                        ci.b.D(obj);
                        if (((Boolean) i1Var2.getValue()).booleanValue() || ((List) i1Var.getValue()).size() > 1) {
                            return uVar2;
                        }
                        Boolean bool = Boolean.TRUE;
                        i1Var2.getClass();
                        i1Var2.j(null, bool);
                        System.currentTimeMillis();
                        el.e eVar = xk.g0.f37189a;
                        el.d dVar = el.d.f23561c;
                        bh.p pVar = new bh.p(i12, cVar, 3);
                        this.f548c = 1;
                        obj = xk.x.E(dVar, pVar, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                    }
                    List list = (List) obj;
                    System.currentTimeMillis();
                    list.size();
                    i1Var.getClass();
                    i1Var.j(null, list);
                    Boolean bool2 = Boolean.FALSE;
                    i1Var2.getClass();
                    i1Var2.j(null, bool2);
                    return uVar2;
                } catch (Throwable th2) {
                    Boolean bool3 = Boolean.FALSE;
                    i1Var2.getClass();
                    i1Var2.j(null, bool3);
                    throw th2;
                }
            case 9:
                int i22 = this.f548c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                a0.m mVar = (a0.m) ((y4.a) this.f549d).f37324b;
                Float f10 = new Float(0.0f);
                a0.l0 l0VarK = a0.f.k(0.0f, 400.0f, new Float(0.5f), 1);
                this.f548c = 1;
                return a0.f.e(mVar, f10, l0VarK, new a0.q0(i10), this) == aVar ? aVar : uVar2;
            case 10:
                jj.i iVar = (jj.i) this.f549d;
                int i23 = this.f548c;
                if (i23 == 0) {
                    ci.b.D(obj);
                    ((p6.i) jm.a.f27720a.f1137e).getClass();
                    cg.a.f2848b.f(null, "large_clean");
                    LinkedHashSet linkedHashSet = iVar.f27713f;
                    ArrayList arrayList = new ArrayList(zj.o.T(linkedHashSet, 10));
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((aj.b) it.next()).c());
                    }
                    this.f548c = 1;
                    obj = iVar.a(arrayList, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                yj.i iVar2 = (yj.i) obj;
                iVar.c((List) iVar2.f37638a, (List) iVar2.f37639b);
                return uVar2;
            case 11:
                int i24 = this.f548c;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                u6.t tVar = ((n5.a) this.f549d).f29765a;
                this.f548c = 1;
                Object objL = tVar.l(this);
                return objL == aVar ? aVar : objL;
            case 12:
                int i25 = this.f548c;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                f0 f0Var = new f0(i10, ((nm.e0) this.f549d).f30032u);
                this.f548c = 1;
                Object objA2 = f0Var.a(uVar, this);
                if (objA2 != aVar) {
                    objA2 = uVar2;
                }
                return objA2 == aVar ? aVar : uVar2;
            case 13:
                int i26 = this.f548c;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                nk.s sVar4 = new nk.s();
                r0.v0 v0Var = (r0.v0) this.f549d;
                y0 y0Var2 = v0Var.f32675o.f22290a;
                j0 j0Var2 = new j0(4, sVar4, v0Var);
                this.f548c = 1;
                y0Var2.getClass();
                y0.k(y0Var2, j0Var2, this);
                return aVar;
            case 14:
                int i27 = this.f548c;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                t5.g gVar = (t5.g) this.f549d;
                this.f548c = 1;
                return gVar.a(this) == aVar ? aVar : uVar2;
            case 15:
                int i28 = this.f548c;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                t5.f0 f0Var2 = (t5.f0) this.f549d;
                this.f548c = 1;
                return f0Var2.f(this) == aVar ? aVar : uVar2;
            case 16:
                int i29 = this.f548c;
                if (i29 == 0) {
                    ci.b.D(obj);
                    h data = ((te.c) this.f549d).f34558d.f34167a.getData();
                    this.f548c = 1;
                    obj = z0.m(data, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                t4.b bVar2 = (t4.b) obj;
                return bVar2 != null ? bVar2.a() : zj.t.f38318a;
            case 17:
                th.q qVar = (th.q) this.f549d;
                i1 i1Var3 = qVar.f34651e;
                wi.e eVar2 = qVar.f34652f;
                int i30 = this.f548c;
                th.n nVar = th.n.f34641a;
                if (i30 == 0) {
                    ci.b.D(obj);
                    if (!zg.c.b()) {
                        eVar2.j(nVar);
                        return uVar2;
                    }
                    Boolean bool4 = Boolean.TRUE;
                    i1Var3.getClass();
                    i1Var3.j(null, bool4);
                    el.e eVar3 = xk.g0.f37189a;
                    bh.p pVar2 = new bh.p(i12, cVar, i11);
                    this.f548c = 1;
                    obj = xk.x.E(eVar3, pVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Boolean bool5 = Boolean.FALSE;
                i1Var3.getClass();
                i1Var3.j(null, bool5);
                if (zBooleanValue) {
                    eVar2.j(nVar);
                    return uVar2;
                }
                yj.n nVar2 = gg.b.g;
                com.bumptech.glide.c.m().a();
                return uVar2;
            default:
                int i31 = this.f548c;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                xk.n nVar3 = (xk.n) this.f549d;
                this.f548c = 1;
                Object objG0 = nVar3.g0(this);
                return objG0 == aVar ? aVar : objG0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f547b = i4;
        this.f549d = obj;
    }
}
