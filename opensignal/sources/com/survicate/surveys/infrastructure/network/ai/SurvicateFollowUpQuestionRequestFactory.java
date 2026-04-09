package com.survicate.surveys.infrastructure.network.ai;

import br.l;
import com.survicate.surveys.infrastructure.network.URLRequest;
import io.sentry.k;
import java.net.URI;
import kotlin.Metadata;
import po.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/SurvicateFollowUpQuestionRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;", "serializer", "Lpo/a;", "urlProvider", "<init>", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;Lpo/a;)V", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "body", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "createFollowUpQuestionRequest", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionSerializer;", "Lpo/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateFollowUpQuestionRequestFactory implements FollowUpQuestionRequestFactory {
    private final FollowUpQuestionSerializer serializer;
    private final a urlProvider;

    public SurvicateFollowUpQuestionRequestFactory(FollowUpQuestionSerializer followUpQuestionSerializer, a aVar) {
        l.e(followUpQuestionSerializer, "serializer");
        l.e(aVar, "urlProvider");
        this.serializer = followUpQuestionSerializer;
        this.urlProvider = aVar;
    }

    @Override // com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRequestFactory
    public URLRequest createFollowUpQuestionRequest(FollowUpQuestionRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "boosted-questions/generate-questions")), URLRequest.METHOD_POST, this.serializer.serializeFollowUpQuestionRequestBody(body));
    }
}
