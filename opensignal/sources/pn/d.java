package pn;

import com.survicate.surveys.entities.survey.surveyLogic.matrix.SurveyLogicMatrixCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20594a;

    static {
        int[] iArr = new int[SurveyLogicMatrixCondition.values().length];
        try {
            iArr[SurveyLogicMatrixCondition.IS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicMatrixCondition.IS_NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicMatrixCondition.IS_BETWEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SurveyLogicMatrixCondition.HAS_ANY_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f20594a = iArr;
    }
}
