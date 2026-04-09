package fm;

import lf.t1;
import lq.b0;

/* loaded from: classes.dex */
public final class c extends rq.j implements ar.k {
    public final /* synthetic */ long B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8999x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b9.c f9000y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, b9.c cVar, long j, pq.c cVar2) {
        super(1, cVar2);
        this.f8999x = str;
        this.f9000y = cVar;
        this.B = j;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        b9.c cVar = this.f9000y;
        long j = this.B;
        c cVar2 = new c(this.f8999x, cVar, j, (pq.c) obj);
        b0 b0Var = b0.f15562a;
        cVar2.q(b0Var);
        return b0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        String str = this.f8999x;
        boolean zA = br.l.a(str, "SEND_RESULTS");
        b9.c cVar = this.f9000y;
        if (zA) {
            cVar.getClass();
            br.l.e(str, "jobId");
        } else {
            cVar.getClass();
            a8.f.A(new g((a8.f) cVar.f2478d, this.B, null, 1));
        }
        return b0.f15562a;
    }
}
