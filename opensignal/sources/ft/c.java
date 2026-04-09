package ft;

import h7.h0;
import rr.o0;

/* loaded from: classes.dex */
public final class c extends ur.j implements b {

    /* renamed from: b0, reason: collision with root package name */
    public final ls.l f9070b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ns.f f9071c0;

    /* renamed from: d0, reason: collision with root package name */
    public final h0 f9072d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ns.h f9073e0;

    /* renamed from: f0, reason: collision with root package name */
    public final k f9074f0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public c(rr.f r12, rr.k r13, sr.h r14, boolean r15, rr.c r16, ls.l r17, ns.f r18, h7.h0 r19, ns.h r20, ft.k r21, rr.o0 r22) {
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
            r11.f9070b0 = r7
            r11.f9071c0 = r8
            r11.f9072d0 = r9
            r11.f9073e0 = r10
            r1 = r21
            r11.f9074f0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.c.<init>(rr.f, rr.k, sr.h, boolean, rr.c, ls.l, ns.f, h7.h0, ns.h, ft.k, rr.o0):void");
    }

    @Override // ft.l
    public final rs.b E() {
        return this.f9070b0;
    }

    @Override // ur.j
    /* renamed from: G1 */
    public final /* bridge */ /* synthetic */ ur.j x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, o0 o0Var, sr.h hVar) {
        return M1(lVar, uVar, cVar, hVar, o0Var);
    }

    public final c M1(rr.l lVar, rr.u uVar, rr.c cVar, sr.h hVar, o0 o0Var) {
        br.l.e(lVar, "newOwner");
        br.l.e(cVar, "kind");
        br.l.e(hVar, "annotations");
        c cVar2 = new c((rr.f) lVar, (rr.k) uVar, hVar, this.f23645a0, cVar, this.f9070b0, this.f9071c0, this.f9072d0, this.f9073e0, this.f9074f0, o0Var);
        cVar2.S = this.S;
        return cVar2;
    }

    @Override // ur.u, rr.u
    public final boolean P() {
        return false;
    }

    @Override // ft.l
    public final h0 T() {
        return this.f9072d0;
    }

    @Override // ft.l
    public final ns.f a0() {
        return this.f9071c0;
    }

    @Override // ft.l
    public final k b0() {
        return this.f9074f0;
    }

    @Override // ur.u, rr.u
    public final boolean g() {
        return false;
    }

    @Override // ur.u, rr.u
    public final boolean r() {
        return false;
    }

    @Override // ur.u, rr.x
    public final boolean u() {
        return false;
    }

    @Override // ur.j, ur.u
    public final /* bridge */ /* synthetic */ ur.u x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, o0 o0Var, sr.h hVar) {
        return M1(lVar, uVar, cVar, hVar, o0Var);
    }
}
