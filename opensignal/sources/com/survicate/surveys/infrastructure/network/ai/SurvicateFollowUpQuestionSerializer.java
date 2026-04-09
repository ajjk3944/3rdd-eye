package com.survicate.surveys.infrastructure.network.ai;

import br.l;
import kotlin.Metadata;
import lu.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/SurvicateFollowUpQuestionSerializer;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;", "Llu/c;", "jsonSerialization", "<init>", "(Llu/c;)V", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "body", "", "serializeFollowUpQuestionRequestBody", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;)Ljava/lang/String;", "response", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "deserializeFollowUpQuestionResponse", "(Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "Llu/c;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateFollowUpQuestionSerializer implements FollowUpQuestionSerializer {
    private final c jsonSerialization;

    public SurvicateFollowUpQuestionSerializer(c cVar) {
        l.e(cVar, "jsonSerialization");
        this.jsonSerialization = cVar;
    }

    @Override // com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionSerializer
    public FollowUpQuestionResponse deserializeFollowUpQuestionResponse(String response) {
        l.e(response, "response");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return (FollowUpQuestionResponse) cVar.a(FollowUpQuestionResponse.INSTANCE.serializer(), response);
    }

    @Override // com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionSerializer
    public String serializeFollowUpQuestionRequestBody(FollowUpQuestionRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(FollowUpQuestionRequestBody.INSTANCE.serializer(), body);
    }
}
