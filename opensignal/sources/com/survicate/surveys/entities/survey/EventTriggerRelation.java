package com.survicate.surveys.entities.survey;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerRelation;", "", "(Ljava/lang/String;I)V", "AND", "OR", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventTriggerRelation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventTriggerRelation[] $VALUES;

    @o(name = "and")
    public static final EventTriggerRelation AND = new EventTriggerRelation("AND", 0);

    @o(name = "or")
    public static final EventTriggerRelation OR = new EventTriggerRelation("OR", 1);

    private static final /* synthetic */ EventTriggerRelation[] $values() {
        return new EventTriggerRelation[]{AND, OR};
    }

    static {
        EventTriggerRelation[] eventTriggerRelationArr$values = $values();
        $VALUES = eventTriggerRelationArr$values;
        $ENTRIES = a.a.j(eventTriggerRelationArr$values);
    }

    private EventTriggerRelation(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static EventTriggerRelation valueOf(String str) {
        return (EventTriggerRelation) Enum.valueOf(EventTriggerRelation.class, str);
    }

    public static EventTriggerRelation[] values() {
        return (EventTriggerRelation[]) $VALUES.clone();
    }
}
