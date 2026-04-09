package cq;

import br.u;
import com.survicate.surveys.presentation.csat.micro.MicroSurveyPointCsatContentView;
import com.survicate.surveys.presentation.nps.micro.MicroSurveyPointNpsContentView;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalContentView;
import com.survicate.surveys.presentation.shape.micro.MicroSurveyPointShapeContentView;
import com.survicate.surveys.presentation.smileyscale.micro.MicroSurveyPointSmileyScaleContentView;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import d4.d1;
import lf.t1;
import lq.b0;
import mq.x;
import wt.d0;
import wt.t;
import wt.w;
import x1.f1;
import x1.v1;
import y1.u0;
import zt.e0;
import zt.f0;

/* loaded from: classes.dex */
public final class h extends rq.j implements ar.n {
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6625x;

    /* renamed from: y, reason: collision with root package name */
    public int f6626y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(ar.k kVar, pq.c cVar) {
        super(2, cVar);
        this.f6625x = 2;
        this.B = (rq.j) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ar.k, rq.j] */
    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6625x) {
            case 0:
                return new h((bp.a) this.B, cVar, 0);
            case 1:
                return new h((d7.a) this.B, cVar, 1);
            case 2:
                return new h((rq.j) this.B, cVar);
            case 3:
                return new h((jn.c) this.B, cVar, 3);
            case 4:
                return new h((g1.f) this.B, cVar, 4);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new h((MicroSurveyPointNpsContentView) this.B, cVar, 5);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new h((MicroSurveyPointNumericalContentView) this.B, cVar, 6);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new h((MicroSurveyPointShapeContentView) this.B, cVar, 7);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new h((uf.b) this.B, cVar, 8);
            case 9:
                return new h((wo.d) this.B, cVar, 9);
            case 10:
                return new h((MicroSurveyPointSmileyScaleContentView) this.B, cVar, 10);
            case 11:
                return new h((y.j) this.B, cVar, 11);
            case 12:
                return new h((y.l) this.B, cVar, 12);
            case 13:
                return new h((MicroSurveyPointCsatContentView) this.B, cVar, 13);
            default:
                return new h((zp.i) this.B, cVar, 14);
        }
    }

    /* JADX WARN: Type inference failed for: r15v37, types: [ar.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ar.k, rq.j] */
    @Override // rq.a
    public final Object q(Object obj) throws Throwable {
        z0.l lVarE;
        al.c cVar;
        int i10 = this.f6625x;
        int i11 = 2;
        byte b2 = 0;
        b0 b0Var = b0.f15562a;
        Object obj2 = this.B;
        int i12 = 1;
        switch (i10) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i13 = this.f6626y;
                if (i13 == 0) {
                    t1.G(obj);
                    this.f6626y = 1;
                    if (w.h(3000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                ((bp.a) obj2).c();
                return b0Var;
            case 1:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i14 = this.f6626y;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return obj;
                }
                t1.G(obj);
                e7.e eVar = ((d7.a) obj2).f7146a;
                this.f6626y = 1;
                Object objC = eVar.c(this);
                return objC == aVar2 ? aVar2 : objC;
            case 2:
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                int i15 = this.f6626y;
                if (i15 == 0) {
                    t1.G(obj);
                    this.f6626y = 1;
                    return ((rq.j) obj2).a(this) == aVar3 ? aVar3 : b0Var;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.G(obj);
                return b0Var;
            case 3:
                qq.a aVar4 = qq.a.COROUTINE_SUSPENDED;
                int i16 = this.f6626y;
                if (i16 == 0) {
                    t1.G(obj);
                    fm.i iVar = (fm.i) ((jn.c) obj2).f13785g.getValue();
                    this.f6626y = 1;
                    iVar.getClass();
                    du.f fVar = d0.f24610a;
                    obj = w.B(du.e.f7570g, new d1(i11, b2 == true ? 1 : 0, i12), this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 4:
                qq.a aVar5 = qq.a.COROUTINE_SUSPENDED;
                int i17 = this.f6626y;
                if (i17 == 0) {
                    t1.G(obj);
                    this.f6626y = 1;
                    return ((g1.f) obj2).w(this) == aVar5 ? aVar5 : b0Var;
                }
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.G(obj);
                return b0Var;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                MicroSurveyPointNpsContentView microSurveyPointNpsContentView = (MicroSurveyPointNpsContentView) obj2;
                qq.a aVar6 = qq.a.COROUTINE_SUSPENDED;
                int i18 = this.f6626y;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                microSurveyPointNpsContentView.F.setVisibility(0);
                microSurveyPointNpsContentView.F.b();
                this.f6626y = 1;
                return MicroSurveyPointNpsContentView.a(microSurveyPointNpsContentView, this) == aVar6 ? aVar6 : b0Var;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                MicroSurveyPointNumericalContentView microSurveyPointNumericalContentView = (MicroSurveyPointNumericalContentView) obj2;
                MicroSurvicateCommentField microSurvicateCommentField = microSurveyPointNumericalContentView.F;
                qq.a aVar7 = qq.a.COROUTINE_SUSPENDED;
                int i19 = this.f6626y;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                microSurvicateCommentField.setVisibility(0);
                microSurvicateCommentField.b();
                this.f6626y = 1;
                return MicroSurveyPointNumericalContentView.a(microSurveyPointNumericalContentView, this) == aVar7 ? aVar7 : b0Var;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                MicroSurveyPointShapeContentView microSurveyPointShapeContentView = (MicroSurveyPointShapeContentView) obj2;
                MicroSurvicateCommentField microSurvicateCommentField2 = microSurveyPointShapeContentView.F;
                qq.a aVar8 = qq.a.COROUTINE_SUSPENDED;
                int i20 = this.f6626y;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                microSurvicateCommentField2.setVisibility(0);
                microSurvicateCommentField2.b();
                this.f6626y = 1;
                return MicroSurveyPointShapeContentView.a(microSurveyPointShapeContentView, this) == aVar8 ? aVar8 : b0Var;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                qq.a aVar9 = qq.a.COROUTINE_SUSPENDED;
                int i21 = this.f6626y;
                if (i21 == 0) {
                    t1.G(obj);
                    zt.f fVarA = ((uf.b) obj2).f23552c.a();
                    this.f6626y = 1;
                    obj = f0.j(fVarA, this);
                    if (obj == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                h4.b bVar = (h4.b) obj;
                return bVar != null ? bVar.a() : x.f16946a;
            case 9:
                qq.a aVar10 = qq.a.COROUTINE_SUSPENDED;
                int i22 = this.f6626y;
                if (i22 == 0) {
                    t1.G(obj);
                    this.f6626y = 1;
                    if (w.h(400L, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                ((wo.d) obj2).f24570w.c();
                return b0Var;
            case 10:
                MicroSurveyPointSmileyScaleContentView microSurveyPointSmileyScaleContentView = (MicroSurveyPointSmileyScaleContentView) obj2;
                qq.a aVar11 = qq.a.COROUTINE_SUSPENDED;
                int i23 = this.f6626y;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                microSurveyPointSmileyScaleContentView.I.setVisibility(0);
                microSurveyPointSmileyScaleContentView.I.b();
                this.f6626y = 1;
                return MicroSurveyPointSmileyScaleContentView.a(microSurveyPointSmileyScaleContentView, this) == aVar11 ? aVar11 : b0Var;
            case 11:
                qq.a aVar12 = qq.a.COROUTINE_SUSPENDED;
                int i24 = this.f6626y;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                u uVar = new u();
                u uVar2 = new u();
                u uVar3 = new u();
                y.j jVar = (y.j) obj2;
                e0 e0Var = jVar.f25593p.f7a;
                au.k kVar = new au.k(uVar, uVar2, uVar3, jVar, 1);
                this.f6626y = 1;
                e0Var.getClass();
                return e0.j(e0Var, kVar, this) == aVar12 ? aVar12 : b0Var;
            case 12:
                qq.a aVar13 = qq.a.COROUTINE_SUSPENDED;
                int i25 = this.f6626y;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                y.l lVar = (y.l) obj2;
                this.f6626y = 1;
                boolean z10 = lVar.f26495b.f26506o;
                if (z10) {
                    if (!z10) {
                        u1.a.b("visitAncestors called on an unattached node");
                    }
                    z0.l lVar2 = lVar.f26495b.f26499f;
                    x1.f0 f0VarR = x1.k.r(lVar);
                    while (true) {
                        if (f0VarR != null) {
                            if ((((z0.l) f0VarR.D.f825g).f26498e & 524288) != 0) {
                                while (lVar2 != null) {
                                    if ((lVar2.f26497d & 524288) != 0) {
                                        lVarE = lVar2;
                                        p0.e eVar2 = null;
                                        while (lVarE != null) {
                                            if (!(lVarE instanceof u0)) {
                                                if ((lVarE.f26497d & 524288) != 0 && (lVarE instanceof x1.j)) {
                                                    int i26 = 0;
                                                    for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                                        if ((lVar3.f26497d & 524288) != 0) {
                                                            i26++;
                                                            if (i26 == 1) {
                                                                lVarE = lVar3;
                                                            } else {
                                                                if (eVar2 == null) {
                                                                    eVar2 = new p0.e(new z0.l[16]);
                                                                }
                                                                if (lVarE != null) {
                                                                    eVar2.b(lVarE);
                                                                    lVarE = null;
                                                                }
                                                                eVar2.b(lVar3);
                                                            }
                                                        }
                                                    }
                                                    if (i26 == 1) {
                                                    }
                                                }
                                                lVarE = x1.k.e(eVar2);
                                            }
                                        }
                                    }
                                    lVar2 = lVar2.f26499f;
                                }
                            }
                            f0VarR = f0VarR.C();
                            lVar2 = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
                        } else {
                            lVarE = null;
                        }
                    }
                    u0 u0Var = (u0) lVarE;
                    if (u0Var != null) {
                        if (!lVar.f26495b.f26506o) {
                            u1.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
                        }
                        f1 f1VarQ = x1.k.q(lVar, 2);
                        if (!f1VarQ.v0().f26506o) {
                            u1.a.b("LayoutCoordinates is not attached.");
                        }
                        long jF0 = f1VarQ.F0(0L);
                        if (!f1VarQ.v0().f26506o) {
                            f1VarQ = null;
                        }
                        f1.c cVarA = f1VarQ != null ? ir.f0.a(0L, kc.f.V(f1VarQ.f23811d)) : null;
                        f1.c cVarC = cVarA != null ? cVarA.c(jF0) : null;
                        if (cVarC != null) {
                            u0Var.f25781p.requestRectangleOnScreen(g1.f0.p(cVarC), false);
                        }
                        qq.a aVar14 = qq.a.COROUTINE_SUSPENDED;
                    }
                }
                return b0Var == aVar13 ? aVar13 : b0Var;
            case 13:
                MicroSurveyPointCsatContentView microSurveyPointCsatContentView = (MicroSurveyPointCsatContentView) obj2;
                MicroSurvicateCommentField microSurvicateCommentField3 = microSurveyPointCsatContentView.D;
                qq.a aVar15 = qq.a.COROUTINE_SUSPENDED;
                int i27 = this.f6626y;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                microSurvicateCommentField3.setVisibility(0);
                microSurvicateCommentField3.b();
                this.f6626y = 1;
                return MicroSurveyPointCsatContentView.a(microSurveyPointCsatContentView, this) == aVar15 ? aVar15 : b0Var;
            default:
                qq.a aVar16 = qq.a.COROUTINE_SUSPENDED;
                int i28 = this.f6626y;
                if (i28 == 0) {
                    t1.G(obj);
                    this.f6626y = 1;
                    return zp.i.k0((zp.i) obj2, this) == aVar16 ? aVar16 : b0Var;
                }
                if (i28 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.G(obj);
                return b0Var;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        t tVar = (t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f6625x) {
        }
        return ((h) o(tVar, cVar)).q(b0.f15562a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, pq.c cVar, int i10) {
        super(2, cVar);
        this.f6625x = i10;
        this.B = obj;
    }
}
