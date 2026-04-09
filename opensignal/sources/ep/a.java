package ep;

import com.survicate.surveys.entities.survey.SurveyAnswerType;
import com.survicate.surveys.entities.survey.theme.ThemeType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8246a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8247b;

    static {
        int[] iArr = new int[SurveyAnswerType.values().length];
        try {
            iArr[SurveyAnswerType.BUTTON_NEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyAnswerType.BUTTON_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyAnswerType.BUTTON_CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SurveyAnswerType.SINGLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SurveyAnswerType.MULTIPLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SurveyAnswerType.MATRIX.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SurveyAnswerType.TEXT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SurveyAnswerType.DATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SurveyAnswerType.SMILEY_SCALE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SurveyAnswerType.NPS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[SurveyAnswerType.SHAPE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[SurveyAnswerType.NUMERICAL.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[SurveyAnswerType.CSAT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[SurveyAnswerType.FORM.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        f8246a = iArr;
        int[] iArr2 = new int[ThemeType.values().length];
        try {
            iArr2[ThemeType.MICRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        f8247b = iArr2;
    }
}
