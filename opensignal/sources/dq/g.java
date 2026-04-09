package dq;

import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterStringAttributeOperator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7444a;

    static {
        int[] iArr = new int[AudienceUserFilterStringAttributeOperator.values().length];
        try {
            iArr[AudienceUserFilterStringAttributeOperator.IS_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudienceUserFilterStringAttributeOperator.IS_NOT_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudienceUserFilterStringAttributeOperator.CONTAINS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AudienceUserFilterStringAttributeOperator.DOES_NOT_CONTAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AudienceUserFilterStringAttributeOperator.EXISTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AudienceUserFilterStringAttributeOperator.DOES_NOT_EXIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AudienceUserFilterStringAttributeOperator.ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f7444a = iArr;
    }
}
