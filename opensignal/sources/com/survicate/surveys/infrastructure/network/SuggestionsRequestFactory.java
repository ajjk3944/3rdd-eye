package com.survicate.surveys.infrastructure.network;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SuggestionsRequestFactory;", "", "createEventSuggestionRequest", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "body", "Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SuggestionsRequestFactory {
    URLRequest createEventSuggestionRequest(EventSuggestionRequestBody body);
}
