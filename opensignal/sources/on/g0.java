package on;

import com.survicate.surveys.entities.models.RespondentEvent;
import com.survicate.surveys.infrastructure.network.HttpException;
import com.survicate.surveys.infrastructure.network.HttpExceptionKt;
import com.survicate.surveys.infrastructure.network.QuestionAnsweredRequestBodyKt;
import com.survicate.surveys.infrastructure.network.RespondentApi;
import com.survicate.surveys.infrastructure.network.SurveySeenRequestBodyKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f19616a;

    /* renamed from: b, reason: collision with root package name */
    public final RespondentApi f19617b;

    /* renamed from: c, reason: collision with root package name */
    public final no.c f19618c;

    /* renamed from: d, reason: collision with root package name */
    public final no.b f19619d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f19620e;

    /* renamed from: f, reason: collision with root package name */
    public List f19621f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f19622g;

    /* renamed from: h, reason: collision with root package name */
    public List f19623h;

    /* renamed from: i, reason: collision with root package name */
    public final bu.c f19624i;

    public g0(b0 b0Var, RespondentApi respondentApi, no.c cVar, no.b bVar) {
        br.l.e(b0Var, "synchronizationDataSource");
        br.l.e(respondentApi, "respondentApi");
        br.l.e(cVar, "networkStateProvider");
        br.l.e(bVar, "logger");
        du.f fVar = wt.d0.f24610a;
        du.e eVar = du.e.f7570g;
        br.l.e(eVar, "ioDispatcher");
        this.f19616a = b0Var;
        this.f19617b = respondentApi;
        this.f19618c = cVar;
        this.f19619d = bVar;
        this.f19620e = new AtomicBoolean(false);
        mq.w wVar = mq.w.f16945a;
        List listUnmodifiableList = Collections.unmodifiableList(wVar);
        br.l.d(listUnmodifiableList, "unmodifiableList(...)");
        this.f19621f = listUnmodifiableList;
        this.f19622g = new AtomicBoolean(false);
        List listUnmodifiableList2 = Collections.unmodifiableList(wVar);
        br.l.d(listUnmodifiableList2, "unmodifiableList(...)");
        this.f19623h = listUnmodifiableList2;
        this.f19624i = wt.w.b(se.b.M(eVar, wt.w.c()));
    }

    public static final void a(g0 g0Var, RespondentEvent.QuestionAnswered questionAnswered) throws IOException {
        b0 b0Var = g0Var.f19616a;
        try {
            g0Var.f19617b.sendQuestionAnswered(questionAnswered.getSurveyId(), QuestionAnsweredRequestBodyKt.toRequestBody(questionAnswered));
            k kVar = (k) b0Var;
            kVar.getClass();
            so.e eVar = (so.e) kVar.f19638b;
            ArrayList arrayListB0 = mq.o.B0(eVar.a(), questionAnswered);
            eVar.f22181a.edit().putString("answersToSend", eVar.f22182b.serializeAnswerEvents(arrayListB0)).apply();
            kVar.f19643g.g(arrayListB0);
        } catch (HttpException e4) {
            if (!HttpExceptionKt.canRetry(e4)) {
                k kVar2 = (k) b0Var;
                kVar2.getClass();
                br.l.e(questionAnswered, "answerEvent");
                so.e eVar2 = (so.e) kVar2.f19638b;
                ArrayList arrayListB02 = mq.o.B0(eVar2.a(), questionAnswered);
                eVar2.f22181a.edit().putString("answersToSend", eVar2.f22182b.serializeAnswerEvents(arrayListB02)).apply();
                kVar2.f19643g.g(arrayListB02);
            }
            throw e4;
        }
    }

    public static final void b(g0 g0Var, RespondentEvent.SurveySeen surveySeen) throws IOException {
        b0 b0Var = g0Var.f19616a;
        try {
            g0Var.f19617b.sendSurveySeen(surveySeen.getSurveyId(), SurveySeenRequestBodyKt.toRequestBody(surveySeen));
            ((k) b0Var).b(surveySeen);
            ((sm.f) g0Var.f19619d).M("`Seen` status of survey " + surveySeen.getSurveyId() + " has been synchronized.");
        } catch (HttpException e4) {
            if (!HttpExceptionKt.canRetry(e4)) {
                ((k) b0Var).b(surveySeen);
            }
            throw e4;
        }
    }
}
