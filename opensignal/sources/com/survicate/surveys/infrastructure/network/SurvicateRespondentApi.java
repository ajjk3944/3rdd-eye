package com.survicate.surveys.infrastructure.network;

import br.l;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateRespondentApi;", "Lcom/survicate/surveys/infrastructure/network/RespondentApi;", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "httpClient", "Lcom/survicate/surveys/infrastructure/network/RespondentRequestFactory;", "requestFactory", "<init>", "(Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;Lcom/survicate/surveys/infrastructure/network/RespondentRequestFactory;)V", "", "surveyId", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "body", "Llq/b0;", "sendQuestionAnswered", "(Ljava/lang/String;Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "sendSurveySeen", "(Ljava/lang/String;Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;", "sendInstalled", "(Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "Lcom/survicate/surveys/infrastructure/network/RespondentRequestFactory;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateRespondentApi implements RespondentApi {
    private final SurvicateHttpClient httpClient;
    private final RespondentRequestFactory requestFactory;

    public SurvicateRespondentApi(SurvicateHttpClient survicateHttpClient, RespondentRequestFactory respondentRequestFactory) {
        l.e(survicateHttpClient, "httpClient");
        l.e(respondentRequestFactory, "requestFactory");
        this.httpClient = survicateHttpClient;
        this.requestFactory = respondentRequestFactory;
    }

    @Override // com.survicate.surveys.infrastructure.network.RespondentApi
    public void sendInstalled(InstalledRequestBody body) throws IOException {
        l.e(body, "body");
        this.httpClient.loadUrlResponse(this.requestFactory.createInstalledRequest(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.RespondentApi
    public void sendQuestionAnswered(String surveyId, QuestionAnsweredRequestBody body) throws IOException {
        l.e(surveyId, "surveyId");
        l.e(body, "body");
        this.httpClient.loadUrlResponse(this.requestFactory.createQuestionAnsweredRequest(surveyId, body));
    }

    @Override // com.survicate.surveys.infrastructure.network.RespondentApi
    public void sendSurveySeen(String surveyId, SurveySeenRequestBody body) throws IOException {
        l.e(surveyId, "surveyId");
        l.e(body, "body");
        this.httpClient.loadUrlResponse(this.requestFactory.createSurveySeenRequest(surveyId, body));
    }
}
