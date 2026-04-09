package pn;

import com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20593a;

    static {
        int[] iArr = new int[SurveyLogicFormCondition.values().length];
        try {
            iArr[SurveyLogicFormCondition.IS_FILLED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicFormCondition.IS_NOT_FILLED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyLogicFormCondition.HAS_ANY_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20593a = iArr;
    }
}
