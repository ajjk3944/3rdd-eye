package com.survicate.surveys.entities.survey.surveyLogic.single;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/single/SurveyLogicSingleCondition;", "", "(Ljava/lang/String;I)V", "IS", "IS_NOT", "HAS_ANY_VALUE", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicSingleCondition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicSingleCondition[] $VALUES;

    @o(name = "is")
    public static final SurveyLogicSingleCondition IS = new SurveyLogicSingleCondition("IS", 0);

    @o(name = "is_not")
    public static final SurveyLogicSingleCondition IS_NOT = new SurveyLogicSingleCondition("IS_NOT", 1);

    @o(name = "has_any_value")
    public static final SurveyLogicSingleCondition HAS_ANY_VALUE = new SurveyLogicSingleCondition("HAS_ANY_VALUE", 2);

    private static final /* synthetic */ SurveyLogicSingleCondition[] $values() {
        return new SurveyLogicSingleCondition[]{IS, IS_NOT, HAS_ANY_VALUE};
    }

    static {
        SurveyLogicSingleCondition[] surveyLogicSingleConditionArr$values = $values();
        $VALUES = surveyLogicSingleConditionArr$values;
        $ENTRIES = a.a.j(surveyLogicSingleConditionArr$values);
    }

    private SurveyLogicSingleCondition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicSingleCondition valueOf(String str) {
        return (SurveyLogicSingleCondition) Enum.valueOf(SurveyLogicSingleCondition.class, str);
    }

    public static SurveyLogicSingleCondition[] values() {
        return (SurveyLogicSingleCondition[]) $VALUES.clone();
    }
}
