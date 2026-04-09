package com.survicate.surveys.entities.survey;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/survicate/surveys/entities/survey/EventTriggerPropertyOperator;", "", "(Ljava/lang/String;I)V", "IS_EQUAL", "IS_NOT_EQUAL", "CONTAINS", "DOES_NOT_CONTAIN", "EXISTS", "DOES_NOT_EXIST", "ANY", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventTriggerPropertyOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventTriggerPropertyOperator[] $VALUES;

    @o(name = "is_equal")
    public static final EventTriggerPropertyOperator IS_EQUAL = new EventTriggerPropertyOperator("IS_EQUAL", 0);

    @o(name = "is_not_equal")
    public static final EventTriggerPropertyOperator IS_NOT_EQUAL = new EventTriggerPropertyOperator("IS_NOT_EQUAL", 1);

    @o(name = "contains")
    public static final EventTriggerPropertyOperator CONTAINS = new EventTriggerPropertyOperator("CONTAINS", 2);

    @o(name = "does_not_contain")
    public static final EventTriggerPropertyOperator DOES_NOT_CONTAIN = new EventTriggerPropertyOperator("DOES_NOT_CONTAIN", 3);

    @o(name = "exists")
    public static final EventTriggerPropertyOperator EXISTS = new EventTriggerPropertyOperator("EXISTS", 4);

    @o(name = "does_not_exist")
    public static final EventTriggerPropertyOperator DOES_NOT_EXIST = new EventTriggerPropertyOperator("DOES_NOT_EXIST", 5);

    @o(name = "any")
    public static final EventTriggerPropertyOperator ANY = new EventTriggerPropertyOperator("ANY", 6);

    private static final /* synthetic */ EventTriggerPropertyOperator[] $values() {
        return new EventTriggerPropertyOperator[]{IS_EQUAL, IS_NOT_EQUAL, CONTAINS, DOES_NOT_CONTAIN, EXISTS, DOES_NOT_EXIST, ANY};
    }

    static {
        EventTriggerPropertyOperator[] eventTriggerPropertyOperatorArr$values = $values();
        $VALUES = eventTriggerPropertyOperatorArr$values;
        $ENTRIES = a.a.j(eventTriggerPropertyOperatorArr$values);
    }

    private EventTriggerPropertyOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static EventTriggerPropertyOperator valueOf(String str) {
        return (EventTriggerPropertyOperator) Enum.valueOf(EventTriggerPropertyOperator.class, str);
    }

    public static EventTriggerPropertyOperator[] values() {
        return (EventTriggerPropertyOperator[]) $VALUES.clone();
    }
}
