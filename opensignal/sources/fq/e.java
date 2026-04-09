package fq;

import com.survicate.surveys.entities.survey.EventTriggerPropertyOperator;
import com.survicate.surveys.entities.survey.EventTriggerRelation;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9032a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9033b;

    static {
        int[] iArr = new int[EventTriggerRelation.values().length];
        try {
            iArr[EventTriggerRelation.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventTriggerRelation.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9032a = iArr;
        int[] iArr2 = new int[EventTriggerPropertyOperator.values().length];
        try {
            iArr2[EventTriggerPropertyOperator.IS_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EventTriggerPropertyOperator.IS_NOT_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EventTriggerPropertyOperator.CONTAINS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EventTriggerPropertyOperator.DOES_NOT_CONTAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EventTriggerPropertyOperator.EXISTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EventTriggerPropertyOperator.DOES_NOT_EXIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EventTriggerPropertyOperator.ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f9033b = iArr2;
    }
}
