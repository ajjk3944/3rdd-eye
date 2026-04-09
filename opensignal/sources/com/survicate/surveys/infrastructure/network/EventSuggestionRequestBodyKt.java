package com.survicate.surveys.infrastructure.network;

import br.l;
import com.survicate.surveys.entities.models.EventSuggestion;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRequestBody", "Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;", "Lcom/survicate/surveys/entities/models/EventSuggestion;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventSuggestionRequestBodyKt {
    public static final EventSuggestionRequestBody toRequestBody(EventSuggestion eventSuggestion) {
        l.e(eventSuggestion, "<this>");
        return new EventSuggestionRequestBody(eventSuggestion.getName(), eventSuggestion.getProperties());
    }
}
