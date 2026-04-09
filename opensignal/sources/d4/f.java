package d4;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import n0.o1;
import y1.e2;

/* loaded from: classes.dex */
public final class f extends rq.j implements ar.n {
    public Object B;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6802x = 1;

    /* renamed from: y, reason: collision with root package name */
    public int f6803y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(br.w wVar, o1 o1Var, androidx.lifecycle.v vVar, e2 e2Var, View view, pq.c cVar) {
        super(2, cVar);
        this.D = wVar;
        this.E = o1Var;
        this.F = vVar;
        this.G = e2Var;
        this.H = view;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6802x) {
            case 0:
                f fVar = new f((List) this.G, (ArrayList) this.H, cVar);
                fVar.F = obj;
                return fVar;
            default:
                f fVar2 = new f((br.w) this.D, (o1) this.E, (androidx.lifecycle.v) this.F, (e2) this.G, (View) this.H, cVar);
                fVar2.B = obj;
                return fVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.f.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f6802x) {
            case 0:
                return ((f) o(obj, (pq.c) obj2)).q(lq.b0.f15562a);
            default:
                return ((f) o((wt.t) obj, (pq.c) obj2)).q(lq.b0.f15562a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, ArrayList arrayList, pq.c cVar) {
        super(2, cVar);
        this.G = list;
        this.H = arrayList;
    }
}
