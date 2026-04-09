package h4;

import ar.n;
import br.l;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.t1;
import mq.b0;
import rq.j;

/* loaded from: classes.dex */
public final class c extends j implements n {
    public /* synthetic */ Object B;
    public final /* synthetic */ j D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9892x;

    /* renamed from: y, reason: collision with root package name */
    public int f9893y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(n nVar, pq.c cVar, int i10) {
        super(2, cVar);
        this.f9892x = i10;
        switch (i10) {
            case 1:
                this.D = (j) nVar;
                super(2, cVar);
                break;
            default:
                this.D = (j) nVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ar.n, rq.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ar.n, rq.j] */
    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f9892x) {
            case 0:
                c cVar2 = new c(this.D, cVar, 0);
                cVar2.B = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.D, cVar, 1);
                cVar3.B = obj;
                return cVar3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ar.n, rq.j] */
    /* JADX WARN: Type inference failed for: r5v14, types: [ar.n, rq.j] */
    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f9892x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f9893y;
                if (i10 == 0) {
                    t1.G(obj);
                    b bVar = (b) this.B;
                    this.f9893y = 1;
                    obj = this.D.w(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                b bVar2 = (b) obj;
                l.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.f9891b.f2481d).set(true);
                return bVar2;
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f9893y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.B;
                    t1.G(obj);
                    return bVar3;
                }
                t1.G(obj);
                b bVar4 = new b(b0.Y(((b) this.B).a()), false);
                this.B = bVar4;
                this.f9893y = 1;
                return this.D.w(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        b bVar = (b) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f9892x) {
        }
        return ((c) o(bVar, cVar)).q(lq.b0.f15562a);
    }
}
