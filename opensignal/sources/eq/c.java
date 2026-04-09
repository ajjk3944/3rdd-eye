package eq;

import com.survicate.surveys.entities.survey.audience.AudienceRelation;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8252a;

    static {
        int[] iArr = new int[AudienceRelation.values().length];
        try {
            iArr[AudienceRelation.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudienceRelation.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8252a = iArr;
    }
}
