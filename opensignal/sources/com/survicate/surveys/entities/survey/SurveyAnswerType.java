package com.survicate.surveys.entities.survey;

import br.g;
import br.l;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "SMILEY_SCALE", "SINGLE", "MULTIPLE", "TEXT", "DATE", "CSAT", "NUMERICAL", "SHAPE", "MATRIX", "NPS", "FORM", "BUTTON_NEXT", "BUTTON_CLOSE", "BUTTON_LINK", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyAnswerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SurveyAnswerType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String key;

    @o(name = "smiley_scale")
    public static final SurveyAnswerType SMILEY_SCALE = new SurveyAnswerType("SMILEY_SCALE", 0, "smiley_scale");

    @o(name = "single")
    public static final SurveyAnswerType SINGLE = new SurveyAnswerType("SINGLE", 1, "single");

    @o(name = "multiple")
    public static final SurveyAnswerType MULTIPLE = new SurveyAnswerType("MULTIPLE", 2, "multiple");

    @o(name = "text")
    public static final SurveyAnswerType TEXT = new SurveyAnswerType("TEXT", 3, "text");

    @o(name = "date")
    public static final SurveyAnswerType DATE = new SurveyAnswerType("DATE", 4, "date");

    @o(name = "csat")
    public static final SurveyAnswerType CSAT = new SurveyAnswerType("CSAT", 5, "csat");

    @o(name = "numerical_scale")
    public static final SurveyAnswerType NUMERICAL = new SurveyAnswerType("NUMERICAL", 6, "numerical_scale");

    @o(name = "rating")
    public static final SurveyAnswerType SHAPE = new SurveyAnswerType("SHAPE", 7, "rating");

    @o(name = "matrix")
    public static final SurveyAnswerType MATRIX = new SurveyAnswerType("MATRIX", 8, "matrix");

    @o(name = "nps")
    public static final SurveyAnswerType NPS = new SurveyAnswerType("NPS", 9, "nps");

    @o(name = "form")
    public static final SurveyAnswerType FORM = new SurveyAnswerType("FORM", 10, "form");

    @o(name = "button_next")
    public static final SurveyAnswerType BUTTON_NEXT = new SurveyAnswerType("BUTTON_NEXT", 11, "button_next");

    @o(name = "button_close")
    public static final SurveyAnswerType BUTTON_CLOSE = new SurveyAnswerType("BUTTON_CLOSE", 12, "button_close");

    @o(name = "button_link")
    public static final SurveyAnswerType BUTTON_LINK = new SurveyAnswerType("BUTTON_LINK", 13, "button_link");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/survey/SurveyAnswerType$Companion;", "", "()V", "fromString", "Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "typeString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SurveyAnswerType fromString(String typeString) {
            Object next;
            l.e(typeString, "typeString");
            Iterator<E> it = SurveyAnswerType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String key = ((SurveyAnswerType) next).getKey();
                Locale locale = Locale.US;
                l.d(locale, "US");
                String lowerCase = key.toLowerCase(locale);
                l.d(lowerCase, "toLowerCase(...)");
                l.d(locale, "US");
                String lowerCase2 = typeString.toLowerCase(locale);
                l.d(lowerCase2, "toLowerCase(...)");
                if (lowerCase.equals(lowerCase2)) {
                    break;
                }
            }
            return (SurveyAnswerType) next;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SurveyAnswerType[] $values() {
        return new SurveyAnswerType[]{SMILEY_SCALE, SINGLE, MULTIPLE, TEXT, DATE, CSAT, NUMERICAL, SHAPE, MATRIX, NPS, FORM, BUTTON_NEXT, BUTTON_CLOSE, BUTTON_LINK};
    }

    static {
        SurveyAnswerType[] surveyAnswerTypeArr$values = $values();
        $VALUES = surveyAnswerTypeArr$values;
        $ENTRIES = a.a.j(surveyAnswerTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private SurveyAnswerType(String str, int i10, String str2) {
        this.key = str2;
    }

    public static final SurveyAnswerType fromString(String str) {
        return INSTANCE.fromString(str);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SurveyAnswerType valueOf(String str) {
        return (SurveyAnswerType) Enum.valueOf(SurveyAnswerType.class, str);
    }

    public static SurveyAnswerType[] values() {
        return (SurveyAnswerType[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
