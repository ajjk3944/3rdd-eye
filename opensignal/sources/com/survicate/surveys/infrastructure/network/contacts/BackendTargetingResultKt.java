package com.survicate.surveys.infrastructure.network.contacts;

import ao.b;
import br.l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;", "Lao/b;", "toCoreResult", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingSurveyResult;)Lao/b;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;", "Lao/a;", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingAudienceResult;)Lao/a;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackendTargetingResultKt {
    public static final b toCoreResult(BackendTargetingSurveyResult backendTargetingSurveyResult) {
        l.e(backendTargetingSurveyResult, "<this>");
        return new b(backendTargetingSurveyResult.getId(), backendTargetingSurveyResult.getCanShow(), backendTargetingSurveyResult.getCacheUntilMs());
    }

    public static final ao.a toCoreResult(BackendTargetingAudienceResult backendTargetingAudienceResult) {
        l.e(backendTargetingAudienceResult, "<this>");
        return new ao.a(backendTargetingAudienceResult.getId(), backendTargetingAudienceResult.isSatisfied(), backendTargetingAudienceResult.getCacheUntilMs());
    }
}
