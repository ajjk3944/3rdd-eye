package dq;

import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterDateTimeAttributeOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7438a;

    static {
        int[] iArr = new int[AudienceUserFilterDateTimeAttributeOperator.values().length];
        try {
            iArr[AudienceUserFilterDateTimeAttributeOperator.IS_EARLIER_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudienceUserFilterDateTimeAttributeOperator.IS_LATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudienceUserFilterDateTimeAttributeOperator.IS_ON_THE_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AudienceUserFilterDateTimeAttributeOperator.IS_BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AudienceUserFilterDateTimeAttributeOperator.IS_NOT_BETWEEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AudienceUserFilterDateTimeAttributeOperator.ANY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f7438a = iArr;
    }
}
