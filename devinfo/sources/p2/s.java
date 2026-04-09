package p2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import g2.n0;
import i2.d1;
import i2.e0;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final o1.c f31113a = new o1.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p2.p a(i2.e0 r8, boolean r9) {
        /*
            com.google.android.gms.internal.consent_sdk.a0 r0 = r8.G
            java.lang.Object r0 = r0.g
            i1.m r0 = (i1.m) r0
            int r1 = r0.f25557d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.f25556c
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof i2.u1
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.f25556c
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof i2.j
            if (r4 == 0) goto L58
            r4 = r1
            i2.j r4 = (i2.j) r4
            i1.m r4 = r4.f25691p
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.f25556c
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            w0.e r3 = new w0.e
            r6 = 16
            i1.m[] r6 = new i1.m[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.b(r1)
            r1 = r2
        L4f:
            r3.b(r4)
        L52:
            i1.m r4 = r4.f25559f
            goto L2f
        L55:
            if (r5 != r6) goto L58
            goto L17
        L58:
            i1.m r1 = i2.k.e(r3)
            goto L17
        L5d:
            int r1 = r0.f25557d
            r1 = r1 & 8
            if (r1 == 0) goto L66
            i1.m r0 = r0.f25559f
            goto Ld
        L66:
            nk.k.b(r2)
            i2.u1 r2 = (i2.u1) r2
            i1.m r2 = (i1.m) r2
            i1.m r0 = r2.f25554a
            p2.l r1 = r8.x()
            if (r1 != 0) goto L7a
            p2.l r1 = new p2.l
            r1.<init>()
        L7a:
            p2.p r2 = new p2.p
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.s.a(i2.e0, boolean):p2.p");
    }

    public static final x.u b(r rVar, mk.c cVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            p pVarA = rVar.a();
            e0 e0Var = pVarA.f31103c;
            if (e0Var.I() && e0Var.H()) {
                x.u uVar = new x.u(48);
                km.i iVar = new km.i(6);
                d3.j jVarX = jm.a.x(pVarA.g());
                ((Region) iVar.f28426b).set(jVarX.f21961a, jVarX.f21962b, jVarX.f21963c, jVarX.f21964d);
                c(iVar, pVarA, uVar, cVar, pVarA, new km.i(6));
                return uVar;
            }
            x.u uVar2 = x.k.f36911a;
            nk.k.c(uVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return uVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(km.i iVar, p pVar, x.u uVar, mk.c cVar, p pVar2, km.i iVar2) {
        o1.c cVarT0;
        e0 e0Var;
        p pVar3 = pVar;
        int i4 = pVar3.g;
        km.i iVar3 = iVar2;
        Region region = (Region) iVar3.f28426b;
        e0 e0Var2 = pVar2.f31103c;
        int i10 = pVar2.g;
        boolean z3 = (e0Var2.I() && e0Var2.H()) ? false : true;
        km.i iVar4 = iVar;
        Region region2 = (Region) iVar4.f28426b;
        if (!region2.isEmpty() || i10 == i4) {
            if (!z3 || pVar2.f31105e) {
                i2.i iVarF = pVar2.f();
                if (iVarF == null) {
                    cVarT0 = ((i2.q) e0Var2.G.f19257d).T0();
                } else {
                    i1.m mVar = ((i1.m) iVarF).f25554a;
                    Object objG = pVar2.f31104d.f31095a.g(k.f31072b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z10 = objG != null;
                    if (!mVar.f25554a.f25565n) {
                        cVarT0 = o1.c.f30365e;
                    } else if (z10) {
                        cVarT0 = i2.k.q(mVar, 8).T0();
                    } else {
                        d1 d1VarQ = i2.k.q(mVar, 8);
                        cVarT0 = n0.f(d1VarQ).r(d1VarQ, true);
                    }
                }
                d3.j jVarX = jm.a.x(cVarT0);
                region.set(jVarX.f21961a, jVarX.f21962b, jVarX.f21963c, jVarX.f21964d);
                if (i10 == i4) {
                    i10 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (pVar2.f31105e) {
                        p pVarL = pVar2.l();
                        uVar.h(i10, new q(pVar2, jm.a.x((pVarL == null || (e0Var = pVarL.f31103c) == null || !e0Var.I()) ? f31113a : pVarL.g())));
                        return;
                    } else {
                        if (i10 == -1) {
                            Rect bounds = region.getBounds();
                            uVar.h(i10, new q(pVar2, new d3.j(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                uVar.h(i10, new q(pVar2, new d3.j(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = p.j(4, pVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) cVar.invoke(listJ.get(size))).booleanValue()) {
                        c(iVar4, pVar3, uVar, cVar, (p) listJ.get(size), iVar3);
                    }
                    size--;
                    iVar4 = iVar;
                    pVar3 = pVar;
                    iVar3 = iVar2;
                }
                if (f(pVar2)) {
                    region2.op(jVarX.f21961a, jVarX.f21962b, jVarX.f21963c, jVarX.f21964d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(l lVar, w wVar) {
        Object objG = lVar.f31095a.g(wVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(p pVar) {
        d1 d1VarD = pVar.d();
        l lVar = pVar.f31104d;
        if (d1VarD != null ? d1VarD.H0() : false) {
            return true;
        }
        w wVar = t.f31114a;
        if (lVar.f31095a.c(t.f31127p)) {
            return true;
        }
        return lVar.f31095a.c(t.f31126o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(p2.p r14) {
        /*
            boolean r0 = e(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            p2.l r14 = r14.f31104d
            boolean r0 = r14.f31097c
            if (r0 != 0) goto L59
            x.e0 r14 = r14.f31095a
            java.lang.Object[] r0 = r14.f36874b
            java.lang.Object[] r2 = r14.f36875c
            long[] r14 = r14.f36873a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            p2.w r11 = (p2.w) r11
            boolean r10 = r11.f31143c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.s.f(p2.p):boolean");
    }
}
