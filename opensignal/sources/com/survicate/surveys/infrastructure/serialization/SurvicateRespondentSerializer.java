package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.infrastructure.network.InstalledRequestBody;
import com.survicate.surveys.infrastructure.network.QuestionAnsweredRequestBody;
import com.survicate.surveys.infrastructure.network.SurveySeenRequestBody;
import kotlin.Metadata;
import lu.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/SurvicateRespondentSerializer;", "Lcom/survicate/surveys/infrastructure/serialization/RespondentSerializer;", "Llu/c;", "jsonSerialization", "<init>", "(Llu/c;)V", "Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;", "body", "", "serializeInstalledRequestBody", "(Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "serializeSurveySeenRequestBody", "(Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "serializeQuestionAnsweredRequestBody", "(Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;)Ljava/lang/String;", "Llu/c;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateRespondentSerializer implements RespondentSerializer {
    private final c jsonSerialization;

    public SurvicateRespondentSerializer(c cVar) {
        l.e(cVar, "jsonSerialization");
        this.jsonSerialization = cVar;
    }

    @Override // com.survicate.surveys.infrastructure.serialization.RespondentSerializer
    public String serializeInstalledRequestBody(InstalledRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(InstalledRequestBody.INSTANCE.serializer(), body);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.RespondentSerializer
    public String serializeQuestionAnsweredRequestBody(QuestionAnsweredRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(QuestionAnsweredRequestBody.INSTANCE.serializer(), body);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.RespondentSerializer
    public String serializeSurveySeenRequestBody(SurveySeenRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(SurveySeenRequestBody.INSTANCE.serializer(), body);
    }
}
