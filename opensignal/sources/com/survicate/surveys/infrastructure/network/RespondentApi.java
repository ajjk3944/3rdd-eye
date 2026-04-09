package com.survicate.surveys.infrastructure.network;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/RespondentApi;", "", "", "surveyId", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "body", "Llq/b0;", "sendQuestionAnswered", "(Ljava/lang/String;Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "sendSurveySeen", "(Ljava/lang/String;Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;", "sendInstalled", "(Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;)V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RespondentApi {
    void sendInstalled(InstalledRequestBody body) throws IOException;

    void sendQuestionAnswered(String surveyId, QuestionAnsweredRequestBody body) throws IOException;

    void sendSurveySeen(String surveyId, SurveySeenRequestBody body) throws IOException;
}
