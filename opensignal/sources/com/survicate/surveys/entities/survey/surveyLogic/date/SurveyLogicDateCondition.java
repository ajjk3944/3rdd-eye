package com.survicate.surveys.entities.survey.surveyLogic.date;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/date/SurveyLogicDateCondition;", "", "(Ljava/lang/String;I)V", "HAS_ANY_VALUE", "QUESTION_IS_ANSWERED", "QUESTION_IS_NOT_ANSWERED", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicDateCondition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicDateCondition[] $VALUES;

    @o(name = "has_any_value")
    public static final SurveyLogicDateCondition HAS_ANY_VALUE = new SurveyLogicDateCondition("HAS_ANY_VALUE", 0);

    @o(name = "question_is_answered")
    public static final SurveyLogicDateCondition QUESTION_IS_ANSWERED = new SurveyLogicDateCondition("QUESTION_IS_ANSWERED", 1);

    @o(name = "question_is_not_answered")
    public static final SurveyLogicDateCondition QUESTION_IS_NOT_ANSWERED = new SurveyLogicDateCondition("QUESTION_IS_NOT_ANSWERED", 2);

    private static final /* synthetic */ SurveyLogicDateCondition[] $values() {
        return new SurveyLogicDateCondition[]{HAS_ANY_VALUE, QUESTION_IS_ANSWERED, QUESTION_IS_NOT_ANSWERED};
    }

    static {
        SurveyLogicDateCondition[] surveyLogicDateConditionArr$values = $values();
        $VALUES = surveyLogicDateConditionArr$values;
        $ENTRIES = a.a.j(surveyLogicDateConditionArr$values);
    }

    private SurveyLogicDateCondition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicDateCondition valueOf(String str) {
        return (SurveyLogicDateCondition) Enum.valueOf(SurveyLogicDateCondition.class, str);
    }

    public static SurveyLogicDateCondition[] values() {
        return (SurveyLogicDateCondition[]) $VALUES.clone();
    }
}
