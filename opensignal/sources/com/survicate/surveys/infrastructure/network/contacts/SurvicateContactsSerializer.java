package com.survicate.surveys.infrastructure.network.contacts;

import br.l;
import kotlin.Metadata;
import lu.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006 "}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/SurvicateContactsSerializer;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;", "Llu/c;", "jsonSerialization", "<init>", "(Llu/c;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "body", "", "serializeUserVerificationRequestBody", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;", "serializeUserAttributesRequestBody", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "serializeUserEventsRequestBody", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "serializeSurveyInteractionsRequestBody", "(Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;", "serializeBackendTargetingRequestBody", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;)Ljava/lang/String;", "response", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "deserializeBackendTargetingResult", "(Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "rawBody", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsErrorBody;", "deserializeErrorBody", "(Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsErrorBody;", "Llu/c;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateContactsSerializer implements ContactsSerializer {
    private final c jsonSerialization;

    public SurvicateContactsSerializer(c cVar) {
        l.e(cVar, "jsonSerialization");
        this.jsonSerialization = cVar;
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public BackendTargetingResult deserializeBackendTargetingResult(String response) {
        l.e(response, "response");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return (BackendTargetingResult) cVar.a(BackendTargetingResult.INSTANCE.serializer(), response);
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public ContactsErrorBody deserializeErrorBody(String rawBody) {
        l.e(rawBody, "rawBody");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return (ContactsErrorBody) cVar.a(ContactsErrorBody.INSTANCE.serializer(), rawBody);
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public String serializeBackendTargetingRequestBody(BackendTargetingRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(BackendTargetingRequestBody.INSTANCE.serializer(), body);
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public String serializeSurveyInteractionsRequestBody(SurveyInteractionsRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(SurveyInteractionsRequestBody.INSTANCE.serializer(), body);
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public String serializeUserAttributesRequestBody(UserAttributesRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(UserAttributesRequestBody.INSTANCE.serializer(), body);
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public String serializeUserEventsRequestBody(UserEventsRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(UserEventsRequestBody.INSTANCE.serializer(), body);
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsSerializer
    public String serializeUserVerificationRequestBody(UserVerificationRequestBody body) {
        l.e(body, "body");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(UserVerificationRequestBody.INSTANCE.serializer(), body);
    }
}
