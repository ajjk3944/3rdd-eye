package com.survicate.surveys.infrastructure.network.contacts;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApi;", "", "Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "requestBody", "Llq/b0;", "verifyUser", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;", "sendUserAttributes", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "sendUserEvents", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "sendSurveyInteractions", "(Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "checkBackendTargeting", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;)Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContactsApi {
    public static final int ATTRIBUTES_CHUNK_SIZE = 100;
    public static final int CHAR_LIMIT = 255;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int EVENTS_CHUNK_SIZE = 100;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApi$Companion;", "", "()V", "ATTRIBUTES_CHUNK_SIZE", "", "CHAR_LIMIT", "EVENTS_CHUNK_SIZE", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ATTRIBUTES_CHUNK_SIZE = 100;
        public static final int CHAR_LIMIT = 255;
        public static final int EVENTS_CHUNK_SIZE = 100;

        private Companion() {
        }
    }

    BackendTargetingResult checkBackendTargeting(BackendTargetingRequestBody requestBody) throws IOException;

    void sendSurveyInteractions(SurveyInteractionsRequestBody requestBody) throws IOException;

    void sendUserAttributes(UserAttributesRequestBody requestBody) throws IOException;

    void sendUserEvents(UserEventsRequestBody requestBody) throws IOException;

    void verifyUser(UserVerificationRequestBody requestBody) throws IOException;
}
