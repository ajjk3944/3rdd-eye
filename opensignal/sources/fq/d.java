package fq;

import com.survicate.surveys.entities.survey.EventTriggerOccurrenceTimeOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9031a;

    static {
        int[] iArr = new int[EventTriggerOccurrenceTimeOperator.values().length];
        try {
            iArr[EventTriggerOccurrenceTimeOperator.IS_GREATER_THAN_OR_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventTriggerOccurrenceTimeOperator.IS_LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventTriggerOccurrenceTimeOperator.IS_BETWEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EventTriggerOccurrenceTimeOperator.IS_NOT_BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f9031a = iArr;
    }
}
