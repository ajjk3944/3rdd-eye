package com.survicate.surveys.entities.models;

import br.l;
import kotlin.Metadata;
import mq.o;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"withMergedPropertiesFrom", "Lcom/survicate/surveys/entities/models/EventSuggestion;", "other", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventSuggestionKt {
    public static final EventSuggestion withMergedPropertiesFrom(EventSuggestion eventSuggestion, EventSuggestion eventSuggestion2) {
        l.e(eventSuggestion, "<this>");
        l.e(eventSuggestion2, "other");
        return EventSuggestion.copy$default(eventSuggestion, null, o.l0(o.E0(eventSuggestion.getProperties(), eventSuggestion2.getProperties())), 1, null);
    }
}
