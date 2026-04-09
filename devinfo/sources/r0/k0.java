package r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import j2.a1;
import java.util.concurrent.atomic.AtomicInteger;
import u0.i1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1.n f32558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.j0 f32559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f32560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f32561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f32562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1.h f32563f;

    public k0(i1.n nVar, p1.j0 j0Var, long j, float f10, float f11, c1.h hVar) {
        this.f32558a = nVar;
        this.f32559b = j0Var;
        this.f32560c = j;
        this.f32561d = f10;
        this.f32562e = f11;
        this.f32563f = hVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        u0.p pVar = (u0.p) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zO = pVar.O(iIntValue & 1, (iIntValue & 3) != 2);
        yj.u uVar = yj.u.f37649a;
        if (!zO) {
            pVar.R();
            return uVar;
        }
        i1.n nVarA = m0.a(this.f32558a, this.f32559b, m0.b(this.f32560c, this.f32561d, pVar), null, ((d3.c) pVar.j(a1.f27074h)).I(this.f32562e));
        Object objL = pVar.L();
        u0.e eVar = u0.l.f34851a;
        if (objL == eVar) {
            objL = new b7.w(16);
            pVar.g0(objL);
        }
        AtomicInteger atomicInteger = p2.n.f31099a;
        i1.n nVarB = nVarA.b(new p2.b((mk.c) objL, false));
        Object objL2 = pVar.L();
        if (objL2 == eVar) {
            objL2 = j0.f32556a;
            pVar.g0(objL2);
        }
        c2.j jVar = c2.g0.f2612a;
        i1.n nVarB2 = nVarB.b(new c2.e0(uVar, null, (PointerInputEventHandler) objL2, 6));
        g2.j0 j0VarC = g0.h.c(i1.b.f25531a, true);
        int iN = u0.q.n(pVar);
        i1 i1VarL = pVar.l();
        i1.n nVarW = com.bumptech.glide.d.w(nVarB2, pVar);
        i2.g.R8.getClass();
        i2.x xVar = i2.f.f25653b;
        pVar.Z();
        if (pVar.S) {
            pVar.k(xVar);
        } else {
            pVar.j0();
        }
        u0.q.x(j0VarC, i2.f.f25656e, pVar);
        u0.q.x(i1VarL, i2.f.f25655d, pVar);
        i2.e eVar2 = i2.f.f25657f;
        if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN))) {
            pVar.g0(Integer.valueOf(iN));
            pVar.b(Integer.valueOf(iN), eVar2);
        }
        u0.q.x(nVarW, i2.f.f25654c, pVar);
        this.f32563f.invoke(pVar, 0);
        pVar.p(true);
        return uVar;
    }
}
