package dq;

import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterBooleanAttributeOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7435a;

    static {
        int[] iArr = new int[AudienceUserFilterBooleanAttributeOperator.values().length];
        try {
            iArr[AudienceUserFilterBooleanAttributeOperator.IS_TRUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudienceUserFilterBooleanAttributeOperator.IS_FALSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudienceUserFilterBooleanAttributeOperator.ANY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7435a = iArr;
    }
}
