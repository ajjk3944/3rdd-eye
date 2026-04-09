package com.survicate.surveys.infrastructure.serialization;

import com.survicate.surveys.entities.models.ActiveEventHistory;
import com.survicate.surveys.entities.models.RespondentEvent;
import hq.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H&¢\u0006\u0004\b\r\u0010\u0007J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\nJ#\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0005H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0002H&¢\u0006\u0004\b\u001a\u0010\u0007J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u001b\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\nJ\u001d\u0010\u001f\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H&¢\u0006\u0004\b\u001f\u0010\u0007J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\u0006\u0010 \u001a\u00020\u0005H&¢\u0006\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/SurvicateSerializer;", "", "", "Lhq/c;", "userTraits", "", "serializeTraits", "(Ljava/util/List;)Ljava/lang/String;", "serializedTraits", "deserializeUserTraits", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "answeredPoints", "serializeAnswerEvents", "serializedAnswers", "deserializeAnswerEvents", "", "", "presentationTimes", "serializePresentationTimesMap", "(Ljava/util/Map;)Ljava/lang/String;", "serializedTimes", "deserializePresentationTimesMap", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "seenEvents", "serializeSurveySeenEvents", "serializedEvents", "deserializeSurveySeenEvents", "Lcom/survicate/surveys/entities/models/ActiveEventHistory;", "eventsHistory", "serializeEventsHistory", "serializedHistory", "deserializeEventsHistory", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SurvicateSerializer {
    List<RespondentEvent.QuestionAnswered> deserializeAnswerEvents(String serializedAnswers);

    List<ActiveEventHistory> deserializeEventsHistory(String serializedHistory);

    Map<String, Long> deserializePresentationTimesMap(String serializedTimes);

    List<RespondentEvent.SurveySeen> deserializeSurveySeenEvents(String serializedEvents);

    List<c> deserializeUserTraits(String serializedTraits) throws JSONException;

    String serializeAnswerEvents(List<RespondentEvent.QuestionAnswered> answeredPoints);

    String serializeEventsHistory(List<ActiveEventHistory> eventsHistory);

    String serializePresentationTimesMap(Map<String, Long> presentationTimes);

    String serializeSurveySeenEvents(List<RespondentEvent.SurveySeen> seenEvents);

    String serializeTraits(List<? extends c> userTraits);
}
