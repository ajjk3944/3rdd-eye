package com.survicate.surveys.entities.survey.questions.nps;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/nps/AnswerLayout;", "", "(Ljava/lang/String;I)V", "Default", "Horizontal", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnswerLayout {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnswerLayout[] $VALUES;

    @o(name = "default")
    public static final AnswerLayout Default = new AnswerLayout("Default", 0);

    @o(name = "horizontal")
    public static final AnswerLayout Horizontal = new AnswerLayout("Horizontal", 1);

    private static final /* synthetic */ AnswerLayout[] $values() {
        return new AnswerLayout[]{Default, Horizontal};
    }

    static {
        AnswerLayout[] answerLayoutArr$values = $values();
        $VALUES = answerLayoutArr$values;
        $ENTRIES = a.a.j(answerLayoutArr$values);
    }

    private AnswerLayout(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AnswerLayout valueOf(String str) {
        return (AnswerLayout) Enum.valueOf(AnswerLayout.class, str);
    }

    public static AnswerLayout[] values() {
        return (AnswerLayout[]) $VALUES.clone();
    }
}
