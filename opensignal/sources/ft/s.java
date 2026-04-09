package ft;

import ls.g0;
import rr.m0;
import rr.o0;
import rr.z;
import ur.h0;

/* loaded from: classes.dex */
public final class s extends h0 implements b {
    public final g0 X;
    public final ns.f Y;
    public final h7.h0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final ns.h f9112a0;

    /* renamed from: b0, reason: collision with root package name */
    public final k f9113b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rr.l lVar, m0 m0Var, sr.h hVar, z zVar, as.p pVar, boolean z10, qs.g gVar, rr.c cVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, g0 g0Var, ns.f fVar, h7.h0 h0Var, ns.h hVar2, k kVar) {
        super(lVar, m0Var, hVar, zVar, pVar, z10, gVar, cVar, o0.f21696s, z11, z12, z15, z13, z14);
        br.l.e(lVar, "containingDeclaration");
        br.l.e(hVar, "annotations");
        br.l.e(zVar, "modality");
        br.l.e(pVar, "visibility");
        br.l.e(gVar, "name");
        br.l.e(cVar, "kind");
        br.l.e(g0Var, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(h0Var, "typeTable");
        br.l.e(hVar2, "versionRequirementTable");
        this.X = g0Var;
        this.Y = fVar;
        this.Z = h0Var;
        this.f9112a0 = hVar2;
        this.f9113b0 = kVar;
    }

    @Override // ft.l
    public final rs.b E() {
        return this.X;
    }

    @Override // ft.l
    public final h7.h0 T() {
        return this.Z;
    }

    @Override // ft.l
    public final ns.f a0() {
        return this.Y;
    }

    @Override // ft.l
    public final k b0() {
        return this.f9113b0;
    }

    @Override // ur.h0, rr.x
    public final boolean u() {
        return ns.e.D.e(this.X.f15783r).booleanValue();
    }

    @Override // ur.h0
    public final h0 x1(rr.l lVar, z zVar, as.p pVar, m0 m0Var, rr.c cVar, qs.g gVar) {
        br.l.e(lVar, "newOwner");
        br.l.e(zVar, "newModality");
        br.l.e(pVar, "newVisibility");
        br.l.e(cVar, "kind");
        br.l.e(gVar, "newName");
        return new s(lVar, m0Var, getAnnotations(), zVar, pVar, this.B, gVar, cVar, this.K, this.L, u(), this.O, this.M, this.X, this.Y, this.Z, this.f9112a0, this.f9113b0);
    }
}
