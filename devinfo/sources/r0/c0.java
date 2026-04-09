package r0;

import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0.b f32499a = new q0.b();

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(mk.a r33, i1.n r34, boolean r35, p1.j0 r36, r0.a r37, r0.d r38, c0.x r39, g0.a0 r40, c1.h r41, u0.p r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.c0.a(mk.a, i1.n, boolean, p1.j0, r0.a, r0.d, c0.x, g0.a0, c1.h, u0.p, int, int):void");
    }

    public static final void b(final i1.n nVar, p1.j0 j0Var, h hVar, i iVar, c1.h hVar2, u0.p pVar, final int i4) {
        c1.h hVar3;
        final p1.j0 j0Var2;
        final h hVar4;
        final i iVar2;
        char c9;
        h hVar5;
        i iVar3;
        pVar.X(1359693790);
        int i10 = i4 | (pVar.f(nVar) ? 4 : 2) | 25744;
        if (pVar.O(i10 & 1, (74899 & i10) != 74898)) {
            pVar.T();
            if ((i4 & 1) == 0 || pVar.y()) {
                p1.j0 j0VarA = h0.a(t0.h.f33961c, pVar);
                l lVar = (l) pVar.j(m.f32596a);
                h hVar6 = lVar.Y;
                if (hVar6 == null) {
                    t0.e eVar = t0.h.f33959a;
                    c9 = 1;
                    h hVar7 = new h(m.c(lVar, eVar), m.a(lVar, m.c(lVar, eVar)), p1.z.h(p1.s.b(m.c(lVar, t0.h.f33962d), t0.h.f33964f), m.c(lVar, eVar)), p1.s.b(m.a(lVar, m.c(lVar, eVar)), 0.38f));
                    lVar.Y = hVar7;
                    hVar6 = hVar7;
                } else {
                    c9 = 1;
                }
                j0Var2 = j0VarA;
                hVar5 = hVar6;
                iVar3 = new i(t0.h.f33960b, t0.h.j, t0.h.f33965h, t0.h.f33966i, t0.h.g, t0.h.f33963e);
            } else {
                pVar.R();
                j0Var2 = j0Var;
                hVar5 = hVar;
                iVar3 = iVar;
                c9 = 1;
            }
            pVar.q();
            long j = hVar5.f32540a;
            long j8 = hVar5.f32541b;
            float f10 = iVar3.f32545a;
            pVar.W(-1763481333);
            pVar.W(167751211);
            Object objL = pVar.L();
            if (objL == u0.l.f34851a) {
                objL = u0.q.r(new d3.f(f10));
                pVar.g0(objL);
            }
            pVar.p(false);
            pVar.p(false);
            float f11 = ((d3.f) ((u0.u0) objL).getValue()).f21957a;
            hVar3 = hVar2;
            c1.h hVarC = c1.n.c(-97109725, new k(hVar3), pVar);
            u0.a0 a0Var = m0.f32598a;
            float f12 = ((d3.f) pVar.j(a0Var)).f21957a + 0;
            p.r rVarA = o.f32614a.a(new p1.s(j8));
            p.r rVarA2 = a0Var.a(new d3.f(f12));
            p.r[] rVarArr = new p.r[2];
            rVarArr[0] = rVarA;
            rVarArr[c9] = rVarA2;
            u0.q.b(rVarArr, c1.n.c(421772006, new k0(nVar, j0Var2, j, f12, f11, hVarC), pVar), pVar, 56);
            hVar4 = hVar5;
            iVar2 = iVar3;
        } else {
            hVar3 = hVar2;
            pVar.R();
            j0Var2 = j0Var;
            hVar4 = hVar;
            iVar2 = iVar;
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            final c1.h hVar8 = hVar3;
            m1VarR.f34870d = new mk.e(j0Var2, hVar4, iVar2, hVar8, i4) { // from class: r0.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1.j0 f32552b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f32553c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i f32554d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c1.h f32555e;

                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iZ = u0.q.z(196609);
                    c0.b(this.f32551a, this.f32552b, this.f32553c, this.f32554d, this.f32555e, (u0.p) obj, iZ);
                    return yj.u.f37649a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final mk.a r24, final i1.n r25, boolean r26, p1.j0 r27, r0.a r28, c0.x r29, g0.a0 r30, final c1.h r31, u0.p r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.c0.c(mk.a, i1.n, boolean, p1.j0, r0.a, c0.x, g0.a0, c1.h, u0.p, int, int):void");
    }
}
