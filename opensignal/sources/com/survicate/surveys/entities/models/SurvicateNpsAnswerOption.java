package com.survicate.surveys.entities.models;

import br.g;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/survicate/surveys/entities/models/SurvicateNpsAnswerOption;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateNpsAnswerOption {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ SurvicateNpsAnswerOption[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final SurvicateNpsAnswerOption Zero = new SurvicateNpsAnswerOption("Zero", 0, 0);
    public static final SurvicateNpsAnswerOption One = new SurvicateNpsAnswerOption("One", 1, 1);
    public static final SurvicateNpsAnswerOption Two = new SurvicateNpsAnswerOption("Two", 2, 2);
    public static final SurvicateNpsAnswerOption Three = new SurvicateNpsAnswerOption("Three", 3, 3);
    public static final SurvicateNpsAnswerOption Four = new SurvicateNpsAnswerOption("Four", 4, 4);
    public static final SurvicateNpsAnswerOption Five = new SurvicateNpsAnswerOption("Five", 5, 5);
    public static final SurvicateNpsAnswerOption Six = new SurvicateNpsAnswerOption("Six", 6, 6);
    public static final SurvicateNpsAnswerOption Seven = new SurvicateNpsAnswerOption("Seven", 7, 7);
    public static final SurvicateNpsAnswerOption Eight = new SurvicateNpsAnswerOption("Eight", 8, 8);
    public static final SurvicateNpsAnswerOption Nine = new SurvicateNpsAnswerOption("Nine", 9, 9);
    public static final SurvicateNpsAnswerOption Ten = new SurvicateNpsAnswerOption("Ten", 10, 10);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/survicate/surveys/entities/models/SurvicateNpsAnswerOption$Companion;", "", "()V", "getPortraitHorizontalAnswers", "", "Lcom/survicate/surveys/entities/models/SurvicateNpsAnswerOption;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final List<SurvicateNpsAnswerOption> getPortraitHorizontalAnswers() {
            return e5.I(SurvicateNpsAnswerOption.Zero, SurvicateNpsAnswerOption.Six, SurvicateNpsAnswerOption.One, SurvicateNpsAnswerOption.Seven, SurvicateNpsAnswerOption.Two, SurvicateNpsAnswerOption.Eight, SurvicateNpsAnswerOption.Three, SurvicateNpsAnswerOption.Nine, SurvicateNpsAnswerOption.Four, SurvicateNpsAnswerOption.Ten, SurvicateNpsAnswerOption.Five);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SurvicateNpsAnswerOption[] $values() {
        return new SurvicateNpsAnswerOption[]{Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten};
    }

    static {
        SurvicateNpsAnswerOption[] survicateNpsAnswerOptionArr$values = $values();
        $VALUES = survicateNpsAnswerOptionArr$values;
        $ENTRIES = a.a.j(survicateNpsAnswerOptionArr$values);
        INSTANCE = new Companion(null);
    }

    private SurvicateNpsAnswerOption(String str, int i10, int i11) {
        this.value = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static SurvicateNpsAnswerOption valueOf(String str) {
        return (SurvicateNpsAnswerOption) Enum.valueOf(SurvicateNpsAnswerOption.class, str);
    }

    public static SurvicateNpsAnswerOption[] values() {
        return (SurvicateNpsAnswerOption[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
