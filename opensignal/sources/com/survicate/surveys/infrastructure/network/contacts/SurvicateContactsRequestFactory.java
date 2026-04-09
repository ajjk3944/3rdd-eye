package com.survicate.surveys.infrastructure.network.contacts;

import br.l;
import com.survicate.surveys.infrastructure.network.URLRequest;
import io.sentry.k;
import java.net.URI;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/SurvicateContactsRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsRequestFactory;", "Lpo/a;", "urlProvider", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;", "contactsSerializer", "<init>", "(Lpo/a;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "body", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "createUserVerificationRequest", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;", "createUserAttributesRequest", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "createUserEventsRequest", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "createSurveyInteractionsRequest", "(Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;", "createBackendTargetingRequest", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lpo/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateContactsRequestFactory implements ContactsRequestFactory {
    private final ContactsSerializer contactsSerializer;
    private final po.a urlProvider;

    public SurvicateContactsRequestFactory(po.a aVar, ContactsSerializer contactsSerializer) {
        l.e(aVar, "urlProvider");
        l.e(contactsSerializer, "contactsSerializer");
        this.urlProvider = aVar;
        this.contactsSerializer = contactsSerializer;
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsRequestFactory
    public URLRequest createBackendTargetingRequest(BackendTargetingRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "contacts/workspaces/{workspaceKey}/targeting")), URLRequest.METHOD_POST, this.contactsSerializer.serializeBackendTargetingRequestBody(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsRequestFactory
    public URLRequest createSurveyInteractionsRequest(SurveyInteractionsRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "contacts/workspaces/{workspaceKey}/survey_interactions")), URLRequest.METHOD_POST, this.contactsSerializer.serializeSurveyInteractionsRequestBody(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsRequestFactory
    public URLRequest createUserAttributesRequest(UserAttributesRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "contacts/workspaces/{workspaceKey}/user_attributes")), URLRequest.METHOD_POST, this.contactsSerializer.serializeUserAttributesRequestBody(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsRequestFactory
    public URLRequest createUserEventsRequest(UserEventsRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "contacts/workspaces/{workspaceKey}/user_events")), URLRequest.METHOD_POST, this.contactsSerializer.serializeUserEventsRequestBody(body));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsRequestFactory
    public URLRequest createUserVerificationRequest(UserVerificationRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "contacts/workspaces/{workspaceKey}/verify_user")), URLRequest.METHOD_POST, this.contactsSerializer.serializeUserVerificationRequestBody(body));
    }
}
