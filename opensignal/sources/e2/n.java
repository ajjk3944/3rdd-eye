package e2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import x1.f0;
import x1.f1;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.c f7727a = new f1.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e2.k a(x1.f0 r8, boolean r9) {
        /*
            al.c r0 = r8.D
            java.lang.Object r0 = r0.f825g
            z0.l r0 = (z0.l) r0
            int r1 = r0.f26498e
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.f26497d
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof x1.t1
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.f26497d
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof x1.j
            if (r4 == 0) goto L58
            r4 = r1
            x1.j r4 = (x1.j) r4
            z0.l r4 = r4.f24863q
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.f26497d
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            p0.e r3 = new p0.e
            r6 = 16
            z0.l[] r6 = new z0.l[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.b(r1)
            r1 = r2
        L4f:
            r3.b(r4)
        L52:
            z0.l r4 = r4.f26500g
            goto L2f
        L55:
            if (r5 != r6) goto L58
            goto L17
        L58:
            z0.l r1 = x1.k.e(r3)
            goto L17
        L5d:
            int r1 = r0.f26498e
            r1 = r1 & 8
            if (r1 == 0) goto L66
            z0.l r0 = r0.f26500g
            goto Ld
        L66:
            br.l.b(r2)
            x1.t1 r2 = (x1.t1) r2
            z0.l r2 = (z0.l) r2
            z0.l r0 = r2.f26495b
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r8.E()
            if (r1 != 0) goto L7a
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
        L7a:
            e2.k r2 = new e2.k
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.n.a(x1.f0, boolean):e2.k");
    }

    public static final u.t b(m mVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            k kVarA = mVar.a();
            f0 f0Var = kVarA.f7716c;
            if (f0Var.T() && f0Var.S()) {
                u.t tVar = new u.t(48);
                b9.c cVar = new b9.c(15);
                t2.h hVarG0 = io.sentry.config.a.g0(kVarA.g());
                ((Region) cVar.f2478d).set(hVarG0.f22388a, hVarG0.f22389b, hVarG0.f22390c, hVarG0.f22391d);
                c(cVar, kVarA, tVar, kVarA, new b9.c(15));
                return tVar;
            }
            u.t tVar2 = u.k.f23086a;
            br.l.c(tVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return tVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(b9.c cVar, k kVar, u.t tVar, k kVar2, b9.c cVar2) {
        f1.c cVarR0;
        f0 f0Var;
        int i10 = kVar.f7720g;
        Region region = (Region) cVar2.f2478d;
        f0 f0Var2 = kVar2.f7716c;
        int i11 = kVar2.f7720g;
        boolean z10 = (f0Var2.T() && f0Var2.S()) ? false : true;
        Region region2 = (Region) cVar.f2478d;
        if (!region2.isEmpty() || i11 == i10) {
            if (!z10 || kVar2.f7718e) {
                x1.i iVarF = kVar2.f();
                if (iVarF == null) {
                    cVarR0 = ((x1.r) f0Var2.D.f822d).R0();
                } else {
                    z0.l lVar = ((z0.l) iVarF).f26495b;
                    Object objG = kVar2.f7717d.f1191a.g(g.f7687b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z11 = objG != null;
                    if (!lVar.f26495b.f26506o) {
                        cVarR0 = f1.c.f8403e;
                    } else if (z11) {
                        cVarR0 = x1.k.q(lVar, 8).R0();
                    } else {
                        f1 f1VarQ = x1.k.q(lVar, 8);
                        cVarR0 = e5.s(f1VarQ).B(f1VarQ, true);
                    }
                }
                t2.h hVarG0 = io.sentry.config.a.g0(cVarR0);
                region.set(hVarG0.f22388a, hVarG0.f22389b, hVarG0.f22390c, hVarG0.f22391d);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (kVar2.f7718e) {
                        k kVarL = kVar2.l();
                        tVar.h(i11, new l(kVar2, io.sentry.config.a.g0((kVarL == null || (f0Var = kVarL.f7716c) == null || !f0Var.T()) ? f7727a : kVarL.g())));
                        return;
                    } else {
                        if (i11 == -1) {
                            Rect bounds = region.getBounds();
                            tVar.h(i11, new l(kVar2, new t2.h(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                tVar.h(i11, new l(kVar2, new t2.h(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = k.j(4, kVar2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((k) listJ.get(size)).k().f1191a.c(p.f7753w)) {
                        c(cVar, kVar, tVar, (k) listJ.get(size), cVar2);
                    }
                }
                if (f(kVar2)) {
                    region2.op(hVarG0.f22388a, hVarG0.f22389b, hVarG0.f22390c, hVarG0.f22391d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(SemanticsConfiguration semanticsConfiguration, s sVar) {
        Object objG = semanticsConfiguration.f1191a.g(sVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(k kVar) {
        f1 f1VarD = kVar.d();
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        if (f1VarD != null ? f1VarD.D0() : false) {
            return true;
        }
        s sVar = p.f7733a;
        if (semanticsConfiguration.f1191a.c(p.f7745o)) {
            return true;
        }
        return semanticsConfiguration.f1191a.c(p.f7744n);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(e2.k r14) {
        /*
            boolean r0 = e(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r14.f7717d
            boolean r0 = r14.f1193g
            if (r0 != 0) goto L59
            u.a0 r14 = r14.f1191a
            java.lang.Object[] r0 = r14.f23038b
            java.lang.Object[] r2 = r14.f23039c
            long[] r14 = r14.f23037a
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
            e2.s r11 = (e2.s) r11
            boolean r10 = r11.f7762c
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
        throw new UnsupportedOperationException("Method not decompiled: e2.n.f(e2.k):boolean");
    }
}
