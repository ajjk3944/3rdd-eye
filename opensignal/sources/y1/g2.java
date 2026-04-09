package y1;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class g2 extends rq.j implements ar.n {
    public final /* synthetic */ i2 B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25689x;

    /* renamed from: y, reason: collision with root package name */
    public int f25690y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(i2 i2Var, pq.c cVar, int i10) {
        super(2, cVar);
        this.f25689x = i10;
        this.B = i2Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f25689x) {
            case 0:
                return new g2(this.B, cVar, 0);
            default:
                return new g2(this.B, cVar, 1);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) throws Throwable {
        switch (this.f25689x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f25690y;
                lq.b0 b0Var = lq.b0.f15562a;
                if (i10 == 0) {
                    lf.t1.G(obj);
                    AndroidComposeView androidComposeView = this.B.f25714a;
                    this.f25690y = 1;
                    Object objK = androidComposeView.O.k(this);
                    if (objK != aVar) {
                        objK = b0Var;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lf.t1.G(obj);
                }
                return b0Var;
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f25690y;
                lq.b0 b0Var2 = lq.b0.f15562a;
                if (i11 == 0) {
                    lf.t1.G(obj);
                    AndroidComposeView androidComposeView2 = this.B.f25714a;
                    this.f25690y = 1;
                    Object objA = androidComposeView2.contentCaptureManager.a(this);
                    if (objA != aVar2) {
                        objA = b0Var2;
                    }
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lf.t1.G(obj);
                }
                return b0Var2;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        wt.t tVar = (wt.t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f25689x) {
        }
        return ((g2) o(tVar, cVar)).q(lq.b0.f15562a);
    }
}
