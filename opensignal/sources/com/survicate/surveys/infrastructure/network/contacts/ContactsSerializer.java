package com.survicate.surveys.infrastructure.network.contacts;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;", "", "deserializeBackendTargetingResult", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "response", "", "deserializeErrorBody", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsErrorBody;", "rawBody", "serializeBackendTargetingRequestBody", "body", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;", "serializeSurveyInteractionsRequestBody", "Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "serializeUserAttributesRequestBody", "Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;", "serializeUserEventsRequestBody", "Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "serializeUserVerificationRequestBody", "Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContactsSerializer {
    BackendTargetingResult deserializeBackendTargetingResult(String response);

    ContactsErrorBody deserializeErrorBody(String rawBody);

    String serializeBackendTargetingRequestBody(BackendTargetingRequestBody body);

    String serializeSurveyInteractionsRequestBody(SurveyInteractionsRequestBody body);

    String serializeUserAttributesRequestBody(UserAttributesRequestBody body);

    String serializeUserEventsRequestBody(UserEventsRequestBody body);

    String serializeUserVerificationRequestBody(UserVerificationRequestBody body);
}
