package com.survicate.surveys.entities.survey.surveyLogic.matrix;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "", "(Ljava/lang/String;I)V", "IS", "IS_NOT", "IS_BETWEEN", "HAS_ANY_VALUE", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicMatrixCondition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicMatrixCondition[] $VALUES;

    @o(name = "is")
    public static final SurveyLogicMatrixCondition IS = new SurveyLogicMatrixCondition("IS", 0);

    @o(name = "is_not")
    public static final SurveyLogicMatrixCondition IS_NOT = new SurveyLogicMatrixCondition("IS_NOT", 1);

    @o(name = "is_between")
    public static final SurveyLogicMatrixCondition IS_BETWEEN = new SurveyLogicMatrixCondition("IS_BETWEEN", 2);

    @o(name = "has_any_value")
    public static final SurveyLogicMatrixCondition HAS_ANY_VALUE = new SurveyLogicMatrixCondition("HAS_ANY_VALUE", 3);

    private static final /* synthetic */ SurveyLogicMatrixCondition[] $values() {
        return new SurveyLogicMatrixCondition[]{IS, IS_NOT, IS_BETWEEN, HAS_ANY_VALUE};
    }

    static {
        SurveyLogicMatrixCondition[] surveyLogicMatrixConditionArr$values = $values();
        $VALUES = surveyLogicMatrixConditionArr$values;
        $ENTRIES = a.a.j(surveyLogicMatrixConditionArr$values);
    }

    private SurveyLogicMatrixCondition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicMatrixCondition valueOf(String str) {
        return (SurveyLogicMatrixCondition) Enum.valueOf(SurveyLogicMatrixCondition.class, str);
    }

    public static SurveyLogicMatrixCondition[] values() {
        return (SurveyLogicMatrixCondition[]) $VALUES.clone();
    }
}
