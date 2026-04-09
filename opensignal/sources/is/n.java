package is;

import as.w;
import ht.a1;
import ht.b0;
import ht.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final sr.a f12973a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12974b;

    /* renamed from: c, reason: collision with root package name */
    public final cj.a f12975c;

    /* renamed from: d, reason: collision with root package name */
    public final as.a f12976d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12977e;

    public n(sr.a aVar, boolean z10, cj.a aVar2, as.a aVar3, boolean z11) {
        br.l.e(aVar2, "containerContext");
        br.l.e(aVar3, "containerApplicabilityType");
        this.f12973a = aVar;
        this.f12974b = z10;
        this.f12975c = aVar2;
        this.f12976d = aVar3;
        this.f12977e = z11;
    }

    public static void a(Object obj, ArrayList arrayList, as.d dVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) dVar.a(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, dVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static is.h b(rr.r0 r4) {
        /*
            java.lang.String r0 = "<this>"
            br.l.e(r4, r0)
            boolean r1 = r4 instanceof es.i0
            if (r1 != 0) goto Lb
            goto Lc4
        Lb:
            java.util.List r4 = r4.getUpperBounds()
            java.lang.String r1 = "this.upperBounds"
            br.l.d(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L1c
            goto Lc4
        L1c:
            java.util.Iterator r1 = r4.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            lt.d r2 = (lt.d) r2
            boolean r2 = jt.g.B(r2)
            if (r2 != 0) goto L20
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L39
            goto L51
        L39:
            java.util.Iterator r1 = r4.iterator()
        L3d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            lt.d r2 = (lt.d) r2
            is.g r2 = d(r2)
            if (r2 == 0) goto L3d
            r1 = r4
            goto L97
        L51:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L58
            goto Lc4
        L58:
            java.util.Iterator r1 = r4.iterator()
        L5c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            lt.d r2 = (lt.d) r2
            br.l.e(r2, r0)
            ht.x r2 = (ht.x) r2
            ht.x r2 = ht.c.e(r2)
            if (r2 == 0) goto L5c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
        L7c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r2.next()
            lt.d r3 = (lt.d) r3
            br.l.e(r3, r0)
            ht.x r3 = (ht.x) r3
            ht.x r3 = ht.c.e(r3)
            if (r3 == 0) goto L7c
            r1.add(r3)
            goto L7c
        L97:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9e
            goto Lb7
        L9e:
            java.util.Iterator r0 = r1.iterator()
        La2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r0.next()
            lt.d r2 = (lt.d) r2
            boolean r2 = jt.g.H(r2)
            if (r2 != 0) goto La2
            is.g r0 = is.g.NOT_NULL
            goto Lb9
        Lb7:
            is.g r0 = is.g.NULLABLE
        Lb9:
            is.h r2 = new is.h
            if (r1 == r4) goto Lbf
            r4 = 1
            goto Lc0
        Lbf:
            r4 = 0
        Lc0:
            r2.<init>(r0, r4)
            return r2
        Lc4:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: is.n.b(rr.r0):is.h");
    }

    public static qs.e c(b0 b0Var) {
        kt.h hVar = a1.f10882a;
        rr.i iVarP = b0Var.Z().p();
        rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
        if (fVar != null) {
            return ts.d.g(fVar);
        }
        return null;
    }

    public static g d(lt.d dVar) {
        b0 b0VarH;
        b0 b0VarH2;
        br.l.e(dVar, "<this>");
        ht.r rVarG = jt.g.g(dVar);
        if (rVarG == null || (b0VarH = jt.g.N(rVarG)) == null) {
            b0VarH = jt.g.h(dVar);
            br.l.b(b0VarH);
        }
        if (jt.g.F(b0VarH)) {
            return g.NULLABLE;
        }
        ht.r rVarG2 = jt.g.g(dVar);
        if (rVarG2 == null || (b0VarH2 = jt.g.Y(rVarG2)) == null) {
            b0VarH2 = jt.g.h(dVar);
            br.l.b(b0VarH2);
        }
        if (jt.g.F(b0VarH2)) {
            return null;
        }
        return g.NOT_NULL;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lq.h] */
    public final ArrayList e(lt.d dVar) {
        cj.a aVar = this.f12975c;
        w wVar = (w) aVar.f3977x.getValue();
        as.c cVar = ((ds.a) aVar.f3974d).f7460q;
        br.l.e(dVar, "<this>");
        a aVar2 = new a(dVar, cVar.b(wVar, ((x) dVar).getAnnotations()), null);
        as.d dVar2 = new as.d(28, this);
        ArrayList arrayList = new ArrayList(1);
        a(aVar2, arrayList, dVar2);
        return arrayList;
    }
}
