package com.survicate.surveys.entities.survey.surveyLogic;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "", "(Ljava/lang/String;I)V", "OR", "AND", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyLogicOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyLogicOperator[] $VALUES;

    @o(name = "or")
    public static final SurveyLogicOperator OR = new SurveyLogicOperator("OR", 0);

    @o(name = "and")
    public static final SurveyLogicOperator AND = new SurveyLogicOperator("AND", 1);

    private static final /* synthetic */ SurveyLogicOperator[] $values() {
        return new SurveyLogicOperator[]{OR, AND};
    }

    static {
        SurveyLogicOperator[] surveyLogicOperatorArr$values = $values();
        $VALUES = surveyLogicOperatorArr$values;
        $ENTRIES = a.a.j(surveyLogicOperatorArr$values);
    }

    private SurveyLogicOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyLogicOperator valueOf(String str) {
        return (SurveyLogicOperator) Enum.valueOf(SurveyLogicOperator.class, str);
    }

    public static SurveyLogicOperator[] values() {
        return (SurveyLogicOperator[]) $VALUES.clone();
    }
}
