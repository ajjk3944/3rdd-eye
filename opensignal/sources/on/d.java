package on;

import com.survicate.surveys.entities.models.RespondentEvent;
import java.util.ArrayList;
import lf.t1;

/* loaded from: classes.dex */
public final class d extends rq.j implements ar.n {
    public final /* synthetic */ long B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f19600x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RespondentEvent.QuestionAnswered f19601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, RespondentEvent.QuestionAnswered questionAnswered, long j, pq.c cVar) {
        super(2, cVar);
        this.f19600x = eVar;
        this.f19601y = questionAnswered;
        this.B = j;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        return new d(this.f19600x, this.f19601y, this.B, cVar);
    }

    @Override // rq.a
    public final Object q(Object obj) {
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        e eVar = this.f19600x;
        k kVar = eVar.f19603a;
        kVar.getClass();
        RespondentEvent.QuestionAnswered questionAnswered = this.f19601y;
        br.l.e(questionAnswered, "answerEvent");
        so.e eVar2 = (so.e) kVar.f19638b;
        ArrayList arrayListF0 = mq.o.F0(eVar2.a(), questionAnswered);
        eVar2.f22181a.edit().putString("answersToSend", eVar2.f22182b.serializeAnswerEvents(arrayListF0)).apply();
        kVar.f19643g.g(arrayListF0);
        no.b bVar = eVar.f19607e;
        sm.f fVar = (sm.f) bVar;
        fVar.M(c7.a.n(this.B, ") has been saved and will be sent.", new StringBuilder("Answer to the question (id: ")));
        return lq.b0.f15562a;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        d dVar = (d) o((wt.t) obj, (pq.c) obj2);
        lq.b0 b0Var = lq.b0.f15562a;
        dVar.q(b0Var);
        return b0Var;
    }
}
