package pn;

import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20592a;

    static {
        int[] iArr = new int[SurveyLogicOperator.values().length];
        try {
            iArr[SurveyLogicOperator.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicOperator.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20592a = iArr;
    }
}
