package pn;

import com.survicate.surveys.entities.survey.surveyLogic.date.SurveyLogicDateCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20591a;

    static {
        int[] iArr = new int[SurveyLogicDateCondition.values().length];
        try {
            iArr[SurveyLogicDateCondition.HAS_ANY_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicDateCondition.QUESTION_IS_ANSWERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicDateCondition.QUESTION_IS_NOT_ANSWERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20591a = iArr;
    }
}
