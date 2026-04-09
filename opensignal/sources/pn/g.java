package pn;

import com.survicate.surveys.entities.survey.surveyLogic.single.SurveyLogicSingleCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20597a;

    static {
        int[] iArr = new int[SurveyLogicSingleCondition.values().length];
        try {
            iArr[SurveyLogicSingleCondition.IS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicSingleCondition.IS_NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicSingleCondition.HAS_ANY_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20597a = iArr;
    }
}
