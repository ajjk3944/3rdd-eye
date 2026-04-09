package tg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import lf.t1;

/* loaded from: classes.dex */
public final class y0 extends rq.j implements ar.n {
    public final /* synthetic */ a1 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22865x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f22866y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(a1 a1Var, pq.c cVar, int i10) {
        super(2, cVar);
        this.f22865x = i10;
        this.B = a1Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f22865x) {
            case 0:
                y0 y0Var = new y0(this.B, cVar, 0);
                y0Var.f22866y = obj;
                return y0Var;
            default:
                y0 y0Var2 = new y0(this.B, cVar, 1);
                y0Var2.f22866y = obj;
                return y0Var2;
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        boolean z10;
        int i10 = this.f22865x;
        a1 a1Var = this.B;
        switch (i10) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return f0.a((f0) this.f22866y, null, a1Var.f22728d.a(), null, 5);
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                f0 f0Var = (f0) this.f22866y;
                boolean zD = a1Var.d(f0Var);
                a0 a0Var = a1Var.f22730f;
                Map mapB = f0Var.f22776c;
                if (mapB != null) {
                    a0Var.getClass();
                    if (!a0Var.f22724f) {
                        ArrayList arrayListA = r.a(a0Var.f22719a);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = arrayListA.iterator();
                        while (it.hasNext()) {
                            c0 c0Var = (c0) it.next();
                            y yVar = (y) mapB.get(c0Var.f22748a);
                            lq.l lVar = yVar != null ? new lq.l(c0Var, yVar) : null;
                            if (lVar != null) {
                                arrayList.add(lVar);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                lq.l lVar2 = (lq.l) it2.next();
                                c0 c0Var2 = (c0) lVar2.f15571a;
                                y yVar2 = (y) lVar2.f15572d;
                                String strA = a0Var.a();
                                String str = c0Var2.f22748a;
                                int i11 = c0Var2.f22749b;
                                if (br.l.a(strA, str)) {
                                    if (i11 != yVar2.f22863a || !br.l.a((String) a0Var.f22722d.getValue(), yVar2.f22864b)) {
                                    }
                                } else if (i11 != yVar2.f22863a) {
                                }
                            }
                        }
                        z10 = true;
                    }
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean zC = a1Var.c(f0Var);
                if (z10) {
                    mapB = a0Var.b(mq.x.f16946a);
                } else if (zC) {
                    mapB = a0Var.b(mapB);
                }
                j0 j0Var = z10 ? null : f0Var.f22774a;
                if (!zD && !z10) {
                    return zC ? f0.a(f0Var, null, null, a0Var.b(mapB), 3) : f0Var;
                }
                j0 j0VarA = a1Var.f22726b.a(j0Var);
                p0 p0Var = (p0) a1Var.f22727c;
                wt.w.s(wt.w.b(p0Var.f22833e), null, null, new n0(p0Var, j0VarA, null), 3);
                a0Var.f22724f = true;
                return new f0(j0VarA, null, mapB);
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f22865x) {
        }
        return ((y0) o(f0Var, cVar)).q(lq.b0.f15562a);
    }
}
