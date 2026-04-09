package au;

import com.google.android.gms.internal.measurement.e5;
import g1.h0;
import h2.a0;
import h2.b0;
import h2.c0;
import h2.e0;
import h2.i0;
import h2.l0;
import h2.m0;
import java.util.ArrayList;
import java.util.List;
import wt.j1;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements ar.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2344a;

    public /* synthetic */ r(int i10) {
        this.f2344a = i10;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        h2.h hVar;
        Object objA;
        switch (this.f2344a) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                pq.f fVar = (pq.f) obj2;
                if (!(fVar instanceof j1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar : Integer.valueOf(iIntValue + 1);
            case 2:
                j1 j1Var = (j1) obj;
                pq.f fVar2 = (pq.f) obj2;
                if (j1Var != null) {
                    return j1Var;
                }
                if (fVar2 instanceof j1) {
                    return (j1) fVar2;
                }
                return null;
            case 3:
                return (bu.w) obj;
            case 4:
                h2.f fVar3 = (h2.f) obj2;
                return e5.e(fVar3.f9811d, a0.a(fVar3.f9810a, a0.f9759a, (w0.a) obj));
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((r2.l) obj2).f21210a);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                r2.p pVar = (r2.p) obj2;
                return e5.e(Float.valueOf(pVar.f21214a), Float.valueOf(pVar.f21215b));
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                w0.a aVar = (w0.a) obj;
                r2.q qVar = (r2.q) obj2;
                t2.k kVar = new t2.k(qVar.f21217a);
                h2.y yVar = a0.f9773q;
                return e5.e(a0.a(kVar, yVar, aVar), a0.a(new t2.k(qVar.f21218b), yVar, aVar));
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.valueOf(((k2.r) obj2).f14004a);
            case 9:
                h2.k kVar2 = (h2.k) obj2;
                return e5.e(kVar2.f9843a, a0.a(kVar2.f9844b, a0.f9767i, (w0.a) obj));
            case 10:
                return Float.valueOf(((r2.a) obj2).f21192a);
            case 11:
                w0.a aVar2 = (w0.a) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(a0.a((h2.d) list.get(i10), a0.f9760b, aVar2));
                }
                return arrayList;
            case 12:
                i0 i0Var = (i0) obj2;
                return e5.e(Integer.valueOf((int) (i0Var.f9836a >> 32)), Integer.valueOf((int) (i0Var.f9836a & 4294967295L)));
            case 13:
                w0.a aVar3 = (w0.a) obj;
                h0 h0Var = (h0) obj2;
                return e5.e(a0.a(new g1.r(h0Var.f9235a), a0.f9772p, aVar3), a0.a(new f1.b(h0Var.f9236b), a0.f9774r, aVar3), Float.valueOf(h0Var.f9237c));
            case 14:
                t2.k kVar3 = (t2.k) obj2;
                return kVar3 != null ? t2.k.a(kVar3.f22395a, t2.k.f22394c) : false ? Boolean.FALSE : e5.e(Float.valueOf(t2.k.c(kVar3.f22395a)), new t2.l(t2.k.b(kVar3.f22395a)));
            case 15:
                f1.b bVar = (f1.b) obj2;
                return bVar != null ? f1.b.a(bVar.f8402a, 9205357640488583168L) : false ? Boolean.FALSE : e5.e(Float.valueOf(Float.intBitsToFloat((int) (bVar.f8402a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.f8402a & 4294967295L))));
            case 16:
                w0.a aVar4 = (w0.a) obj;
                List list2 = ((n2.b) obj2).f17379a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(a0.a((n2.a) list2.get(i11), a0.f9776t, aVar4));
                }
                return arrayList2;
            case 17:
                return ((n2.a) obj2).f17377a.toLanguageTag();
            case 18:
                r2.i iVar = (r2.i) obj2;
                return e5.e(new r2.f(iVar.f21205a), new r2.h(iVar.f21206b), new r2.g());
            case 19:
                w0.a aVar5 = (w0.a) obj;
                h2.d dVar = (h2.d) obj2;
                Object obj3 = dVar.f9800a;
                if (obj3 instanceof h2.s) {
                    hVar = h2.h.Paragraph;
                } else if (obj3 instanceof c0) {
                    hVar = h2.h.Span;
                } else if (obj3 instanceof m0) {
                    hVar = h2.h.VerbatimTts;
                } else if (obj3 instanceof l0) {
                    hVar = h2.h.Url;
                } else if (obj3 instanceof h2.k) {
                    hVar = h2.h.Link;
                } else if (obj3 instanceof h2.j) {
                    hVar = h2.h.Clickable;
                } else {
                    if (!(obj3 instanceof e0)) {
                        throw new UnsupportedOperationException();
                    }
                    hVar = h2.h.String;
                }
                switch (h2.z.f9886a[hVar.ordinal()]) {
                    case 1:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = a0.a((h2.s) obj3, a0.f9765g, aVar5);
                        break;
                    case 2:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = a0.a((c0) obj3, a0.f9766h, aVar5);
                        break;
                    case 3:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = a0.a((m0) obj3, a0.f9761c, aVar5);
                        break;
                    case 4:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = a0.a((l0) obj3, a0.f9762d, aVar5);
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = a0.a((h2.k) obj3, a0.f9763e, aVar5);
                        break;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = a0.a((h2.j) obj3, a0.f9764f, aVar5);
                        break;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        br.l.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((e0) obj3).f9809a;
                        break;
                    default:
                        throw new bf.n();
                }
                return e5.e(hVar, objA, Integer.valueOf(dVar.f9801b), Integer.valueOf(dVar.f9802c), dVar.f9803d);
            case 20:
                h2.j jVar = (h2.j) obj2;
                return e5.e(jVar.f9837a, a0.a(jVar.f9838b, a0.f9767i, (w0.a) obj));
            case 21:
                return ((m0) obj2).f9855a;
            case 22:
                return ((l0) obj2).f9846a;
            case 23:
                w0.a aVar6 = (w0.a) obj;
                h2.s sVar = (h2.s) obj2;
                r2.k kVar4 = new r2.k(sVar.f9869a);
                r2.m mVar = new r2.m(sVar.f9870b);
                Object objA2 = a0.a(new t2.k(sVar.f9871c), a0.f9773q, aVar6);
                r2.q qVar2 = sVar.f9872d;
                r2.q qVar3 = r2.q.f21216c;
                Object objA3 = a0.a(qVar2, a0.f9768l, aVar6);
                Object objA4 = a0.a(sVar.f9873e, b0.f9784a, aVar6);
                r2.i iVar2 = sVar.f9874f;
                r2.i iVar3 = r2.i.f21204c;
                return e5.e(kVar4, mVar, objA2, objA3, objA4, a0.a(iVar2, a0.f9777u, aVar6), a0.a(new r2.e(sVar.f9875g), b0.f9785b, aVar6), new r2.d(sVar.f9876h), a0.a(sVar.f9877i, b0.f9786c, aVar6));
            case 24:
                w0.a aVar7 = (w0.a) obj;
                c0 c0Var = (c0) obj2;
                g1.r rVar = new g1.r(c0Var.f9787a.b());
                h2.y yVar2 = a0.f9772p;
                Object objA5 = a0.a(rVar, yVar2, aVar7);
                t2.k kVar5 = new t2.k(c0Var.f9788b);
                h2.y yVar3 = a0.f9773q;
                Object objA6 = a0.a(kVar5, yVar3, aVar7);
                k2.r rVar2 = c0Var.f9789c;
                k2.r rVar3 = k2.r.f13999d;
                Object objA7 = a0.a(rVar2, a0.f9769m, aVar7);
                k2.n nVar = c0Var.f9790d;
                k2.o oVar = c0Var.f9791e;
                String str = c0Var.f9793g;
                Object objA8 = a0.a(new t2.k(c0Var.f9794h), yVar3, aVar7);
                Object objA9 = a0.a(c0Var.f9795i, a0.f9770n, aVar7);
                Object objA10 = a0.a(c0Var.j, a0.k, aVar7);
                n2.b bVar2 = c0Var.k;
                n2.b bVar3 = n2.b.f17378g;
                Object objA11 = a0.a(bVar2, a0.f9775s, aVar7);
                Object objA12 = a0.a(new g1.r(c0Var.f9796l), yVar2, aVar7);
                Object objA13 = a0.a(c0Var.f9797m, a0.j, aVar7);
                h0 h0Var2 = c0Var.f9798n;
                h0 h0Var3 = h0.f9234d;
                return e5.e(objA5, objA6, objA7, nVar, oVar, -1, str, objA8, objA9, objA10, objA11, objA12, objA13, a0.a(h0Var2, a0.f9771o, aVar7));
            case 25:
                w0.a aVar8 = (w0.a) obj;
                h2.h0 h0Var4 = (h2.h0) obj2;
                c0 c0Var2 = h0Var4.f9830a;
                q3.a aVar9 = a0.f9766h;
                return e5.e(a0.a(c0Var2, aVar9, aVar8), a0.a(h0Var4.f9831b, aVar9, aVar8), a0.a(h0Var4.f9832c, aVar9, aVar8), a0.a(h0Var4.f9833d, aVar9, aVar8));
            case 26:
                Boolean boolValueOf = Boolean.valueOf(((h2.u) obj2).f9880a);
                q3.a aVar10 = a0.f9759a;
                return e5.e(boolValueOf, new h2.i());
            case 27:
                return Integer.valueOf(((r2.e) obj2).f21198a);
            case 28:
                r2.s sVar2 = (r2.s) obj2;
                r2.r rVar4 = new r2.r(sVar2.f21222a);
                q3.a aVar11 = a0.f9759a;
                return e5.e(rVar4, Boolean.valueOf(sVar2.f21223b));
            default:
                uv.b bVar4 = (uv.b) obj;
                br.l.e(bVar4, "$this$single");
                br.l.e((rv.a) obj2, "it");
                return new ll.c((ll.a) bVar4.a(null, br.x.f2918a.b(ll.a.class), null));
        }
    }
}
