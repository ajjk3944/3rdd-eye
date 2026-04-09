package com.survicate.surveys.entities.survey;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerOccurrenceCountOperator;", "", "(Ljava/lang/String;I)V", "IS_EQUAL", "IS_NOT_EQUAL", "IS_GREATER_THAN", "IS_GREATER_THAN_OR_EQUAL", "IS_LESS_THAN", "IS_LESS_THAN_OR_EQUAL", "IS_BETWEEN", "IS_NOT_BETWEEN", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventTriggerOccurrenceCountOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventTriggerOccurrenceCountOperator[] $VALUES;

    @o(name = "is_equal")
    public static final EventTriggerOccurrenceCountOperator IS_EQUAL = new EventTriggerOccurrenceCountOperator("IS_EQUAL", 0);

    @o(name = "is_not_equal")
    public static final EventTriggerOccurrenceCountOperator IS_NOT_EQUAL = new EventTriggerOccurrenceCountOperator("IS_NOT_EQUAL", 1);

    @o(name = "is_greater_than")
    public static final EventTriggerOccurrenceCountOperator IS_GREATER_THAN = new EventTriggerOccurrenceCountOperator("IS_GREATER_THAN", 2);

    @o(name = "is_greater_than_or_equal")
    public static final EventTriggerOccurrenceCountOperator IS_GREATER_THAN_OR_EQUAL = new EventTriggerOccurrenceCountOperator("IS_GREATER_THAN_OR_EQUAL", 3);

    @o(name = "is_less_than")
    public static final EventTriggerOccurrenceCountOperator IS_LESS_THAN = new EventTriggerOccurrenceCountOperator("IS_LESS_THAN", 4);

    @o(name = "is_less_than_or_equal")
    public static final EventTriggerOccurrenceCountOperator IS_LESS_THAN_OR_EQUAL = new EventTriggerOccurrenceCountOperator("IS_LESS_THAN_OR_EQUAL", 5);

    @o(name = "is_between")
    public static final EventTriggerOccurrenceCountOperator IS_BETWEEN = new EventTriggerOccurrenceCountOperator("IS_BETWEEN", 6);

    @o(name = "is_not_between")
    public static final EventTriggerOccurrenceCountOperator IS_NOT_BETWEEN = new EventTriggerOccurrenceCountOperator("IS_NOT_BETWEEN", 7);

    private static final /* synthetic */ EventTriggerOccurrenceCountOperator[] $values() {
        return new EventTriggerOccurrenceCountOperator[]{IS_EQUAL, IS_NOT_EQUAL, IS_GREATER_THAN, IS_GREATER_THAN_OR_EQUAL, IS_LESS_THAN, IS_LESS_THAN_OR_EQUAL, IS_BETWEEN, IS_NOT_BETWEEN};
    }

    static {
        EventTriggerOccurrenceCountOperator[] eventTriggerOccurrenceCountOperatorArr$values = $values();
        $VALUES = eventTriggerOccurrenceCountOperatorArr$values;
        $ENTRIES = a.a.j(eventTriggerOccurrenceCountOperatorArr$values);
    }

    private EventTriggerOccurrenceCountOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static EventTriggerOccurrenceCountOperator valueOf(String str) {
        return (EventTriggerOccurrenceCountOperator) Enum.valueOf(EventTriggerOccurrenceCountOperator.class, str);
    }

    public static EventTriggerOccurrenceCountOperator[] values() {
        return (EventTriggerOccurrenceCountOperator[]) $VALUES.clone();
    }
}
