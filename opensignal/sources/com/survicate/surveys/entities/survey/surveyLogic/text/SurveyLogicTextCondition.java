package com.survicate.surveys.entities.survey.surveyLogic.text;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyLogicTextCondition;", "", "(Ljava/lang/String;I)V", "ANSWER_CONTAINS", "ANSWER_DOES_NOT_CONTAIN", "QUESTION_IS_ANSWERED", "QUESTION_IS_NOT_ANSWERED", "HAS_ANY_VALUE", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicTextCondition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicTextCondition[] $VALUES;

    @o(name = "answer_contains")
    public static final SurveyLogicTextCondition ANSWER_CONTAINS = new SurveyLogicTextCondition("ANSWER_CONTAINS", 0);

    @o(name = "answer_doesnt_contain")
    public static final SurveyLogicTextCondition ANSWER_DOES_NOT_CONTAIN = new SurveyLogicTextCondition("ANSWER_DOES_NOT_CONTAIN", 1);

    @o(name = "question_is_answered")
    public static final SurveyLogicTextCondition QUESTION_IS_ANSWERED = new SurveyLogicTextCondition("QUESTION_IS_ANSWERED", 2);

    @o(name = "question_is_not_answered")
    public static final SurveyLogicTextCondition QUESTION_IS_NOT_ANSWERED = new SurveyLogicTextCondition("QUESTION_IS_NOT_ANSWERED", 3);

    @o(name = "has_any_value")
    public static final SurveyLogicTextCondition HAS_ANY_VALUE = new SurveyLogicTextCondition("HAS_ANY_VALUE", 4);

    private static final /* synthetic */ SurveyLogicTextCondition[] $values() {
        return new SurveyLogicTextCondition[]{ANSWER_CONTAINS, ANSWER_DOES_NOT_CONTAIN, QUESTION_IS_ANSWERED, QUESTION_IS_NOT_ANSWERED, HAS_ANY_VALUE};
    }

    static {
        SurveyLogicTextCondition[] surveyLogicTextConditionArr$values = $values();
        $VALUES = surveyLogicTextConditionArr$values;
        $ENTRIES = a.a.j(surveyLogicTextConditionArr$values);
    }

    private SurveyLogicTextCondition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicTextCondition valueOf(String str) {
        return (SurveyLogicTextCondition) Enum.valueOf(SurveyLogicTextCondition.class, str);
    }

    public static SurveyLogicTextCondition[] values() {
        return (SurveyLogicTextCondition[]) $VALUES.clone();
    }
}
