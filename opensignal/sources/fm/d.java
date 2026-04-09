package fm;

import lf.t1;
import lq.b0;

/* loaded from: classes.dex */
public final class d extends rq.j implements ar.k {
    public final /* synthetic */ a8.f B;
    public final /* synthetic */ long D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f9001x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f9002y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, a8.f fVar, long j, pq.c cVar) {
        super(1, cVar);
        this.f9001x = str;
        this.f9002y = str2;
        this.B = fVar;
        this.D = j;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        a8.f fVar = this.B;
        long j = this.D;
        d dVar = new d(this.f9001x, this.f9002y, fVar, j, (pq.c) obj);
        b0 b0Var = b0.f15562a;
        dVar.q(b0Var);
        return b0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        String str;
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        String str2 = this.f9001x;
        if (br.l.a(str2, "UPLOAD_SPEED") && (str = this.f9002y) != null) {
            a8.f fVar = this.B;
            a8.f.c(fVar, a8.f.a(fVar, str2, str), gm.b.UPLOAD_FINISHED, this.D);
        }
        return b0.f15562a;
    }
}
