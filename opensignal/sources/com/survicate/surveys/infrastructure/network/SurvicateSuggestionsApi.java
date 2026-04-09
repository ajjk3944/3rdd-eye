package com.survicate.surveys.infrastructure.network;

import br.l;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateSuggestionsApi;", "Lcom/survicate/surveys/infrastructure/network/SuggestionsApi;", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "httpClient", "Lcom/survicate/surveys/infrastructure/network/SuggestionsRequestFactory;", "requestFactory", "<init>", "(Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;Lcom/survicate/surveys/infrastructure/network/SuggestionsRequestFactory;)V", "Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;", "requestBody", "Llq/b0;", "sendEventSuggestion", "(Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;)V", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "Lcom/survicate/surveys/infrastructure/network/SuggestionsRequestFactory;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateSuggestionsApi implements SuggestionsApi {
    private final SurvicateHttpClient httpClient;
    private final SuggestionsRequestFactory requestFactory;

    public SurvicateSuggestionsApi(SurvicateHttpClient survicateHttpClient, SuggestionsRequestFactory suggestionsRequestFactory) {
        l.e(survicateHttpClient, "httpClient");
        l.e(suggestionsRequestFactory, "requestFactory");
        this.httpClient = survicateHttpClient;
        this.requestFactory = suggestionsRequestFactory;
    }

    @Override // com.survicate.surveys.infrastructure.network.SuggestionsApi
    public void sendEventSuggestion(EventSuggestionRequestBody requestBody) throws IOException {
        l.e(requestBody, "requestBody");
        this.httpClient.loadUrlResponse(this.requestFactory.createEventSuggestionRequest(requestBody));
    }
}
