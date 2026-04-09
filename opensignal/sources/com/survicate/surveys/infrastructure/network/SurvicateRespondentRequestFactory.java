package com.survicate.surveys.infrastructure.network;

import br.l;
import com.survicate.surveys.infrastructure.serialization.RespondentSerializer;
import io.sentry.k;
import java.net.URI;
import kotlin.Metadata;
import po.a;
import tt.s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateRespondentRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/RespondentRequestFactory;", "Lcom/survicate/surveys/infrastructure/serialization/RespondentSerializer;", "serializer", "Lpo/a;", "urlProvider", "<init>", "(Lcom/survicate/surveys/infrastructure/serialization/RespondentSerializer;Lpo/a;)V", "", "surveyId", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "body", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "createQuestionAnsweredRequest", "(Ljava/lang/String;Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "createSurveySeenRequest", "(Ljava/lang/String;Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;", "createInstalledRequest", "(Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/serialization/RespondentSerializer;", "Lpo/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateRespondentRequestFactory implements RespondentRequestFactory {
    private final RespondentSerializer serializer;
    private final a urlProvider;

    public SurvicateRespondentRequestFactory(RespondentSerializer respondentSerializer, a aVar) {
        l.e(respondentSerializer, "serializer");
        l.e(aVar, "urlProvider");
        this.serializer = respondentSerializer;
        this.urlProvider = aVar;
    }

    @Override // com.survicate.surveys.infrastructure.network.RespondentRequestFactory
    public URLRequest createInstalledRequest(InstalledRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "workspaces/{workspaceKey}/installed.json")), URLRequest.METHOD_POST, this.serializer.serializeInstalledRequestBody(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.RespondentRequestFactory
    public URLRequest createQuestionAnsweredRequest(String surveyId, QuestionAnsweredRequestBody body) {
        l.e(surveyId, "surveyId");
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(s.l0(kVar.W((String) kVar.f12399r, "workspaces/{workspaceKey}/surveys/{surveyId}/answered_v3.json"), "{surveyId}", surveyId)), URLRequest.METHOD_POST, this.serializer.serializeQuestionAnsweredRequestBody(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.RespondentRequestFactory
    public URLRequest createSurveySeenRequest(String surveyId, SurveySeenRequestBody body) {
        l.e(surveyId, "surveyId");
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(s.l0(kVar.W((String) kVar.f12399r, "workspaces/{workspaceKey}/surveys/{surveyId}/seen.json"), "{surveyId}", surveyId)), URLRequest.METHOD_POST, this.serializer.serializeSurveySeenRequestBody(body));
    }
}
