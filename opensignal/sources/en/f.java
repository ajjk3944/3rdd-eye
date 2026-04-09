package en;

import ar.n;
import bh.g;
import lf.t1;
import lq.b0;
import n0.x0;
import rq.j;
import wt.t;
import wt.w;

/* loaded from: classes.dex */
public final class f extends j implements n {
    public final /* synthetic */ fn.a B;
    public final /* synthetic */ x0 D;

    /* renamed from: x, reason: collision with root package name */
    public int f8242x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f8243y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, fn.a aVar, x0 x0Var, pq.c cVar) {
        super(2, cVar);
        this.f8243y = z10;
        this.B = aVar;
        this.D = x0Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        return new f(this.f8243y, this.B, this.D, cVar);
    }

    @Override // rq.a
    public final Object q(Object obj) {
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        int i10 = this.f8242x;
        b0 b0Var = b0.f15562a;
        if (i10 == 0) {
            t1.G(obj);
            if (this.f8243y) {
                return b0Var;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.G(obj);
        }
        do {
            g gVar = this.B.f9019e;
            g gVar2 = g.TESTING;
            x0 x0Var = this.D;
            String str = "";
            if (gVar != gVar2) {
                x0Var.setValue("");
                return b0Var;
            }
            String str2 = (String) x0Var.getValue();
            int iHashCode = str2.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 46) {
                    if (iHashCode == 1472) {
                        str2.equals("..");
                    }
                } else if (str2.equals(".")) {
                    str = "..";
                }
            } else if (str2.equals("")) {
                str = ".";
            }
            x0Var.setValue(str);
            this.f8242x = 1;
        } while (w.h(300L, this) != aVar);
        return aVar;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((f) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
    }
}
