package com.survicate.surveys.entities.survey;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceTimeOperator;", "", "(Ljava/lang/String;I)V", "IS_GREATER_THAN_OR_EQUAL", "IS_LESS_THAN_OR_EQUAL", "IS_BETWEEN", "IS_NOT_BETWEEN", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventTriggerOccurrenceTimeOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventTriggerOccurrenceTimeOperator[] $VALUES;

    @o(name = "is_greater_than_or_equal")
    public static final EventTriggerOccurrenceTimeOperator IS_GREATER_THAN_OR_EQUAL = new EventTriggerOccurrenceTimeOperator("IS_GREATER_THAN_OR_EQUAL", 0);

    @o(name = "is_less_than_or_equal")
    public static final EventTriggerOccurrenceTimeOperator IS_LESS_THAN_OR_EQUAL = new EventTriggerOccurrenceTimeOperator("IS_LESS_THAN_OR_EQUAL", 1);

    @o(name = "is_between")
    public static final EventTriggerOccurrenceTimeOperator IS_BETWEEN = new EventTriggerOccurrenceTimeOperator("IS_BETWEEN", 2);

    @o(name = "is_not_between")
    public static final EventTriggerOccurrenceTimeOperator IS_NOT_BETWEEN = new EventTriggerOccurrenceTimeOperator("IS_NOT_BETWEEN", 3);

    private static final /* synthetic */ EventTriggerOccurrenceTimeOperator[] $values() {
        return new EventTriggerOccurrenceTimeOperator[]{IS_GREATER_THAN_OR_EQUAL, IS_LESS_THAN_OR_EQUAL, IS_BETWEEN, IS_NOT_BETWEEN};
    }

    static {
        EventTriggerOccurrenceTimeOperator[] eventTriggerOccurrenceTimeOperatorArr$values = $values();
        $VALUES = eventTriggerOccurrenceTimeOperatorArr$values;
        $ENTRIES = a.a.j(eventTriggerOccurrenceTimeOperatorArr$values);
    }

    private EventTriggerOccurrenceTimeOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static EventTriggerOccurrenceTimeOperator valueOf(String str) {
        return (EventTriggerOccurrenceTimeOperator) Enum.valueOf(EventTriggerOccurrenceTimeOperator.class, str);
    }

    public static EventTriggerOccurrenceTimeOperator[] values() {
        return (EventTriggerOccurrenceTimeOperator[]) $VALUES.clone();
    }
}
