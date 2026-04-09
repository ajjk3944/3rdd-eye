package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.models.ActiveEventHistory;
import com.survicate.surveys.entities.models.RespondentEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ku.c1;
import ku.g0;
import ku.k0;
import lu.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xu.d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J#\u0010\u001b\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000bH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\u0006\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u0012J\u001d\u0010'\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000bH\u0016¢\u0006\u0004\b'\u0010\u000fJ\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u000b2\u0006\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*¨\u0006+"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/SurvicateJsonSerializer;", "Lcom/survicate/surveys/infrastructure/serialization/SurvicateSerializer;", "Llu/c;", "jsonSerialization", "<init>", "(Llu/c;)V", "Lorg/json/JSONObject;", "rawTrait", "Lhq/c;", "tryParseUserTrait", "(Lorg/json/JSONObject;)Lhq/c;", "", "userTraits", "", "serializeTraits", "(Ljava/util/List;)Ljava/lang/String;", "serializedTraits", "deserializeUserTraits", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/survicate/surveys/entities/models/RespondentEvent$QuestionAnswered;", "answeredPoints", "serializeAnswerEvents", "serializedAnswers", "deserializeAnswerEvents", "", "", "presentationTimes", "serializePresentationTimesMap", "(Ljava/util/Map;)Ljava/lang/String;", "serializedTimes", "deserializePresentationTimesMap", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "seenEvents", "serializeSurveySeenEvents", "serializedEvents", "deserializeSurveySeenEvents", "Lcom/survicate/surveys/entities/models/ActiveEventHistory;", "eventsHistory", "serializeEventsHistory", "serializedHistory", "deserializeEventsHistory", "Llu/c;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateJsonSerializer implements SurvicateSerializer {
    private final c jsonSerialization;

    public SurvicateJsonSerializer(c cVar) {
        l.e(cVar, "jsonSerialization");
        this.jsonSerialization = cVar;
    }

    private final hq.c tryParseUserTrait(JSONObject rawTrait) throws JSONException {
        try {
            String string = rawTrait.getString("key");
            l.d(string, "getString(...)");
            String string2 = rawTrait.isNull("value") ? null : rawTrait.getString("value");
            Long lValueOf = rawTrait.isNull("timestamp_ms") ? null : Long.valueOf(rawTrait.getLong("timestamp_ms"));
            Long lValueOf2 = rawTrait.isNull("throttled_to_ms") ? null : Long.valueOf(rawTrait.getLong("throttled_to_ms"));
            hq.c cVar = new hq.c(string, string2);
            cVar.e(lValueOf);
            cVar.d(lValueOf2);
            return cVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public List<RespondentEvent.QuestionAnswered> deserializeAnswerEvents(String serializedAnswers) {
        l.e(serializedAnswers, "serializedAnswers");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return (List) cVar.a(new ku.c(RespondentEvent.QuestionAnswered.INSTANCE.serializer()), serializedAnswers);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public List<ActiveEventHistory> deserializeEventsHistory(String serializedHistory) {
        l.e(serializedHistory, "serializedHistory");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return (List) cVar.a(new ku.c(ActiveEventHistory.INSTANCE.serializer()), serializedHistory);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public Map<String, Long> deserializePresentationTimesMap(String serializedTimes) {
        l.e(serializedTimes, "serializedTimes");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        c1 c1Var = c1.f14534a;
        return (Map) cVar.a(new g0(d.F(k0.f14571a)), serializedTimes);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public List<RespondentEvent.SurveySeen> deserializeSurveySeenEvents(String serializedEvents) {
        l.e(serializedEvents, "serializedEvents");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return (List) cVar.a(new ku.c(RespondentEvent.SurveySeen.INSTANCE.serializer()), serializedEvents);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public List<hq.c> deserializeUserTraits(String serializedTraits) throws JSONException {
        l.e(serializedTraits, "serializedTraits");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(serializedTraits);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            l.b(jSONObject);
            hq.c cVarTryParseUserTrait = tryParseUserTrait(jSONObject);
            if (cVarTryParseUserTrait != null) {
                arrayList.add(cVarTryParseUserTrait);
            }
        }
        return arrayList;
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public String serializeAnswerEvents(List<RespondentEvent.QuestionAnswered> answeredPoints) {
        l.e(answeredPoints, "answeredPoints");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(new ku.c(RespondentEvent.QuestionAnswered.INSTANCE.serializer()), answeredPoints);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public String serializeEventsHistory(List<ActiveEventHistory> eventsHistory) {
        l.e(eventsHistory, "eventsHistory");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(new ku.c(ActiveEventHistory.INSTANCE.serializer()), eventsHistory);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public String serializePresentationTimesMap(Map<String, Long> presentationTimes) {
        l.e(presentationTimes, "presentationTimes");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        c1 c1Var = c1.f14534a;
        return cVar.b(new g0(k0.f14571a), presentationTimes);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public String serializeSurveySeenEvents(List<RespondentEvent.SurveySeen> seenEvents) {
        l.e(seenEvents, "seenEvents");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(new ku.c(RespondentEvent.SurveySeen.INSTANCE.serializer()), seenEvents);
    }

    @Override // com.survicate.surveys.infrastructure.serialization.SurvicateSerializer
    public String serializeTraits(List<? extends hq.c> userTraits) {
        l.e(userTraits, "userTraits");
        c cVar = this.jsonSerialization;
        cVar.getClass();
        return cVar.b(new ku.c(hq.c.Companion.serializer()), userTraits);
    }
}
