package qn;

import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.date.SurveyLogicDateCondition;
import com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormCondition;
import com.survicate.surveys.entities.survey.surveyLogic.multiple.SurveyLogicMultipleCondition;
import com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition;
import com.survicate.surveys.entities.survey.surveyLogic.single.SurveyLogicSingleCondition;
import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyLogicTextCondition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20939a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20940b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f20941c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f20942d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f20943e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int[] f20944f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f20945g;

    static {
        int[] iArr = new int[SurveyLogicOperator.values().length];
        try {
            iArr[SurveyLogicOperator.OR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyLogicOperator.AND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20939a = iArr;
        int[] iArr2 = new int[SurveyLogicTextCondition.values().length];
        try {
            iArr2[SurveyLogicTextCondition.ANSWER_CONTAINS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SurveyLogicTextCondition.ANSWER_DOES_NOT_CONTAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SurveyLogicTextCondition.QUESTION_IS_ANSWERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SurveyLogicTextCondition.QUESTION_IS_NOT_ANSWERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SurveyLogicTextCondition.HAS_ANY_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f20940b = iArr2;
        int[] iArr3 = new int[SurveyLogicDateCondition.values().length];
        try {
            iArr3[SurveyLogicDateCondition.QUESTION_IS_ANSWERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[SurveyLogicDateCondition.QUESTION_IS_NOT_ANSWERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[SurveyLogicDateCondition.HAS_ANY_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f20941c = iArr3;
        int[] iArr4 = new int[SurveyLogicRangeCondition.values().length];
        try {
            iArr4[SurveyLogicRangeCondition.IS.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[SurveyLogicRangeCondition.IS_NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[SurveyLogicRangeCondition.IS_BETWEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[SurveyLogicRangeCondition.HAS_ANY_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        f20942d = iArr4;
        int[] iArr5 = new int[SurveyLogicSingleCondition.values().length];
        try {
            iArr5[SurveyLogicSingleCondition.IS.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[SurveyLogicSingleCondition.IS_NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[SurveyLogicSingleCondition.HAS_ANY_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        f20943e = iArr5;
        int[] iArr6 = new int[SurveyLogicMultipleCondition.values().length];
        try {
            iArr6[SurveyLogicMultipleCondition.IS_EXACTLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[SurveyLogicMultipleCondition.INCLUDES_ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[SurveyLogicMultipleCondition.INCLUDES_ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[SurveyLogicMultipleCondition.DOES_NOT_INCLUDE_ANY.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[SurveyLogicMultipleCondition.HAS_ANY_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        f20944f = iArr6;
        int[] iArr7 = new int[SurveyLogicFormCondition.values().length];
        try {
            iArr7[SurveyLogicFormCondition.IS_FILLED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr7[SurveyLogicFormCondition.IS_NOT_FILLED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr7[SurveyLogicFormCondition.HAS_ANY_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        f20945g = iArr7;
    }
}
