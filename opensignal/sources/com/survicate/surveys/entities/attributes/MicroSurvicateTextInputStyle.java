package com.survicate.surveys.entities.attributes;

import br.g;
import java.util.Iterator;
import kotlin.Metadata;
import on.p;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/survicate/surveys/entities/attributes/MicroSurvicateTextInputStyle;", "", "id", "", "height", "singleLine", "", "(Ljava/lang/String;IILjava/lang/Integer;Z)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "getSingleLine", "()Z", "TEXT_ANSWER", "FORM", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurvicateTextInputStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MicroSurvicateTextInputStyle[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final Integer height;
    private final int id;
    private final boolean singleLine;
    public static final MicroSurvicateTextInputStyle TEXT_ANSWER = new MicroSurvicateTextInputStyle("TEXT_ANSWER", 0, 0, Integer.valueOf(p.survicate_micro_input_height_text_answer), false);
    public static final MicroSurvicateTextInputStyle FORM = new MicroSurvicateTextInputStyle("FORM", 1, 1, null, true);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/attributes/MicroSurvicateTextInputStyle$Companion;", "", "()V", "fromId", "Lcom/survicate/surveys/entities/attributes/MicroSurvicateTextInputStyle;", "id", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final MicroSurvicateTextInputStyle fromId(int id2) {
            Object next;
            Iterator<E> it = MicroSurvicateTextInputStyle.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((MicroSurvicateTextInputStyle) next).getId() == id2) {
                    break;
                }
            }
            MicroSurvicateTextInputStyle microSurvicateTextInputStyle = (MicroSurvicateTextInputStyle) next;
            return microSurvicateTextInputStyle == null ? MicroSurvicateTextInputStyle.TEXT_ANSWER : microSurvicateTextInputStyle;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MicroSurvicateTextInputStyle[] $values() {
        return new MicroSurvicateTextInputStyle[]{TEXT_ANSWER, FORM};
    }

    static {
        MicroSurvicateTextInputStyle[] microSurvicateTextInputStyleArr$values = $values();
        $VALUES = microSurvicateTextInputStyleArr$values;
        $ENTRIES = a.a.j(microSurvicateTextInputStyleArr$values);
        INSTANCE = new Companion(null);
    }

    private MicroSurvicateTextInputStyle(String str, int i10, int i11, Integer num, boolean z10) {
        this.id = i11;
        this.height = num;
        this.singleLine = z10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MicroSurvicateTextInputStyle valueOf(String str) {
        return (MicroSurvicateTextInputStyle) Enum.valueOf(MicroSurvicateTextInputStyle.class, str);
    }

    public static MicroSurvicateTextInputStyle[] values() {
        return (MicroSurvicateTextInputStyle[]) $VALUES.clone();
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }
}
