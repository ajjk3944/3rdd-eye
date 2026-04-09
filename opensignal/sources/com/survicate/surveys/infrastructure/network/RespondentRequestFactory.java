package com.survicate.surveys.infrastructure.network;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/RespondentRequestFactory;", "", "createInstalledRequest", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "body", "Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;", "createQuestionAnsweredRequest", "surveyId", "", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "createSurveySeenRequest", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RespondentRequestFactory {
    URLRequest createInstalledRequest(InstalledRequestBody body);

    URLRequest createQuestionAnsweredRequest(String surveyId, QuestionAnsweredRequestBody body);

    URLRequest createSurveySeenRequest(String surveyId, SurveySeenRequestBody body);
}
