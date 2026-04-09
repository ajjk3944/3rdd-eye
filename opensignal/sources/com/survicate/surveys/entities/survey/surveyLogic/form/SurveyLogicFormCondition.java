package com.survicate.surveys.entities.survey.surveyLogic.form;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "", "(Ljava/lang/String;I)V", "IS_FILLED_IN", "IS_NOT_FILLED_IN", "HAS_ANY_VALUE", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicFormCondition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicFormCondition[] $VALUES;

    @o(name = "is_filled_in")
    public static final SurveyLogicFormCondition IS_FILLED_IN = new SurveyLogicFormCondition("IS_FILLED_IN", 0);

    @o(name = "is_not_filled_in")
    public static final SurveyLogicFormCondition IS_NOT_FILLED_IN = new SurveyLogicFormCondition("IS_NOT_FILLED_IN", 1);

    @o(name = "has_any_value")
    public static final SurveyLogicFormCondition HAS_ANY_VALUE = new SurveyLogicFormCondition("HAS_ANY_VALUE", 2);

    private static final /* synthetic */ SurveyLogicFormCondition[] $values() {
        return new SurveyLogicFormCondition[]{IS_FILLED_IN, IS_NOT_FILLED_IN, HAS_ANY_VALUE};
    }

    static {
        SurveyLogicFormCondition[] surveyLogicFormConditionArr$values = $values();
        $VALUES = surveyLogicFormConditionArr$values;
        $ENTRIES = a.a.j(surveyLogicFormConditionArr$values);
    }

    private SurveyLogicFormCondition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicFormCondition valueOf(String str) {
        return (SurveyLogicFormCondition) Enum.valueOf(SurveyLogicFormCondition.class, str);
    }

    public static SurveyLogicFormCondition[] values() {
        return (SurveyLogicFormCondition[]) $VALUES.clone();
    }
}
