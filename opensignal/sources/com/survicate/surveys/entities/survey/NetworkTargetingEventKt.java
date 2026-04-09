package com.survicate.surveys.entities.survey;

import br.l;
import com.survicate.surveys.entities.models.EventSuggestion;
import java.util.List;
import kotlin.Metadata;
import mq.w;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEventSuggestion", "Lcom/survicate/surveys/entities/models/EventSuggestion;", "Lcom/survicate/surveys/entities/survey/NetworkTargetingEvent;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkTargetingEventKt {
    public static final EventSuggestion toEventSuggestion(NetworkTargetingEvent networkTargetingEvent) {
        l.e(networkTargetingEvent, "<this>");
        String name = networkTargetingEvent.getName();
        List<String> properties = networkTargetingEvent.getProperties();
        if (properties == null) {
            properties = w.f16945a;
        }
        return new EventSuggestion(name, properties);
    }
}
