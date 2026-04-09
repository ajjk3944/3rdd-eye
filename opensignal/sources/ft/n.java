package ft;

import es.b0;
import h7.h0;
import ir.f0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import ls.e1;
import ls.g0;
import ls.q0;
import ls.s0;
import ls.y;
import p.v2;

/* loaded from: classes.dex */
public final class n extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9091d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f9092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(1);
        this.f9091d = i10;
        this.f9092g = oVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        Collection<y> collectionD0;
        Collection<g0> collectionD02;
        q0 q0VarX;
        q0 q0VarX2;
        switch (this.f9091d) {
            case 0:
                qs.g gVar = (qs.g) obj;
                br.l.e(gVar, "it");
                o oVar = this.f9092g;
                LinkedHashMap linkedHashMap = oVar.f9093a;
                ls.a aVar = y.R;
                br.l.d(aVar, "PARSER");
                q qVar = oVar.f9101i;
                byte[] bArr = (byte[]) linkedHashMap.get(gVar);
                if (bArr != null) {
                    b0 b0Var = new b0(aVar, new ByteArrayInputStream(bArr), qVar, 1);
                    collectionD0 = st.l.d0(new st.a(new st.i(b0Var, new cg.j(13, b0Var))));
                } else {
                    collectionD0 = mq.w.f16945a;
                }
                ArrayList arrayList = new ArrayList(collectionD0.size());
                for (y yVar : collectionD0) {
                    dt.t tVar = (dt.t) qVar.f9105b.f817i;
                    br.l.d(yVar, "it");
                    t tVarE = tVar.e(yVar);
                    if (!qVar.r(tVarE)) {
                        tVarE = null;
                    }
                    if (tVarE != null) {
                        arrayList.add(tVarE);
                    }
                }
                qVar.j(arrayList, gVar);
                return rt.k.d(arrayList);
            case 1:
                qs.g gVar2 = (qs.g) obj;
                br.l.e(gVar2, "it");
                o oVar2 = this.f9092g;
                LinkedHashMap linkedHashMap2 = oVar2.f9094b;
                ls.a aVar2 = g0.R;
                br.l.d(aVar2, "PARSER");
                q qVar2 = oVar2.f9101i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(gVar2);
                if (bArr2 != null) {
                    b0 b0Var2 = new b0(aVar2, new ByteArrayInputStream(bArr2), qVar2, 1);
                    collectionD02 = st.l.d0(new st.a(new st.i(b0Var2, new cg.j(13, b0Var2))));
                } else {
                    collectionD02 = mq.w.f16945a;
                }
                ArrayList arrayList2 = new ArrayList(collectionD02.size());
                for (g0 g0Var : collectionD02) {
                    dt.t tVar2 = (dt.t) qVar2.f9105b.f817i;
                    br.l.d(g0Var, "it");
                    arrayList2.add(tVar2.f(g0Var));
                }
                qVar2.k(arrayList2, gVar2);
                return rt.k.d(arrayList2);
            default:
                qs.g gVar3 = (qs.g) obj;
                br.l.e(gVar3, "it");
                o oVar3 = this.f9092g;
                al.b bVar = oVar3.f9101i.f9105b;
                byte[] bArr3 = (byte[]) oVar3.f9095c.get(gVar3);
                if (bArr3 != null) {
                    s0 s0Var = (s0) s0.L.b(new ByteArrayInputStream(bArr3), ((dt.k) bVar.f810b).f7506p);
                    if (s0Var != null) {
                        dt.t tVar3 = (dt.t) bVar.f817i;
                        al.b bVar2 = tVar3.f7538a;
                        ns.f fVar = (ns.f) bVar2.f811c;
                        h0 h0Var = (h0) bVar2.f813e;
                        List<ls.g> list = s0Var.G;
                        br.l.d(list, "proto.annotationList");
                        ArrayList arrayList3 = new ArrayList(mq.p.a0(list, 10));
                        for (ls.g gVar4 : list) {
                            io.sentry.internal.debugmeta.c cVar = tVar3.f7539b;
                            br.l.d(gVar4, "it");
                            arrayList3.add(cVar.e(gVar4, fVar));
                        }
                        u uVar = new u(((dt.k) bVar2.f810b).f7493a, (rr.l) bVar2.f812d, arrayList3.isEmpty() ? sr.g.f22217a : new sr.i(0, arrayList3), io.sentry.config.a.Y(fVar, s0Var.f15877x), f0.p((e1) ns.e.f18531d.e(s0Var.f15876r)), s0Var, (ns.f) bVar2.f811c, h0Var, (ns.h) bVar2.f814f, (k) bVar2.f816h);
                        List list2 = s0Var.f15878y;
                        br.l.d(list2, "proto.typeParameterList");
                        v2 v2Var = (v2) bVar2.b(uVar, list2, (ns.f) bVar2.f811c, (h0) bVar2.f813e, (ns.h) bVar2.f814f, (ns.a) bVar2.f815g).f809a;
                        List listD = v2Var.d();
                        int i10 = s0Var.f15875g;
                        if ((i10 & 4) == 4) {
                            q0VarX = s0Var.B;
                            br.l.d(q0VarX, "underlyingType");
                        } else {
                            if ((i10 & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            q0VarX = h0Var.x(s0Var.D);
                        }
                        ht.b0 b0VarJ = v2Var.j(q0VarX, false);
                        int i11 = s0Var.f15875g;
                        if ((i11 & 16) == 16) {
                            q0VarX2 = s0Var.E;
                            br.l.d(q0VarX2, "expandedType");
                        } else {
                            if ((i11 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            q0VarX2 = h0Var.x(s0Var.F);
                        }
                        uVar.y1(listD, b0VarJ, v2Var.j(q0VarX2, false));
                        return uVar;
                    }
                }
                return null;
        }
    }
}
