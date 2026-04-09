package com.survicate.surveys.entities.survey.surveyLogic.multiple;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyLogicMultipleCondition;", "", "(Ljava/lang/String;I)V", "IS_EXACTLY", "INCLUDES_ALL", "INCLUDES_ANY", "DOES_NOT_INCLUDE_ANY", "HAS_ANY_VALUE", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicMultipleCondition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicMultipleCondition[] $VALUES;

    @o(name = "is_exactly")
    public static final SurveyLogicMultipleCondition IS_EXACTLY = new SurveyLogicMultipleCondition("IS_EXACTLY", 0);

    @o(name = "includes_all_of_the_following")
    public static final SurveyLogicMultipleCondition INCLUDES_ALL = new SurveyLogicMultipleCondition("INCLUDES_ALL", 1);

    @o(name = "includes_any_of_the_following")
    public static final SurveyLogicMultipleCondition INCLUDES_ANY = new SurveyLogicMultipleCondition("INCLUDES_ANY", 2);

    @o(name = "doesnt_include_any_of_the_following")
    public static final SurveyLogicMultipleCondition DOES_NOT_INCLUDE_ANY = new SurveyLogicMultipleCondition("DOES_NOT_INCLUDE_ANY", 3);

    @o(name = "has_any_value")
    public static final SurveyLogicMultipleCondition HAS_ANY_VALUE = new SurveyLogicMultipleCondition("HAS_ANY_VALUE", 4);

    private static final /* synthetic */ SurveyLogicMultipleCondition[] $values() {
        return new SurveyLogicMultipleCondition[]{IS_EXACTLY, INCLUDES_ALL, INCLUDES_ANY, DOES_NOT_INCLUDE_ANY, HAS_ANY_VALUE};
    }

    static {
        SurveyLogicMultipleCondition[] surveyLogicMultipleConditionArr$values = $values();
        $VALUES = surveyLogicMultipleConditionArr$values;
        $ENTRIES = a.a.j(surveyLogicMultipleConditionArr$values);
    }

    private SurveyLogicMultipleCondition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicMultipleCondition valueOf(String str) {
        return (SurveyLogicMultipleCondition) Enum.valueOf(SurveyLogicMultipleCondition.class, str);
    }

    public static SurveyLogicMultipleCondition[] values() {
        return (SurveyLogicMultipleCondition[]) $VALUES.clone();
    }
}
