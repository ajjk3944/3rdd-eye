package com.survicate.surveys.entities.survey.questions;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/ImagePosition;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImagePosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImagePosition[] $VALUES;

    @o(name = "top")
    public static final ImagePosition TOP = new ImagePosition("TOP", 0);

    @o(name = "bottom")
    public static final ImagePosition BOTTOM = new ImagePosition("BOTTOM", 1);

    private static final /* synthetic */ ImagePosition[] $values() {
        return new ImagePosition[]{TOP, BOTTOM};
    }

    static {
        ImagePosition[] imagePositionArr$values = $values();
        $VALUES = imagePositionArr$values;
        $ENTRIES = a.a.j(imagePositionArr$values);
    }

    private ImagePosition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ImagePosition valueOf(String str) {
        return (ImagePosition) Enum.valueOf(ImagePosition.class, str);
    }

    public static ImagePosition[] values() {
        return (ImagePosition[]) $VALUES.clone();
    }
}
