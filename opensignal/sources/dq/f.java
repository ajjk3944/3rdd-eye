package dq;

import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterNumberAttributeOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7443a;

    static {
        int[] iArr = new int[AudienceUserFilterNumberAttributeOperator.values().length];
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_NOT_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_GREATER_THAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_GREATER_THAN_OR_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_LESS_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_LESS_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_BETWEEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.IS_NOT_BETWEEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AudienceUserFilterNumberAttributeOperator.ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f7443a = iArr;
    }
}
