package com.survicate.surveys.entities.attributes;

import br.g;
import java.util.Iterator;
import kotlin.Metadata;
import on.p;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/entities/attributes/MicroSurvicateCommentFieldStyle;", "", "id", "", "height", "(Ljava/lang/String;III)V", "getHeight", "()I", "getId", "NESTED", "STANDALONE", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurvicateCommentFieldStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MicroSurvicateCommentFieldStyle[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MicroSurvicateCommentFieldStyle NESTED = new MicroSurvicateCommentFieldStyle("NESTED", 0, 0, p.survicate_micro_input_height_comment_nested);
    public static final MicroSurvicateCommentFieldStyle STANDALONE = new MicroSurvicateCommentFieldStyle("STANDALONE", 1, 1, p.survicate_micro_input_height_comment_standalone);
    private final int height;
    private final int id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/attributes/MicroSurvicateCommentFieldStyle$Companion;", "", "()V", "fromId", "Lcom/survicate/surveys/entities/attributes/MicroSurvicateCommentFieldStyle;", "id", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final MicroSurvicateCommentFieldStyle fromId(int id2) {
            Object next;
            Iterator<E> it = MicroSurvicateCommentFieldStyle.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((MicroSurvicateCommentFieldStyle) next).getId() == id2) {
                    break;
                }
            }
            MicroSurvicateCommentFieldStyle microSurvicateCommentFieldStyle = (MicroSurvicateCommentFieldStyle) next;
            return microSurvicateCommentFieldStyle == null ? MicroSurvicateCommentFieldStyle.STANDALONE : microSurvicateCommentFieldStyle;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MicroSurvicateCommentFieldStyle[] $values() {
        return new MicroSurvicateCommentFieldStyle[]{NESTED, STANDALONE};
    }

    static {
        MicroSurvicateCommentFieldStyle[] microSurvicateCommentFieldStyleArr$values = $values();
        $VALUES = microSurvicateCommentFieldStyleArr$values;
        $ENTRIES = a.a.j(microSurvicateCommentFieldStyleArr$values);
        INSTANCE = new Companion(null);
    }

    private MicroSurvicateCommentFieldStyle(String str, int i10, int i11, int i12) {
        this.id = i11;
        this.height = i12;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MicroSurvicateCommentFieldStyle valueOf(String str) {
        return (MicroSurvicateCommentFieldStyle) Enum.valueOf(MicroSurvicateCommentFieldStyle.class, str);
    }

    public static MicroSurvicateCommentFieldStyle[] values() {
        return (MicroSurvicateCommentFieldStyle[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }
}
