package com.survicate.surveys.entities.colors;

import kotlin.Metadata;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/survicate/surveys/entities/colors/MicroColorControlOpacity;", "", "opacityValue", "", "(Ljava/lang/String;IF)V", "getOpacityValue", "()F", "Divider", "ProgressBarBackground", "SurveyBackgroundDim", "CloseButton", "AnswerBackground", "Pressed", "ButtonDisabled", "ButtonTextDisabled", "ShapeNotSelected", "ShapeSelected", "DatePickerOverlay", "OutlinedButtonTextDisabled", "OutlinedButtonBorderDisabled", "InputHint", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroColorControlOpacity {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MicroColorControlOpacity[] $VALUES;
    private final float opacityValue;
    public static final MicroColorControlOpacity Divider = new MicroColorControlOpacity("Divider", 0, 0.2f);
    public static final MicroColorControlOpacity ProgressBarBackground = new MicroColorControlOpacity("ProgressBarBackground", 1, 0.15f);
    public static final MicroColorControlOpacity SurveyBackgroundDim = new MicroColorControlOpacity("SurveyBackgroundDim", 2, 0.7f);
    public static final MicroColorControlOpacity CloseButton = new MicroColorControlOpacity("CloseButton", 3, 0.5f);
    public static final MicroColorControlOpacity AnswerBackground = new MicroColorControlOpacity("AnswerBackground", 4, 0.1f);
    public static final MicroColorControlOpacity Pressed = new MicroColorControlOpacity("Pressed", 5, 0.1f);
    public static final MicroColorControlOpacity ButtonDisabled = new MicroColorControlOpacity("ButtonDisabled", 6, 0.45f);
    public static final MicroColorControlOpacity ButtonTextDisabled = new MicroColorControlOpacity("ButtonTextDisabled", 7, 0.5f);
    public static final MicroColorControlOpacity ShapeNotSelected = new MicroColorControlOpacity("ShapeNotSelected", 8, 0.3f);
    public static final MicroColorControlOpacity ShapeSelected = new MicroColorControlOpacity("ShapeSelected", 9, 1.0f);
    public static final MicroColorControlOpacity DatePickerOverlay = new MicroColorControlOpacity("DatePickerOverlay", 10, 0.2f);
    public static final MicroColorControlOpacity OutlinedButtonTextDisabled = new MicroColorControlOpacity("OutlinedButtonTextDisabled", 11, 0.6f);
    public static final MicroColorControlOpacity OutlinedButtonBorderDisabled = new MicroColorControlOpacity("OutlinedButtonBorderDisabled", 12, 0.3f);
    public static final MicroColorControlOpacity InputHint = new MicroColorControlOpacity("InputHint", 13, 0.6f);

    private static final /* synthetic */ MicroColorControlOpacity[] $values() {
        return new MicroColorControlOpacity[]{Divider, ProgressBarBackground, SurveyBackgroundDim, CloseButton, AnswerBackground, Pressed, ButtonDisabled, ButtonTextDisabled, ShapeNotSelected, ShapeSelected, DatePickerOverlay, OutlinedButtonTextDisabled, OutlinedButtonBorderDisabled, InputHint};
    }

    static {
        MicroColorControlOpacity[] microColorControlOpacityArr$values = $values();
        $VALUES = microColorControlOpacityArr$values;
        $ENTRIES = a.a.j(microColorControlOpacityArr$values);
    }

    private MicroColorControlOpacity(String str, int i10, float f10) {
        this.opacityValue = f10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MicroColorControlOpacity valueOf(String str) {
        return (MicroColorControlOpacity) Enum.valueOf(MicroColorControlOpacity.class, str);
    }

    public static MicroColorControlOpacity[] values() {
        return (MicroColorControlOpacity[]) $VALUES.clone();
    }

    public final float getOpacityValue() {
        return this.opacityValue;
    }
}
