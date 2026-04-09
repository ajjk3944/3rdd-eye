package pn;

import com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20596a;

    static {
        int[] iArr = new int[SurveyLogicRangeCondition.values().length];
        try {
            iArr[SurveyLogicRangeCondition.IS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicRangeCondition.IS_NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicRangeCondition.IS_BETWEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SurveyLogicRangeCondition.HAS_ANY_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f20596a = iArr;
    }
}
