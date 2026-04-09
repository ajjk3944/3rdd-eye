package com.survicate.surveys.infrastructure.network.contacts;

import ah.d;
import br.l;
import com.survicate.surveys.infrastructure.network.HttpException;
import com.survicate.surveys.infrastructure.network.SurvicateHttpClient;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(¨\u0006)"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/SurvicateContactsApi;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApi;", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "httpClient", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsRequestFactory;", "requestFactory", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;", "serializer", "<init>", "(Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsRequestFactory;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;)V", "T", "Lkotlin/Function0;", "block", "runMappingException", "(Lar/a;)Ljava/lang/Object;", "Lcom/survicate/surveys/infrastructure/network/HttpException;", "exception", "", "parseErrorMessage", "(Lcom/survicate/surveys/infrastructure/network/HttpException;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "requestBody", "Llq/b0;", "verifyUser", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;", "sendUserAttributes", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserAttributesRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "sendUserEvents", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "sendSurveyInteractions", "(Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;", "Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "checkBackendTargeting", "(Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingRequestBody;)Lcom/survicate/surveys/infrastructure/network/contacts/BackendTargetingResult;", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsSerializer;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateContactsApi implements ContactsApi {
    private final SurvicateHttpClient httpClient;
    private final ContactsRequestFactory requestFactory;
    private final ContactsSerializer serializer;

    public SurvicateContactsApi(SurvicateHttpClient survicateHttpClient, ContactsRequestFactory contactsRequestFactory, ContactsSerializer contactsSerializer) {
        l.e(survicateHttpClient, "httpClient");
        l.e(contactsRequestFactory, "requestFactory");
        l.e(contactsSerializer, "serializer");
        this.httpClient = survicateHttpClient;
        this.requestFactory = contactsRequestFactory;
        this.serializer = contactsSerializer;
    }

    private final String parseErrorMessage(HttpException exception) {
        String errorBody = exception.getErrorBody();
        if (errorBody == null) {
            return "";
        }
        try {
            return this.serializer.deserializeErrorBody(errorBody).getMessage();
        } catch (Exception unused) {
            return "";
        }
    }

    private final <T> T runMappingException(ar.a block) throws ContactsHttpException {
        try {
            return (T) block.c();
        } catch (HttpException e4) {
            throw new ContactsHttpException(e4.getResponseCode(), parseErrorMessage(e4));
        }
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsApi
    public BackendTargetingResult checkBackendTargeting(BackendTargetingRequestBody requestBody) {
        l.e(requestBody, "requestBody");
        return (BackendTargetingResult) runMappingException(new d(this, 3, requestBody));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsApi
    public void sendSurveyInteractions(SurveyInteractionsRequestBody requestBody) throws ContactsHttpException {
        l.e(requestBody, "requestBody");
        runMappingException(new d(this, 4, requestBody));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsApi
    public void sendUserAttributes(UserAttributesRequestBody requestBody) throws ContactsHttpException {
        l.e(requestBody, "requestBody");
        runMappingException(new d(this, 5, requestBody));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsApi
    public void sendUserEvents(UserEventsRequestBody requestBody) throws ContactsHttpException {
        l.e(requestBody, "requestBody");
        runMappingException(new d(this, 6, requestBody));
    }

    @Override // com.survicate.surveys.infrastructure.network.contacts.ContactsApi
    public void verifyUser(UserVerificationRequestBody requestBody) throws ContactsHttpException {
        l.e(requestBody, "requestBody");
        runMappingException(new d(this, 7, requestBody));
    }
}
