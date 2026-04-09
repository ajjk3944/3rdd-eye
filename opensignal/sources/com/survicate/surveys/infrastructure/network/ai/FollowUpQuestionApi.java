package com.survicate.surveys.infrastructure.network.ai;

import java.io.IOException;
import kotlin.Metadata;
import pq.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionApi;", "", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "body", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "requestFollowUpQuestion", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;Lpq/c;)Ljava/lang/Object;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FollowUpQuestionApi {
    Object requestFollowUpQuestion(FollowUpQuestionRequestBody followUpQuestionRequestBody, c cVar) throws IOException;
}
