package on;

import com.survicate.surveys.entities.models.EventSuggestion;
import com.survicate.surveys.infrastructure.network.EventSuggestionRequestBodyKt;
import com.survicate.surveys.infrastructure.network.HttpException;
import java.util.concurrent.Callable;
import lf.t1;

/* loaded from: classes.dex */
public final class j extends rq.j implements ar.n {
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f19635x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f19636y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, pq.c cVar, int i10) {
        super(2, cVar);
        this.f19635x = i10;
        this.B = obj;
        this.D = obj2;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f19635x) {
            case 0:
                return new j((Callable) this.f19636y, (k) this.B, (no.a) this.D, cVar);
            case 1:
                j jVar = new j((so.g) this.B, (EventSuggestion) this.D, cVar, 1);
                jVar.f19636y = obj;
                return jVar;
            default:
                j jVar2 = new j((h4.e) this.B, (Long) this.D, cVar, 2);
                jVar2.f19636y = obj;
                return jVar2;
        }
    }

    @Override // rq.a
    public final Object q(Object obj) throws Exception {
        switch (this.f19635x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                Object objCall = ((Callable) this.f19636y).call();
                k kVar = (k) this.B;
                no.a aVar2 = (no.a) this.D;
                kVar.getClass();
                if (aVar2.f18468d == null) {
                    aVar2.g(objCall);
                }
                break;
            case 1:
                so.g gVar = (so.g) this.B;
                no.b bVar = gVar.f22186b;
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                wt.t tVar = (wt.t) this.f19636y;
                try {
                    gVar.f22185a.sendEventSuggestion(EventSuggestionRequestBodyKt.toRequestBody((EventSuggestion) this.D));
                } catch (HttpException e4) {
                    wt.w.j(tVar);
                    gVar.f22192h = true;
                    ((sm.f) bVar).N(e4, "Failed to send an event suggestion");
                } catch (Exception e10) {
                    wt.w.j(tVar);
                    ((sm.f) bVar).N(e10, "Failed to send an event suggestion");
                }
                break;
            default:
                qq.a aVar4 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                ((h4.b) this.f19636y).d((h4.e) this.B, (Long) this.D);
                break;
        }
        return lq.b0.f15562a;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws Exception {
        switch (this.f19635x) {
            case 0:
                j jVar = (j) o((wt.t) obj, (pq.c) obj2);
                lq.b0 b0Var = lq.b0.f15562a;
                jVar.q(b0Var);
                return b0Var;
            case 1:
                j jVar2 = (j) o((wt.t) obj, (pq.c) obj2);
                lq.b0 b0Var2 = lq.b0.f15562a;
                jVar2.q(b0Var2);
                return b0Var2;
            default:
                j jVar3 = (j) o((h4.b) obj, (pq.c) obj2);
                lq.b0 b0Var3 = lq.b0.f15562a;
                jVar3.q(b0Var3);
                return b0Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Callable callable, k kVar, no.a aVar, pq.c cVar) {
        super(2, cVar);
        this.f19635x = 0;
        this.f19636y = callable;
        this.B = kVar;
        this.D = aVar;
    }
}
