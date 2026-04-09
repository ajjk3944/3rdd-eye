package com.survicate.surveys.entities.attributes;

import kotlin.Metadata;
import on.q;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/survicate/surveys/entities/attributes/MicroSurvicateSelectionType;", "", "drawableRes", "", "(Ljava/lang/String;II)V", "getDrawableRes", "()I", "Checkbox", "Radio", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurvicateSelectionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MicroSurvicateSelectionType[] $VALUES;
    public static final MicroSurvicateSelectionType Checkbox = new MicroSurvicateSelectionType("Checkbox", 0, q.ic_checkbox_button_micro);
    public static final MicroSurvicateSelectionType Radio = new MicroSurvicateSelectionType("Radio", 1, q.ic_radio_button_micro);
    private final int drawableRes;

    private static final /* synthetic */ MicroSurvicateSelectionType[] $values() {
        return new MicroSurvicateSelectionType[]{Checkbox, Radio};
    }

    static {
        MicroSurvicateSelectionType[] microSurvicateSelectionTypeArr$values = $values();
        $VALUES = microSurvicateSelectionTypeArr$values;
        $ENTRIES = a.a.j(microSurvicateSelectionTypeArr$values);
    }

    private MicroSurvicateSelectionType(String str, int i10, int i11) {
        this.drawableRes = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MicroSurvicateSelectionType valueOf(String str) {
        return (MicroSurvicateSelectionType) Enum.valueOf(MicroSurvicateSelectionType.class, str);
    }

    public static MicroSurvicateSelectionType[] values() {
        return (MicroSurvicateSelectionType[]) $VALUES.clone();
    }

    public final int getDrawableRes() {
        return this.drawableRes;
    }
}
