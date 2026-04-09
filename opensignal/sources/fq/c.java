package fq;

import com.survicate.surveys.entities.survey.EventTriggerOccurrenceCountOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9030a;

    static {
        int[] iArr = new int[EventTriggerOccurrenceCountOperator.values().length];
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_NOT_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_GREATER_THAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_GREATER_THAN_OR_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_LESS_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_LESS_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_BETWEEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[EventTriggerOccurrenceCountOperator.IS_NOT_BETWEEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f9030a = iArr;
    }
}
