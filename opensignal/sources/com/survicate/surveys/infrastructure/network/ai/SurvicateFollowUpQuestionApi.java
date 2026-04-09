package com.survicate.surveys.infrastructure.network.ai;

import androidx.lifecycle.p;
import br.g;
import br.l;
import com.survicate.surveys.infrastructure.network.SurvicateHttpClient;
import du.e;
import du.f;
import kotlin.Metadata;
import pq.c;
import wt.d0;
import wt.q;
import wt.w;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/SurvicateFollowUpQuestionApi;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionApi;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestFactory;", "requestFactory", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;", "deserializer", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "httpClient", "Lwt/q;", "dispatcher", "<init>", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestFactory;Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;Lwt/q;)V", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "body", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "requestFollowUpQuestion", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;Lpq/c;)Ljava/lang/Object;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "Lwt/q;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateFollowUpQuestionApi implements FollowUpQuestionApi {
    private final FollowUpQuestionSerializer deserializer;
    private final q dispatcher;
    private final SurvicateHttpClient httpClient;
    private final FollowUpQuestionRequestFactory requestFactory;

    public SurvicateFollowUpQuestionApi(FollowUpQuestionRequestFactory followUpQuestionRequestFactory, FollowUpQuestionSerializer followUpQuestionSerializer, SurvicateHttpClient survicateHttpClient, q qVar) {
        l.e(followUpQuestionRequestFactory, "requestFactory");
        l.e(followUpQuestionSerializer, "deserializer");
        l.e(survicateHttpClient, "httpClient");
        l.e(qVar, "dispatcher");
        this.requestFactory = followUpQuestionRequestFactory;
        this.deserializer = followUpQuestionSerializer;
        this.httpClient = survicateHttpClient;
        this.dispatcher = qVar;
    }

    @Override // com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionApi
    public Object requestFollowUpQuestion(FollowUpQuestionRequestBody followUpQuestionRequestBody, c cVar) {
        return w.B(this.dispatcher, new p(this, followUpQuestionRequestBody, (c) null), cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SurvicateFollowUpQuestionApi(FollowUpQuestionRequestFactory followUpQuestionRequestFactory, FollowUpQuestionSerializer followUpQuestionSerializer, SurvicateHttpClient survicateHttpClient, q qVar, int i10, g gVar) {
        if ((i10 & 8) != 0) {
            f fVar = d0.f24610a;
            qVar = e.f7570g;
        }
        this(followUpQuestionRequestFactory, followUpQuestionSerializer, survicateHttpClient, qVar);
    }
}
