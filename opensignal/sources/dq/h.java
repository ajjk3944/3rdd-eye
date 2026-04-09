package dq;

import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterTimeIntervalAttributeOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7445a;

    static {
        int[] iArr = new int[AudienceUserFilterTimeIntervalAttributeOperator.values().length];
        try {
            iArr[AudienceUserFilterTimeIntervalAttributeOperator.IS_GREATER_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudienceUserFilterTimeIntervalAttributeOperator.IS_LESS_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudienceUserFilterTimeIntervalAttributeOperator.ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7445a = iArr;
    }
}
