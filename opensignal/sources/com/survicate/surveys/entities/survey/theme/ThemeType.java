package com.survicate.surveys.entities.survey.theme;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/survicate/surveys/entities/survey/theme/ThemeType;", "", "(Ljava/lang/String;I)V", "MICRO", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;

    @o(name = "MicroTheme")
    public static final ThemeType MICRO = new ThemeType("MICRO", 0);

    private static final /* synthetic */ ThemeType[] $values() {
        return new ThemeType[]{MICRO};
    }

    static {
        ThemeType[] themeTypeArr$values = $values();
        $VALUES = themeTypeArr$values;
        $ENTRIES = a.a.j(themeTypeArr$values);
    }

    private ThemeType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }
}
