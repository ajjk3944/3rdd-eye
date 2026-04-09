package ft;

import h7.h0;
import ls.y;
import rr.o0;
import ur.k0;

/* loaded from: classes.dex */
public final class t extends k0 implements b {

    /* renamed from: a0, reason: collision with root package name */
    public final y f9114a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ns.f f9115b0;

    /* renamed from: c0, reason: collision with root package name */
    public final h0 f9116c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ns.h f9117d0;

    /* renamed from: e0, reason: collision with root package name */
    public final k f9118e0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public t(rr.l r12, ur.k0 r13, sr.h r14, qs.g r15, rr.c r16, ls.y r17, ns.f r18, h7.h0 r19, ns.h r20, ft.k r21, rr.o0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            br.l.e(r12, r0)
            java.lang.String r0 = "annotations"
            br.l.e(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            br.l.e(r5, r0)
            java.lang.String r0 = "proto"
            br.l.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            br.l.e(r8, r0)
            java.lang.String r0 = "typeTable"
            br.l.e(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            br.l.e(r10, r0)
            if (r22 != 0) goto L38
            rr.p0 r0 = rr.o0.f21696s
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f9114a0 = r7
            r11.f9115b0 = r8
            r11.f9116c0 = r9
            r11.f9117d0 = r10
            r1 = r21
            r11.f9118e0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.t.<init>(rr.l, ur.k0, sr.h, qs.g, rr.c, ls.y, ns.f, h7.h0, ns.h, ft.k, rr.o0):void");
    }

    @Override // ft.l
    public final rs.b E() {
        return this.f9114a0;
    }

    @Override // ft.l
    public final h0 T() {
        return this.f9116c0;
    }

    @Override // ft.l
    public final ns.f a0() {
        return this.f9115b0;
    }

    @Override // ft.l
    public final k b0() {
        return this.f9118e0;
    }

    @Override // ur.k0, ur.u
    public final ur.u x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, o0 o0Var, sr.h hVar) {
        br.l.e(lVar, "newOwner");
        br.l.e(cVar, "kind");
        br.l.e(hVar, "annotations");
        k0 k0Var = (k0) uVar;
        if (gVar == null) {
            gVar = getName();
            br.l.d(gVar, "name");
        }
        t tVar = new t(lVar, k0Var, hVar, gVar, cVar, this.f9114a0, this.f9115b0, this.f9116c0, this.f9117d0, this.f9118e0, o0Var);
        tVar.S = this.S;
        return tVar;
    }
}
