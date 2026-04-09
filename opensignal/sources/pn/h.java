package pn;

import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyLogicTextCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20598a;

    static {
        int[] iArr = new int[SurveyLogicTextCondition.values().length];
        try {
            iArr[SurveyLogicTextCondition.ANSWER_CONTAINS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicTextCondition.ANSWER_DOES_NOT_CONTAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicTextCondition.QUESTION_IS_ANSWERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SurveyLogicTextCondition.QUESTION_IS_NOT_ANSWERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SurveyLogicTextCondition.HAS_ANY_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f20598a = iArr;
    }
}
