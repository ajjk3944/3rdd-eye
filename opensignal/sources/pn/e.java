package pn;

import com.survicate.surveys.entities.survey.surveyLogic.multiple.SurveyLogicMultipleCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20595a;

    static {
        int[] iArr = new int[SurveyLogicMultipleCondition.values().length];
        try {
            iArr[SurveyLogicMultipleCondition.IS_EXACTLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicMultipleCondition.INCLUDES_ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicMultipleCondition.INCLUDES_ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SurveyLogicMultipleCondition.DOES_NOT_INCLUDE_ANY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SurveyLogicMultipleCondition.HAS_ANY_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f20595a = iArr;
    }
}
