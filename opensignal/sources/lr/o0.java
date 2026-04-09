package lr;

import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p.l2;

/* loaded from: classes.dex */
public final class o0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15656d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0 f15657g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i10) {
        super(0);
        this.f15656d = i10;
        this.f15657g = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Iterable] */
    @Override // ar.a
    public final Object c() throws rs.t {
        ?? H;
        switch (this.f15656d) {
            case 0:
                r1 r1Var = this.f15657g.f15665c;
                ir.v vVar = p0.f15664g[0];
                wr.b bVar = (wr.b) r1Var.c();
                if (bVar != null) {
                    ks.c cVar = bVar.f24589b;
                    String[] strArr = (String[]) cVar.f14491e;
                    String[] strArr2 = (String[]) cVar.f14493g;
                    if (strArr != null && strArr2 != null) {
                        lq.l lVarH = ps.i.h(strArr, strArr2);
                        return new lq.r((ps.g) lVarH.f15571a, (ls.c0) lVarH.f15572d, (ps.f) cVar.f14490d);
                    }
                }
                return null;
            default:
                p0 p0Var = this.f15657g;
                r1 r1Var2 = p0Var.f15665c;
                ir.v vVar2 = p0.f15664g[0];
                wr.b bVar2 = (wr.b) r1Var2.c();
                if (bVar2 == null) {
                    return at.m.f2303b;
                }
                r1 r1Var3 = p0Var.f15593a;
                ir.v vVar3 = a0.f15592b[0];
                Object objC = r1Var3.c();
                br.l.d(objC, "<get-moduleData>(...)");
                qm.c cVar2 = ((wr.e) objC).f24594b;
                js.g gVar = (js.g) cVar2.f20918d;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar2.f20920r;
                Class cls = bVar2.f24588a;
                qs.b bVarA = xr.d.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    qs.c cVarG = xr.d.a(cls).g();
                    br.l.d(cVarG, "fileClass.classId.packageFqName");
                    ks.c cVar3 = bVar2.f24589b;
                    ks.b bVar3 = (ks.b) cVar3.f14489c;
                    ks.b bVar4 = ks.b.MULTIFILE_CLASS;
                    if (bVar3 == bVar4) {
                        String[] strArr3 = (String[]) cVar3.f14491e;
                        if (bVar3 != bVar4) {
                            strArr3 = null;
                        }
                        List listX = strArr3 != null ? mq.l.X(strArr3) : null;
                        if (listX == null) {
                            listX = mq.w.f16945a;
                        }
                        H = new ArrayList();
                        Iterator it = listX.iterator();
                        while (it.hasNext()) {
                            qs.b bVarJ = qs.b.j(new qs.c(ys.b.d((String) it.next()).f26415a.replace('/', '.')));
                            l2 l2Var = (l2) cVar2.f20919g;
                            br.l.e(gVar.c().f7495c, "<this>");
                            wr.b bVarL = i4.l(l2Var, bVarJ, ps.f.f20634g);
                            if (bVarL != null) {
                                H.add(bVarL);
                            }
                        }
                    } else {
                        H = e5.H(bVar2);
                    }
                    qr.o oVar = new qr.o(gVar.c().f7494b, cVarG, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = H.iterator();
                    while (it2.hasNext()) {
                        ft.r rVarA = gVar.a(oVar, (wr.b) it2.next());
                        if (rVarA != null) {
                            arrayList.add(rVarA);
                        }
                    }
                    at.n nVarQ = e5.q("package " + cVarG + " (" + bVar2 + ')', mq.o.Q0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, nVarQ);
                    obj = objPutIfAbsent == null ? nVarQ : objPutIfAbsent;
                }
                br.l.d(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                return (at.n) obj;
        }
    }
}
